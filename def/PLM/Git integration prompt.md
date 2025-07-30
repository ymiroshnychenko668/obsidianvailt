## /*  
GOAL

Extend the existing PLM code base so that mechanical (BOM) data and software sources live together  
and users can work with Git from inside the application.

## HIGH‑LEVEL CHANGES

1. Domain model  
    • New JPA entity SoftwarePackage representing the “active” (HEAD) state of a Git repo.  
    – Fields: id (Long), name, description, gitUrl (String, mandatory), mainBranch (String, default “main”),  
    createdAt/modifiedAt (Audited), deleted (soft‑delete flag).  
    – release_ver is always 0 (Long) exactly like ProductActiveRelease, kept in the PK so future tags can point to  
    ReleaseVersion rows. No historical tables for SoftwarePackage – Git already versions the contents.  
    – @ManyToMany with ProductActiveRelease (products may share packages, packages may serve many products).  
    Add product_software_packages join table. Pattern identical to CompleteSet↔ProductActiveRelease mapping. ★see ProductActiveRelease code all_java_combined
    
2. Git abstraction  
    • interface GitService with methods  
    cloneRepo(path)  
    commit(path, message)  
    push(path, remoteBranch)  
    pull(path, remoteBranch)  
    createBranch(path, branchName)  
    listHistory(path, branch, limit) → List<CommitDto>  
    listTree(path, commitShaOrBranch) → List<TreeEntryDto>  
    • GithubService implements GitService.  
    – Use org.eclipse.jgit (v6.x) for local commands  
    – Use GitHub REST v3 over OkHttp for remote ops:  
    POST /user/repos → create repository  
    POST /repos/{owner}/{repo}/git/refs → create branch  
    GET   /repos/{owner}/{repo}/commits?sha=main&per_page={limit} → history  
    PAT read from application‑*.yml `github.token`.  
    • GitlabService implements GitService but, for unimplemented calls, just  
    throw new UnsupportedOperationException("Not supported yet by GitlabService");  
    – Keep the class skeleton so future devs can add GitLab4J / GitLab REST.  
    • Spring @Qualifier("gitHub") / @Qualifier("gitLab") beans so callers can inject what they need.
    
3. Spring services  
    • SoftwarePackageService (pattern: ActiveReleaseProductService all_java_combined)  
    – CRUD via SoftwarePackageRepository extends CrudRepository<SoftwarePackage,Long> (user preference).  
    – Delegates Git operations to GitService injected by constructor.  
    • RepoFileComponentLink entity (id, branch, filePath, sha, componentId, componentReleaseVer=0).  
    Only HEAD of main branch is allowed; branch column default ‘main’.  
    Links ONLY to ComponentActiveRelease (engineering BOM) – see ComponentActiveRelease id composite all_java_combined
    
4. YAML manifest  
    • When a link is created, persist a YAML file `.plm-links.yaml` at repo root in main branch:  
    - file: src/Foo.cad  
    componentId: 42  
    componentReleaseVer: 0  
    The list is regenerated after every create/delete. Use snakeyaml.
    
5. Vaadin UI  

		ProductPage – “Software Packages” panel  
• Purpose: manage the Git repositories associated with the currently selected ProductActiveRelease.

Visual layout  
• Existing Product details layout gains a new tab “Software packages”.  
• Inside the tab sits a Vaadin Grid<SoftwarePackageDto> (not a MultiSelectComboBox).  
The Grid supports multiselect so users can unlink several repos at once.

Grid columns (add or remove later as needed)

1. Name – package name stored in PLM.
    
2. Host – enum value GITHUB | GITLAB (derived from gitUrl).
    
3. Main branch – normally “main” but user may override.
    
4. Last commit – date‑time of HEAD commit (fetched via GitService.listHistory).
    
5. Linked by – username of person who attached it (audit field).
    
6. Url – clickable hyperlink that opens the remote repository in a new browser tab.
    

Toolbar / row actions  
• “Create repository” – opens a dialog: name, host selector, visibility.  
On OK calls SoftwarePackageService.createAndLink(productId,…).  
• “Attach existing repository” – opens a dialog showing all repos already  
stored in PLM and not yet linked to this product (Grid with same columns).  
User selects one; service layer adds entry to product_software_packages.  
• “Unlink repository” – enabled when one or more Grid rows are selected.  
Removes the association but leaves the repository entity intact.  
• “Open in Git host” – row action icon that executes  
getUI().ifPresent(ui -> ui.getPage().open(selected.getUrl(), “_blank”)).  
Works for both GitHub and GitLab.

Behaviour notes  
• The Grid is refreshed after every create/attach/unlink.  
• Creating a repository delegates to GithubService.createRemoteRepo or throws  
UnsupportedOperationException when host = GITLAB.  
• No file‑tree or commit history here; that lives in SoftwarePackagePage.

This clarifies that the UI uses a fully fledged Grid with identifiable columns and gives users explicit controls to create, attach, unlink repositories and to open them directly on GitHub or GitLab.
	


    Route  
“/software-packages/:packageId”  
The view is created only by selecting a package row in the ProductPage “Software packages” tab and clicking “Open”.

Purpose  
Provide all Git‑centric operations and code browsing for one SoftwarePackage entity.

Layout (VerticalLayout root)  
1. Top toolbar (HorizontalLayout)  
• Commit            → opens small dialog for message, then SoftwarePackageService.commit  
• Pull              → SoftwarePackageService.pull  
• Push              → SoftwarePackageService.push  
• Create branch     → dialog for branch name → SoftwarePackageService.createBranch  
• Refresh           → reloads source tree and commit grid


`2. SplitLayout (setSizeFull)      LEFT pane (TreeGrid<FileNodeDto>)          – Shows folders/files of current branch (initially main)          – Lazy loading via GitService.listTree(packageId, branch, parentPath)          – Context menu item “Attach component…” triggers AttachComponentDialog            (Component picker + path auto‑filled from selected node)      RIGHT pane (VerticalLayout, full height)          a. Commit history Grid<CommitDto> (height = 35 %)             columns: sha (short), authorName, committerDate, message             • Row click sets selectedCommitSha and refreshes source tree + code viewer to that revision          b. Code viewer (RichTextArea, height = 65 %)             – When a file node is selected in the TreeGrid, load its content at selectedCommitSha (default HEAD)             – Syntax highlighting is optional; plain monospaced text is acceptable for MVP`

Behaviour details  
• Selecting a different commit rewires the TreeGrid to the file system snapshot of that commit.  
• Source viewer is read‑only; editing belongs to local Git clients.  
• All Git actions operate on the currently checked‑out branch.  
• AttachComponentDialog restricts branch field to “main” and commit field to HEAD.  
• A badge in the toolbar shows the active branch; after Create branch it switches automatically.  
• A link icon beside the branch badge opens the remote repository in a new browser tab (GitHub / GitLab).

Navigation  
MainLayout adds menu item “Software package” but it stays disabled; the only route into the page is the action from ProductPage, ensuring the user context (product ↔ package) is preserved.

Persistence hooks  
• After a successful commit via the toolbar, SoftwarePackageService.recomputeLastCommitDate(packageId) so ProductPage grid shows fresh data on return.

This replaces the previous generic description with a precise, single‑package‑focused UI explanation, clarifying visible controls, component hierarchy, and navigation path.

Ask ChatGPT
    
6. API stubs for remote repository creation  
    • GitHub ➜ POST https://api.github.com/user/repos (JSON: {name, private, description})  
    • GitLab ➜ POST [https://gitlab.com/api/v4/projects](https://gitlab.com/api/v4/projects) (JSON: {name, visibility})  
    Provide wrapper methods createRemoteRepo(name, visibility, description).  
    GithubService implements, GitlabService throws UnsupportedOperationException for now.
    
7. Tests  
    • Mock GitService with Mockito for service tests.  
    • Integration test that POST /software‑packages creates entity and calls GitHub API (WireMock).
    

## CODING STEPS

A. persistence  
– com.ua.crow.plm.database.active.SoftwarePackage (copy ProductActiveRelease pattern, minus BOM fields)  
– com.ua.crow.plm.database.repo.SoftwarePackageRepository (CrudRepository)

B. DTO & mapper  
– SoftwarePackageDto, SoftwarePackageMapper (@Mapper similar to ProductMapper all_java_combined)

C. services  
– GitService, GithubService, GitlabService under com.ua.crow.git  
– SoftwarePackageService under com.ua.crow.plm.service.software

D. Vaadin  
– SoftwarePackagePage under com.ua.crow.views.software  
– MenuItem in MainLayout

E. YAML link handling  
– RepoFileComponentLinkRepository, RepoFileComponentLinkService

F. Configuration  
– application.yml:  
git:  
rootPath: ${java.io.tmpdir}/plm/git  
github:  
token: ${GITHUB_PAT}

## NOTES

- Follow existing auditing, soft‑delete, and @IdClass(ReleasableId.class) conventions.
    
- All new repositories use CrudRepository, not JpaRepository.
    
- Keep all comments in English.
    
- Do not implement UI for GitLab until GitlabService fully supports the operations.  
    */