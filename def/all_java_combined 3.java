// ===== File: crow/target/generated-sources/annotations/com/ua/crow/dto/mappers/UnitsMapperImpl.java =====
package com.ua.crow.dto.mappers;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.plm.dto.UnitsDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class UnitsMapperImpl extends UnitsMapper {

    @Override
    public UnitsDto toDto(Units units) {
        if ( units == null ) {
            return null;
        }

        UnitsDto unitsDto = new UnitsDto();

        unitsDto.setId( units.getId() );
        unitsDto.setDeleted( units.isDeleted() );
        unitsDto.setName( units.getName() );
        unitsDto.setUkrName( units.getUkrName() );
        unitsDto.setType( units.getType() );
        unitsDto.setShortName( units.getShortName() );

        return unitsDto;
    }

    @Override
    public Units toPojo(UnitsDto unitsDto) {
        if ( unitsDto == null ) {
            return null;
        }

        Units units = new Units();

        units.setId( unitsDto.getId() );
        units.setDeleted( unitsDto.isDeleted() );
        units.setName( unitsDto.getName() );
        units.setUkrName( unitsDto.getUkrName() );
        units.setType( unitsDto.getType() );
        units.setShortName( unitsDto.getShortName() );

        return units;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ResourceGroupMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.inventory.database.ResourceItem;
import com.ua.crow.plm.dto.ResourceGroupDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ResourceGroupMapperImpl extends ResourceGroupMapper {

    @Override
    public ResourceGroupDto toDto(ResourceGroup task) {
        if ( task == null ) {
            return null;
        }

        ResourceGroupDto resourceGroupDto = new ResourceGroupDto();

        resourceGroupDto.setId( task.getId() );
        resourceGroupDto.setTenantId( task.getTenantId() );
        resourceGroupDto.setDeleted( task.isDeleted() );
        resourceGroupDto.setName( task.getName() );
        resourceGroupDto.setUkrName( task.getUkrName() );
        resourceGroupDto.setCreator( task.getCreator() );
        resourceGroupDto.setModifier( task.getModifier() );
        resourceGroupDto.setCreatedAt( task.getCreatedAt() );
        resourceGroupDto.setModifiedAt( task.getModifiedAt() );
        resourceGroupDto.setWithdrawAlgorythm( task.getWithdrawAlgorythm() );
        resourceGroupDto.setMinimalUnitToWithdraw( task.getMinimalUnitToWithdraw() );
        List<ResourceItem> list = task.getResources();
        if ( list != null ) {
            resourceGroupDto.setResources( new ArrayList<ResourceItem>( list ) );
        }
        resourceGroupDto.setParent( task.getParent() );

        return resourceGroupDto;
    }

    @Override
    public ResourceGroup toResourceGroup(ResourceGroupDto task) {
        if ( task == null ) {
            return null;
        }

        ResourceGroup resourceGroup = new ResourceGroup();

        resourceGroup.setId( task.getId() );
        resourceGroup.setTenantId( task.getTenantId() );
        resourceGroup.setDeleted( task.isDeleted() );
        resourceGroup.setName( task.getName() );
        resourceGroup.setUkrName( task.getUkrName() );
        resourceGroup.setCreator( task.getCreator() );
        resourceGroup.setModifier( task.getModifier() );
        resourceGroup.setCreatedAt( task.getCreatedAt() );
        resourceGroup.setModifiedAt( task.getModifiedAt() );
        resourceGroup.setParent( task.getParent() );
        resourceGroup.setWithdrawAlgorythm( task.getWithdrawAlgorythm() );
        resourceGroup.setMinimalUnitToWithdraw( task.getMinimalUnitToWithdraw() );
        List<ResourceItem> list = task.getResources();
        if ( list != null ) {
            resourceGroup.setResources( new ArrayList<ResourceItem>( list ) );
        }

        return resourceGroup;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ShortFusionBomMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ShortFusionBomMapperImpl extends ShortFusionBomMapper {

    @Override
    public FusionComponentDto toShortDto(FusionComponent bom) {
        if ( bom == null ) {
            return null;
        }

        FusionComponentDto fusionComponentDto = new FusionComponentDto();

        fusionComponentDto.setPartName( bom.getPartName() );
        fusionComponentDto.setPartNumber( bom.getPartNumber() );
        fusionComponentDto.setType( bom.getType() );

        return fusionComponentDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/BomShortMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class BomShortMapperImpl extends BomShortMapper {

    @Override
    public BomActiveReleaseDto toDto(BomActiveRelease bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        BomActiveReleaseDto bomActiveReleaseDto = new BomActiveReleaseDto();

        bomActiveReleaseDto.setId( bomActiveRelease.getId() );
        bomActiveReleaseDto.setDeleted( bomActiveRelease.isDeleted() );
        bomActiveReleaseDto.setName( bomActiveRelease.getName() );
        bomActiveReleaseDto.setUkrName( bomActiveRelease.getUkrName() );
        bomActiveReleaseDto.setCreator( bomActiveRelease.getCreator() );
        bomActiveReleaseDto.setModifier( bomActiveRelease.getModifier() );
        bomActiveReleaseDto.setCreatedAt( bomActiveRelease.getCreatedAt() );
        bomActiveReleaseDto.setModifiedAt( bomActiveRelease.getModifiedAt() );
        bomActiveReleaseDto.setDescription( bomActiveRelease.getDescription() );
        bomActiveReleaseDto.setPartNumber( bomActiveRelease.getPartNumber() );
        bomActiveReleaseDto.setFusionVersion( bomActiveRelease.getFusionVersion() );
        bomActiveReleaseDto.setFusionId( bomActiveRelease.getFusionId() );
        bomActiveReleaseDto.setLibraryItem( bomActiveRelease.isLibraryItem() );
        bomActiveReleaseDto.setFusionRevisionId( bomActiveRelease.getFusionRevisionId() );
        bomActiveReleaseDto.setConfiguration( bomActiveRelease.isConfiguration() );
        bomActiveReleaseDto.setConfiguredDesign( bomActiveRelease.isConfiguredDesign() );
        bomActiveReleaseDto.setConsistent( bomActiveRelease.isConsistent() );

        return bomActiveReleaseDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ResourceItemMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.inventory.database.ResourceItem;
import com.ua.crow.plm.dto.ResourceGroupDto;
import com.ua.crow.plm.dto.ResourceItemDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ResourceItemMapperImpl extends ResourceItemMapper {

    @Override
    public ResourceItemDTO toDto(ResourceItem comment) {
        if ( comment == null ) {
            return null;
        }

        ResourceItemDTO resourceItemDTO = new ResourceItemDTO();

        resourceItemDTO.setId( comment.getId() );
        resourceItemDTO.setDeleted( comment.isDeleted() );
        resourceItemDTO.setName( comment.getName() );
        resourceItemDTO.setUkrName( comment.getUkrName() );
        resourceItemDTO.setCreator( comment.getCreator() );
        resourceItemDTO.setModifier( comment.getModifier() );
        resourceItemDTO.setCreatedAt( comment.getCreatedAt() );
        resourceItemDTO.setModifiedAt( comment.getModifiedAt() );
        resourceItemDTO.setWithdrawAlgorythm( comment.getWithdrawAlgorythm() );
        resourceItemDTO.setMinimalUnitToWithdraw( comment.getMinimalUnitToWithdraw() );
        resourceItemDTO.setPrice( comment.getPrice() );
        resourceItemDTO.setGroup( resourceGroupToResourceGroupDto( comment.getGroup() ) );

        return resourceItemDTO;
    }

    @Override
    public ResourceItem toPojo(ResourceItemDTO comment) {
        if ( comment == null ) {
            return null;
        }

        ResourceItem resourceItem = new ResourceItem();

        resourceItem.setId( comment.getId() );
        resourceItem.setDeleted( comment.isDeleted() );
        resourceItem.setName( comment.getName() );
        resourceItem.setUkrName( comment.getUkrName() );
        resourceItem.setCreator( comment.getCreator() );
        resourceItem.setModifier( comment.getModifier() );
        resourceItem.setCreatedAt( comment.getCreatedAt() );
        resourceItem.setModifiedAt( comment.getModifiedAt() );
        resourceItem.setWithdrawAlgorythm( comment.getWithdrawAlgorythm() );
        resourceItem.setMinimalUnitToWithdraw( comment.getMinimalUnitToWithdraw() );
        resourceItem.setPrice( comment.getPrice() );
        resourceItem.setGroup( resourceGroupDtoToResourceGroup( comment.getGroup() ) );

        return resourceItem;
    }

    protected List<ResourceGroupDto> resourceGroupListToResourceGroupDtoList(List<ResourceGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<ResourceGroupDto> list1 = new ArrayList<ResourceGroupDto>( list.size() );
        for ( ResourceGroup resourceGroup : list ) {
            list1.add( resourceGroupToResourceGroupDto( resourceGroup ) );
        }

        return list1;
    }

    protected ResourceGroupDto resourceGroupToResourceGroupDto(ResourceGroup resourceGroup) {
        if ( resourceGroup == null ) {
            return null;
        }

        ResourceGroupDto resourceGroupDto = new ResourceGroupDto();

        resourceGroupDto.setId( resourceGroup.getId() );
        resourceGroupDto.setTenantId( resourceGroup.getTenantId() );
        resourceGroupDto.setDeleted( resourceGroup.isDeleted() );
        resourceGroupDto.setName( resourceGroup.getName() );
        resourceGroupDto.setUkrName( resourceGroup.getUkrName() );
        resourceGroupDto.setCreator( resourceGroup.getCreator() );
        resourceGroupDto.setModifier( resourceGroup.getModifier() );
        resourceGroupDto.setCreatedAt( resourceGroup.getCreatedAt() );
        resourceGroupDto.setModifiedAt( resourceGroup.getModifiedAt() );
        resourceGroupDto.setWithdrawAlgorythm( resourceGroup.getWithdrawAlgorythm() );
        resourceGroupDto.setMinimalUnitToWithdraw( resourceGroup.getMinimalUnitToWithdraw() );
        List<ResourceItem> list = resourceGroup.getResources();
        if ( list != null ) {
            resourceGroupDto.setResources( new ArrayList<ResourceItem>( list ) );
        }
        resourceGroupDto.setParent( resourceGroup.getParent() );
        resourceGroupDto.setChildren( resourceGroupListToResourceGroupDtoList( resourceGroup.getChildren() ) );

        return resourceGroupDto;
    }

    protected List<ResourceGroup> resourceGroupDtoListToResourceGroupList(List<ResourceGroupDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ResourceGroup> list1 = new ArrayList<ResourceGroup>( list.size() );
        for ( ResourceGroupDto resourceGroupDto : list ) {
            list1.add( resourceGroupDtoToResourceGroup( resourceGroupDto ) );
        }

        return list1;
    }

    protected ResourceGroup resourceGroupDtoToResourceGroup(ResourceGroupDto resourceGroupDto) {
        if ( resourceGroupDto == null ) {
            return null;
        }

        ResourceGroup resourceGroup = new ResourceGroup();

        resourceGroup.setId( resourceGroupDto.getId() );
        resourceGroup.setTenantId( resourceGroupDto.getTenantId() );
        resourceGroup.setDeleted( resourceGroupDto.isDeleted() );
        resourceGroup.setName( resourceGroupDto.getName() );
        resourceGroup.setUkrName( resourceGroupDto.getUkrName() );
        resourceGroup.setCreator( resourceGroupDto.getCreator() );
        resourceGroup.setModifier( resourceGroupDto.getModifier() );
        resourceGroup.setCreatedAt( resourceGroupDto.getCreatedAt() );
        resourceGroup.setModifiedAt( resourceGroupDto.getModifiedAt() );
        resourceGroup.setParent( resourceGroupDto.getParent() );
        resourceGroup.setChildren( resourceGroupDtoListToResourceGroupList( resourceGroupDto.getChildren() ) );
        resourceGroup.setWithdrawAlgorythm( resourceGroupDto.getWithdrawAlgorythm() );
        resourceGroup.setMinimalUnitToWithdraw( resourceGroupDto.getMinimalUnitToWithdraw() );
        List<ResourceItem> list1 = resourceGroupDto.getResources();
        if ( list1 != null ) {
            resourceGroup.setResources( new ArrayList<ResourceItem>( list1 ) );
        }

        return resourceGroup;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ProductMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl extends ProductMapper {

    @Override
    public ProductActiveReleaseDto toDto(ProductActiveRelease task) {
        if ( task == null ) {
            return null;
        }

        ProductActiveReleaseDto productActiveReleaseDto = new ProductActiveReleaseDto();

        productActiveReleaseDto.setId( task.getId() );
        productActiveReleaseDto.setDeleted( task.isDeleted() );
        productActiveReleaseDto.setName( task.getName() );
        productActiveReleaseDto.setUkrName( task.getUkrName() );
        productActiveReleaseDto.setCreator( task.getCreator() );
        productActiveReleaseDto.setModifier( task.getModifier() );
        productActiveReleaseDto.setCreatedAt( task.getCreatedAt() );
        productActiveReleaseDto.setModifiedAt( task.getModifiedAt() );

        return productActiveReleaseDto;
    }

    @Override
    public ProductActiveRelease toProduct(ProductActiveReleaseDto task) {
        if ( task == null ) {
            return null;
        }

        ProductActiveRelease productActiveRelease = new ProductActiveRelease();

        productActiveRelease.setId( task.getId() );
        productActiveRelease.setDeleted( task.isDeleted() );
        productActiveRelease.setName( task.getName() );
        productActiveRelease.setUkrName( task.getUkrName() );
        productActiveRelease.setCreator( task.getCreator() );
        productActiveRelease.setModifier( task.getModifier() );
        productActiveRelease.setCreatedAt( task.getCreatedAt() );
        productActiveRelease.setModifiedAt( task.getModifiedAt() );

        return productActiveRelease;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ComponentPropertyTypeMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.dto.UnitsDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ComponentPropertyTypeMapperImpl extends ComponentPropertyTypeMapper {

    @Override
    public BomItemPropertyTypeDto toDto(BomItemPropertyType bomItemPropertyType) {
        if ( bomItemPropertyType == null ) {
            return null;
        }

        BomItemPropertyTypeDto bomItemPropertyTypeDto = new BomItemPropertyTypeDto();

        bomItemPropertyTypeDto.setId( bomItemPropertyType.getId() );
        bomItemPropertyTypeDto.setDeleted( bomItemPropertyType.isDeleted() );
        bomItemPropertyTypeDto.setName( bomItemPropertyType.getName() );
        bomItemPropertyTypeDto.setUkrName( bomItemPropertyType.getUkrName() );
        bomItemPropertyTypeDto.setCreator( bomItemPropertyType.getCreator() );
        bomItemPropertyTypeDto.setModifier( bomItemPropertyType.getModifier() );
        bomItemPropertyTypeDto.setCreatedAt( bomItemPropertyType.getCreatedAt() );
        bomItemPropertyTypeDto.setModifiedAt( bomItemPropertyType.getModifiedAt() );
        bomItemPropertyTypeDto.setUnits( unitsToUnitsDto( bomItemPropertyType.getUnits() ) );
        bomItemPropertyTypeDto.setGroup( bomItemPropertyTypeGroupToBomItemPropertyTypeGroupDto( bomItemPropertyType.getGroup() ) );
        bomItemPropertyTypeDto.setDataType( bomItemPropertyType.getDataType() );

        return bomItemPropertyTypeDto;
    }

    @Override
    public BomItemPropertyType toPojo(BomItemPropertyTypeDto bomItemPropertyTypeDto) {
        if ( bomItemPropertyTypeDto == null ) {
            return null;
        }

        BomItemPropertyType bomItemPropertyType = new BomItemPropertyType();

        bomItemPropertyType.setId( bomItemPropertyTypeDto.getId() );
        bomItemPropertyType.setDeleted( bomItemPropertyTypeDto.isDeleted() );
        bomItemPropertyType.setName( bomItemPropertyTypeDto.getName() );
        bomItemPropertyType.setUkrName( bomItemPropertyTypeDto.getUkrName() );
        bomItemPropertyType.setCreator( bomItemPropertyTypeDto.getCreator() );
        bomItemPropertyType.setModifier( bomItemPropertyTypeDto.getModifier() );
        bomItemPropertyType.setCreatedAt( bomItemPropertyTypeDto.getCreatedAt() );
        bomItemPropertyType.setModifiedAt( bomItemPropertyTypeDto.getModifiedAt() );
        bomItemPropertyType.setUnits( unitsDtoToUnits( bomItemPropertyTypeDto.getUnits() ) );
        bomItemPropertyType.setGroup( bomItemPropertyTypeGroupDtoToBomItemPropertyTypeGroup( bomItemPropertyTypeDto.getGroup() ) );
        bomItemPropertyType.setDataType( bomItemPropertyTypeDto.getDataType() );

        return bomItemPropertyType;
    }

    protected UnitsDto unitsToUnitsDto(Units units) {
        if ( units == null ) {
            return null;
        }

        UnitsDto unitsDto = new UnitsDto();

        unitsDto.setId( units.getId() );
        unitsDto.setDeleted( units.isDeleted() );
        unitsDto.setName( units.getName() );
        unitsDto.setUkrName( units.getUkrName() );
        unitsDto.setType( units.getType() );
        unitsDto.setShortName( units.getShortName() );

        return unitsDto;
    }

    protected BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupToBomItemPropertyTypeGroupDto(BomItemPropertyTypeGroup bomItemPropertyTypeGroup) {
        if ( bomItemPropertyTypeGroup == null ) {
            return null;
        }

        BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupDto = new BomItemPropertyTypeGroupDto();

        bomItemPropertyTypeGroupDto.setId( bomItemPropertyTypeGroup.getId() );
        bomItemPropertyTypeGroupDto.setDeleted( bomItemPropertyTypeGroup.isDeleted() );
        bomItemPropertyTypeGroupDto.setName( bomItemPropertyTypeGroup.getName() );
        bomItemPropertyTypeGroupDto.setUkrName( bomItemPropertyTypeGroup.getUkrName() );
        bomItemPropertyTypeGroupDto.setCreator( bomItemPropertyTypeGroup.getCreator() );
        bomItemPropertyTypeGroupDto.setModifier( bomItemPropertyTypeGroup.getModifier() );
        bomItemPropertyTypeGroupDto.setCreatedAt( bomItemPropertyTypeGroup.getCreatedAt() );
        bomItemPropertyTypeGroupDto.setModifiedAt( bomItemPropertyTypeGroup.getModifiedAt() );

        return bomItemPropertyTypeGroupDto;
    }

    protected Units unitsDtoToUnits(UnitsDto unitsDto) {
        if ( unitsDto == null ) {
            return null;
        }

        Units units = new Units();

        units.setId( unitsDto.getId() );
        units.setDeleted( unitsDto.isDeleted() );
        units.setName( unitsDto.getName() );
        units.setUkrName( unitsDto.getUkrName() );
        units.setType( unitsDto.getType() );
        units.setShortName( unitsDto.getShortName() );

        return units;
    }

    protected BomItemPropertyTypeGroup bomItemPropertyTypeGroupDtoToBomItemPropertyTypeGroup(BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupDto) {
        if ( bomItemPropertyTypeGroupDto == null ) {
            return null;
        }

        BomItemPropertyTypeGroup bomItemPropertyTypeGroup = new BomItemPropertyTypeGroup();

        bomItemPropertyTypeGroup.setId( bomItemPropertyTypeGroupDto.getId() );
        bomItemPropertyTypeGroup.setDeleted( bomItemPropertyTypeGroupDto.isDeleted() );
        bomItemPropertyTypeGroup.setName( bomItemPropertyTypeGroupDto.getName() );
        bomItemPropertyTypeGroup.setUkrName( bomItemPropertyTypeGroupDto.getUkrName() );
        bomItemPropertyTypeGroup.setCreator( bomItemPropertyTypeGroupDto.getCreator() );
        bomItemPropertyTypeGroup.setModifier( bomItemPropertyTypeGroupDto.getModifier() );
        bomItemPropertyTypeGroup.setCreatedAt( bomItemPropertyTypeGroupDto.getCreatedAt() );
        bomItemPropertyTypeGroup.setModifiedAt( bomItemPropertyTypeGroupDto.getModifiedAt() );

        return bomItemPropertyTypeGroup;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/FusionBomMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.active.BomComponentRel;
import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class FusionBomMapperImpl extends FusionBomMapper {

    @Override
    public FusionBomDto toDto(FusionBom bom) {
        if ( bom == null ) {
            return null;
        }

        FusionBomDto fusionBomDto = new FusionBomDto();

        fusionBomDto.setFusionId( bom.getFusionId() );
        fusionBomDto.setProduct( productActiveReleaseToProductActiveReleaseDto( bom.getProduct() ) );
        fusionBomDto.setDocumentName( bom.getDocumentName() );
        fusionBomDto.setVersion( bom.getVersion() );
        fusionBomDto.setProcessed( bom.isProcessed() );
        fusionBomDto.setEngineeringBomId( bom.getEngineeringBomId() );
        fusionBomDto.setDescription( bom.getDescription() );
        fusionBomDto.setLibraryItem( bom.isLibraryItem() );
        fusionBomDto.setRevisionId( bom.getRevisionId() );
        fusionBomDto.setPartNumber( bom.getPartNumber() );
        fusionBomDto.setConfiguration( bom.isConfiguration() );
        fusionBomDto.setConfiguredDesign( bom.isConfiguredDesign() );
        fusionBomDto.setDeleted( bom.isDeleted() );
        fusionBomDto.setCreator( bom.getCreator() );
        fusionBomDto.setModifier( bom.getModifier() );
        fusionBomDto.setCreatedAt( bom.getCreatedAt() );
        fusionBomDto.setModifiedAt( bom.getModifiedAt() );
        fusionBomDto.setName( bom.getName() );

        return fusionBomDto;
    }

    @Override
    public FusionBom toFusionBom(FusionBomDto bom) {
        if ( bom == null ) {
            return null;
        }

        FusionBom fusionBom = new FusionBom();

        fusionBom.setFusionId( bom.getFusionId() );
        fusionBom.setRevisionId( bom.getRevisionId() );
        fusionBom.setProduct( productActiveReleaseDtoToProductActiveRelease( bom.getProduct() ) );
        fusionBom.setPartNumber( bom.getPartNumber() );
        fusionBom.setDescription( bom.getDescription() );
        fusionBom.setProcessed( bom.isProcessed() );
        fusionBom.setEngineeringBomId( bom.getEngineeringBomId() );
        fusionBom.setDocumentName( bom.getDocumentName() );
        fusionBom.setName( bom.getName() );
        fusionBom.setVersion( bom.getVersion() );
        fusionBom.setLibraryItem( bom.isLibraryItem() );
        fusionBom.setConfiguration( bom.isConfiguration() );
        fusionBom.setConfiguredDesign( bom.isConfiguredDesign() );
        fusionBom.setDeleted( bom.isDeleted() );
        fusionBom.setCreator( bom.getCreator() );
        fusionBom.setModifier( bom.getModifier() );
        fusionBom.setCreatedAt( bom.getCreatedAt() );
        fusionBom.setModifiedAt( bom.getModifiedAt() );

        return fusionBom;
    }

    protected Set<ComponentActiveReleaseDto> bomComponentRelSetToComponentActiveReleaseDtoSet(Set<BomComponentRel> set) {
        if ( set == null ) {
            return null;
        }

        Set<ComponentActiveReleaseDto> set1 = new LinkedHashSet<ComponentActiveReleaseDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( BomComponentRel bomComponentRel : set ) {
            set1.add( bomComponentRelToComponentActiveReleaseDto( bomComponentRel ) );
        }

        return set1;
    }

    protected EngineeringBomWoChildren bomActiveReleaseToEngineeringBomWoChildren(BomActiveRelease bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        EngineeringBomWoChildren engineeringBomWoChildren = new EngineeringBomWoChildren();

        engineeringBomWoChildren.setId( bomActiveRelease.getId() );
        engineeringBomWoChildren.setDeleted( bomActiveRelease.isDeleted() );
        engineeringBomWoChildren.setName( bomActiveRelease.getName() );
        engineeringBomWoChildren.setUkrName( bomActiveRelease.getUkrName() );
        engineeringBomWoChildren.setCreator( bomActiveRelease.getCreator() );
        engineeringBomWoChildren.setModifier( bomActiveRelease.getModifier() );
        engineeringBomWoChildren.setCreatedAt( bomActiveRelease.getCreatedAt() );
        engineeringBomWoChildren.setModifiedAt( bomActiveRelease.getModifiedAt() );
        engineeringBomWoChildren.setProduct( productActiveReleaseToProductActiveReleaseDto( bomActiveRelease.getProduct() ) );
        engineeringBomWoChildren.setDescription( bomActiveRelease.getDescription() );
        engineeringBomWoChildren.setPartNumber( bomActiveRelease.getPartNumber() );
        engineeringBomWoChildren.setChildren( bomComponentRelSetToComponentActiveReleaseDtoSet( bomActiveRelease.getChildren() ) );
        engineeringBomWoChildren.setFusionVersion( bomActiveRelease.getFusionVersion() );
        engineeringBomWoChildren.setFusionId( bomActiveRelease.getFusionId() );
        engineeringBomWoChildren.setLibraryItem( bomActiveRelease.isLibraryItem() );
        engineeringBomWoChildren.setFusionRevisionId( bomActiveRelease.getFusionRevisionId() );
        engineeringBomWoChildren.setConfiguration( bomActiveRelease.isConfiguration() );
        engineeringBomWoChildren.setConfiguredDesign( bomActiveRelease.isConfiguredDesign() );
        engineeringBomWoChildren.setConsistent( bomActiveRelease.isConsistent() );

        return engineeringBomWoChildren;
    }

    protected ComponentActiveReleaseDto bomComponentRelToComponentActiveReleaseDto(BomComponentRel bomComponentRel) {
        if ( bomComponentRel == null ) {
            return null;
        }

        ComponentActiveReleaseDto componentActiveReleaseDto = new ComponentActiveReleaseDto();

        componentActiveReleaseDto.setQuantity( bomComponentRel.getQuantity() );
        componentActiveReleaseDto.setParentBom( bomActiveReleaseToEngineeringBomWoChildren( bomComponentRel.getParentBom() ) );

        return componentActiveReleaseDto;
    }

    protected BomActiveReleaseDto bomActiveReleaseToBomActiveReleaseDto(BomActiveRelease bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        BomActiveReleaseDto bomActiveReleaseDto = new BomActiveReleaseDto();

        bomActiveReleaseDto.setId( bomActiveRelease.getId() );
        bomActiveReleaseDto.setDeleted( bomActiveRelease.isDeleted() );
        bomActiveReleaseDto.setName( bomActiveRelease.getName() );
        bomActiveReleaseDto.setUkrName( bomActiveRelease.getUkrName() );
        bomActiveReleaseDto.setCreator( bomActiveRelease.getCreator() );
        bomActiveReleaseDto.setModifier( bomActiveRelease.getModifier() );
        bomActiveReleaseDto.setCreatedAt( bomActiveRelease.getCreatedAt() );
        bomActiveReleaseDto.setModifiedAt( bomActiveRelease.getModifiedAt() );
        bomActiveReleaseDto.setProduct( productActiveReleaseToProductActiveReleaseDto( bomActiveRelease.getProduct() ) );
        bomActiveReleaseDto.setDescription( bomActiveRelease.getDescription() );
        bomActiveReleaseDto.setPartNumber( bomActiveRelease.getPartNumber() );
        bomActiveReleaseDto.setChildren( bomComponentRelSetToComponentActiveReleaseDtoSet( bomActiveRelease.getChildren() ) );
        bomActiveReleaseDto.setFusionVersion( bomActiveRelease.getFusionVersion() );
        bomActiveReleaseDto.setFusionId( bomActiveRelease.getFusionId() );
        bomActiveReleaseDto.setLibraryItem( bomActiveRelease.isLibraryItem() );
        bomActiveReleaseDto.setFusionRevisionId( bomActiveRelease.getFusionRevisionId() );
        bomActiveReleaseDto.setConfiguration( bomActiveRelease.isConfiguration() );
        bomActiveReleaseDto.setConfiguredDesign( bomActiveRelease.isConfiguredDesign() );
        bomActiveReleaseDto.setConsistent( bomActiveRelease.isConsistent() );

        return bomActiveReleaseDto;
    }

    protected Set<BomActiveReleaseDto> bomActiveReleaseSetToBomActiveReleaseDtoSet(Set<BomActiveRelease> set) {
        if ( set == null ) {
            return null;
        }

        Set<BomActiveReleaseDto> set1 = new LinkedHashSet<BomActiveReleaseDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( BomActiveRelease bomActiveRelease : set ) {
            set1.add( bomActiveReleaseToBomActiveReleaseDto( bomActiveRelease ) );
        }

        return set1;
    }

    protected ProductActiveReleaseDto productActiveReleaseToProductActiveReleaseDto(ProductActiveRelease productActiveRelease) {
        if ( productActiveRelease == null ) {
            return null;
        }

        ProductActiveReleaseDto productActiveReleaseDto = new ProductActiveReleaseDto();

        productActiveReleaseDto.setId( productActiveRelease.getId() );
        productActiveReleaseDto.setDeleted( productActiveRelease.isDeleted() );
        productActiveReleaseDto.setName( productActiveRelease.getName() );
        productActiveReleaseDto.setUkrName( productActiveRelease.getUkrName() );
        productActiveReleaseDto.setCreator( productActiveRelease.getCreator() );
        productActiveReleaseDto.setModifier( productActiveRelease.getModifier() );
        productActiveReleaseDto.setCreatedAt( productActiveRelease.getCreatedAt() );
        productActiveReleaseDto.setModifiedAt( productActiveRelease.getModifiedAt() );
        productActiveReleaseDto.setEngineeringBoms( bomActiveReleaseSetToBomActiveReleaseDtoSet( productActiveRelease.getEngineeringBoms() ) );

        return productActiveReleaseDto;
    }

    protected Set<BomComponentRel> componentActiveReleaseDtoSetToBomComponentRelSet(Set<ComponentActiveReleaseDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<BomComponentRel> set1 = new LinkedHashSet<BomComponentRel>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ComponentActiveReleaseDto componentActiveReleaseDto : set ) {
            set1.add( componentActiveReleaseDtoToBomComponentRel( componentActiveReleaseDto ) );
        }

        return set1;
    }

    protected BomActiveRelease engineeringBomWoChildrenToBomActiveRelease(EngineeringBomWoChildren engineeringBomWoChildren) {
        if ( engineeringBomWoChildren == null ) {
            return null;
        }

        BomActiveRelease bomActiveRelease = new BomActiveRelease();

        bomActiveRelease.setId( engineeringBomWoChildren.getId() );
        bomActiveRelease.setDeleted( engineeringBomWoChildren.isDeleted() );
        bomActiveRelease.setName( engineeringBomWoChildren.getName() );
        bomActiveRelease.setUkrName( engineeringBomWoChildren.getUkrName() );
        bomActiveRelease.setCreator( engineeringBomWoChildren.getCreator() );
        bomActiveRelease.setModifier( engineeringBomWoChildren.getModifier() );
        bomActiveRelease.setCreatedAt( engineeringBomWoChildren.getCreatedAt() );
        bomActiveRelease.setModifiedAt( engineeringBomWoChildren.getModifiedAt() );
        bomActiveRelease.setProduct( productActiveReleaseDtoToProductActiveRelease( engineeringBomWoChildren.getProduct() ) );
        bomActiveRelease.setDescription( engineeringBomWoChildren.getDescription() );
        bomActiveRelease.setPartNumber( engineeringBomWoChildren.getPartNumber() );
        bomActiveRelease.setFusionVersion( engineeringBomWoChildren.getFusionVersion() );
        bomActiveRelease.setFusionId( engineeringBomWoChildren.getFusionId() );
        bomActiveRelease.setLibraryItem( engineeringBomWoChildren.isLibraryItem() );
        bomActiveRelease.setFusionRevisionId( engineeringBomWoChildren.getFusionRevisionId() );
        bomActiveRelease.setConfiguration( engineeringBomWoChildren.isConfiguration() );
        bomActiveRelease.setConfiguredDesign( engineeringBomWoChildren.isConfiguredDesign() );
        bomActiveRelease.setConsistent( engineeringBomWoChildren.isConsistent() );
        bomActiveRelease.setChildren( componentActiveReleaseDtoSetToBomComponentRelSet( engineeringBomWoChildren.getChildren() ) );

        return bomActiveRelease;
    }

    protected BomComponentRel componentActiveReleaseDtoToBomComponentRel(ComponentActiveReleaseDto componentActiveReleaseDto) {
        if ( componentActiveReleaseDto == null ) {
            return null;
        }

        BomComponentRel bomComponentRel = new BomComponentRel();

        bomComponentRel.setQuantity( componentActiveReleaseDto.getQuantity() );
        bomComponentRel.setParentBom( engineeringBomWoChildrenToBomActiveRelease( componentActiveReleaseDto.getParentBom() ) );

        return bomComponentRel;
    }

    protected BomActiveRelease bomActiveReleaseDtoToBomActiveRelease(BomActiveReleaseDto bomActiveReleaseDto) {
        if ( bomActiveReleaseDto == null ) {
            return null;
        }

        BomActiveRelease bomActiveRelease = new BomActiveRelease();

        bomActiveRelease.setId( bomActiveReleaseDto.getId() );
        bomActiveRelease.setDeleted( bomActiveReleaseDto.isDeleted() );
        bomActiveRelease.setName( bomActiveReleaseDto.getName() );
        bomActiveRelease.setUkrName( bomActiveReleaseDto.getUkrName() );
        bomActiveRelease.setCreator( bomActiveReleaseDto.getCreator() );
        bomActiveRelease.setModifier( bomActiveReleaseDto.getModifier() );
        bomActiveRelease.setCreatedAt( bomActiveReleaseDto.getCreatedAt() );
        bomActiveRelease.setModifiedAt( bomActiveReleaseDto.getModifiedAt() );
        bomActiveRelease.setProduct( productActiveReleaseDtoToProductActiveRelease( bomActiveReleaseDto.getProduct() ) );
        bomActiveRelease.setDescription( bomActiveReleaseDto.getDescription() );
        bomActiveRelease.setPartNumber( bomActiveReleaseDto.getPartNumber() );
        bomActiveRelease.setFusionVersion( bomActiveReleaseDto.getFusionVersion() );
        bomActiveRelease.setFusionId( bomActiveReleaseDto.getFusionId() );
        bomActiveRelease.setLibraryItem( bomActiveReleaseDto.isLibraryItem() );
        bomActiveRelease.setFusionRevisionId( bomActiveReleaseDto.getFusionRevisionId() );
        bomActiveRelease.setConfiguration( bomActiveReleaseDto.isConfiguration() );
        bomActiveRelease.setConfiguredDesign( bomActiveReleaseDto.isConfiguredDesign() );
        bomActiveRelease.setConsistent( bomActiveReleaseDto.isConsistent() );
        bomActiveRelease.setChildren( componentActiveReleaseDtoSetToBomComponentRelSet( bomActiveReleaseDto.getChildren() ) );

        return bomActiveRelease;
    }

    protected Set<BomActiveRelease> bomActiveReleaseDtoSetToBomActiveReleaseSet(Set<BomActiveReleaseDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<BomActiveRelease> set1 = new LinkedHashSet<BomActiveRelease>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( BomActiveReleaseDto bomActiveReleaseDto : set ) {
            set1.add( bomActiveReleaseDtoToBomActiveRelease( bomActiveReleaseDto ) );
        }

        return set1;
    }

    protected ProductActiveRelease productActiveReleaseDtoToProductActiveRelease(ProductActiveReleaseDto productActiveReleaseDto) {
        if ( productActiveReleaseDto == null ) {
            return null;
        }

        ProductActiveRelease productActiveRelease = new ProductActiveRelease();

        productActiveRelease.setId( productActiveReleaseDto.getId() );
        productActiveRelease.setDeleted( productActiveReleaseDto.isDeleted() );
        productActiveRelease.setName( productActiveReleaseDto.getName() );
        productActiveRelease.setUkrName( productActiveReleaseDto.getUkrName() );
        productActiveRelease.setCreator( productActiveReleaseDto.getCreator() );
        productActiveRelease.setModifier( productActiveReleaseDto.getModifier() );
        productActiveRelease.setCreatedAt( productActiveReleaseDto.getCreatedAt() );
        productActiveRelease.setModifiedAt( productActiveReleaseDto.getModifiedAt() );
        productActiveRelease.setEngineeringBoms( bomActiveReleaseDtoSetToBomActiveReleaseSet( productActiveReleaseDto.getEngineeringBoms() ) );

        return productActiveRelease;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/FusionBomItemMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class FusionBomItemMapperImpl extends FusionBomItemMapper {

    @Override
    public FusionComponentDto toDto(FusionComponent bom) {
        if ( bom == null ) {
            return null;
        }

        FusionComponentDto fusionComponentDto = new FusionComponentDto();

        fusionComponentDto.setFusionId( bom.getFusionId() );
        fusionComponentDto.setRevisionId( bom.getRevisionId() );
        fusionComponentDto.setType( bom.getType() );
        fusionComponentDto.setPartName( bom.getPartName() );
        fusionComponentDto.setPartNumber( bom.getPartNumber() );
        fusionComponentDto.setDescription( bom.getDescription() );
        fusionComponentDto.setSourceFile( bom.getSourceFile() );
        fusionComponentDto.setPath( bom.getPath() );
        fusionComponentDto.setRoot( bom.isRoot() );

        return fusionComponentDto;
    }

    @Override
    public FusionComponent toFusionBom(FusionComponentDto bom) {
        if ( bom == null ) {
            return null;
        }

        FusionComponent fusionComponent = new FusionComponent();

        fusionComponent.setFusionId( bom.getFusionId() );
        fusionComponent.setRevisionId( bom.getRevisionId() );
        fusionComponent.setType( bom.getType() );
        fusionComponent.setPartName( bom.getPartName() );
        fusionComponent.setPartNumber( bom.getPartNumber() );
        fusionComponent.setDescription( bom.getDescription() );
        fusionComponent.setSourceFile( bom.getSourceFile() );
        fusionComponent.setPath( bom.getPath() );
        fusionComponent.setRoot( bom.isRoot() );

        return fusionComponent;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/MaterialMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.Material;
import com.ua.crow.plm.dto.fusion.MaterialDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class MaterialMapperImpl extends MaterialMapper {

    @Override
    MaterialDto toDto(Material material) {
        if ( material == null ) {
            return null;
        }

        MaterialDto materialDto = new MaterialDto();

        materialDto.setId( material.getId() );
        materialDto.setDeleted( material.isDeleted() );
        materialDto.setName( material.getName() );
        materialDto.setUkrName( material.getUkrName() );

        return materialDto;
    }

    @Override
    Material toPojo(MaterialDto material) {
        if ( material == null ) {
            return null;
        }

        Material material1 = new Material();

        material1.setId( material.getId() );
        material1.setDeleted( material.isDeleted() );
        material1.setName( material.getName() );
        material1.setUkrName( material.getUkrName() );

        return material1;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ItemTypeNameMappingMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.dto.base.ItemTypeNameMappingDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ItemTypeNameMappingMapperImpl extends ItemTypeNameMappingMapper {

    @Override
    public ItemTypeNameMappingDto toDto(ItemTypeNameMapping mapping) {
        if ( mapping == null ) {
            return null;
        }

        ItemTypeNameMappingDto itemTypeNameMappingDto = new ItemTypeNameMappingDto();

        itemTypeNameMappingDto.setId( mapping.getId() );
        itemTypeNameMappingDto.setDeleted( mapping.isDeleted() );
        itemTypeNameMappingDto.setType( mapping.getType() );
        itemTypeNameMappingDto.setName( mapping.getName() );

        return itemTypeNameMappingDto;
    }

    @Override
    public ItemTypeNameMapping toEntity(ItemTypeNameMappingDto dto) {
        if ( dto == null ) {
            return null;
        }

        ItemTypeNameMapping itemTypeNameMapping = new ItemTypeNameMapping();

        itemTypeNameMapping.setId( dto.getId() );
        itemTypeNameMapping.setDeleted( dto.isDeleted() );
        itemTypeNameMapping.setType( dto.getType() );
        itemTypeNameMapping.setName( dto.getName() );

        return itemTypeNameMapping;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/PropertyTypeGroupMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class PropertyTypeGroupMapperImpl extends PropertyTypeGroupMapper {

    @Override
    public BomItemPropertyTypeGroupDto toDto(BomItemPropertyTypeGroup bomItemPropertyTypeGroup) {
        if ( bomItemPropertyTypeGroup == null ) {
            return null;
        }

        BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupDto = new BomItemPropertyTypeGroupDto();

        bomItemPropertyTypeGroupDto.setId( bomItemPropertyTypeGroup.getId() );
        bomItemPropertyTypeGroupDto.setDeleted( bomItemPropertyTypeGroup.isDeleted() );
        bomItemPropertyTypeGroupDto.setName( bomItemPropertyTypeGroup.getName() );
        bomItemPropertyTypeGroupDto.setUkrName( bomItemPropertyTypeGroup.getUkrName() );
        bomItemPropertyTypeGroupDto.setCreator( bomItemPropertyTypeGroup.getCreator() );
        bomItemPropertyTypeGroupDto.setModifier( bomItemPropertyTypeGroup.getModifier() );
        bomItemPropertyTypeGroupDto.setCreatedAt( bomItemPropertyTypeGroup.getCreatedAt() );
        bomItemPropertyTypeGroupDto.setModifiedAt( bomItemPropertyTypeGroup.getModifiedAt() );

        return bomItemPropertyTypeGroupDto;
    }

    @Override
    public BomItemPropertyTypeGroup toPojo(BomItemPropertyTypeGroupDto bomItemPropertyTypeDto) {
        if ( bomItemPropertyTypeDto == null ) {
            return null;
        }

        BomItemPropertyTypeGroup bomItemPropertyTypeGroup = new BomItemPropertyTypeGroup();

        bomItemPropertyTypeGroup.setId( bomItemPropertyTypeDto.getId() );
        bomItemPropertyTypeGroup.setDeleted( bomItemPropertyTypeDto.isDeleted() );
        bomItemPropertyTypeGroup.setName( bomItemPropertyTypeDto.getName() );
        bomItemPropertyTypeGroup.setUkrName( bomItemPropertyTypeDto.getUkrName() );
        bomItemPropertyTypeGroup.setCreator( bomItemPropertyTypeDto.getCreator() );
        bomItemPropertyTypeGroup.setModifier( bomItemPropertyTypeDto.getModifier() );
        bomItemPropertyTypeGroup.setCreatedAt( bomItemPropertyTypeDto.getCreatedAt() );
        bomItemPropertyTypeGroup.setModifiedAt( bomItemPropertyTypeDto.getModifiedAt() );

        return bomItemPropertyTypeGroup;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ComponentGroupMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.ComponentGroup;
import com.ua.crow.plm.dto.base.ComponentGroupDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ComponentGroupMapperImpl extends ComponentGroupMapper {

    @Override
    public ComponentGroupDto toDto(ComponentGroup group) {
        if ( group == null ) {
            return null;
        }

        ComponentGroupDto componentGroupDto = new ComponentGroupDto();

        componentGroupDto.setId( group.getId() );
        componentGroupDto.setDeleted( group.isDeleted() );
        componentGroupDto.setName( group.getName() );
        componentGroupDto.setUkrName( group.getUkrName() );
        componentGroupDto.setCreator( group.getCreator() );
        componentGroupDto.setModifier( group.getModifier() );
        componentGroupDto.setCreatedAt( group.getCreatedAt() );
        componentGroupDto.setModifiedAt( group.getModifiedAt() );
        componentGroupDto.setParent( toDto( group.getParent() ) );

        return componentGroupDto;
    }

    @Override
    public ComponentGroup toEntity(ComponentGroupDto dto) {
        if ( dto == null ) {
            return null;
        }

        ComponentGroup componentGroup = new ComponentGroup();

        componentGroup.setId( dto.getId() );
        componentGroup.setDeleted( dto.isDeleted() );
        componentGroup.setName( dto.getName() );
        componentGroup.setUkrName( dto.getUkrName() );
        componentGroup.setCreator( dto.getCreator() );
        componentGroup.setModifier( dto.getModifier() );
        componentGroup.setCreatedAt( dto.getCreatedAt() );
        componentGroup.setModifiedAt( dto.getModifiedAt() );
        componentGroup.setParent( toEntity( dto.getParent() ) );

        return componentGroup;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ComponentPropertyMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.database.active.ComponentProperty;
import com.ua.crow.plm.dto.UnitsDto;
import com.ua.crow.plm.dto.active.CompPropertiesActiveReleaseDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ComponentPropertyMapperImpl extends ComponentPropertyMapper {

    @Override
    public CompPropertiesActiveReleaseDto toDto(ComponentProperty bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        CompPropertiesActiveReleaseDto compPropertiesActiveReleaseDto = new CompPropertiesActiveReleaseDto();

        compPropertiesActiveReleaseDto.setId( bomActiveRelease.getId() );
        compPropertiesActiveReleaseDto.setDeleted( bomActiveRelease.isDeleted() );
        compPropertiesActiveReleaseDto.setCreator( bomActiveRelease.getCreator() );
        compPropertiesActiveReleaseDto.setModifier( bomActiveRelease.getModifier() );
        compPropertiesActiveReleaseDto.setCreatedAt( bomActiveRelease.getCreatedAt() );
        compPropertiesActiveReleaseDto.setModifiedAt( bomActiveRelease.getModifiedAt() );
        compPropertiesActiveReleaseDto.setStringValue( bomActiveRelease.getStringValue() );
        compPropertiesActiveReleaseDto.setNumericValue( bomActiveRelease.getNumericValue() );
        compPropertiesActiveReleaseDto.setPropertyType( bomItemPropertyTypeToBomItemPropertyTypeDto( bomActiveRelease.getPropertyType() ) );

        return compPropertiesActiveReleaseDto;
    }

    @Override
    public ComponentProperty toPojo(CompPropertiesActiveReleaseDto bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        ComponentProperty componentProperty = new ComponentProperty();

        componentProperty.setId( bomActiveRelease.getId() );
        componentProperty.setDeleted( bomActiveRelease.isDeleted() );
        componentProperty.setCreator( bomActiveRelease.getCreator() );
        componentProperty.setModifier( bomActiveRelease.getModifier() );
        componentProperty.setCreatedAt( bomActiveRelease.getCreatedAt() );
        componentProperty.setModifiedAt( bomActiveRelease.getModifiedAt() );
        componentProperty.setStringValue( bomActiveRelease.getStringValue() );
        componentProperty.setNumericValue( bomActiveRelease.getNumericValue() );
        componentProperty.setPropertyType( bomItemPropertyTypeDtoToBomItemPropertyType( bomActiveRelease.getPropertyType() ) );

        return componentProperty;
    }

    protected UnitsDto unitsToUnitsDto(Units units) {
        if ( units == null ) {
            return null;
        }

        UnitsDto unitsDto = new UnitsDto();

        unitsDto.setId( units.getId() );
        unitsDto.setDeleted( units.isDeleted() );
        unitsDto.setName( units.getName() );
        unitsDto.setUkrName( units.getUkrName() );
        unitsDto.setType( units.getType() );
        unitsDto.setShortName( units.getShortName() );

        return unitsDto;
    }

    protected BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupToBomItemPropertyTypeGroupDto(BomItemPropertyTypeGroup bomItemPropertyTypeGroup) {
        if ( bomItemPropertyTypeGroup == null ) {
            return null;
        }

        BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupDto = new BomItemPropertyTypeGroupDto();

        bomItemPropertyTypeGroupDto.setId( bomItemPropertyTypeGroup.getId() );
        bomItemPropertyTypeGroupDto.setDeleted( bomItemPropertyTypeGroup.isDeleted() );
        bomItemPropertyTypeGroupDto.setName( bomItemPropertyTypeGroup.getName() );
        bomItemPropertyTypeGroupDto.setUkrName( bomItemPropertyTypeGroup.getUkrName() );
        bomItemPropertyTypeGroupDto.setCreator( bomItemPropertyTypeGroup.getCreator() );
        bomItemPropertyTypeGroupDto.setModifier( bomItemPropertyTypeGroup.getModifier() );
        bomItemPropertyTypeGroupDto.setCreatedAt( bomItemPropertyTypeGroup.getCreatedAt() );
        bomItemPropertyTypeGroupDto.setModifiedAt( bomItemPropertyTypeGroup.getModifiedAt() );

        return bomItemPropertyTypeGroupDto;
    }

    protected BomItemPropertyTypeDto bomItemPropertyTypeToBomItemPropertyTypeDto(BomItemPropertyType bomItemPropertyType) {
        if ( bomItemPropertyType == null ) {
            return null;
        }

        BomItemPropertyTypeDto bomItemPropertyTypeDto = new BomItemPropertyTypeDto();

        bomItemPropertyTypeDto.setId( bomItemPropertyType.getId() );
        bomItemPropertyTypeDto.setDeleted( bomItemPropertyType.isDeleted() );
        bomItemPropertyTypeDto.setName( bomItemPropertyType.getName() );
        bomItemPropertyTypeDto.setUkrName( bomItemPropertyType.getUkrName() );
        bomItemPropertyTypeDto.setCreator( bomItemPropertyType.getCreator() );
        bomItemPropertyTypeDto.setModifier( bomItemPropertyType.getModifier() );
        bomItemPropertyTypeDto.setCreatedAt( bomItemPropertyType.getCreatedAt() );
        bomItemPropertyTypeDto.setModifiedAt( bomItemPropertyType.getModifiedAt() );
        bomItemPropertyTypeDto.setUnits( unitsToUnitsDto( bomItemPropertyType.getUnits() ) );
        bomItemPropertyTypeDto.setGroup( bomItemPropertyTypeGroupToBomItemPropertyTypeGroupDto( bomItemPropertyType.getGroup() ) );
        bomItemPropertyTypeDto.setDataType( bomItemPropertyType.getDataType() );

        return bomItemPropertyTypeDto;
    }

    protected Units unitsDtoToUnits(UnitsDto unitsDto) {
        if ( unitsDto == null ) {
            return null;
        }

        Units units = new Units();

        units.setId( unitsDto.getId() );
        units.setDeleted( unitsDto.isDeleted() );
        units.setName( unitsDto.getName() );
        units.setUkrName( unitsDto.getUkrName() );
        units.setType( unitsDto.getType() );
        units.setShortName( unitsDto.getShortName() );

        return units;
    }

    protected BomItemPropertyTypeGroup bomItemPropertyTypeGroupDtoToBomItemPropertyTypeGroup(BomItemPropertyTypeGroupDto bomItemPropertyTypeGroupDto) {
        if ( bomItemPropertyTypeGroupDto == null ) {
            return null;
        }

        BomItemPropertyTypeGroup bomItemPropertyTypeGroup = new BomItemPropertyTypeGroup();

        bomItemPropertyTypeGroup.setId( bomItemPropertyTypeGroupDto.getId() );
        bomItemPropertyTypeGroup.setDeleted( bomItemPropertyTypeGroupDto.isDeleted() );
        bomItemPropertyTypeGroup.setName( bomItemPropertyTypeGroupDto.getName() );
        bomItemPropertyTypeGroup.setUkrName( bomItemPropertyTypeGroupDto.getUkrName() );
        bomItemPropertyTypeGroup.setCreator( bomItemPropertyTypeGroupDto.getCreator() );
        bomItemPropertyTypeGroup.setModifier( bomItemPropertyTypeGroupDto.getModifier() );
        bomItemPropertyTypeGroup.setCreatedAt( bomItemPropertyTypeGroupDto.getCreatedAt() );
        bomItemPropertyTypeGroup.setModifiedAt( bomItemPropertyTypeGroupDto.getModifiedAt() );

        return bomItemPropertyTypeGroup;
    }

    protected BomItemPropertyType bomItemPropertyTypeDtoToBomItemPropertyType(BomItemPropertyTypeDto bomItemPropertyTypeDto) {
        if ( bomItemPropertyTypeDto == null ) {
            return null;
        }

        BomItemPropertyType bomItemPropertyType = new BomItemPropertyType();

        bomItemPropertyType.setId( bomItemPropertyTypeDto.getId() );
        bomItemPropertyType.setDeleted( bomItemPropertyTypeDto.isDeleted() );
        bomItemPropertyType.setName( bomItemPropertyTypeDto.getName() );
        bomItemPropertyType.setUkrName( bomItemPropertyTypeDto.getUkrName() );
        bomItemPropertyType.setCreator( bomItemPropertyTypeDto.getCreator() );
        bomItemPropertyType.setModifier( bomItemPropertyTypeDto.getModifier() );
        bomItemPropertyType.setCreatedAt( bomItemPropertyTypeDto.getCreatedAt() );
        bomItemPropertyType.setModifiedAt( bomItemPropertyTypeDto.getModifiedAt() );
        bomItemPropertyType.setUnits( unitsDtoToUnits( bomItemPropertyTypeDto.getUnits() ) );
        bomItemPropertyType.setGroup( bomItemPropertyTypeGroupDtoToBomItemPropertyTypeGroup( bomItemPropertyTypeDto.getGroup() ) );
        bomItemPropertyType.setDataType( bomItemPropertyTypeDto.getDataType() );

        return bomItemPropertyType;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ReleaseVersionMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.dto.released.ReleaseVersionDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ReleaseVersionMapperImpl extends ReleaseVersionMapper {

    @Override
    public ReleaseVersionDTO toDto(ReleaseVersion bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        ReleaseVersionDTO releaseVersionDTO = new ReleaseVersionDTO();

        releaseVersionDTO.setId( bomActiveRelease.getId() );
        releaseVersionDTO.setDeleted( bomActiveRelease.isDeleted() );
        releaseVersionDTO.setName( bomActiveRelease.getName() );
        releaseVersionDTO.setUkrName( bomActiveRelease.getUkrName() );
        releaseVersionDTO.setCreator( bomActiveRelease.getCreator() );
        releaseVersionDTO.setModifier( bomActiveRelease.getModifier() );
        releaseVersionDTO.setCreatedAt( bomActiveRelease.getCreatedAt() );
        releaseVersionDTO.setModifiedAt( bomActiveRelease.getModifiedAt() );
        releaseVersionDTO.setReleased( bomActiveRelease.isReleased() );
        releaseVersionDTO.setReleaseDate( bomActiveRelease.getReleaseDate() );
        releaseVersionDTO.setVer( bomActiveRelease.getVer() );
        releaseVersionDTO.setDescription( bomActiveRelease.getDescription() );

        return releaseVersionDTO;
    }

    @Override
    public ReleaseVersion toPojo(ReleaseVersionDTO bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        ReleaseVersion releaseVersion = new ReleaseVersion();

        releaseVersion.setId( bomActiveRelease.getId() );
        releaseVersion.setDeleted( bomActiveRelease.isDeleted() );
        releaseVersion.setName( bomActiveRelease.getName() );
        releaseVersion.setUkrName( bomActiveRelease.getUkrName() );
        releaseVersion.setCreator( bomActiveRelease.getCreator() );
        releaseVersion.setModifier( bomActiveRelease.getModifier() );
        releaseVersion.setCreatedAt( bomActiveRelease.getCreatedAt() );
        releaseVersion.setModifiedAt( bomActiveRelease.getModifiedAt() );
        releaseVersion.setReleased( bomActiveRelease.isReleased() );
        releaseVersion.setReleaseDate( bomActiveRelease.getReleaseDate() );
        releaseVersion.setDescription( bomActiveRelease.getDescription() );
        releaseVersion.setVer( bomActiveRelease.getVer() );

        return releaseVersion;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/ComponentMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.inventory.database.ResourceItem;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.active.ComponentActiveRelease;
import com.ua.crow.plm.dto.ResourceGroupDto;
import com.ua.crow.plm.dto.ResourceItemDTO;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class ComponentMapperImpl extends ComponentMapper {

    @Override
    public ComponentActiveReleaseDto toDto(ComponentActiveRelease bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        ComponentActiveReleaseDto componentActiveReleaseDto = new ComponentActiveReleaseDto();

        componentActiveReleaseDto.setId( bomActiveRelease.getId() );
        componentActiveReleaseDto.setDeleted( bomActiveRelease.isDeleted() );
        componentActiveReleaseDto.setName( bomActiveRelease.getName() );
        componentActiveReleaseDto.setUkrName( bomActiveRelease.getUkrName() );
        componentActiveReleaseDto.setCreator( bomActiveRelease.getCreator() );
        componentActiveReleaseDto.setModifier( bomActiveRelease.getModifier() );
        componentActiveReleaseDto.setCreatedAt( bomActiveRelease.getCreatedAt() );
        componentActiveReleaseDto.setModifiedAt( bomActiveRelease.getModifiedAt() );
        if ( bomActiveRelease.getItemType() != null ) {
            componentActiveReleaseDto.setItemType( bomActiveRelease.getItemType().name() );
        }
        componentActiveReleaseDto.setDescription( bomActiveRelease.getDescription() );
        componentActiveReleaseDto.setPartNumber( bomActiveRelease.getPartNumber() );
        componentActiveReleaseDto.setResourceItem( resourceItemToResourceItemDTO( bomActiveRelease.getResourceItem() ) );

        return componentActiveReleaseDto;
    }

    @Override
    public ComponentActiveRelease toPojo(ComponentActiveReleaseDto bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        ComponentActiveRelease componentActiveRelease = new ComponentActiveRelease();

        componentActiveRelease.setId( bomActiveRelease.getId() );
        componentActiveRelease.setDeleted( bomActiveRelease.isDeleted() );
        componentActiveRelease.setName( bomActiveRelease.getName() );
        componentActiveRelease.setUkrName( bomActiveRelease.getUkrName() );
        componentActiveRelease.setCreator( bomActiveRelease.getCreator() );
        componentActiveRelease.setModifier( bomActiveRelease.getModifier() );
        componentActiveRelease.setCreatedAt( bomActiveRelease.getCreatedAt() );
        componentActiveRelease.setModifiedAt( bomActiveRelease.getModifiedAt() );
        if ( bomActiveRelease.getItemType() != null ) {
            componentActiveRelease.setItemType( Enum.valueOf( ItemTypes.class, bomActiveRelease.getItemType() ) );
        }
        componentActiveRelease.setDescription( bomActiveRelease.getDescription() );
        componentActiveRelease.setPartNumber( bomActiveRelease.getPartNumber() );
        componentActiveRelease.setResourceItem( resourceItemDTOToResourceItem( bomActiveRelease.getResourceItem() ) );

        return componentActiveRelease;
    }

    protected List<ResourceGroupDto> resourceGroupListToResourceGroupDtoList(List<ResourceGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<ResourceGroupDto> list1 = new ArrayList<ResourceGroupDto>( list.size() );
        for ( ResourceGroup resourceGroup : list ) {
            list1.add( resourceGroupToResourceGroupDto( resourceGroup ) );
        }

        return list1;
    }

    protected ResourceGroupDto resourceGroupToResourceGroupDto(ResourceGroup resourceGroup) {
        if ( resourceGroup == null ) {
            return null;
        }

        ResourceGroupDto resourceGroupDto = new ResourceGroupDto();

        resourceGroupDto.setId( resourceGroup.getId() );
        resourceGroupDto.setTenantId( resourceGroup.getTenantId() );
        resourceGroupDto.setDeleted( resourceGroup.isDeleted() );
        resourceGroupDto.setName( resourceGroup.getName() );
        resourceGroupDto.setUkrName( resourceGroup.getUkrName() );
        resourceGroupDto.setCreator( resourceGroup.getCreator() );
        resourceGroupDto.setModifier( resourceGroup.getModifier() );
        resourceGroupDto.setCreatedAt( resourceGroup.getCreatedAt() );
        resourceGroupDto.setModifiedAt( resourceGroup.getModifiedAt() );
        resourceGroupDto.setWithdrawAlgorythm( resourceGroup.getWithdrawAlgorythm() );
        resourceGroupDto.setMinimalUnitToWithdraw( resourceGroup.getMinimalUnitToWithdraw() );
        List<ResourceItem> list = resourceGroup.getResources();
        if ( list != null ) {
            resourceGroupDto.setResources( new ArrayList<ResourceItem>( list ) );
        }
        resourceGroupDto.setParent( resourceGroup.getParent() );
        resourceGroupDto.setChildren( resourceGroupListToResourceGroupDtoList( resourceGroup.getChildren() ) );

        return resourceGroupDto;
    }

    protected ResourceItemDTO resourceItemToResourceItemDTO(ResourceItem resourceItem) {
        if ( resourceItem == null ) {
            return null;
        }

        ResourceItemDTO resourceItemDTO = new ResourceItemDTO();

        resourceItemDTO.setId( resourceItem.getId() );
        resourceItemDTO.setDeleted( resourceItem.isDeleted() );
        resourceItemDTO.setName( resourceItem.getName() );
        resourceItemDTO.setUkrName( resourceItem.getUkrName() );
        resourceItemDTO.setCreator( resourceItem.getCreator() );
        resourceItemDTO.setModifier( resourceItem.getModifier() );
        resourceItemDTO.setCreatedAt( resourceItem.getCreatedAt() );
        resourceItemDTO.setModifiedAt( resourceItem.getModifiedAt() );
        resourceItemDTO.setWithdrawAlgorythm( resourceItem.getWithdrawAlgorythm() );
        resourceItemDTO.setMinimalUnitToWithdraw( resourceItem.getMinimalUnitToWithdraw() );
        resourceItemDTO.setPrice( resourceItem.getPrice() );
        resourceItemDTO.setGroup( resourceGroupToResourceGroupDto( resourceItem.getGroup() ) );

        return resourceItemDTO;
    }

    protected List<ResourceGroup> resourceGroupDtoListToResourceGroupList(List<ResourceGroupDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ResourceGroup> list1 = new ArrayList<ResourceGroup>( list.size() );
        for ( ResourceGroupDto resourceGroupDto : list ) {
            list1.add( resourceGroupDtoToResourceGroup( resourceGroupDto ) );
        }

        return list1;
    }

    protected ResourceGroup resourceGroupDtoToResourceGroup(ResourceGroupDto resourceGroupDto) {
        if ( resourceGroupDto == null ) {
            return null;
        }

        ResourceGroup resourceGroup = new ResourceGroup();

        resourceGroup.setId( resourceGroupDto.getId() );
        resourceGroup.setTenantId( resourceGroupDto.getTenantId() );
        resourceGroup.setDeleted( resourceGroupDto.isDeleted() );
        resourceGroup.setName( resourceGroupDto.getName() );
        resourceGroup.setUkrName( resourceGroupDto.getUkrName() );
        resourceGroup.setCreator( resourceGroupDto.getCreator() );
        resourceGroup.setModifier( resourceGroupDto.getModifier() );
        resourceGroup.setCreatedAt( resourceGroupDto.getCreatedAt() );
        resourceGroup.setModifiedAt( resourceGroupDto.getModifiedAt() );
        resourceGroup.setParent( resourceGroupDto.getParent() );
        resourceGroup.setChildren( resourceGroupDtoListToResourceGroupList( resourceGroupDto.getChildren() ) );
        resourceGroup.setWithdrawAlgorythm( resourceGroupDto.getWithdrawAlgorythm() );
        resourceGroup.setMinimalUnitToWithdraw( resourceGroupDto.getMinimalUnitToWithdraw() );
        List<ResourceItem> list1 = resourceGroupDto.getResources();
        if ( list1 != null ) {
            resourceGroup.setResources( new ArrayList<ResourceItem>( list1 ) );
        }

        return resourceGroup;
    }

    protected ResourceItem resourceItemDTOToResourceItem(ResourceItemDTO resourceItemDTO) {
        if ( resourceItemDTO == null ) {
            return null;
        }

        ResourceItem resourceItem = new ResourceItem();

        resourceItem.setId( resourceItemDTO.getId() );
        resourceItem.setDeleted( resourceItemDTO.isDeleted() );
        resourceItem.setName( resourceItemDTO.getName() );
        resourceItem.setUkrName( resourceItemDTO.getUkrName() );
        resourceItem.setCreator( resourceItemDTO.getCreator() );
        resourceItem.setModifier( resourceItemDTO.getModifier() );
        resourceItem.setCreatedAt( resourceItemDTO.getCreatedAt() );
        resourceItem.setModifiedAt( resourceItemDTO.getModifiedAt() );
        resourceItem.setWithdrawAlgorythm( resourceItemDTO.getWithdrawAlgorythm() );
        resourceItem.setMinimalUnitToWithdraw( resourceItemDTO.getMinimalUnitToWithdraw() );
        resourceItem.setPrice( resourceItemDTO.getPrice() );
        resourceItem.setGroup( resourceGroupDtoToResourceGroup( resourceItemDTO.getGroup() ) );

        return resourceItem;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/FullBomMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class FullBomMapperImpl extends FullBomMapper {

    @Override
    public BomActiveReleaseDto toDto(BomActiveRelease bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        BomActiveReleaseDto bomActiveReleaseDto = new BomActiveReleaseDto();

        bomActiveReleaseDto.setId( bomActiveRelease.getId() );
        bomActiveReleaseDto.setDeleted( bomActiveRelease.isDeleted() );
        bomActiveReleaseDto.setName( bomActiveRelease.getName() );
        bomActiveReleaseDto.setUkrName( bomActiveRelease.getUkrName() );
        bomActiveReleaseDto.setCreator( bomActiveRelease.getCreator() );
        bomActiveReleaseDto.setModifier( bomActiveRelease.getModifier() );
        bomActiveReleaseDto.setCreatedAt( bomActiveRelease.getCreatedAt() );
        bomActiveReleaseDto.setModifiedAt( bomActiveRelease.getModifiedAt() );
        bomActiveReleaseDto.setDescription( bomActiveRelease.getDescription() );
        bomActiveReleaseDto.setPartNumber( bomActiveRelease.getPartNumber() );
        bomActiveReleaseDto.setFusionVersion( bomActiveRelease.getFusionVersion() );
        bomActiveReleaseDto.setFusionId( bomActiveRelease.getFusionId() );
        bomActiveReleaseDto.setLibraryItem( bomActiveRelease.isLibraryItem() );
        bomActiveReleaseDto.setFusionRevisionId( bomActiveRelease.getFusionRevisionId() );
        bomActiveReleaseDto.setConfiguration( bomActiveRelease.isConfiguration() );
        bomActiveReleaseDto.setConfiguredDesign( bomActiveRelease.isConfiguredDesign() );
        bomActiveReleaseDto.setConsistent( bomActiveRelease.isConsistent() );

        return bomActiveReleaseDto;
    }

    @Override
    public EngineeringBomWoChildren toDtoWoChildren(BomActiveRelease bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        EngineeringBomWoChildren engineeringBomWoChildren = new EngineeringBomWoChildren();

        engineeringBomWoChildren.setId( bomActiveRelease.getId() );
        engineeringBomWoChildren.setDeleted( bomActiveRelease.isDeleted() );
        engineeringBomWoChildren.setName( bomActiveRelease.getName() );
        engineeringBomWoChildren.setUkrName( bomActiveRelease.getUkrName() );
        engineeringBomWoChildren.setCreator( bomActiveRelease.getCreator() );
        engineeringBomWoChildren.setModifier( bomActiveRelease.getModifier() );
        engineeringBomWoChildren.setCreatedAt( bomActiveRelease.getCreatedAt() );
        engineeringBomWoChildren.setModifiedAt( bomActiveRelease.getModifiedAt() );
        engineeringBomWoChildren.setDescription( bomActiveRelease.getDescription() );
        engineeringBomWoChildren.setPartNumber( bomActiveRelease.getPartNumber() );
        engineeringBomWoChildren.setFusionVersion( bomActiveRelease.getFusionVersion() );
        engineeringBomWoChildren.setFusionId( bomActiveRelease.getFusionId() );
        engineeringBomWoChildren.setLibraryItem( bomActiveRelease.isLibraryItem() );
        engineeringBomWoChildren.setFusionRevisionId( bomActiveRelease.getFusionRevisionId() );
        engineeringBomWoChildren.setConfiguration( bomActiveRelease.isConfiguration() );
        engineeringBomWoChildren.setConfiguredDesign( bomActiveRelease.isConfiguredDesign() );
        engineeringBomWoChildren.setConsistent( bomActiveRelease.isConsistent() );

        return engineeringBomWoChildren;
    }

    @Override
    public BomActiveRelease toPojo(BomActiveReleaseDto bomActiveRelease) {
        if ( bomActiveRelease == null ) {
            return null;
        }

        BomActiveRelease bomActiveRelease1 = new BomActiveRelease();

        bomActiveRelease1.setId( bomActiveRelease.getId() );
        bomActiveRelease1.setDeleted( bomActiveRelease.isDeleted() );
        bomActiveRelease1.setName( bomActiveRelease.getName() );
        bomActiveRelease1.setUkrName( bomActiveRelease.getUkrName() );
        bomActiveRelease1.setCreator( bomActiveRelease.getCreator() );
        bomActiveRelease1.setModifier( bomActiveRelease.getModifier() );
        bomActiveRelease1.setCreatedAt( bomActiveRelease.getCreatedAt() );
        bomActiveRelease1.setModifiedAt( bomActiveRelease.getModifiedAt() );
        bomActiveRelease1.setDescription( bomActiveRelease.getDescription() );
        bomActiveRelease1.setPartNumber( bomActiveRelease.getPartNumber() );
        bomActiveRelease1.setFusionVersion( bomActiveRelease.getFusionVersion() );
        bomActiveRelease1.setFusionId( bomActiveRelease.getFusionId() );
        bomActiveRelease1.setLibraryItem( bomActiveRelease.isLibraryItem() );
        bomActiveRelease1.setFusionRevisionId( bomActiveRelease.getFusionRevisionId() );
        bomActiveRelease1.setConfiguration( bomActiveRelease.isConfiguration() );
        bomActiveRelease1.setConfiguredDesign( bomActiveRelease.isConfiguredDesign() );
        bomActiveRelease1.setConsistent( bomActiveRelease.isConsistent() );

        return bomActiveRelease1;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/plm/converters/mappers/BodyMapperImpl.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.FusionPhysicalProperty;
import com.ua.crow.plm.database.fusion.Material;
import com.ua.crow.plm.dto.fusion.Body;
import com.ua.crow.plm.dto.fusion.MaterialDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class BodyMapperImpl extends BodyMapper {

    @Override
    public Body toDto(FusionPhysicalProperty fusionPhysicalProperty) {
        if ( fusionPhysicalProperty == null ) {
            return null;
        }

        Body body = new Body();

        body.setBodyName( fusionPhysicalProperty.getBodyName() );
        body.setWidthMm( fusionPhysicalProperty.getWidthMm() );
        body.setLengthMm( fusionPhysicalProperty.getLengthMm() );
        body.setHeightMm( fusionPhysicalProperty.getHeightMm() );
        body.setVolumeCm3( fusionPhysicalProperty.getVolumeCm3() );
        body.setAreaCm2( fusionPhysicalProperty.getAreaCm2() );
        body.setMassKg( fusionPhysicalProperty.getMassKg() );
        body.setDensityKgCm2( fusionPhysicalProperty.getDensityKgCm2() );
        body.setMaterial( materialToMaterialDto( fusionPhysicalProperty.getMaterial() ) );

        return body;
    }

    @Override
    public FusionPhysicalProperty toPojo(Body body) {
        if ( body == null ) {
            return null;
        }

        FusionPhysicalProperty fusionPhysicalProperty = new FusionPhysicalProperty();

        fusionPhysicalProperty.setBodyName( body.getBodyName() );
        fusionPhysicalProperty.setMaterial( materialDtoToMaterial( body.getMaterial() ) );
        fusionPhysicalProperty.setWidthMm( body.getWidthMm() );
        fusionPhysicalProperty.setLengthMm( body.getLengthMm() );
        fusionPhysicalProperty.setHeightMm( body.getHeightMm() );
        fusionPhysicalProperty.setVolumeCm3( body.getVolumeCm3() );
        fusionPhysicalProperty.setAreaCm2( body.getAreaCm2() );
        fusionPhysicalProperty.setMassKg( body.getMassKg() );
        fusionPhysicalProperty.setDensityKgCm2( body.getDensityKgCm2() );

        return fusionPhysicalProperty;
    }

    protected MaterialDto materialToMaterialDto(Material material) {
        if ( material == null ) {
            return null;
        }

        MaterialDto materialDto = new MaterialDto();

        materialDto.setId( material.getId() );
        materialDto.setDeleted( material.isDeleted() );
        materialDto.setName( material.getName() );
        materialDto.setUkrName( material.getUkrName() );

        return materialDto;
    }

    protected Material materialDtoToMaterial(MaterialDto materialDto) {
        if ( materialDto == null ) {
            return null;
        }

        Material material = new Material();

        material.setId( materialDto.getId() );
        material.setDeleted( materialDto.isDeleted() );
        material.setName( materialDto.getName() );
        material.setUkrName( materialDto.getUkrName() );

        return material;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/TimeLogMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.mes.database.TimeLog;
import com.ua.crow.mes.dto.TimeLogDto;
import com.ua.crow.mes.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class TimeLogMapperImpl extends TimeLogMapper {

    @Override
    public TimeLogDto toDto(TimeLog timeLog) {
        if ( timeLog == null ) {
            return null;
        }

        TimeLogDto timeLogDto = new TimeLogDto();

        timeLogDto.setId( timeLog.getId() );
        timeLogDto.setDeleted( timeLog.isDeleted() );
        timeLogDto.setName( timeLog.getName() );
        timeLogDto.setUkrName( timeLog.getUkrName() );
        timeLogDto.setCreator( timeLog.getCreator() );
        timeLogDto.setModifier( timeLog.getModifier() );
        timeLogDto.setCreatedAt( timeLog.getCreatedAt() );
        timeLogDto.setModifiedAt( timeLog.getModifiedAt() );
        timeLogDto.setAmount( timeLog.getAmount() );
        timeLogDto.setLoggedBy( userEntityToUserDto( timeLog.getLoggedBy() ) );
        timeLogDto.setDate( timeLog.getDate() );

        return timeLogDto;
    }

    protected UserDto userEntityToUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userEntity.getId() );
        userDto.setDeleted( userEntity.isDeleted() );
        userDto.setUsername( userEntity.getUsername() );
        userDto.setEnabled( userEntity.isEnabled() );
        userDto.setName( userEntity.getName() );

        return userDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/SeverityMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Severity;
import com.ua.crow.mes.dto.SeverityDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class SeverityMapperImpl extends SeverityMapper {

    @Override
    public SeverityDto toDto(Severity severity) {
        if ( severity == null ) {
            return null;
        }

        SeverityDto severityDto = new SeverityDto();

        severityDto.setColor( severity.getColor() );
        if ( severity.getValue() != null ) {
            severityDto.setValue( severity.getValue() );
        }

        severityDto.setName( severity.toString() );

        return severityDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/SubtaskMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Subtask;
import com.ua.crow.mes.dto.SubtaskDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class SubtaskMapperImpl extends SubtaskMapper {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public SubtaskDto toDto(Subtask severity) {
        if ( severity == null ) {
            return null;
        }

        SubtaskDto subtaskDto = new SubtaskDto();

        subtaskDto.setId( severity.getId() );
        subtaskDto.setDeleted( severity.isDeleted() );
        subtaskDto.setName( severity.getName() );
        subtaskDto.setUkrName( severity.getUkrName() );
        subtaskDto.setCreator( severity.getCreator() );
        subtaskDto.setModifier( severity.getModifier() );
        subtaskDto.setCreatedAt( severity.getCreatedAt() );
        subtaskDto.setModifiedAt( severity.getModifiedAt() );
        subtaskDto.setSequence( severity.getSequence() );
        subtaskDto.setTask( taskMapper.toRef( severity.getTask() ) );

        return subtaskDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/TaskMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Subtask;
import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.database.TaskStatus;
import com.ua.crow.mes.database.TimeLog;
import com.ua.crow.mes.dto.SubtaskDto;
import com.ua.crow.mes.dto.TaskDto;
import com.ua.crow.mes.dto.TaskRef;
import com.ua.crow.mes.dto.TaskStatusDto;
import com.ua.crow.mes.dto.TimeLogDto;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class TaskMapperImpl extends TaskMapper {

    @Autowired
    private TaskTypeMapper taskTypeMapper;
    @Autowired
    private UserEntityMapper userEntityMapper;
    @Autowired
    private CommentsMapper commentsMapper;
    @Autowired
    private SeverityMapper severityMapper;
    @Autowired
    private TimeLogMapper timeLogMapper;

    @Override
    public TaskDto toDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setId( task.getId() );
        taskDto.setDeleted( task.isDeleted() );
        taskDto.setName( task.getName() );
        taskDto.setUkrName( task.getUkrName() );
        taskDto.setCreator( task.getCreator() );
        taskDto.setModifier( task.getModifier() );
        taskDto.setCreatedAt( task.getCreatedAt() );
        taskDto.setModifiedAt( task.getModifiedAt() );
        taskDto.setAssignee( userEntityMapper.toDto( task.getAssignee() ) );
        taskDto.setSubtask( task.isSubtask() );
        taskDto.setReporter( userEntityMapper.toDto( task.getReporter() ) );
        taskDto.setDescription( task.getDescription() );
        taskDto.setStatus( taskStatusToTaskStatusDto( task.getStatus() ) );
        taskDto.setStart( task.getStart() );
        taskDto.setHoursLogged( timeLogListToTimeLogDtoList( task.getHoursLogged() ) );
        taskDto.setComments( commentsMapper.map( task.getComments() ) );
        taskDto.setSubtasks( subtaskSetToSubtaskDtoSet( task.getSubtasks() ) );
        taskDto.setSeverity( severityMapper.toDto( task.getSeverity() ) );
        taskDto.setTaskType( taskTypeMapper.toDto( task.getTaskType() ) );

        taskDto.setTotalHoursLogged( taskService.computeTotalHoursLogged(task) );
        taskDto.setSubtasksCount( taskService.getSubtasksCount(task) );

        return taskDto;
    }

    @Override
    public TaskRef toRef(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskRef taskRef = new TaskRef();

        taskRef.setType( taskTypeMapper.toDto( task.getTaskType() ) );
        taskRef.setId( task.getId() );
        taskRef.setDeleted( task.isDeleted() );
        taskRef.setName( task.getName() );
        taskRef.setUkrName( task.getUkrName() );
        taskRef.setCreator( task.getCreator() );
        taskRef.setModifier( task.getModifier() );
        taskRef.setCreatedAt( task.getCreatedAt() );
        taskRef.setModifiedAt( task.getModifiedAt() );
        taskRef.setStatus( taskStatusToTaskStatusDto( task.getStatus() ) );
        taskRef.setAssignee( userEntityMapper.toDto( task.getAssignee() ) );
        taskRef.setReporter( userEntityMapper.toDto( task.getReporter() ) );

        return taskRef;
    }

    protected TaskStatusDto taskStatusToTaskStatusDto(TaskStatus taskStatus) {
        if ( taskStatus == null ) {
            return null;
        }

        TaskStatusDto taskStatusDto = new TaskStatusDto();

        taskStatusDto.setId( taskStatus.getId() );
        taskStatusDto.setDeleted( taskStatus.isDeleted() );
        taskStatusDto.setName( taskStatus.getName() );
        taskStatusDto.setUkrName( taskStatus.getUkrName() );
        taskStatusDto.setTaskType( taskTypeMapper.toDto( taskStatus.getTaskType() ) );
        taskStatusDto.setInitialStatus( taskStatus.isInitialStatus() );
        taskStatusDto.setTerminatedStatus( taskStatus.isTerminatedStatus() );

        return taskStatusDto;
    }

    protected List<TimeLogDto> timeLogListToTimeLogDtoList(List<TimeLog> list) {
        if ( list == null ) {
            return null;
        }

        List<TimeLogDto> list1 = new ArrayList<TimeLogDto>( list.size() );
        for ( TimeLog timeLog : list ) {
            list1.add( timeLogMapper.toDto( timeLog ) );
        }

        return list1;
    }

    protected SubtaskDto subtaskToSubtaskDto(Subtask subtask) {
        if ( subtask == null ) {
            return null;
        }

        SubtaskDto subtaskDto = new SubtaskDto();

        subtaskDto.setId( subtask.getId() );
        subtaskDto.setDeleted( subtask.isDeleted() );
        subtaskDto.setName( subtask.getName() );
        subtaskDto.setUkrName( subtask.getUkrName() );
        subtaskDto.setCreator( subtask.getCreator() );
        subtaskDto.setModifier( subtask.getModifier() );
        subtaskDto.setCreatedAt( subtask.getCreatedAt() );
        subtaskDto.setModifiedAt( subtask.getModifiedAt() );
        subtaskDto.setSequence( subtask.getSequence() );
        subtaskDto.setTask( toRef( subtask.getTask() ) );

        return subtaskDto;
    }

    protected Set<SubtaskDto> subtaskSetToSubtaskDtoSet(Set<Subtask> set) {
        if ( set == null ) {
            return null;
        }

        Set<SubtaskDto> set1 = new LinkedHashSet<SubtaskDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Subtask subtask : set ) {
            set1.add( subtaskToSubtaskDto( subtask ) );
        }

        return set1;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/TaskTypeMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.TaskType;
import com.ua.crow.mes.dto.TaskTypeDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class TaskTypeMapperImpl extends TaskTypeMapper {

    @Override
    public TaskTypeDto toDto(TaskType taskType) {
        if ( taskType == null ) {
            return null;
        }

        TaskTypeDto taskTypeDto = new TaskTypeDto();

        taskTypeDto.setId( taskType.getId() );
        taskTypeDto.setDeleted( taskType.isDeleted() );
        taskTypeDto.setName( taskType.getName() );
        taskTypeDto.setUkrName( taskType.getUkrName() );

        return taskTypeDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/UserEntityMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.mes.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class UserEntityMapperImpl extends UserEntityMapper {

    @Override
    public UserDto toDto(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setDeleted( user.isDeleted() );
        userDto.setUsername( user.getUsername() );
        userDto.setEnabled( user.isEnabled() );
        userDto.setName( user.getName() );

        return userDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/TaskStatusMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.TaskStatus;
import com.ua.crow.mes.database.TaskType;
import com.ua.crow.mes.dto.TaskStatusDto;
import com.ua.crow.mes.dto.TaskTypeDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class TaskStatusMapperImpl extends TaskStatusMapper {

    @Override
    public TaskStatusDto toDto(TaskStatus task) {
        if ( task == null ) {
            return null;
        }

        TaskStatusDto taskStatusDto = new TaskStatusDto();

        taskStatusDto.setId( task.getId() );
        taskStatusDto.setDeleted( task.isDeleted() );
        taskStatusDto.setName( task.getName() );
        taskStatusDto.setUkrName( task.getUkrName() );
        taskStatusDto.setTaskType( taskTypeToTaskTypeDto( task.getTaskType() ) );
        taskStatusDto.setInitialStatus( task.isInitialStatus() );
        taskStatusDto.setTerminatedStatus( task.isTerminatedStatus() );

        return taskStatusDto;
    }

    protected TaskTypeDto taskTypeToTaskTypeDto(TaskType taskType) {
        if ( taskType == null ) {
            return null;
        }

        TaskTypeDto taskTypeDto = new TaskTypeDto();

        taskTypeDto.setId( taskType.getId() );
        taskTypeDto.setDeleted( taskType.isDeleted() );
        taskTypeDto.setName( taskType.getName() );
        taskTypeDto.setUkrName( taskType.getUkrName() );

        return taskTypeDto;
    }
}



// ===== File: crow/target/generated-sources/annotations/com/ua/crow/mes/conversion/CommentsMapperImpl.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.mes.database.Comment;
import com.ua.crow.mes.dto.CommentDto;
import com.ua.crow.mes.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-21T16:20:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class CommentsMapperImpl extends CommentsMapper {

    @Override
    public CommentDto toDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        commentDto.setId( comment.getId() );
        commentDto.setDeleted( comment.isDeleted() );
        commentDto.setName( comment.getName() );
        commentDto.setUkrName( comment.getUkrName() );
        commentDto.setCreator( comment.getCreator() );
        commentDto.setModifier( comment.getModifier() );
        commentDto.setCreatedAt( comment.getCreatedAt() );
        commentDto.setModifiedAt( comment.getModifiedAt() );
        commentDto.setImageUrl( comment.getImageUrl() );
        commentDto.setAudioUrl( comment.getAudioUrl() );
        commentDto.setAuthor( userEntityToUserDto( comment.getAuthor() ) );

        return commentDto;
    }

    @Override
    public List<CommentDto> map(List<Comment> comments) {
        if ( comments == null ) {
            return null;
        }

        List<CommentDto> list = new ArrayList<CommentDto>( comments.size() );
        for ( Comment comment : comments ) {
            list.add( toDto( comment ) );
        }

        return list;
    }

    protected UserDto userEntityToUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userEntity.getId() );
        userDto.setDeleted( userEntity.isDeleted() );
        userDto.setUsername( userEntity.getUsername() );
        userDto.setEnabled( userEntity.isEnabled() );
        userDto.setName( userEntity.getName() );

        return userDto;
    }
}



// ===== File: crow/src/test/java/com/ua/crown/CrownApplicationTests.java =====
package com.ua.crown;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class CrownApplicationTests {

    @BeforeEach
    public void setUp() {}
}



// ===== File: crow/src/main/java/com/ua/crow/dto/basic/NamedNumericIdEntityDto.java =====
package com.ua.crow.dto.basic;

import lombok.*;

@Getter
@Setter
public class NamedNumericIdEntityDto extends NumericIdEntityDto {
    private String name;

    private String ukrName;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/basic/FindProjectByNameRequest.java =====
package com.ua.crow.dto.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindProjectByNameRequest {
    String name;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/basic/NumericIdEntityDto.java =====
package com.ua.crow.dto.basic;

import lombok.*;

@Getter
@Setter
public class NumericIdEntityDto {
    private Long id;
    private boolean deleted;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/basic/StringIdEntityDto.java =====
package com.ua.crow.dto.basic;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class StringIdEntityDto {
    @Id
    String id;

    private boolean deleted;

}



// ===== File: crow/src/main/java/com/ua/crow/dto/basic/NamedStringIdEntityDto.java =====
package com.ua.crow.dto.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NamedStringIdEntityDto extends StringIdEntityDto {
    private String name;

    private String ukrName;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/basic/NamedBasicEntityWithNumericIdDto.java =====
package com.ua.crow.dto.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.*;

@Getter
@Setter
public class NamedBasicEntityWithNumericIdDto extends NamedNumericIdEntityDto {

    private String creator = null;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String modifier = null;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createdAt = null;

    private Date modifiedAt = null;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/JwtRequest.java =====
package com.ua.crow.dto;

import lombok.*;

@Getter
@Setter
public class JwtRequest {
    private String username;

    private String password;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/FileTypes.java =====
package com.ua.crow.dto;

public enum FileTypes {
    VIDEO,
    AUDIO,
    IMAGE,
    DOCUMENT
}



// ===== File: crow/src/main/java/com/ua/crow/dto/appsmith/ResponseMeta.java =====
package com.ua.crow.dto.appsmith;

public class ResponseMeta {
    public int status;
    public boolean success;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/appsmith/Data.java =====
package com.ua.crow.dto.appsmith;

import lombok.*;

@Getter
@Setter
public class Data {
    public String email;
    public String username;
    public String name;
    public String useCase;
    public boolean enableTelemetry;
    public boolean accountNonExpired;
    public boolean accountNonLocked;
    public boolean credentialsNonExpired;
    public boolean emptyInstance;
    public boolean isAnonymous;
    public boolean isEnabled;
    public boolean isSuperUser;
    public boolean isConfigurable;
    public boolean adminSettingsVisible;
    public boolean isIntercomConsentGiven;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/appsmith/MeResponse.java =====
package com.ua.crow.dto.appsmith;

public class MeResponse {
    public ResponseMeta responseMeta;
    public Data data;
    public String errorDisplay;
}



// ===== File: crow/src/main/java/com/ua/crow/dto/ErrorInfo.java =====
package com.ua.crow.dto;

import java.util.Optional;
import lombok.Getter;

public record ErrorInfo(@Getter int code, @Getter String message, Optional<String> url) {
    public static ErrorInfo createErrorInfo(int code, String message, String url) {
        return new ErrorInfo(code, message, Optional.of(url));
    }

    public static ErrorInfo createErrorInfo(int code, String message) {
        return new ErrorInfo(code, message, Optional.empty());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/dto/mappers/UnitsMapper.java =====
package com.ua.crow.dto.mappers;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.plm.dto.UnitsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UnitsMapper {
    public abstract UnitsDto toDto(Units units);
    public abstract Units toPojo(UnitsDto unitsDto);
}



// ===== File: crow/src/main/java/com/ua/crow/dto/JwtResponse.java =====
package com.ua.crow.dto;

import lombok.*;

public class JwtResponse {
    @Getter
    @Setter
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public JwtResponse() {}
}



// ===== File: crow/src/main/java/com/ua/crow/database/repository/UnitsRepository.java =====
package com.ua.crow.database.repository;

import com.ua.crow.database.models.common.Units;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitsRepository extends CrudRepository<Units, Long> {
    Optional<Units> findByShortName(String shortName);
}



// ===== File: crow/src/main/java/com/ua/crow/database/repository/UserRoleRepository.java =====
package com.ua.crow.database.repository;

import com.ua.crow.database.models.auth.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/database/repository/UserRepository.java =====
package com.ua.crow.database.repository;

import com.ua.crow.database.models.auth.UserEntity;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/auth/UserRole.java =====
package com.ua.crow.database.models.auth;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity(name = "userrole")
@Table(indexes = {@Index(name = "userrole_user_id_uindex", columnList = "user_id")})
public class UserRole {

    @Id
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @OneToOne(mappedBy = "userRole", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private UserEntity user;

    public UserRole() {}


    public UserRole(Role role) {
        this.role = role;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/auth/UserEntity.java =====
package com.ua.crow.database.models.auth;

import com.ua.crow.database.models.common.basic.NumericIdEntity;
import com.ua.crow.workspace.WorkspaceType;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
public class UserEntity extends NumericIdEntity {

    @Column(nullable = false, unique = true)
    private String username;

    private String name;

    private String password;

    private boolean enabled;

    private String email;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean anonymous;

    private boolean credentialsNonExpired;

    @Enumerated(EnumType.STRING)
    private WorkspaceType currentWorkspace;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private UserRole userRole;

    public UserEntity() {}

    public UserEntity(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/auth/Role.java =====
package com.ua.crow.database.models.auth;

public enum Role {
    ADMIN,
    RESEARCH,
    WORKER
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/cashbox/Cashbox.java =====
package com.ua.crow.database.models.cashbox;

import com.ua.crow.database.models.common.Location;
import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.database.models.common.basic.Currency;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cashbox extends BasicEntityWithNumericId {

    @ManyToOne
    private Location location;

    @ManyToOne
    private Currency currency;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/cashbox/CashboxLeftovers.java =====
package com.ua.crow.database.models.cashbox;

import com.ua.crow.database.models.common.basic.NumericIdEntity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

public class CashboxLeftovers extends NumericIdEntity {
    @ManyToOne
    private Cashbox cashbox;

    private Date date;

    double leftover;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/Country.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Country extends NamedNumericIdEntity {
    private String code;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/NumericIdEntity.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public class NumericIdEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tenantId;

    private boolean deleted;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/NamedBasicEntityWithNumericId.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import lombok.*;
import org.springframework.data.annotation.*;

@Getter
@Setter
@MappedSuperclass
public class NamedBasicEntityWithNumericId extends NamedNumericIdEntity {
    @CreatedBy
    private String creator = null;

    @LastModifiedBy
    private String modifier = null;

    @CreatedDate
    private Date createdAt = null;

    @LastModifiedDate
    private Date modifiedAt = null;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/BasicEntityWithNumericId.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import lombok.*;
import org.springframework.data.annotation.*;

@Getter
@Setter
@MappedSuperclass
public class BasicEntityWithNumericId extends NumericIdEntity {

    @CreatedBy
    private String creator = null;

    @LastModifiedBy
    private String modifier = null;

    @CreatedDate
    private Date createdAt = null;

    @LastModifiedDate
    private Date modifiedAt = null;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/NamedNumericIdEntity.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Getter
@Setter
@MappedSuperclass
public class NamedNumericIdEntity extends NumericIdEntity {

    private String name;

    private String ukrName;

}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/StringIdEntity.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StringIdEntity {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String tenantId;

    private boolean deleted;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/Currency.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
public class Currency extends NamedNumericIdEntity {
    private String code;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/basic/NamedStringIdEntity.java =====
package com.ua.crow.database.models.common.basic;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class NamedStringIdEntity extends StringIdEntity {

    private String name;

    private String ukrName;

}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/AbstractResourceGroup.java =====
package com.ua.crow.database.models.common;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractResourceGroup<T extends AbstractResourceGroup<T>> extends NamedBasicEntityWithNumericId implements Convertable {

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private T parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<T> children;

}


// ===== File: crow/src/main/java/com/ua/crow/database/models/common/Address.java =====
package com.ua.crow.database.models.common;

import com.ua.crow.database.models.common.basic.NumericIdEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address extends NumericIdEntity {
    private String addressLine1;
    private String addressLine2;
    private String postCode;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/Units.java =====
package com.ua.crow.database.models.common;

import com.ua.crow.database.models.common.basic.NamedNumericIdEntity;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class Units extends NamedNumericIdEntity implements Convertable {

    @Enumerated(EnumType.STRING)
    private TypeOfUnits type;

    private String shortName;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/TypeOfUnits.java =====
package com.ua.crow.database.models.common;

// volume, lenght, voltage etc
public enum TypeOfUnits {
    SQUARE,
    UNITS_LENGTH,
    MASS,
    VOLUME,
    DENSITY,
    PRESSURE,
    TEMPERATURE,
    PCS;
}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/DataTypes.java =====
package com.ua.crow.database.models.common;

public enum DataTypes {
    NUMBER,
    TEXT,
    RASTISED_IMAGE,
    VECTOR_IMAGE,
    URL,
    MONEY,
    MODEL



}



// ===== File: crow/src/main/java/com/ua/crow/database/models/common/Location.java =====
package com.ua.crow.database.models.common;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.database.models.common.basic.Country;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Location extends BasicEntityWithNumericId {

    @ManyToOne
    private Country country;

    @ManyToOne
    private Address address;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/fusion/FusionComponentDto.java =====
package com.ua.crow.plm.dto.fusion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Configurable
public class FusionComponentDto implements Convertable {

    private String fusionId;

    private String revisionId;

    private ItemTypes type;

    private String partName;

    private FusionComponentDto parent;

    private FusionBomDto parentBom;

    private List<FusionComponentDto> children = new LinkedList<>();

    private String partNumber;

    private Double quantity;

    private String description;

    private String sourceFile;

    private String path;

    private Set<Body> bodies;

    private boolean root;

    public void addChild(FusionComponentDto item){
        children.add(item);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/fusion/AddChildRequest.java =====
package com.ua.crow.plm.dto.fusion;

import com.ua.crow.plm.database.fusion.FusionId;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddChildRequest {

    @NotNull
    FusionId parentId;

    @NotNull
    FusionId bomId;

    @NotNull
    FusionId childId;


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/fusion/FusionBomDto.java =====
package com.ua.crow.plm.dto.fusion;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FusionBomDto  implements Convertable {
    String fusionId;
    ProductActiveReleaseDto product;
    String documentName;
    String version;
    boolean processed;
    Long engineeringBomId;
    String description;
    boolean isLibraryItem;
    String revisionId;
    String partNumber;
    boolean isConfiguration;
    boolean isConfiguredDesign;
    FusionComponentDto rootPart;
    boolean deleted;

    private String creator = null;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String modifier = null;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createdAt = null;

    private Date modifiedAt = null;

    private String name;

    /**
     * Signed URL to download STEP model from MinIO.
     */
    private String url;

    private java.util.List<FusionBomDto> children;

    public java.util.List<FusionBomDto> getChildren() {
        return children == null ? java.util.Collections.emptyList() : children;
    }

    public void setChildren(java.util.List<FusionBomDto> children) {
        this.children = children;
    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/fusion/Body.java =====
package com.ua.crow.plm.dto.fusion;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Body {
    String bodyName;
    String description;
    Double widthMm;
    Double lengthMm;
    Double heightMm;
    Double volumeCm3;
    Double areaCm2;
    Double massKg;
    Double densityKgCm2;
    MaterialDto material;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/fusion/FusionRevisionDto.java =====
package com.ua.crow.plm.dto.fusion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FusionRevisionDto {
    private String revisionId;
    private int number;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/fusion/MaterialDto.java =====
package com.ua.crow.plm.dto.fusion;

import com.ua.crow.dto.basic.NamedStringIdEntityDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialDto extends NamedStringIdEntityDto {

}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/ResourceGroupDto.java =====
package com.ua.crow.plm.dto;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.inventory.database.ResourceItem;
import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.plm.database.WithdrawAlgorythm;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ResourceGroupDto extends NamedBasicEntityWithNumericId implements Convertable {
    private WithdrawAlgorythm withdrawAlgorythm;
    private double minimalUnitToWithdraw;
    List<ResourceItem> resources;
    private ResourceGroup parent;
    private List<ResourceGroupDto> children;

}




// ===== File: crow/src/main/java/com/ua/crow/plm/dto/BomDtoShort.java =====
package com.ua.crow.plm.dto;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;

public class BomDtoShort extends NamedBasicEntityWithNumericIdDto {
    
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/ResourceItemDTO.java =====
package com.ua.crow.plm.dto;


import com.ua.crow.plm.database.WithdrawAlgorythm;
import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;

import lombok.Data;

@Data
public class ResourceItemDTO extends NamedBasicEntityWithNumericIdDto {


    private WithdrawAlgorythm withdrawAlgorythm;

    private double minimalUnitToWithdraw;

    private double price;


    private ResourceGroupDto group;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/UnitsDto.java =====
package com.ua.crow.plm.dto;

import com.ua.crow.database.models.common.TypeOfUnits;
import com.ua.crow.dto.basic.NamedNumericIdEntityDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnitsDto extends NamedNumericIdEntityDto {

    private TypeOfUnits type;

    private String shortName;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/merge/MergeBomTreesDto.java =====
package com.ua.crow.plm.dto.merge;

import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO combining Fusion and Engineering BOM trees for merge UI.
 */
@Getter
@Setter
public class MergeBomTreesDto {
    private FusionBomDto fusionBom;
    private BomActiveReleaseDto engineeringBom;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/ResourceDto.java =====
package com.ua.crow.plm.dto;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.plm.database.WithdrawAlgorythm;
import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourceDto extends NamedBasicEntityWithNumericIdDto {


    private WithdrawAlgorythm withdrawAlgorythm;

    private double minimalUnitToWithdraw;

    private double price;


    private ResourceGroup group;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/requests/MergeBomItemsRequest.java =====
package com.ua.crow.plm.dto.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MergeBomItemsRequest {
    @NotNull
    @NotEmpty
    private String sourceFusionId;
    @NotNull
    @NotEmpty
    private String sourceRevisionId;
    @NotNull
    @NotEmpty
    private String targetFusionId;
    @NotNull
    @NotEmpty
    private String targetRevisionId;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/requests/FusionBomsListRequest.java =====
package com.ua.crow.plm.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class FusionBomsListRequest {
    Optional<Long> productId = Optional.empty();
    Optional<Long> release = Optional.empty();
    Optional<Boolean> unprocessed = Optional.empty();
    Optional<String> partNumber = Optional.empty();


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/requests/MapProductRequest.java =====
package com.ua.crow.plm.dto.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MapProductRequest {
    @NotNull
    Long productId;
    @NotNull
    @NotEmpty
    String fusionBomId;

    @NotNull
    @NotEmpty
    String revisionId;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/requests/ComponentRequestDto.java =====
package com.ua.crow.plm.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComponentRequestDto {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/released/ReleaseVersionDTO.java =====
package com.ua.crow.plm.dto.released;


import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Data;

import java.util.Date;

@Data
public class ReleaseVersionDTO extends NamedBasicEntityWithNumericIdDto {

    private boolean released;

    private Date releaseDate;

    private ReleaseVersionDTO previous;

    private Double ver;

    private String description;


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/released/ComponentReleasedPropertiesDto.java =====
package com.ua.crow.plm.dto.released;

import com.ua.crow.plm.dto.base.ComponentPropertiesDTO;

public class ComponentReleasedPropertiesDto extends ComponentPropertiesDTO<ComponentReleasedDTO> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/released/BomReleasedDTO.java =====
package com.ua.crow.plm.dto.released;


import com.ua.crow.plm.dto.base.EngineeringBomDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BomReleasedDTO extends EngineeringBomDTO<ComponentReleasedDTO, ProductReleasedDTO> {
    private ReleaseVersionDTO releaseVersion;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/released/ComponentReleasedDTO.java =====
package com.ua.crow.plm.dto.released;

import com.ua.crow.plm.dto.base.ComponentDTO;
import com.ua.crow.plm.dto.base.ComponentPropertiesDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ComponentReleasedDTO extends ComponentDTO<BomReleasedDTO, ComponentPropertiesDTO,ComponentReleasedDTO> {
    ReleaseVersionDTO releaseVersionDTO;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/released/ProductReleasedDTO.java =====
package com.ua.crow.plm.dto.released;

import com.ua.crow.plm.dto.base.ProductDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductReleasedDTO extends ProductDto<BomReleasedDTO> {
    ReleaseVersionDTO releaseVersionDTO;

    public ProductReleasedDTO(ProductDto base) {
        try {
            BeanUtils.copyProperties( base,this);
        } catch (Exception e) {
            throw new RuntimeException("Failed to copy properties from base entity", e);
        }

    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/ObtainPartNumberRequest.java =====
package com.ua.crow.plm.dto;

import com.ua.crow.plm.database.fusion.FusionId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObtainPartNumberRequest {
    FusionId bomId;

    String partNumber;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/active/ComponentActiveReleaseDto.java =====
package com.ua.crow.plm.dto.active;

import com.ua.crow.plm.dto.base.ComponentDTO;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ComponentActiveReleaseDto extends ComponentDTO<EngineeringBomWoChildren, CompPropertiesActiveReleaseDto, ComponentActiveReleaseDto> implements Convertable {


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/active/ProductActiveReleaseDto.java =====
package com.ua.crow.plm.dto.active;

import com.ua.crow.plm.dto.base.ProductDto;
import lombok.*;


@Getter
@Setter
public class ProductActiveReleaseDto extends ProductDto<BomActiveReleaseDto> {

//    public ProductActiveReleaseDto(ProductDto base) {
//        try {
//            BeanUtils.copyProperties( base,this);
//        } catch (Exception e) {
//            throw new RuntimeException("Failed to copy properties from base entity", e);
//        }
//
//    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/active/BomActiveReleaseDto.java =====
package com.ua.crow.plm.dto.active;

import com.ua.crow.plm.dto.base.EngineeringBomDTO;
import com.ua.crow.service.conversion.Optionalable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BomActiveReleaseDto extends EngineeringBomDTO<ComponentActiveReleaseDto, ProductActiveReleaseDto> implements Optionalable<BomActiveReleaseDto> {


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/active/EngineeringBomWoChildren.java =====
package com.ua.crow.plm.dto.active;

public class EngineeringBomWoChildren extends BomActiveReleaseDto{
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/active/CompPropertiesActiveReleaseDto.java =====
package com.ua.crow.plm.dto.active;

import com.ua.crow.plm.dto.base.ComponentPropertiesDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CompPropertiesActiveReleaseDto extends ComponentPropertiesDTO<ComponentActiveReleaseDto> {


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/ProductDto.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.service.conversion.Convertable;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto<T extends EngineeringBomDTO> extends NamedBasicEntityWithNumericIdDto implements Convertable {
        private Set<T> engineeringBoms;
        private String thumbnailUrl;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/ComponentDTO.java =====
package com.ua.crow.plm.dto.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ComponentDTO<K extends EngineeringBomDTO, T extends ComponentPropertiesDTO, V extends ComponentDTO> extends PartDTO<T> {
    private List<V> parts = new LinkedList<>();
    private K parentBom;
    private V parent;
    private K childBom;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/BomItemPropertyDto.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Data;

@Data
public class BomItemPropertyDto<T extends ComponentDTO> extends NamedBasicEntityWithNumericIdDto {

    private T item;

    private String stringValue;

    private Double numericValue;


    BomItemPropertyTypeDto propertyType;


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/BomItemPropertyTypeDto.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.database.models.common.DataTypes;
import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.plm.dto.UnitsDto;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BomItemPropertyTypeDto extends NamedBasicEntityWithNumericIdDto implements Convertable {

    private UnitsDto units;

    private BomItemPropertyTypeGroupDto group;

    private DataTypes dataType;


}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/PartDTO.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.plm.dto.ResourceItemDTO;
import lombok.Data;
import java.util.Set;

@Data
public class PartDTO<T extends ComponentPropertiesDTO> extends NamedBasicEntityWithNumericIdDto {
    private String itemType;
    private Double quantity;
    private String description;
    private String partNumber;
    private ResourceItemDTO resourceItem;
    private Set<T> properties;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/ComponentPropertiesDTO.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Data;

@Data
public class ComponentPropertiesDTO<T extends ComponentDTO> extends NamedBasicEntityWithNumericIdDto {


    private T item;

    private String stringValue;

    private Double numericValue;


    BomItemPropertyTypeDto propertyType;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/EngineeringBomDTO.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class EngineeringBomDTO<T extends ComponentDTO, V extends ProductDto> extends NamedBasicEntityWithNumericIdDto {
    private V product;
    private String description;
    private String partNumber;
    private Set<T> children;

    private String fusionVersion;
    private String fusionId;
    private boolean isLibraryItem;
    private String fusionRevisionId;
    private boolean isConfiguration;
    private boolean isConfiguredDesign;
    private boolean consistent;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/ItemTypeNameMappingDto.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NumericIdEntityDto;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemTypeNameMappingDto extends NumericIdEntityDto implements Convertable {
    private ItemTypes type;
    private String name;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/BomItemPropertyTypeGroupDto.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BomItemPropertyTypeGroupDto extends NamedBasicEntityWithNumericIdDto implements Convertable {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/base/ComponentGroupDto.java =====
package com.ua.crow.plm.dto.base;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.service.conversion.Convertable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ComponentGroupDto extends NamedBasicEntityWithNumericIdDto implements Convertable {
    private ComponentGroupDto parent;
    private List<ComponentGroupDto> children;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/dto/FusionProjectListItem.java =====
package com.ua.crow.plm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FusionProjectListItem {
    boolean selected;
    String name;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionBomEngineeringBom.java =====
package com.ua.crow.plm.database.fusion;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.service.conversion.Optionalable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@IdClass(FusionBomEngineeringBomId.class)
public class FusionBomEngineeringBom implements Optionalable<FusionBomEngineeringBom> {

    @Id
    String fusionBomId;
    @Id
    String fusionBomRevId;
    @Id
    Long bomId;
    @Id
    Long bomVer;

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(name = "fusionBomId",referencedColumnName = "fusionId", updatable = false,insertable = false),
            @JoinColumn(name = "fusionBomRevId",referencedColumnName = "revisionId", updatable = false,insertable = false)})
    private FusionBom fusionBom;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "bomId",referencedColumnName = "id", updatable = false,insertable = false),
            @JoinColumn(name = "bomVer", referencedColumnName = "release_ver", updatable = false,insertable = false)})
    private BomActiveRelease engineeringBom;

    @CreatedBy
    private String creator;
    @LastModifiedBy
    private String modifier;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date modifiedAt;
    private boolean deleted;
    private String name;


    public FusionBomEngineeringBom(FusionBom fusionBom, BomActiveRelease engineeringBom,String commitName) {
        this.fusionBom = fusionBom;
        this.engineeringBom = engineeringBom;
        this.fusionBomId = fusionBom.getFusionId();
        this.fusionBomRevId = fusionBom.getRevisionId();
        this.bomId = engineeringBom.getId();
        this.bomVer = engineeringBom.getRelease_ver();
        setName(commitName);
    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionComponentRel.java =====
package com.ua.crow.plm.database.fusion;

import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
@Entity
@IdClass(FusionBomItemRelId.class)
@Table(name = "fusion_bom_item_rel")
public class FusionComponentRel implements Convertable {
    @Id
    private String fusionParentId;
    @Id
    private String parentRevisionId;
    @Id
    private String fusionChildId;
    @Id
    private String childRevisionId;
    @Id
    private String bomId;
    @Id
    private String bomRevisionId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumns(value = {@JoinColumn(name = "bomId",referencedColumnName = "fusionId",insertable = false,updatable = false)
            ,@JoinColumn(name = "bomRevisionId",referencedColumnName = "revisionId",insertable = false,updatable = false)})
    private FusionBom bom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(value = {@JoinColumn(name = "fusionParentId", referencedColumnName = "fusionId", insertable = false, updatable = false)
            ,@JoinColumn(name = "parentRevisionId",referencedColumnName = "revisionId",insertable = false,updatable = false)})
    private FusionComponent parent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(value = {@JoinColumn(name = "fusionChildId", referencedColumnName = "fusionId", insertable = false, updatable = false)
            ,@JoinColumn(name = "childRevisionId",referencedColumnName = "revisionId",insertable = false,updatable = false)})
    private FusionComponent child;

    private Double quantity;

    @Enumerated(EnumType.STRING)
    private RelType relType;

    public void setChild(FusionComponent child) {
        this.childRevisionId  =child.getRevisionId();
        this.fusionChildId = child.getFusionId();
    }

    public void setParent(FusionComponent parent) {
        fusionParentId = parent.getFusionId();
        parentRevisionId = parent.getRevisionId();
    }

    public void setBom(FusionBom bom) {
        this.bomId = bom.getFusionId();
        this.bomRevisionId = bom.getRevisionId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FusionComponentRel that = (FusionComponentRel) o;

        return new EqualsBuilder().append(getFusionParentId(), that.getFusionParentId()).append(getParentRevisionId(), that.getParentRevisionId()).append(getFusionChildId(), that.getFusionChildId()).append(getChildRevisionId(), that.getChildRevisionId()).append(getBomId(), that.getBomId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getFusionParentId()).append(getParentRevisionId()).append(getFusionChildId()).append(getChildRevisionId()).append(getBomId()).toHashCode();
    }
}


// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/Material.java =====
package com.ua.crow.plm.database.fusion;


import com.ua.crow.database.models.common.basic.NamedStringIdEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Material extends NamedStringIdEntity {

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionId.java =====
package com.ua.crow.plm.database.fusion;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FusionId implements Serializable {

    @NotNull
    @NotEmpty
    @Valid
    private String fusionId;

    @NotNull
    @NotEmpty
    @Valid
    private String revisionId;


    @Validated
    public static @Valid FusionId id(@NotBlank @NotNull String fusionId, @NotBlank @NotNull String revisionId) {
        return new FusionId(fusionId,revisionId);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FusionId fusionId1 = (FusionId) o;

        return new EqualsBuilder().append(getFusionId(), fusionId1.getFusionId()).append(getRevisionId(), fusionId1.getRevisionId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getFusionId()).append(getRevisionId()).toHashCode();
    }

    @Override
    public String toString() {
        return "FusionId{" +
                "fusionId='" + fusionId + '\'' +
                ", revisionId='" + revisionId + '\'' +
                '}';
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionBomRel.java =====
package com.ua.crow.plm.database.fusion;

import com.ua.crow.service.conversion.Optionalable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
@Entity
@IdClass(FusionBomRelId.class)
@Table(name = "fusion_bom_rel")
public class FusionBomRel implements Optionalable<FusionBomRel> {

    @Id
    private String parentBomId;
    @Id
    private String parentBomRevisionId;
    @Id
    private String childBomId;
    @Id
    private String childBomRevisionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "parentBomId", referencedColumnName = "fusionId", insertable = false, updatable = false),
            @JoinColumn(name = "parentBomRevisionId", referencedColumnName = "revisionId", insertable = false, updatable = false)
    })
    private FusionBom parentBom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "childBomId", referencedColumnName = "fusionId", insertable = false, updatable = false),
            @JoinColumn(name = "childBomRevisionId", referencedColumnName = "revisionId", insertable = false, updatable = false)
    })
    private FusionBom childBom;

    private Double quantity;

    @Enumerated(EnumType.STRING)
    private RelType relType = RelType.PART_OF;

    public void setParentBom(FusionBom bom) {
        this.parentBomId = bom.getFusionId();
        this.parentBomRevisionId = bom.getRevisionId();
        this.parentBom = bom;
    }

    public void setChildBom(FusionBom bom) {
        this.childBomId = bom.getFusionId();
        this.childBomRevisionId = bom.getRevisionId();
        this.childBom = bom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FusionBomRel that = (FusionBomRel) o;
        return new EqualsBuilder()
                .append(parentBomId, that.parentBomId)
                .append(parentBomRevisionId, that.parentBomRevisionId)
                .append(childBomId, that.childBomId)
                .append(childBomRevisionId, that.childBomRevisionId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17,37)
                .append(parentBomId)
                .append(parentBomRevisionId)
                .append(childBomId)
                .append(childBomRevisionId)
                .toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/PhysicalPropertyId.java =====
package com.ua.crow.plm.database.fusion;


import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalPropertyId implements Serializable {

    String bodyName;

    String itemId;

    String itemRevId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PhysicalPropertyId that = (PhysicalPropertyId) o;

        return new EqualsBuilder().append(getBodyName(), that.getBodyName()).append(getItemId(), that.getItemId()).append(getItemRevId(), that.getItemRevId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getBodyName()).append(getItemId()).append(getItemRevId()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionComponent.java =====
package com.ua.crow.plm.database.fusion;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.service.conversion.Convertable;
import com.ua.crow.service.conversion.Optionalable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table( indexes = {@Index(name = "idx_part_number", columnList = "partNumber, revisionId", unique = true)})
@IdClass(FusionId.class)
public class FusionComponent implements Convertable, Optionalable<FusionComponent> {

    @Id
    private String fusionId;
    @Id
    private String revisionId;

    @Enumerated(EnumType.STRING)
    private ItemTypes type;

    private String partName;

    private String partNumber;

    private String description;

    private String sourceFile;

    private String path;


    @OneToMany(mappedBy = "component",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<FusionPhysicalProperty> physicalProperties = new HashSet<>();

    boolean root = false;

    private String tenantId;

    private boolean deleted;

    @CreatedBy
    private String creator = null;

    @LastModifiedBy
    private String modifier = null;

    @CreatedDate
    private Date createdAt = null;

    @LastModifiedDate
    private Date modifiedAt = null;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionBom.java =====
package com.ua.crow.plm.database.fusion;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.service.conversion.Convertable;
import com.ua.crow.service.conversion.Optionalable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@IdClass(FusionId.class)
public class FusionBom  implements Convertable, Optionalable<FusionBom> {

    @Id
    private String fusionId;
    @Id
    private String revisionId;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "product_id",referencedColumnName = "id"),
            @JoinColumn(name = "release_ver",referencedColumnName = "release_ver")})
    private ProductActiveRelease product;

    @ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinColumns(value = {@JoinColumn(name = "root_id",referencedColumnName = "fusionId"),
            @JoinColumn(name = "rootRevId",referencedColumnName = "revisionId")})
    private FusionComponent root;

    private String partNumber;
    private String description;
    private boolean processed;
    @Column(name = "effective_bom_id")
    private Long engineeringBomId;
    private String documentName;
    private String name;
    private String version;
    private boolean isLibraryItem;
    private boolean isConfiguration;
    private boolean isConfiguredDesign;
    private boolean consistent;
    private String tenantId;
    private boolean deleted;

    @CreatedBy
    private String creator = null;
    @LastModifiedBy
    private String modifier = null;
    @CreatedDate
    private Date createdAt = null;
    @LastModifiedDate
    private Date modifiedAt = null;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionBomItemRelId.java =====
package com.ua.crow.plm.database.fusion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FusionBomItemRelId implements Serializable {
    private String fusionParentId;
    private String parentRevisionId;
    private String fusionChildId;
    private String childRevisionId;
    private String bomId;
    private String bomRevisionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FusionBomItemRelId that = (FusionBomItemRelId) o;

        return new EqualsBuilder().append(getFusionParentId(), that.getFusionParentId()).append(getParentRevisionId(), that.getParentRevisionId()).append(getFusionChildId(), that.getFusionChildId()).append(getChildRevisionId(), that.getChildRevisionId()).append(getBomId(), that.getBomId()).append(getBomRevisionId(), that.getBomRevisionId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getFusionParentId()).append(getParentRevisionId()).append(getFusionChildId()).append(getChildRevisionId()).append(getBomId()).append(getBomRevisionId()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionBomRelId.java =====
package com.ua.crow.plm.database.fusion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FusionBomRelId implements Serializable {
    private String parentBomId;
    private String parentBomRevisionId;
    private String childBomId;
    private String childBomRevisionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FusionBomRelId that = (FusionBomRelId) o;
        return new EqualsBuilder()
                .append(parentBomId, that.parentBomId)
                .append(parentBomRevisionId, that.parentBomRevisionId)
                .append(childBomId, that.childBomId)
                .append(childBomRevisionId, that.childBomRevisionId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17,37)
                .append(parentBomId)
                .append(parentBomRevisionId)
                .append(childBomId)
                .append(childBomRevisionId)
                .toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionBomEngineeringBomId.java =====
package com.ua.crow.plm.database.fusion;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
public class FusionBomEngineeringBomId implements Serializable {
    String fusionBomId;
    String fusionBomRevId;
    Long bomId;
    Long bomVer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FusionBomEngineeringBomId that = (FusionBomEngineeringBomId) o;

        return new EqualsBuilder().append(getFusionBomId(), that.getFusionBomId()).append(getFusionBomRevId(), that.getFusionBomRevId()).append(getBomId(), that.getBomId()).append(getBomVer(), that.getBomVer()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getFusionBomId()).append(getFusionBomRevId()).append(getBomId()).append(getBomVer()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/FusionPhysicalProperty.java =====
package com.ua.crow.plm.database.fusion;

import com.ua.crow.service.conversion.Convertable;
import com.ua.crow.service.conversion.Optionalable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(PhysicalPropertyId.class)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FusionPhysicalProperty implements Convertable, Optionalable<FusionPhysicalProperty> {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns(value =
            {@JoinColumn(name = "itemId", referencedColumnName = "fusionId", insertable = false, updatable = false),
                    @JoinColumn(name = "itemRevId", referencedColumnName = "revisionId", insertable = false, updatable = false)})
    FusionComponent component;

    public void setComponent(@NotNull FusionComponent component) {
        this.component = component;
        itemId = component.getFusionId();
        itemRevId = component.getRevisionId();
    }

    @Id
    @EqualsAndHashCode.Include
    String itemId;

    @Id
    @EqualsAndHashCode.Include
    String itemRevId;

    @Id
    @EqualsAndHashCode.Include
    String bodyName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "material")
    Material material;

    private Double widthMm;

    private Double lengthMm;

    private Double heightMm;

    private Double volumeCm3;

    private Double areaCm2;

    private Double massKg;

    private Double densityKgCm2;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/fusion/RelType.java =====
package com.ua.crow.plm.database.fusion;

public enum RelType {
    PART_OF,
    COPY_OF

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/PartNumberPool.java =====
package com.ua.crow.plm.database;

import com.ua.crow.database.models.common.basic.NumericIdEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class PartNumberPool extends NumericIdEntity {
    Date issueDate;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/PartNumberReferenceType.java =====
package com.ua.crow.plm.database;

public enum PartNumberReferenceType {
    FUSION_PART,
    ACTIVE_RELEASE_COMPONENT,

    POOL, EFFECTIVE_BOM, FUSION_BOM, NEW
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/Part.java =====
package com.ua.crow.plm.database;

public class Part {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/ComponentGroup.java =====
package com.ua.crow.plm.database;

import com.ua.crow.database.models.common.AbstractResourceGroup;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class ComponentGroup extends AbstractResourceGroup<ComponentGroup> implements Convertable {


}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/PartNumberReference.java =====
package com.ua.crow.plm.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartNumberReference {
    String partNumber;
    PartNumberReferenceType referenceType;
    String partName;
    String description;
    Long productId;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/released/BomReleased.java =====
package com.ua.crow.plm.database.released;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.database.base.EngineeringBom;
import com.ua.crow.plm.database.base.Releasable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class BomReleased extends EngineeringBom<ComponentReleased, ProductReleased> implements Releasable {


    @Id
    Long release_ver;


    @ManyToOne
    @JoinColumn(name = "release_ver", referencedColumnName = "id", insertable = false,updatable = false)
    ReleaseVersion releaseVersion;


}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/released/ProductReleased.java =====
package com.ua.crow.plm.database.released;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.database.base.ProductBase;
import com.ua.crow.plm.database.base.Releasable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class ProductReleased extends ProductBase<BomReleased>
        implements Releasable {

    @Id
    Long release_ver;

    @ManyToOne
    @JoinColumn(name = "release_ver",referencedColumnName = "id", updatable = false, insertable = false)
    ReleaseVersion releaseVersion;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/released/CompPropertiesReleased.java =====
package com.ua.crow.plm.database.released;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.database.base.ComponentProperties;
import com.ua.crow.plm.database.base.Releasable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class CompPropertiesReleased extends ComponentProperties<ComponentReleased> implements Releasable {
    @Id
    Long release_ver;

    @OneToOne
    @JoinColumn(name = "release_ver",insertable = false,updatable = false)
    ReleaseVersion releaseVersion;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/released/ReleasableId.java =====
package com.ua.crow.plm.database.released;

import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReleasableId implements Serializable {

    private Long id;

    private Long release_ver;

    public static ReleasableId releasableId(Long productId){
        return new ReleasableId(productId,0L);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ReleasableId that = (ReleasableId) o;

        return new EqualsBuilder().append(getId(), that.getId()).append(getRelease_ver(), that.getRelease_ver()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).append(getRelease_ver()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/released/ComponentReleased.java =====
package com.ua.crow.plm.database.released;

import com.ua.crow.plm.database.ComponentGroup;
import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.database.base.Releasable;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class ComponentReleased extends com.ua.crow.plm.database.base.Part<CompPropertiesReleased> implements Releasable {

    @Id
    private Long release_ver;

    @OneToMany(mappedBy = "parents", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Set<ComponentReleased> parts = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name = "bom_id"),@JoinColumn(name = "parent_bom_release_ver")})
    BomReleased parentBom;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "component_rel_item_relationship",
            joinColumns = {@JoinColumn(name = "parent_id"),@JoinColumn(name="parent_release_ver")},
            inverseJoinColumns = {@JoinColumn(name = "child_id"),@JoinColumn(name="child_release_ver")})
    Set<ComponentReleased> parents = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "child_bom_id"),@JoinColumn(name = "child_bom_release_ver")})
    BomReleased childBom;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    ComponentGroup componentGroup;

    public void addChild(ComponentReleased comp){
        parts.add(comp);
    }

    public void addParent(ComponentReleased parent) {
        parents.add(parent);
    }

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    Set<CompPropertiesReleased> properties = new HashSet<>();

    public void addProperty(CompPropertiesReleased p) {
        properties.add(p);
    }
    @OneToOne
    @JoinColumn(name = "release_ver")
    ReleaseVersion releaseVersion;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/ReleaseVersion.java =====
package com.ua.crow.plm.database;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ReleaseVersion extends NamedBasicEntityWithNumericId {

    private boolean released;

    private Date releaseDate;

    private String description;

    @ManyToOne
    @JoinColumn(name = "prev_ver_id")
    private ReleaseVersion previous;

    private Double ver;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/BomItemPropertyTypeGroup.java =====
package com.ua.crow.plm.database;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BomItemPropertyTypeGroup extends NamedBasicEntityWithNumericId implements Convertable {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/ItemTypes.java =====
package com.ua.crow.plm.database;

public enum ItemTypes {
    COMPONENT,
    PART,
    BOM,
    FASTENER,
    THRDPARTY,
    NONE
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/ItemTypeNameMapping.java =====
package com.ua.crow.plm.database;

import com.ua.crow.database.models.common.basic.NumericIdEntity;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ItemTypeNameMapping extends NumericIdEntity implements Convertable {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemTypes type;

    @Column(nullable = false)
    private String name;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/WithdrawAlgorythm.java =====
package com.ua.crow.plm.database;

public enum WithdrawAlgorythm {
    AMOUNT,
    LENGHT,
    SQUARE,
    WEIGHT,
    VOLUME
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/BomComponentRelId.java =====
package com.ua.crow.plm.database.active;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BomComponentRelId implements Serializable {

    private Long parentBomId;
    private Long parentBomReleaseVer;
    private Long childId;
    private Long childReleaseVer;
    private Long completeSetId;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/ComponentRel.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.plm.database.base.BaseRel;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
@Entity
@IdClass(ComponentPartRelationshipId.class)
@Table(name = "component_part_relationship")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ComponentRel extends BaseRel implements Convertable {

    @Id

    private Long parentId;

    @Id

    private Long parentReleaseVer;

    @Id

    private Long bomId;

    @Id

    private Long bomVersion;


    @Id

    private Long completeSetId;




    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "bomId", referencedColumnName = "id", insertable = false, updatable = false),
            @JoinColumn(name = "bomVersion", referencedColumnName = "release_ver", insertable = false, updatable = false)
    })
    private BomActiveRelease bom;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "completeSetId", referencedColumnName = "id", insertable = false, updatable = false),
    })
    private CompleteSet completeSet;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "parentId", referencedColumnName = "id", insertable = false, updatable = false),
            @JoinColumn(name = "parentReleaseVer", referencedColumnName = "release_ver", insertable = false, updatable = false)
    })
    private ComponentActiveRelease parent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ComponentRel that = (ComponentRel) o;

        return new EqualsBuilder().appendSuper(super.equals(o)).append(getParentId(), that.getParentId()).append(getParentReleaseVer(), that.getParentReleaseVer()).append(getBomId(), that.getBomId()).append(getBomVersion(), that.getBomVersion()).append(getCompleteSetId(), that.getCompleteSetId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).appendSuper(super.hashCode()).append(getParentId()).append(getParentReleaseVer()).append(getBomId()).append(getBomVersion()).append(getCompleteSetId()).toHashCode();
    }


    // Constructors, getters, and setters are handled by Lombok
}


// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/ComponentActiveRelease.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.plm.database.ComponentGroup;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.*;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class ComponentActiveRelease extends com.ua.crow.plm.database.base.Part<ComponentProperty>
        implements Convertable {
    @Id
    private Long release_ver = 0L;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name = "bom_id"),@JoinColumn(name = "parent_bom_release_ver")})
    private BomActiveRelease parentBom;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<ComponentRel> parts = new HashSet<>();

    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<ComponentRel> parents = new HashSet<>();

    private boolean root;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "child_bom_id", referencedColumnName = "id"),
            @JoinColumn(name = "child_bom_release_ver",referencedColumnName = "release_ver")})
    private BomActiveRelease childBom;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private ComponentGroup componentGroup;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    Set<ComponentProperty> properties = new HashSet<>();

    public void addProperty(ComponentProperty p) {
        properties.add(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ComponentActiveRelease that = (ComponentActiveRelease) o;

        if(that.getId()==null && this.getId()==null||that.getId()==0&&this.getId()==0) return false;

        return new EqualsBuilder().appendSuper(super.equals(o)).append(release_ver, that.release_ver).append(this.getId(),that.getId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).appendSuper(super.hashCode()).append(release_ver).append(this.getId()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/CompleteSet.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompleteSet extends NamedBasicEntityWithNumericId {
    @ManyToOne
    ProductActiveRelease product;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/ComponentProperty.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.base.ComponentProperties;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class ComponentProperty extends ComponentProperties<ComponentActiveRelease> implements Convertable {

    @Id
    private Long release_ver = 0L;

    public ComponentProperty(String stringValue, ComponentActiveRelease item, BomItemPropertyType propertyType) {
        super(stringValue, item, propertyType);
    }

    public ComponentProperty(Double numericValue, ComponentActiveRelease item, BomItemPropertyType propertyType) {
        super(numericValue, item, propertyType);
    }

    public ComponentProperty() {
    }

    public ComponentProperty(Double numericValue, ComponentActiveRelease item, BomItemPropertyType propertyType, String bodyName) {
        super(numericValue, item,propertyType,bodyName);

    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/ProductActiveRelease.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.plm.database.base.ProductBase;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"name"}) })
public class ProductActiveRelease extends ProductBase<BomActiveRelease> implements Convertable {

    public ProductActiveRelease() {
        super();
        super.setRelease_ver(0L);
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "default_complete_set",referencedColumnName = "id")
    private CompleteSet defaultCompleteSet;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "product", orphanRemoval = true)
    Set<CompleteSet> completeSets = new HashSet<>();

    @Override
    public void setRelease_ver(Long releaseVer) {
        throw new UnsupportedOperationException("Release version cannot be set for active product release. It is always 0.");
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/BomComponentRel.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.plm.database.base.BaseRel;
import com.ua.crow.service.conversion.Convertable;
import com.ua.crow.service.conversion.Optionalable;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
@Entity
@IdClass(BomComponentRelId.class)

public class BomComponentRel extends BaseRel implements Convertable, Optionalable<BomComponentRel> {

    @Id
    private Long parentBomId;

    @Id
    private Long parentBomReleaseVer;

    @Id
    private Long completeSetId;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "parentBomId", referencedColumnName = "id", insertable = false, updatable = false),
        @JoinColumn(name = "parentBomReleaseVer", referencedColumnName = "release_ver", insertable = false, updatable = false)
    })
    private BomActiveRelease parentBom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "completeSetId", referencedColumnName = "id", insertable = false, updatable = false)})
    private CompleteSet completeSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BomComponentRel that = (BomComponentRel) o;

        return new EqualsBuilder().appendSuper(super.equals(o)).append(getParentBomId(), that.getParentBomId()).append(getParentBomReleaseVer(), that.getParentBomReleaseVer()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).appendSuper(super.hashCode()).append(getParentBomId()).append(getParentBomReleaseVer()).toHashCode();
    }



    // Constructors, getters, and setters are handled by Lombok
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/BomActiveRelease.java =====
package com.ua.crow.plm.database.active;

import com.ua.crow.plm.database.base.EngineeringBom;
import com.ua.crow.plm.database.fusion.FusionBomEngineeringBom;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(ReleasableId.class)
public class BomActiveRelease extends EngineeringBom<ComponentActiveRelease,ProductActiveRelease> implements Convertable {
    @Id
    private Long release_ver = 0L;

    @OneToMany(mappedBy = "engineeringBom", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FusionBomEngineeringBom> fusionBoms = new HashSet<>();

    @OneToMany(mappedBy = "parentBom", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<BomComponentRel> children = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BomActiveRelease that = (BomActiveRelease) o;

        if(that.getId()==0&&this.getId()==0||that.getId()==null && this.getId()==null) return false;

        return new EqualsBuilder().appendSuper(super.equals(o)).append(release_ver, that.release_ver).append(this.getId(),that.getId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).appendSuper(super.hashCode()).append(release_ver).append(this.getId()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/active/ComponentPartRelationshipId.java =====
package com.ua.crow.plm.database.active;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComponentPartRelationshipId implements Serializable {

    private Long parentId;
    private Long parentReleaseVer;
    private Long childId;
    private Long childReleaseVer;
    private Long bomId;
    private Long bomVersion;
    private Long completeSetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ComponentPartRelationshipId that = (ComponentPartRelationshipId) o;

        return new EqualsBuilder().append(getParentId(), that.getParentId()).append(getParentReleaseVer(), that.getParentReleaseVer()).append(getChildId(), that.getChildId()).append(getChildReleaseVer(), that.getChildReleaseVer()).append(getBomId(), that.getBomId()).append(getBomVersion(), that.getBomVersion()).append(getCompleteSetId(), that.getCompleteSetId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getParentId()).append(getParentReleaseVer()).append(getChildId()).append(getChildReleaseVer()).append(getBomId()).append(getBomVersion()).append(getCompleteSetId()).toHashCode();
    }


    // Constructors, getters, setters, equals, and hashCode methods
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/BomItemPropertyType.java =====
package com.ua.crow.plm.database;

import com.ua.crow.database.models.common.DataTypes;
import com.ua.crow.database.models.common.Units;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BomItemPropertyType extends NamedBasicEntityWithNumericId implements Convertable {

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Units units;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private BomItemPropertyTypeGroup group;

    @Enumerated(EnumType.STRING)
    private DataTypes dataType;


}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/FusionBomRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public interface FusionBomRepository extends JpaRepository<FusionBom, FusionId> {
    @Query("select t from FusionBom t where t.product.id = ?1 and t.product.release_ver = ?2 and t.deleted = false")
    List<FusionBom> findByProductId(Long id, Long release_ver);
    @Query("""
    select t from FusionBom t
    where t.product.id = :productId
      and t.product.release_ver = :releaseVersion
      and t.deleted = false
      and t.consistent = true
""")
    List<FusionBom> findByProductIdAndReleaseVerConsistentNotDeleted(
            @Param("productId") Long productId,
            @Param("releaseVersion") Long releaseVersion);
    @Query("select t from FusionBom t where t.product.id = ?1 and t.product.release_ver = ?2 and t.deleted = false")
    Stream<FusionBom> findByProductId(Long id, Long release_ver, Pageable pageable);
    Stream<FusionBom> findByPartNumber(String partNumber);

    @Query("select t from FusionBom t where t.deleted = false and t.consistent= true")
    Stream<FusionBom> findNotDeleted();

    Optional<FusionBom> findByFusionId(String fusionId);
    @Query("select t from FusionBom t where t.product.id = :productId and t.product.release_ver = :releaseVer and t.deleted = false and t.consistent = true and t.engineeringBomId is null")
    List<FusionBom> findUnprocessedByProductId(@Param("productId") Long productId, @Param("releaseVer") Long releaseVer);

    @Query("select t from FusionBom t where t.product.id = :productId and t.product.release_ver = :releaseVer and t.deleted = false and t.consistent = true and t.engineeringBomId is not null")
    List<FusionBom> findProcessedByProductId(@Param("productId") Long productId, @Param("releaseVer") Long releaseVer);

    @Query("""
            select b from FusionBom b
            where b.product.id = :productId
              and b.product.release_ver = :releaseVer
              and b.deleted = false
              and b.consistent = true
              and b.engineeringBomId is null
              and not exists (
                  select 1 from FusionBomRel r
                  where r.childBomId = b.fusionId
                    and r.childBomRevisionId = b.revisionId
              )
            """)
    List<FusionBom> findRootUnprocessedByProductId(@Param("productId") Long productId, @Param("releaseVer") Long releaseVer);

    @Query("""
            select b from FusionBom b
            where b.product.id = :productId
              and b.product.release_ver = :releaseVer
              and b.deleted = false
              and b.consistent = true
              and b.engineeringBomId is not null
              and not exists (
                  select 1 from FusionBomRel r
                  where r.childBomId = b.fusionId
                    and r.childBomRevisionId = b.revisionId
              )
            """)
    List<FusionBom> findRootProcessedByProductId(@Param("productId") Long productId, @Param("releaseVer") Long releaseVer);

    @Query("""
            select b from FusionBom b
            where b.product.id = :productId
              and b.product.release_ver = :releaseVer
              and b.deleted = false
              and b.consistent = true
              and not exists (
                  select 1 from FusionBomRel r
                  where r.childBomId = b.fusionId
                    and r.childBomRevisionId = b.revisionId
              )
            """)
    List<FusionBom> findRootByProductId(@Param("productId") Long productId, @Param("releaseVer") Long releaseVer);

    @Query("""
            select b from FusionBom b
            where b.deleted = false
              and b.consistent = true
              and not exists (
                  select 1 from FusionBomRel r
                  where r.childBomId = b.fusionId
                    and r.childBomRevisionId = b.revisionId
              )
            """)
    Stream<FusionBom> findRootNotDeleted();

    @Query("select b from FusionBom b where b.root.fusionId = :rootId and b.root.revisionId = :rootRev")
    Optional<FusionBom> findByRoot(@Param("rootId") String rootId,@Param("rootRev") String rootRev);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ActiveReleaseProductRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActiveReleaseProductRepository extends JpaRepository<ProductActiveRelease, ReleasableId> {
    List<ProductActiveRelease> findByDeletedFalse();

    Optional<ProductActiveRelease> findByName(String name);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ItemTypeNameMappingRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ItemTypeNameMappingRepository extends CrudRepository<ItemTypeNameMapping, Long> {
    Optional<ItemTypeNameMapping> findByName(String name);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/EngineeringBomItemPropertyTypeRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.BomItemPropertyType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EngineeringBomItemPropertyTypeRepository extends JpaRepository<BomItemPropertyType, Long> {
    Optional<BomItemPropertyType> findByName(String name);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/MaterialRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.fusion.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material,String> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ReleasedProductRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.released.ProductReleased;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface ReleasedProductRepository extends JpaRepository<ProductReleased, ReleasableId> {
    List<ProductActiveRelease> findByDeleted(boolean deleated);
    @Query("select t from ProductReleased t where t.id = ?1 AND t.releaseVersion.deleted = ?2 AND t.deleted = ?2 ")
    List<ProductReleased> findAllProductReleases(Long id, boolean deleted);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/FusionComponentRepository.java =====
package com.ua.crow.plm.database.repo;


import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface FusionComponentRepository extends JpaRepository<FusionComponent, FusionId> {

    @Query("select t from FusionComponent t where  t.id = ?1 and root=true")
    Optional<FusionComponent> getRootById(Long id);

    @Query("SELECT f.child FROM FusionComponentRel f WHERE f.parent.id = :parentId AND f.bom.id = :bomId")
    Stream<FusionComponent> findChildrenForBom(@Param("parentId") Long parentId, @Param("bomId") Long bomId);


    Optional<FusionComponent> findByPartNumberAndRevisionId(String partNumber, String revisionId);


    Stream<FusionComponent> findByPartNumber(String partNumber);

    @Query("SELECT f FROM FusionComponent f WHERE f.partNumber = :partNumber order by createdAt DESC limit 1")
    Optional<FusionComponent> findLastByPartNumber(String partNumber);


}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/FusionBomRelRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.fusion.FusionBomRel;
import com.ua.crow.plm.database.fusion.FusionBomRelId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FusionBomRelRepository extends JpaRepository<FusionBomRel, FusionBomRelId> {
    @Query("""
            SELECT r
            FROM FusionBomRel r
            WHERE r.parentBomId = :parentId
              AND r.parentBomRevisionId = :parentRev
              AND r.childBomId = :childId
              AND r.childBomRevisionId = :childRev
              AND r.relType = com.ua.crow.plm.database.fusion.RelType.PART_OF
            """)
    Optional<FusionBomRel> findRelation(@Param("parentId") String parentId,
                                        @Param("parentRev") String parentRev,
                                        @Param("childId") String childId,
                                        @Param("childRev") String childRev);

    @Query("""
            SELECT r
            FROM FusionBomRel r
            WHERE r.parentBomId = :parentId
              AND r.parentBomRevisionId = :parentRev
              AND r.relType = com.ua.crow.plm.database.fusion.RelType.PART_OF
            """)
    java.util.List<FusionBomRel> findChildren(@Param("parentId") String parentId,
                                              @Param("parentRev") String parentRev);

    @Query("""
            SELECT r
            FROM FusionBomRel r
            WHERE r.childBomId = :childId
              AND r.childBomRevisionId = :childRev
              AND r.relType = com.ua.crow.plm.database.fusion.RelType.PART_OF
            """)
    java.util.List<FusionBomRel> findParents(@Param("childId") String childId,
                                             @Param("childRev") String childRev);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/EngineeringBomRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface EngineeringBomRepository extends JpaRepository<BomActiveRelease, ReleasableId> {

    Stream<BomActiveRelease> findByPartNumber(String partNumber);

    @Query("select t from BomActiveRelease t " +
            "join ProductActiveRelease p on p.id = t.product.id " +
            "where p.id = ?1 and p.release_ver = ?2 and t.deleted = false and t.isRoot = true")
    List<BomActiveRelease> findRootBomsByProductId(Long productId, Long releaseVer, Pageable pageable);

    @Query("select t from BomActiveRelease t " +
            "join ProductActiveRelease p on p.id = t.product.id " +
            "where p.id = ?1 and p.release_ver = ?2 and t.deleted = false")
    List<BomActiveRelease> findBomsByProductId(Long productId, Long releaseVer, Pageable pageable);

    @Query("select t from BomActiveRelease t " +
            "join ProductActiveRelease p on p.id = t.parentProduct.id " +
            "where p.id = ?1 and p.release_ver = ?2 and t.deleted = false")
    Stream<BomActiveRelease> findRootBomsByProductId(Long productId, Long releaseVer);
}


// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/BomReleasedRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.released.BomReleased;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface BomReleasedRepository extends JpaRepository<BomReleased, ReleasableId> {

    @Query("select t from BomReleased t " +
            "join ProductReleased p on p.id = t.product.id " +
            "where p.id = ?1 and p.release_ver = ?2 and t.deleted = false and t.isRoot = true")
    List<BomReleased> findRootBomsByProductId(Long productId, Long releaseVer, Pageable pageable);

    @Query("select t from BomReleased t " +
            "join ProductReleased p on p.id = t.product.id " +
            "where p.id = ?1 and p.release_ver = ?2 and t.deleted = false")
    List<BomReleased> findBomsByProductId(Long productId, Long releaseVer, Pageable pageable);

    @Query("select t from BomReleased t " +
            "join ProductReleased p on p.id = t.parentProduct.id " +
            "where p.id = ?1 and p.release_ver = ?2 and t.deleted = false")
    Stream<BomReleased> findRootBomsByProductId(Long productId, Long releaseVer);

    @Query("select t from BomReleased t where t.id = ?1 and t.releaseVersion.deleted = ?2 and t.deleted = ?2")
    List<BomReleased> findAllBomReleases(Long bomId, boolean deleted);
}


// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/PartNumberPoolRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.PartNumberPool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartNumberPoolRepository extends JpaRepository<PartNumberPool,Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/CompleteSetRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.CompleteSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompleteSetRepository extends JpaRepository<CompleteSet,Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/EngineeringBomItemPropertyTypeGroupRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EngineeringBomItemPropertyTypeGroupRepository extends JpaRepository<BomItemPropertyTypeGroup, Long> {
    Optional<BomItemPropertyTypeGroup> findByName(String name);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/FusionComponentRelRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.fusion.FusionComponentRel;
import com.ua.crow.plm.database.fusion.RelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface FusionComponentRelRepository extends JpaRepository<FusionComponentRel, Long> {
    @Query("""
            SELECT f
            FROM FusionComponentRel f
            WHERE f.parent.fusionId = :parentId
              AND f.parent.revisionId = :revisionId
              AND f.bom.fusionId = :bomId
              AND f.bom.revisionId = :bomRevId
              AND f.relType IS NULL
            """)
    Stream<FusionComponentRel> findChildrenForBom(@Param("parentId") String parentId,@Param("revisionId") String revisionId, @Param("bomId") String bomId,@Param("bomRevId") String bomRevId);

    @Query("SELECT f FROM FusionComponentRel f " +
            "WHERE f.parent.fusionId = :parentId " +
            "AND f.parent.revisionId = :revisionId " +
            "AND f.bom.fusionId = :bomId " +
            "AND f.bom.revisionId = :bomRevId " +
            "AND f.relType IN (:relTypes)")
    Stream<FusionComponentRel> findChildrenForBomWithRelTypes(
            @Param("parentId") String parentId,
            @Param("revisionId") String revisionId,
            @Param("bomId") String bomId,
            @Param("bomRevId") String bomRevId,
            @Param("relTypes") RelType... relTypes
    );

    @Modifying
    @Query("DELETE FROM FusionComponentRel f WHERE f.bomId = :id AND f.bomRevisionId = :revisionId")
    void hardDeleteBomRelations(String id,String revisionId);

    @Query("""
            SELECT f
            FROM FusionComponentRel f
            WHERE f.fusionChildId = :childId
              AND f.childRevisionId = :childRev
              AND f.relType IS NULL
            """)
    Stream<FusionComponentRel> findByChild(@Param("childId") String childId,@Param("childRev") String childRev);

    @Query("""
            SELECT f
            FROM FusionComponentRel f
            WHERE f.fusionParentId = :parentId
              AND f.parentRevisionId = :parentRev
              AND f.relType IS NULL
            """)
    Stream<FusionComponentRel> findByParent(@Param("parentId") String parentId,
                                            @Param("parentRev") String parentRev);
}


// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ReleaseVersionRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReleaseVersionRepository extends JpaRepository<ReleaseVersion, ReleasableId> {

    List<ReleaseVersion> findByDeleted(boolean deleted);

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ComponentRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.ComponentActiveRelease;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentActiveRelease, ReleasableId> {
    Stream<ComponentActiveRelease> findByPartNumber(String partNumber);

    @Query("select t from ComponentActiveRelease t where t.parentBom.id = ?2 and t.partNumber = ?1 and t.deleted = false")
    Optional<ComponentActiveRelease> findByPartNumberAndBomId(String partNumber, Long id);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/BomItemPropertyTypeGroupRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BomItemPropertyTypeGroupRepository extends JpaRepository<BomItemPropertyTypeGroup, Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ComponentGroupRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.ComponentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentGroupRepository extends JpaRepository<ComponentGroup, Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ComponentReleasedRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.released.ComponentReleased;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentReleasedRepository extends JpaRepository<ComponentReleased, ReleasableId> {

    @Query("select c from ComponentReleased c where c.parentBom.id = :bomId and c.parentBom.release_ver = :release")
    List<ComponentReleased> findByParentBom(@Param("bomId") Long bomId, @Param("release") Long release);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/BomItemPropertyTypeRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.BomItemPropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BomItemPropertyTypeRepository extends JpaRepository<BomItemPropertyType, Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/BomRelRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.BomComponentRel;
import com.ua.crow.plm.database.active.BomComponentRelId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BomRelRepository extends JpaRepository<BomComponentRel, BomComponentRelId> {

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ComponentPropertiesRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.ComponentProperty;
import com.ua.crow.plm.database.released.ReleasableId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentPropertiesRepository extends JpaRepository<ComponentProperty, ReleasableId> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/repo/ComponentRelRepository.java =====
package com.ua.crow.plm.database.repo;

import com.ua.crow.plm.database.active.ComponentPartRelationshipId;
import com.ua.crow.plm.database.active.ComponentRel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRelRepository extends JpaRepository<ComponentRel, ComponentPartRelationshipId> {
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/base/Part.java =====
package com.ua.crow.plm.database.base;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.inventory.database.ResourceItem;
import com.ua.crow.plm.database.ItemTypes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class Part<T extends ComponentProperties> extends NamedBasicEntityWithNumericId {


    //Generic fields
    @Enumerated(EnumType.STRING)
    ItemTypes itemType;



    private String description;


    @NotBlank(message = "Part number is missing")
    private String partNumber;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "resource_item_id", referencedColumnName = "id")
    private ResourceItem resourceItem;

    //If PART or 3RDPARTY


    private String fusionId;

    private String fusionRevisionId;

    private String fusionPath;

 
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/base/Releasable.java =====
package com.ua.crow.plm.database.base;

import com.ua.crow.plm.database.ReleaseVersion;

public interface Releasable {

        ReleaseVersion getReleaseVersion();

        void setReleaseVersion(ReleaseVersion releaseVersion);


}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/base/ProductBase.java =====
package com.ua.crow.plm.database.base;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.service.product.ProductAttachmentService;
import com.ua.crow.plm.service.product.ProductAttachmentServiceProvider;
import com.ua.crow.util.SpringContext;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@With
@MappedSuperclass
public class ProductBase<T extends EngineeringBom> extends NamedBasicEntityWithNumericId {

    @Id
    Long release_ver;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<T> engineeringBoms;

    @Transient
    private ProductAttachmentService attachmentService;

    public ProductAttachmentService getAttachmentService() {
        if (attachmentService == null) {
            attachmentService = SpringContext.getBean(ProductAttachmentServiceProvider.class).create(this);
        }
        return attachmentService;
    }


}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/base/ComponentProperties.java =====
package com.ua.crow.plm.database.base;


import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.plm.database.BomItemPropertyType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class ComponentProperties<T extends Part> extends BasicEntityWithNumericId  {

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumns({ @JoinColumn(name = "component_id",referencedColumnName = "id"),@JoinColumn(name = "comp_release_ver",referencedColumnName = "release_ver")})
    private T item;

    private String stringValue;

    private Double numericValue;

    private String solidBodyName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "type_id")
    BomItemPropertyType propertyType;

    public ComponentProperties( String stringValue,T item, BomItemPropertyType propertyType,String solidBodyName) {
        this.item = item;
        this.stringValue = stringValue;
        this.solidBodyName = solidBodyName;
        this.propertyType = propertyType;
    }

    public ComponentProperties( Double numericValue,T item, BomItemPropertyType propertyType, String solidBodyName) {
        this.item = item;
        this.numericValue = numericValue;
        this.solidBodyName = solidBodyName;
        this.propertyType = propertyType;
    }

    public ComponentProperties(String stringValue, T item, BomItemPropertyType propertyType) {
        this.item = item;
        this.stringValue = stringValue;
        this.propertyType = propertyType;
    }


    public ComponentProperties(Double numericValue, T item, BomItemPropertyType propertyType) {
        this.item = item;
        this.numericValue = numericValue;
        this.propertyType = propertyType;
    }

    public ComponentProperties() {
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/base/EngineeringBom.java =====
package com.ua.crow.plm.database.base;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class EngineeringBom<T extends Part,V extends ProductBase>  extends NamedBasicEntityWithNumericId {

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(name = "product", referencedColumnName = "id"),
            @JoinColumn(name = "product_release_ver",referencedColumnName = "release_ver")})
    private V product;

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(name = "parent_product", referencedColumnName = "id"),
            @JoinColumn(name = "parent_product_release_ver",referencedColumnName = "release_ver")})
    private V parentProduct;

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(name = "parent_comp", referencedColumnName = "id"),
            @JoinColumn(name = "parent_component_release_ver",referencedColumnName = "release_ver")})
    private T parentComponent;

    private String description;
    private String partNumber;
    private String fusionVersion;
    private String fusionId;
    private boolean isLibraryItem;
    private String fusionRevisionId;
    private boolean isConfiguration;
    private boolean isConfiguredDesign;
    private boolean consistent;
    private boolean isRoot;

}



// ===== File: crow/src/main/java/com/ua/crow/plm/database/base/BaseRel.java =====
package com.ua.crow.plm.database.base;

import com.ua.crow.plm.database.active.ComponentActiveRelease;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Getter
@Setter
@MappedSuperclass
public class BaseRel {
    private Double quantity;
    @Id
    private Long childId;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "childId", referencedColumnName = "id", insertable = false, updatable = false),
            @JoinColumn(name = "childReleaseVer", referencedColumnName = "release_ver", insertable = false, updatable = false)
    })
    private ComponentActiveRelease child;


    private Long childReleaseVer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BaseRel baseRel = (BaseRel) o;

        return new EqualsBuilder().append(getChildId(), baseRel.getChildId()).append(getChildReleaseVer(), baseRel.getChildReleaseVer()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getChildId()).append(getChildReleaseVer()).toHashCode();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/FusionBomItemToPartNumReference.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.database.PartNumberReference;
import com.ua.crow.plm.database.PartNumberReferenceType;
import com.ua.crow.plm.database.fusion.FusionComponent;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionBomItemToPartNumReference implements Converter<FusionComponent,PartNumberReference> {

    @Override
    public PartNumberReference convert(FusionComponent item) {
        PartNumberReference partNumberReference = new PartNumberReference();
        partNumberReference.setReferenceType(PartNumberReferenceType.FUSION_PART);
        partNumberReference.setPartName(item.getPartName());
        partNumberReference.setPartNumber(item.getPartNumber());
        partNumberReference.setDescription(item.getDescription());
        return partNumberReference;    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/FusionBomItemToBomActiveRelease.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.fusion.FusionComponent;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionBomItemToBomActiveRelease implements Converter<FusionComponent, BomActiveRelease> {

    @Override
    public BomActiveRelease convert(FusionComponent source) {
        BomActiveRelease bom = new BomActiveRelease();
        bom.setRelease_ver(0L);
        bom.setDescription(source.getDescription());
        bom.setPartNumber(bom.getPartNumber());
        bom.setName(source.getPartName());
        bom.setFusionId(source.getFusionId());
        bom.setFusionRevisionId(source.getRevisionId());
        return bom;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/FusionCompToDtoFlat.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.converters.mappers.FusionBomItemMapper;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionCompToDtoFlat implements Converter<FusionComponent, FusionComponentDto> {
    @Autowired
    FusionBomItemMapper mapper;
    @Override
    public FusionComponentDto convert(FusionComponent source) {
        return mapper.toDto(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/FusionCompToComponent.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.active.ComponentProperty;
import com.ua.crow.plm.database.active.ComponentActiveRelease;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionPhysicalProperty;
import com.ua.crow.plm.service.PropertyTypeProvider;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class FusionCompToComponent implements Converter<FusionComponent, ComponentActiveRelease> {

    private final PropertyTypeProvider propertyTypeProvider;

    private BomItemPropertyType widthMm;
    private BomItemPropertyType lengthMm;
    private BomItemPropertyType heightMm;
    private BomItemPropertyType volumeCm3;
    private BomItemPropertyType areaCm2;
    private BomItemPropertyType massKg;
    private BomItemPropertyType densityKgCm3;

    @Autowired
    public FusionCompToComponent(@Lazy PropertyTypeProvider propertyTypeProvider) {
        this.propertyTypeProvider = propertyTypeProvider;
    }

    private boolean initialized = false;

    private void initPropertyTypes() {
        widthMm = propertyTypeProvider.get("widthMm");
        lengthMm = propertyTypeProvider.get("lengthMm");
        heightMm = propertyTypeProvider.get("heightMm");
        volumeCm3 = propertyTypeProvider.get("volumeCm3");
        areaCm2 = propertyTypeProvider.get("areaCm2");
        massKg = propertyTypeProvider.get("massKg");
        densityKgCm3 = propertyTypeProvider.get("densityKgCm3");
        initialized = true;
    }




    @Override
    public ComponentActiveRelease convert(FusionComponent fusionComponent) {
        if (!initialized) {
            initPropertyTypes();
        }
        ComponentActiveRelease car = convert_(fusionComponent, Optional.empty());
        Set<FusionPhysicalProperty> props = fusionComponent.getPhysicalProperties();
        AtomicReference<Double> totalArea = new AtomicReference<>(0d);
        AtomicReference<Double> totalMass = new AtomicReference<>(0d);
        AtomicReference<Double> totalVolume = new AtomicReference<>(0d);
        props.stream().findFirst().ifPresent(p -> {
            car.addProperty(new ComponentProperty(p.getAreaCm2(), car, areaCm2,p.getBodyName()));
            car.addProperty(new ComponentProperty(p.getDensityKgCm2(), car, densityKgCm3,p.getBodyName()));
            car.addProperty(new ComponentProperty(p.getMassKg(), car, massKg,p.getBodyName()));
            car.addProperty(new ComponentProperty(p.getLengthMm(), car, lengthMm,p.getBodyName()));
            car.addProperty(new ComponentProperty(p.getHeightMm(), car, heightMm,p.getBodyName()));
            car.addProperty(new ComponentProperty(p.getWidthMm(), car, widthMm,p.getBodyName()));
            car.addProperty(new ComponentProperty(p.getVolumeCm3(), car, volumeCm3,p.getBodyName()));
            totalMass.updateAndGet(v -> v + p.getMassKg());
            totalVolume.updateAndGet(v -> v + p.getVolumeCm3());
            totalArea.updateAndGet(v -> v + p.getAreaCm2());
        });
        car.addProperty(new ComponentProperty(totalArea.get(), car, areaCm2));
        car.addProperty(new ComponentProperty(totalMass.get(), car, massKg));
        car.addProperty(new ComponentProperty(totalVolume.get(), car, volumeCm3));
        return car;
    }

    private boolean isPartOrComponent(ComponentActiveRelease car) {
        return car.getItemType() == ItemTypes.PART || car.getItemType() == ItemTypes.COMPONENT;
    }

    private ComponentActiveRelease convert_(FusionComponent fusionComponent, Optional<String> name) {
        ComponentActiveRelease car = new ComponentActiveRelease();
        car.setPartNumber(fusionComponent.getPartNumber());
        car.setDescription(fusionComponent.getDescription());
        car.setName(name.orElse(fusionComponent.getPartName()));
        car.setItemType(fusionComponent.getType());
        car.setFusionId(fusionComponent.getFusionId());
        car.setFusionRevisionId(fusionComponent.getRevisionId());
        car.setFusionPath(fusionComponent.getPath());
        return car;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/ComponentActiveReleaseDtoToFusionComponentDto.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Converter from {@link ComponentActiveReleaseDto} to {@link FusionComponentDto}.
 * This is used when merging Engineering BOM items into a Fusion BOM tree.
 */
@Component
public class ComponentActiveReleaseDtoToFusionComponentDto implements Converter<ComponentActiveReleaseDto, FusionComponentDto> {
    @Override
    public FusionComponentDto convert(ComponentActiveReleaseDto source) {
        if (source == null) {
            return null;
        }
        FusionComponentDto target = new FusionComponentDto();
        target.setPartName(source.getName());
        target.setDescription(source.getDescription());
        target.setPartNumber(source.getPartNumber());
        target.setQuantity(source.getQuantity());
        if (source.getItemType() != null) {
            try {
                target.setType(ItemTypes.valueOf(source.getItemType()));
            } catch (IllegalArgumentException ignore) {
                // Unknown type string; leave type unset
            }
        }
        if (source.getParts() != null) {
            for (ComponentActiveReleaseDto child : source.getParts()) {
                target.addChild(convert(child));
            }
        }
        return target;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/FusionCompDtoToPojo.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionPhysicalProperty;
import com.ua.crow.plm.dto.fusion.Body;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.converters.mappers.BodyMapper;
import com.ua.crow.plm.converters.mappers.FusionBomItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionCompDtoToPojo implements Converter<FusionComponentDto, FusionComponent> {
    @Autowired
    FusionBomItemMapper mapper;
    @Autowired
    BodyMapper bodyMapper;


    @Override
    public FusionComponent convert(FusionComponentDto dto) {
        FusionComponent item = mapper.toFusionBom(dto);

        if (dto.getBodies() != null) {
            for (Body body : dto.getBodies()) {
                FusionPhysicalProperty bodyPojo = bodyMapper.toPojo(body);
                bodyPojo.setComponent(item);
                item.getPhysicalProperties().add(bodyPojo);
            }
        }
        return item;

    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbomitem/FusionItemPropertyToDto.java =====
package com.ua.crow.plm.converters.fusionbomitem;

import com.ua.crow.plm.database.fusion.FusionPhysicalProperty;
import com.ua.crow.plm.dto.fusion.Body;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionItemPropertyToDto implements Converter<FusionPhysicalProperty, Body> {
    @Override
    public Body convert(FusionPhysicalProperty source) {
        Body body = new Body();
        BeanUtils.copyProperties(source, body);
        return body;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/settings/ItemTypeNameMappingDtoToEntity.java =====
package com.ua.crow.plm.converters.settings;

import com.ua.crow.plm.converters.mappers.ItemTypeNameMappingMapper;
import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.dto.base.ItemTypeNameMappingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ItemTypeNameMappingDtoToEntity implements Converter<ItemTypeNameMappingDto, ItemTypeNameMapping> {

    @Autowired
    private ItemTypeNameMappingMapper mapper;

    @Override
    public ItemTypeNameMapping convert(ItemTypeNameMappingDto source) {
        return mapper.toEntity(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/settings/ItemTypeNameMappingToDto.java =====
package com.ua.crow.plm.converters.settings;

import com.ua.crow.plm.converters.mappers.ItemTypeNameMappingMapper;
import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.dto.base.ItemTypeNameMappingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ItemTypeNameMappingToDto implements Converter<ItemTypeNameMapping, ItemTypeNameMappingDto> {

    @Autowired
    private ItemTypeNameMappingMapper mapper;

    @Override
    public ItemTypeNameMappingDto convert(ItemTypeNameMapping source) {
        return mapper.toDto(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/EngineeringBomWoChildrenToDto.java =====
package com.ua.crow.plm.converters;

import com.ua.crow.plm.converters.mappers.FullBomMapper;
import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EngineeringBomWoChildrenToDto implements Converter<BomActiveRelease, EngineeringBomWoChildren> {

    @Autowired
    FullBomMapper mapper;
    @Override
    public EngineeringBomWoChildren convert(BomActiveRelease source) {
        EngineeringBomWoChildren dto = mapper.toDtoWoChildren(source);

        return dto;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/BomActiveReleaseToDto.java =====
package com.ua.crow.plm.converters;

import com.ua.crow.plm.converters.mappers.FullBomMapper;
import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.active.BomComponentRel;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BomActiveReleaseToDto implements Converter<BomActiveRelease, BomActiveReleaseDto> {
    @Autowired
    FullBomMapper mapper;


    @Override
    public BomActiveReleaseDto convert(BomActiveRelease source) {
        Set<BomComponentRel> children = source.getChildren();
        BomActiveReleaseDto dto = mapper.toDto(source);
        HashSet<ComponentActiveReleaseDto> childrenDto = new HashSet<>();
        dto.setChildren(childrenDto);
        if (children != null) {
            children.forEach(c -> childrenDto.add(c.convert(ComponentActiveReleaseDto.class)));
        }
        return dto;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/component/PropertyToDto.java =====
package com.ua.crow.plm.converters.component;

import com.ua.crow.plm.converters.mappers.ComponentPropertyMapper;
import com.ua.crow.plm.database.active.ComponentProperty;
import com.ua.crow.plm.dto.active.CompPropertiesActiveReleaseDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PropertyToDto implements Converter<ComponentProperty, CompPropertiesActiveReleaseDto> {
    @Autowired
    ComponentPropertyMapper componentPropertyMapper;

    @Override
    public CompPropertiesActiveReleaseDto convert(ComponentProperty p) {
        CompPropertiesActiveReleaseDto cp = componentPropertyMapper.toDto(p);
        if (p.getPropertyType() != null) {
            cp.setPropertyType(p.getPropertyType().convert(BomItemPropertyTypeDto.class));
        }

        return cp;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/component/PropertyTypeToDto.java =====
package com.ua.crow.plm.converters.component;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.plm.converters.mappers.ComponentPropertyTypeMapper;
import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.dto.UnitsDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PropertyTypeToDto implements Converter<BomItemPropertyType,BomItemPropertyTypeDto> {

    @Autowired
    ComponentPropertyTypeMapper componentPropertyTypeMapper;


    @Override
    public BomItemPropertyTypeDto convert(BomItemPropertyType propertyType) {
        BomItemPropertyTypeDto dto = componentPropertyTypeMapper.toDto(propertyType);
        Units units = propertyType.getUnits();
        if(units!=null){
            dto.setUnits(units.convert(UnitsDto.class));
        }
        if(propertyType.getGroup()!=null){
            dto.setGroup(propertyType.getGroup().convert(BomItemPropertyTypeGroupDto.class));
        }
        return dto;
    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/component/ComponentRelToDto.java =====
package com.ua.crow.plm.converters.component;

import com.ua.crow.plm.database.active.ComponentRel;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ComponentRelToDto implements Converter<ComponentRel, ComponentActiveReleaseDto> {

    @Override
    public ComponentActiveReleaseDto convert(ComponentRel source) {
       ComponentActiveReleaseDto comp = source.getChild().convert(ComponentActiveReleaseDto.class);
       comp.setQuantity(source.getQuantity());
       return comp;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/component/PropertyGroupsToDto.java =====
package com.ua.crow.plm.converters.component;

import com.ua.crow.plm.converters.mappers.PropertyTypeGroupMapper;
import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PropertyGroupsToDto implements Converter<BomItemPropertyTypeGroup,BomItemPropertyTypeGroupDto> {

    @Autowired
    PropertyTypeGroupMapper propertyTypeGroupMapper;

    @Override
    public BomItemPropertyTypeGroupDto convert(BomItemPropertyTypeGroup source) {
        return propertyTypeGroupMapper.toDto(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/component/BomComponentRelToDto.java =====
package com.ua.crow.plm.converters.component;

import com.ua.crow.plm.database.active.BomComponentRel;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BomComponentRelToDto implements Converter<BomComponentRel, ComponentActiveReleaseDto> {

    @Override
    public ComponentActiveReleaseDto convert(BomComponentRel source) {
        ComponentActiveReleaseDto comp = source.getChild().convert(ComponentActiveReleaseDto.class);
        comp.setQuantity(source.getQuantity());
        return comp;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/component/ComponentToDto.java =====
package com.ua.crow.plm.converters.component;

import com.ua.crow.plm.converters.mappers.ComponentMapper;
import com.ua.crow.plm.database.active.ComponentProperty;
import com.ua.crow.plm.database.active.ComponentActiveRelease;
import com.ua.crow.plm.dto.active.CompPropertiesActiveReleaseDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
public class ComponentToDto implements Converter<ComponentActiveRelease, ComponentActiveReleaseDto> {
    @Autowired
    ComponentMapper componentMapper;


    @Override
    public ComponentActiveReleaseDto convert(ComponentActiveRelease c) {
        ComponentActiveReleaseDto componentActiveReleaseDto = componentMapper.toDto(c);
        if (c.getChildBom() != null) {
            componentActiveReleaseDto.setChildBom(c.getChildBom().convert(EngineeringBomWoChildren.class));
        }

//        if (c.getParts() != null) {
//            List<ComponentActiveReleaseDto> componentActiveReleaseDtos = new LinkedList<>();
//            componentActiveReleaseDto.setParts(componentActiveReleaseDtos);
//            c.getParts().forEach(comp -> {
//                componentActiveReleaseDtos.add(comp.convert(ComponentActiveReleaseDto.class));
//            });
//        }

        Set<ComponentProperty> props = c.getProperties();
        if (props != null) {
            Set<CompPropertiesActiveReleaseDto> propsDto = new HashSet<>();
            componentActiveReleaseDto.setProperties(propsDto);
            props.forEach(p -> propsDto.add(p.convert(CompPropertiesActiveReleaseDto.class)));
        }
        return componentActiveReleaseDto;

    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/product/ProductDtoToProductActiveRelease.java =====
package com.ua.crow.plm.converters.product;

import com.ua.crow.plm.converters.mappers.ProductMapper;
import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoToProductActiveRelease implements Converter<ProductActiveReleaseDto, ProductActiveRelease> {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public ProductActiveRelease convert(ProductActiveReleaseDto source) {
        return productMapper.toProduct(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/product/ProductActiveReleaseConverterToProductDto.java =====
package com.ua.crow.plm.converters.product;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.ua.crow.plm.converters.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductActiveReleaseConverterToProductDto implements Converter<ProductActiveRelease, ProductActiveReleaseDto> {
    @Autowired
    private ProductMapper productMapper;
    public ProductActiveReleaseDto convertWithoutBoms(ProductActiveRelease product) {
        ProductActiveReleaseDto p = productMapper.toDto(product);
        product.getAttachmentService().getFirstThumbnailUrl().ifPresent(url->p.setThumbnailUrl(url));
        return p;
    }
    @Override
    public ProductActiveReleaseDto convert(ProductActiveRelease source) {
        return convertWithoutBoms(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/UnitsToDto.java =====
package com.ua.crow.plm.converters;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.dto.mappers.UnitsMapper;
import com.ua.crow.plm.dto.UnitsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UnitsToDto implements Converter<Units, UnitsDto> {
    @Autowired
    UnitsMapper unitsMapper;
    @Override
    public UnitsDto convert(Units source) {
        return unitsMapper.toDto(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/ActiveReleaseComponentToPartNumberReference.java =====
package com.ua.crow.plm.converters;


import com.ua.crow.plm.database.PartNumberReference;
import com.ua.crow.plm.database.PartNumberReferenceType;
import com.ua.crow.plm.database.active.ComponentActiveRelease;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ActiveReleaseComponentToPartNumberReference implements Converter<ComponentActiveRelease,PartNumberReference> {

    @Override
    public PartNumberReference convert(ComponentActiveRelease component) {
        PartNumberReference reference = new PartNumberReference();
        reference.setReferenceType(PartNumberReferenceType.ACTIVE_RELEASE_COMPONENT);
        reference.setPartNumber(component.getPartNumber());
        reference.setDescription(component.getDescription());
        reference.setPartName(component.getName());
        return reference;

    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ComponentPropertyMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.ComponentProperty;
import com.ua.crow.plm.dto.active.CompPropertiesActiveReleaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ComponentPropertyMapper {

    @Mapping(target = "item", ignore = true)
    public abstract CompPropertiesActiveReleaseDto toDto(ComponentProperty bomActiveRelease);

    @Mapping(target = "item", ignore = true)
    public abstract ComponentProperty toPojo(CompPropertiesActiveReleaseDto bomActiveRelease);

}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ComponentMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.ComponentActiveRelease;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ComponentMapper {

    @Mapping(target = "parts", ignore = true)
    @Mapping(target = "properties", ignore = true)
    @Mapping(target = "parentBom", ignore = true)
    @Mapping(target = "childBom", ignore = true)
    public abstract ComponentActiveReleaseDto toDto(ComponentActiveRelease bomActiveRelease);

    @Mapping(target = "parts", ignore = true)
    @Mapping(target = "properties", ignore = true)
    @Mapping(target = "parentBom", ignore = true)
    @Mapping(target = "childBom", ignore = true)
    public abstract ComponentActiveRelease toPojo(ComponentActiveReleaseDto bomActiveRelease);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/FusionBomMapper.java =====
package com.ua.crow.plm.converters.mappers;


import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class FusionBomMapper {

    public abstract FusionBomDto toDto(FusionBom bom);


    public abstract FusionBom toFusionBom(FusionBomDto bom);


}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/FullBomMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class FullBomMapper {
    @Mapping(target = "children", ignore = true)
    @Mapping(target = "product", ignore = true)
    public abstract BomActiveReleaseDto toDto(BomActiveRelease bomActiveRelease);

    @Mapping(target = "children", ignore = true)
    @Mapping(target = "product", ignore = true)
    public abstract EngineeringBomWoChildren toDtoWoChildren(BomActiveRelease bomActiveRelease);

    @Mapping(target = "children", ignore = true)
    @Mapping(target = "product", ignore = true)
    public abstract BomActiveRelease toPojo(BomActiveReleaseDto bomActiveRelease);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ShortFusionBomMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class ShortFusionBomMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "partName", source = "partName")
    @Mapping(target = "partNumber", source = "partNumber")
    @Mapping(target = "type", source = "type")
    public abstract FusionComponentDto toShortDto(FusionComponent bom);

}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/PropertyTypeGroupMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PropertyTypeGroupMapper {
    public abstract BomItemPropertyTypeGroupDto toDto(BomItemPropertyTypeGroup bomItemPropertyTypeGroup);
    public abstract BomItemPropertyTypeGroup toPojo(BomItemPropertyTypeGroupDto bomItemPropertyTypeDto);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ResourceGroupMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.plm.dto.ResourceGroupDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class ResourceGroupMapper {
    @Mapping(target = "children", ignore = true)
    public abstract ResourceGroupDto toDto(ResourceGroup task);

    @Mapping(target = "children", ignore = true)
    public abstract ResourceGroup toResourceGroup(ResourceGroupDto task);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/MaterialMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.Material;
import com.ua.crow.plm.dto.fusion.MaterialDto;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class MaterialMapper {
    abstract MaterialDto toDto(Material material);

    abstract Material toPojo(MaterialDto material);


}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ComponentGroupMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.ComponentGroup;
import com.ua.crow.plm.dto.base.ComponentGroupDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ComponentGroupMapper {
    @Mapping(target = "children", ignore = true)
    public abstract ComponentGroupDto toDto(ComponentGroup group);

    @Mapping(target = "children", ignore = true)
    public abstract ComponentGroup toEntity(ComponentGroupDto dto);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ResourceItemMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.inventory.database.ResourceItem;
import com.ua.crow.plm.dto.ResourceItemDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ResourceItemMapper {
    public abstract ResourceItemDTO toDto(ResourceItem comment);
    public abstract ResourceItem toPojo(ResourceItemDTO comment);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ProductMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class ProductMapper {

    @Mapping(target = "engineeringBoms" ,ignore = true)
    public abstract ProductActiveReleaseDto toDto(ProductActiveRelease task);
    @Mapping(target = "engineeringBoms" ,ignore = true)
    public abstract ProductActiveRelease toProduct(ProductActiveReleaseDto task);

}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/BodyMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.FusionPhysicalProperty;
import com.ua.crow.plm.dto.fusion.Body;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class BodyMapper {
    public abstract Body toDto(FusionPhysicalProperty fusionPhysicalProperty);

    public abstract FusionPhysicalProperty toPojo(Body body);

}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ReleaseVersionMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.dto.released.ReleaseVersionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ReleaseVersionMapper {

    @Mapping(target = "previous", ignore = true)

    public abstract ReleaseVersionDTO toDto(ReleaseVersion bomActiveRelease);
    @Mapping(target = "previous", ignore = true)


    public abstract ReleaseVersion toPojo(ReleaseVersionDTO bomActiveRelease);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ComponentPropertyTypeMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ComponentPropertyTypeMapper {

    public abstract BomItemPropertyTypeDto toDto(BomItemPropertyType bomItemPropertyType);

    public abstract BomItemPropertyType toPojo(BomItemPropertyTypeDto bomItemPropertyTypeDto);

}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/FusionBomItemMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class FusionBomItemMapper {


    public abstract FusionComponentDto toDto(FusionComponent bom);

    public abstract FusionComponent toFusionBom(FusionComponentDto bom);


}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/ItemTypeNameMappingMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.dto.base.ItemTypeNameMappingDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ItemTypeNameMappingMapper {
    public abstract ItemTypeNameMappingDto toDto(ItemTypeNameMapping mapping);

    public abstract ItemTypeNameMapping toEntity(ItemTypeNameMappingDto dto);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/mappers/BomShortMapper.java =====
package com.ua.crow.plm.converters.mappers;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class BomShortMapper {
    @Mapping(target = "children" , ignore = true)
    @Mapping(target = "product", ignore = true)
    public abstract BomActiveReleaseDto toDto(BomActiveRelease bomActiveRelease);
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbom/FusionBomToPartNumberReference.java =====
package com.ua.crow.plm.converters.fusionbom;

import com.ua.crow.plm.database.PartNumberReference;
import com.ua.crow.plm.database.PartNumberReferenceType;
import com.ua.crow.plm.database.fusion.FusionBom;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionBomToPartNumberReference implements Converter<FusionBom, PartNumberReference> {

    @Override
    public PartNumberReference convert(FusionBom source) {
        return converFusionBomToPartNumberRef(source);
    }
    private PartNumberReference converFusionBomToPartNumberRef(FusionBom fb) {
        PartNumberReference partNumberReference = new PartNumberReference();
        partNumberReference.setReferenceType(PartNumberReferenceType.FUSION_BOM);
        partNumberReference.setPartName(fb.getName());
        partNumberReference.setPartNumber(fb.getPartNumber());
        partNumberReference.setDescription(fb.getDescription());
        if(fb.getProduct()!=null) {
            partNumberReference.setProductId(fb.getProduct().getId());
        }
        return partNumberReference;

    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbom/FusionBomDtoToFusionBom.java =====
package com.ua.crow.plm.converters.fusionbom;


import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.converters.mappers.FusionBomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionBomDtoToFusionBom implements Converter<FusionBomDto,FusionBom> {

    @Autowired
    private FusionBomMapper fusionBomMapper;


    @Override
    public FusionBom convert(FusionBomDto source) {

        return fusionBomMapper.toFusionBom(source);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbom/FusionBomToFusionBomDto.java =====
package com.ua.crow.plm.converters.fusionbom;

import com.ua.crow.config.Buckets;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.service.minio.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionBomToFusionBomDto implements Converter<FusionBom,FusionBomDto> {

    @Autowired
    private MinioService minioService;

    @Override
    public FusionBomDto convert(FusionBom bom) {
        FusionBomDto fusionBomDto = new FusionBomDto();

        fusionBomDto.setDeleted( bom.isDeleted() );
        fusionBomDto.setName( bom.getName() );

        fusionBomDto.setCreator( bom.getCreator() );
        fusionBomDto.setModifier( bom.getModifier() );
        fusionBomDto.setCreatedAt( bom.getCreatedAt() );
        fusionBomDto.setModifiedAt( bom.getModifiedAt() );
//        fusionBomDto.setProduct(Optional.of( bom.getProduct() ).map(b->bom.getProduct().convert(ProductActiveReleaseDto.class)).orElse(null)) ;
        fusionBomDto.setDocumentName( bom.getDocumentName() );
        fusionBomDto.setVersion( bom.getVersion() );
        fusionBomDto.setProcessed( bom.isProcessed() );
        fusionBomDto.setEngineeringBomId( bom.getEngineeringBomId() );
        fusionBomDto.setDescription( bom.getDescription() );
        fusionBomDto.setFusionId( bom.getFusionId() );
        fusionBomDto.setLibraryItem( bom.isLibraryItem() );
        fusionBomDto.setRevisionId( bom.getRevisionId() );
        fusionBomDto.setPartNumber( bom.getPartNumber() );
        fusionBomDto.setConfiguration( bom.isConfiguration() );
        fusionBomDto.setConfiguredDesign( bom.isConfiguredDesign() );

        if (bom.getRoot()!=null){
            fusionBomDto.setRootPart(bom.getRoot().convert(FusionComponentDto.class));
        }
        String objectName = new StringBuilder()
                .append("fusionbom/")
                .append(bom.getFusionId())
                .append('_')
                .append(bom.getRevisionId())
                .append('/')
                .append("model.step")
                .toString();
        if (minioService.exist(Buckets.cad, objectName)) {
            fusionBomDto.setUrl(minioService.sign(Buckets.cad, objectName));
        }
        return fusionBomDto;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/converters/fusionbom/FusionBomToBomActiveRelease.java =====
package com.ua.crow.plm.converters.fusionbom;

import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.fusion.FusionBom;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FusionBomToBomActiveRelease implements Converter<FusionBom, BomActiveRelease> {

    @Override
    public BomActiveRelease convert(FusionBom source) {
        BomActiveRelease bom = new BomActiveRelease();
//        bom.addFusionBom("Engineering BOM creation using Fusion 360 model",source);
        bom.setRelease_ver(0L);
        bom.setProduct(source.getProduct());
        bom.setDescription(source.getDescription());
        bom.setPartNumber(source.getPartNumber());
        bom.setName(source.getDocumentName());
        bom.setFusionVersion(source.getVersion());
        bom.setLibraryItem(source.isLibraryItem());
        bom.setConfiguration(source.isConfiguration());
        bom.setConfiguredDesign(source.isConfiguredDesign());
        bom.setFusionRevisionId(source.getRevisionId());
        bom.setFusionId(source.getFusionId());

        return bom;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/fusion/FusionBomItemController.java =====
package com.ua.crow.plm.controller.fusion;

import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.dto.fusion.AddChildRequest;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.service.fusionbom.FusionBomFacadeService;
import com.ua.crow.plm.service.fusionbom.FusionBomManagementService;
import com.ua.crow.plm.service.fusionbomitem.FusionBomItemService;
import com.ua.crow.service.NotFoundException;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fusionbomitem")
@Validated
public class FusionBomItemController {
    @Autowired
    FusionBomFacadeService service;

    @Autowired
    FusionBomManagementService fusionBomManagementService;

    @Autowired
    FusionBomItemService fusionBomItemService;

    @PostMapping("/add")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public @ResponseBody FusionComponentDto save(@RequestBody FusionComponentDto dto){
        return fusionBomManagementService.createItem(dto).convert(FusionComponentDto.class);
    }

    @PostMapping("/addparent")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public @ResponseBody FusionComponentDto save(@RequestBody @Valid AddChildRequest dto){
            return service.addChildItem(dto).convert(FusionComponentDto.class);
    }

    @PostMapping("/update")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionComponentDto update(@RequestBody @Valid FusionComponentDto dto, @RequestParam(value = "updateProperties", defaultValue = "false") boolean updateProperties) {
        return service.updateItem(dto,updateProperties).convert(FusionComponentDto.class);
    }
    @GetMapping("/read")
    public FusionComponentDto readById(@RequestParam String id,@RequestParam String revisionId,@RequestParam(value = "includeProperties", defaultValue = "false") boolean includeProperties) {
        return fusionBomItemService.readById(id, revisionId, includeProperties)
                .orElseThrow(() -> new NotFoundException("Fusion component not found with ID: " + id + " and revision ID: " + revisionId))
                .convert(FusionComponentDto.class);
    }

    @PostMapping("/merge")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionComponentDto merge(@RequestBody @Valid com.ua.crow.plm.dto.requests.MergeBomItemsRequest request) {
        return fusionBomItemService.merge(request.getSourceFusionId(), request.getSourceRevisionId(),
                request.getTargetFusionId(), request.getTargetRevisionId());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/fusion/FusionBomController.java =====
package com.ua.crow.plm.controller.fusion;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.converters.mappers.FusionBomItemMapper;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.dto.requests.FusionBomsListRequest;
import com.ua.crow.plm.dto.requests.MapProductRequest;
import com.ua.crow.plm.service.fusionbom.FusionBomImportService;
import com.ua.crow.plm.service.fusionbom.FusionBomFacadeService;
import com.ua.crow.plm.service.fusionbom.FusionBomManagementService;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.plm.dto.merge.MergeBomTreesDto;
import org.springframework.http.ResponseEntity;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fusionbom")
@Validated
public class FusionBomController {
    @Autowired
    private FusionBomFacadeService fusionBomService;

    @Autowired

    private FusionBomManagementService fusionBomManagementService;
    @Autowired
    private FusionBomItemMapper fusionBomItemMapper;
    @Autowired
    FusionBomImportService fusionBomImportService;
    @PostMapping("/list")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public List<FusionBomDto> fusionBoms(@RequestBody FusionBomsListRequest request, @PageableDefault Pageable pageable) {
        List<FusionBomDto> result;
        if (request.getProductId().isPresent()) {
            if (request.getUnprocessed().isPresent()) {
                if (request.getUnprocessed().get()) {
                    result = fusionBomService.readUnprocessedBomTreeDtosByProduct(request.getProductId().get(), request.getRelease().orElse(0L));
                } else {
                    result = fusionBomService.readProcessedBomTreeDtosByProduct(request.getProductId().get(), request.getRelease().orElse(0L));
                }
            } else {
                result = fusionBomService.readBomTreeDtoByProduct(request.getProductId().get(), request.getRelease().orElse(0L));
            }
        } else {
            result = fusionBomService.readAllTreeDto();
        }

        if (request.getPartNumber().isPresent()) {
            String search = request.getPartNumber().get().toLowerCase();
            result = result.stream()
                    .filter(dto -> dto.getPartNumber() != null && dto.getPartNumber().toLowerCase().contains(search))
                    .toList();
        }
        return result;
    }
    @PostMapping("/updateType")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionComponentDto updateStatus(@RequestParam(required = true) ItemTypes type, @RequestParam(required = true) String id, @RequestParam(required = true) String revId) {
        return fusionBomService.updateItemType(id, revId, type);
    }
    @GetMapping("/{id}")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<FusionBomDto> getFusionBom(@PathVariable("id") String id, @RequestParam("revisionId") String revisionId) {
        return fusionBomService.readDtoById(FusionId.id(id, revisionId));
    }

    @GetMapping("/tree")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<FusionBomDto> getFusionBomTree(@RequestParam String id,
                                                   @RequestParam String revisionId,
                                                   @RequestParam(value = "returnComponentBodies", defaultValue = "false") boolean returnComponentBodies) {
        return fusionBomService.readFullTree(FusionId.id(id, revisionId), returnComponentBodies);
    }
    @GetMapping("/root")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<FusionComponentDto> getTreeOfComponents(@RequestParam String id,
                                                            @RequestParam String revisionId,
                                                            @RequestParam(value = "returnComponentBodies", defaultValue = "false") boolean returnComponentBodies) {
        return fusionBomService.readFullTree(FusionId.id(id, revisionId), returnComponentBodies).map(FusionBomDto::getRootPart);
    }
    @DeleteMapping
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionBomDto delete(@RequestBody FusionId id) {
        return fusionBomManagementService.softDelete(id).convert(FusionBomDto.class);
    }

    @PostMapping("/unlink")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity<Void> unlink(@RequestBody FusionId id) {
        fusionBomManagementService.unlinkFromParents(id);
        return ResponseEntity.ok().build();
    }
    @PostMapping("/mapproduct")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionBomDto mapProduct(@RequestBody @Valid MapProductRequest request) {
        return fusionBomService.mapProduct(FusionId.id(request.getFusionBomId(), request.getRevisionId()), request.getProductId()).convert(FusionBomDto.class);
    }

    @PutMapping
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionBomDto createFusionBom(@RequestBody @NotNull FusionBomDto dto) {
        return fusionBomImportService.save(dto);
    }

    @GetMapping("/revisions/{fusionId}")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public java.util.List<com.ua.crow.plm.dto.fusion.FusionRevisionDto> revisions(
            @PathVariable("fusionId") String fusionId,
            @RequestParam Long productId,
            @RequestParam Long release) {
        return fusionBomService.readRevisionDtos(fusionId, productId, release);
    }

    /**
     * Returns the most suitable Engineering BOM for merging with the specified Fusion BOM.
     */
    @GetMapping("/mergeable-effective-boms/{id}")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity<EngineeringBomWoChildren> mergeableEngineeringBom(@PathVariable("id") String id,
                                                                        @RequestParam String revisionId) {
        return fusionBomService.findMergeableEngineeringBom(FusionId.id(id, revisionId))
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Loads hierarchical trees for both Fusion and Engineering BOM.
     */
    @GetMapping("/trees/{fusionId}/{effectiveId}")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity<MergeBomTreesDto> mergeTrees(@PathVariable("fusionId") String fusionId,
                                                       @PathVariable("effectiveId") Long effectiveId,
                                                       @RequestParam String revisionId) {
        return fusionBomService.loadMergeTrees(FusionId.id(fusionId, revisionId), effectiveId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Performs merge of a Fusion BOM into an existing Engineering BOM.
     */
    @PostMapping("/merge")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity<Void> merge(@RequestParam String fusionId,
                                      @RequestParam String revisionId,
                                      @RequestParam Long engineeringBomId) {
        fusionBomService.mergeFusionIntoEngineeringBom(FusionId.id(fusionId, revisionId), engineeringBomId);
        return ResponseEntity.ok().build();
    }

    // Direct invocation from Vaadin views
    public void deleteComponent(String componentId, String componentRevision) {
        fusionBomManagementService.deleteComponent(FusionId.id(componentId, componentRevision));
    }


}


// ===== File: crow/src/main/java/com/ua/crow/plm/controller/fusion/FusionController.java =====
package com.ua.crow.plm.controller.fusion;

import com.ua.crow.plm.database.PartNumberReference;
import com.ua.crow.plm.database.PartNumberReferenceType;
import com.ua.crow.dto.basic.FindProjectByNameRequest;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.dto.FusionProjectListItem;
import com.ua.crow.plm.dto.ObtainPartNumberRequest;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.ua.crow.plm.dto.fusion.AddChildRequest;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.service.*;
import com.ua.crow.plm.service.fusionbom.FusionBomImportService;
import com.ua.crow.plm.service.fusionbom.FusionBomFileService;
import com.ua.crow.plm.service.product.ActiveReleaseProductService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/fusion")
@Validated
public class FusionController {
    @Autowired
    PartNumberProvider pool;
    @Autowired
    ActiveReleaseProductService service;


    @Autowired
    FusionBomImportService fusionBomImportService;

    @Autowired
    FusionBomFileService fusionBomFileService;

    @GetMapping("/products")
    Stream<FusionProjectListItem> projectList() {
        return service.findAll(false).map(p -> {
            FusionProjectListItem fusionProjectListItem = new FusionProjectListItem();
            fusionProjectListItem.setName(p.getName());
            return fusionProjectListItem;
        });
    }

    @PostMapping("/productsbyname")
    Optional<ProductActiveReleaseDto> findByName(@RequestBody @Valid FindProjectByNameRequest request) {
        return service.findByName(request.getName()).map(p -> p.convert(ProductActiveReleaseDto.class));
    }



    @PostMapping("/readbyid")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<FusionBomDto> getFusionBom(@RequestBody @NotNull  FusionId fusionId) {
        return fusionBomImportService.checkIfExists(fusionId).map(f -> {
            FusionBomDto dto = f.convert(FusionBomDto.class);
            String url = fusionBomFileService.getStepFileUrl(f);
            if (url != null) {
                dto.setUrl(url);
            }
            return dto;
        });
    }

    @PostMapping("/issue")
    ResponseEntity<Void> issue(@RequestBody ObtainPartNumberRequest req) {
            PartNumberReference partNumberReference = pool.findOrCreate(Optional.of(req.getPartNumber())).get();
            ResponseEntity.BodyBuilder r = ResponseEntity.ok().header("partNumber", partNumberReference.getPartNumber());
            if (partNumberReference.getReferenceType() == PartNumberReferenceType.NEW) {
                r.header("created", "true");
            }
            return r.build();
    }

    @PostMapping("/txbegin")
    public ResponseEntity<Void> txBegin(@RequestBody @Valid @NotNull FusionId fusionId){
        return ResponseEntity.ok().build();
    }

    @PutMapping("/fusionbom")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionBomDto createFusionBom(@RequestBody @NotNull FusionBomDto dto){
        return fusionBomImportService.save(dto).convert(FusionBomDto.class);
    }

    @PostMapping("/fusionbomitem")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public @ResponseBody FusionComponentDto save(@RequestBody FusionComponentDto dto){
        return fusionBomImportService.saveItem(dto).convert(FusionComponentDto.class);

    }

    @PostMapping("/addparent")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public @ResponseBody FusionComponentDto addparent(@RequestBody @Valid AddChildRequest dto){

            return fusionBomImportService.addChildItem(dto).convert(FusionComponentDto.class);


    }


    @PostMapping("/txcommit")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionBomDto commit(@RequestBody @NotNull FusionId id){
            return fusionBomImportService.commitTransaction(id);
    }


    @PostMapping("/deletefusionbom")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public FusionBomDto delete(@RequestBody @NotNull FusionId id){
        return fusionBomImportService.delete(id).convert(FusionBomDto.class);
    }

    @PostMapping("/uploadStep")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity<Void> uploadStep(@RequestHeader String fusionId,
                                           @RequestHeader String revisionId,
                                           @RequestHeader("file") MultipartFile file) throws java.io.IOException {
        fusionBomFileService.uploadStepFile(FusionId.id(fusionId, revisionId), file);
        return ResponseEntity.ok().build();
    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/ProductController.java =====
package com.ua.crow.plm.controller;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.ua.crow.plm.dto.base.ProductDto;
import com.ua.crow.service.NotFoundException;
import com.ua.crow.plm.service.product.ActiveReleaseProductService;
import jakarta.annotation.Nonnull;
import jakarta.annotation.security.RolesAllowed;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
@Validated
public class ProductController {
    @Autowired
    private ActiveReleaseProductService activeReleaseProductService;

    @GetMapping
    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    public List<ProductActiveReleaseDto> getAllProducts() {
        return activeReleaseProductService.findAll(false)
                .map(product -> product.convert(ProductActiveReleaseDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/byid")
    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    public Optional<ProductDto> getProductById(@RequestParam @Nonnull Long id) {
        return activeReleaseProductService
                .findById(id)
                .map(productActiveRelease -> productActiveRelease.convert(ProductActiveReleaseDto.class));
    }

    @PostMapping
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ProductActiveReleaseDto createProduct(@RequestBody ProductActiveReleaseDto productDTO) {
        ProductActiveRelease savedProductActiveRelease = activeReleaseProductService.createProduct(productDTO);
        return savedProductActiveRelease.convert(ProductActiveReleaseDto.class);
    }


    public ProductActiveReleaseDto updateProduct( ProductDto productDTO) {
        Long id = productDTO.getId();
        ProductActiveRelease existingProductActiveRelease = activeReleaseProductService.findById(id)
                .orElseThrow(() -> new NotFoundException(id,ProductActiveRelease.class));
        existingProductActiveRelease.setName(productDTO.getName());
        existingProductActiveRelease.setUkrName(productDTO.getUkrName());
        ProductActiveRelease updatedProductActiveRelease = activeReleaseProductService.updateProduct(existingProductActiveRelease);
        return updatedProductActiveRelease.convert(ProductActiveReleaseDto.class);
    }

    @DeleteMapping("/{id}")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        throw new NotImplementedException();
    }


}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/settings/ItemTypeNameMappingController.java =====
package com.ua.crow.plm.controller.settings;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.dto.base.ItemTypeNameMappingDto;
import com.ua.crow.plm.service.ItemTypeNameMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settings/item-type-mappings")
public class ItemTypeNameMappingController {
    private final ItemTypeNameMappingService service;

    @Autowired
    public ItemTypeNameMappingController(ItemTypeNameMappingService service) {
        this.service = service;
    }

    @GetMapping
    public List<ItemTypeNameMappingDto> getAll() {
        return service.findAll().stream().map(e -> e.convert(ItemTypeNameMappingDto.class)).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemTypeNameMappingDto> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ItemTypeNameMappingDto create(@RequestBody ItemTypeNameMappingDto dto) {
        ItemTypeNameMapping saved = service.save(dto.convert(ItemTypeNameMapping.class));
        return saved.convert(ItemTypeNameMappingDto.class);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemTypeNameMappingDto> update(@PathVariable Long id, @RequestBody ItemTypeNameMappingDto dto) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        dto.setId(id);
        ItemTypeNameMapping saved = service.save(dto.convert(ItemTypeNameMapping.class));
        return ResponseEntity.ok(saved.convert(ItemTypeNameMappingDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/settings/BomItemPropertyTypeController.java =====
package com.ua.crow.plm.controller.settings;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import com.ua.crow.plm.service.engbom.BomItemPropertyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settings/property-types")
public class BomItemPropertyTypeController {
    private final BomItemPropertyTypeService service;

    @Autowired
    public BomItemPropertyTypeController(BomItemPropertyTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<BomItemPropertyTypeDto> getAll() {
        return service.findAll().stream().map(e -> e.convert(BomItemPropertyTypeDto.class)).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BomItemPropertyTypeDto> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public BomItemPropertyTypeDto create(@RequestBody BomItemPropertyTypeDto dto) {
        BomItemPropertyType saved = service.save(dto.convert(BomItemPropertyType.class));
        return saved.convert(BomItemPropertyTypeDto.class);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BomItemPropertyTypeDto> update(@PathVariable Long id, @RequestBody BomItemPropertyTypeDto dto) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        dto.setId(id);
        BomItemPropertyType saved = service.save(dto.convert(BomItemPropertyType.class));
        return ResponseEntity.ok(saved.convert(BomItemPropertyTypeDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/settings/ComponentGroupController.java =====
package com.ua.crow.plm.controller.settings;

import com.ua.crow.plm.database.ComponentGroup;
import com.ua.crow.plm.dto.base.ComponentGroupDto;
import com.ua.crow.plm.service.ComponentGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settings/component-groups")
public class ComponentGroupController {
    private final ComponentGroupService service;

    @Autowired
    public ComponentGroupController(ComponentGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<ComponentGroupDto> getAll() {
        return service.findAll().stream().map(e -> e.convert(ComponentGroupDto.class)).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComponentGroupDto> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ComponentGroupDto create(@RequestBody ComponentGroupDto dto) {
        ComponentGroup saved = service.save(dto.convert(ComponentGroup.class));
        return saved.convert(ComponentGroupDto.class);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ComponentGroupDto> update(@PathVariable Long id, @RequestBody ComponentGroupDto dto) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        dto.setId(id);
        ComponentGroup saved = service.save(dto.convert(ComponentGroup.class));
        return ResponseEntity.ok(saved.convert(ComponentGroupDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/settings/BomItemPropertyTypeGroupController.java =====
package com.ua.crow.plm.controller.settings;

import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import com.ua.crow.plm.service.engbom.BomItemPropertyTypeGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settings/property-type-groups")
public class BomItemPropertyTypeGroupController {
    private final BomItemPropertyTypeGroupService service;

    @Autowired
    public BomItemPropertyTypeGroupController(BomItemPropertyTypeGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<BomItemPropertyTypeGroupDto> getAll() {
        return service.findAll().stream().map(e -> e.convert(BomItemPropertyTypeGroupDto.class)).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BomItemPropertyTypeGroupDto> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public BomItemPropertyTypeGroupDto create(@RequestBody BomItemPropertyTypeGroupDto dto) {
        BomItemPropertyTypeGroup saved = service.save(dto.convert(BomItemPropertyTypeGroup.class));
        return saved.convert(BomItemPropertyTypeGroupDto.class);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BomItemPropertyTypeGroupDto> update(@PathVariable Long id, @RequestBody BomItemPropertyTypeGroupDto dto) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        dto.setId(id);
        BomItemPropertyTypeGroup saved = service.save(dto.convert(BomItemPropertyTypeGroup.class));
        return ResponseEntity.ok(saved.convert(BomItemPropertyTypeGroupDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/ResourceGroupController.java =====
package com.ua.crow.plm.controller;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.plm.dto.ResourceGroupDto;
import com.ua.crow.inventory.service.ResourceGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/resource-groups")
public class ResourceGroupController {

    private final ResourceGroupService resourceGroupService;

    @Autowired
    public ResourceGroupController(ResourceGroupService resourceGroupService) {
        this.resourceGroupService = resourceGroupService;
    }

    @GetMapping
    public ResponseEntity<List<ResourceGroupDto>> getAllResourceGroups() {
        List<ResourceGroupDto> resourceGroups = resourceGroupService.findAll().stream().map(e->e.convert(ResourceGroupDto.class)).toList();
        return new ResponseEntity<>(resourceGroups, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceGroupDto> getResourceGroupById(@PathVariable Long id) {
        Optional<ResourceGroupDto> resourceGroup = resourceGroupService.findById(id);
        return resourceGroup.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<ResourceGroupDto> createResourceGroup(@RequestBody ResourceGroupDto resourceGroupDto) {
        ResourceGroup savedResourceG = resourceGroupService.save(resourceGroupDto.convert(ResourceGroup.class));
        ResourceGroupDto savedResourceGroup = savedResourceG.convert(ResourceGroupDto.class);
        return new ResponseEntity<>(savedResourceGroup, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResourceGroupDto> updateResourceGroup(@PathVariable Long id, @RequestBody ResourceGroupDto resourceGroupDto) {
        if (!resourceGroupService.findById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        resourceGroupDto.setId(id);
        ResourceGroupDto updatedResourceGroup = resourceGroupService.save(resourceGroupDto.convert(ResourceGroup.class)).convert(ResourceGroupDto.class);
        return new ResponseEntity<>(updatedResourceGroup, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResourceGroup(@PathVariable Long id) {
        if (!resourceGroupService.findById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        resourceGroupService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/tree")
    public ResponseEntity<List<ResourceGroupDto>> getResourceGroupTree() {
        List<ResourceGroupDto> tree = resourceGroupService.getTree().stream()
                .map(this::convertRecursively)
                .toList();

        return new ResponseEntity<>(tree, HttpStatus.OK);    }
    private ResourceGroupDto convertRecursively(ResourceGroup group) {
        ResourceGroupDto dto = group.convert(ResourceGroupDto.class);
        if (group.getChildren() != null && !group.getChildren().isEmpty()) {
            List<ResourceGroupDto> childDtos = group.getChildren().stream()
                    .map(this::convertRecursively)
                    .toList();
            dto.setChildren(childDtos);
        }
        return dto;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/EngineeringBomController.java =====
package com.ua.crow.plm.controller;

import com.ua.crow.plm.converters.mappers.BomShortMapper;
import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.service.engbom.BomService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/ebom")
@Validated
public class EngineeringBomController {
    @Autowired
    private BomService bomService;
    @Autowired
    private BomShortMapper bomShortMapper;

    @PostMapping("/convertToEngineeringBom")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public ResponseEntity convertToEngineeringBom(@RequestParam @NotNull @NotBlank String id, @RequestParam @NotNull @NotBlank String revisionId) {
        BomActiveRelease res = bomService.importFusionBom(FusionId.id(id,revisionId));
        return ResponseEntity.ok().build();
    }

    @PostMapping("/shortlist")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Stream<ComponentActiveReleaseDto> fusionBoms(@NotNull Long bomId){
        return bomService.shortList(bomId).map(i->i.convert(ComponentActiveReleaseDto.class));
    }

    @GetMapping("/byproductid")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public List<EngineeringBomWoChildren>
        listByProductId(@NotNull @RequestParam Long productId,
                        @RequestParam(required = false, defaultValue = "0") Long release,
                        @PageableDefault @SortDefault.SortDefaults({@SortDefault(sort = "id")}) Pageable pageable,
                        @RequestParam(required = false) boolean rootOnly) {
        return bomService.listByProductId(productId, release, pageable, rootOnly);

    }

    @GetMapping("/byid/components")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public List<ComponentActiveReleaseDto> fullbyId(@NotNull @RequestParam Long id,
                                                    @RequestParam(required = false, defaultValue = "0") Long release) {
        return bomService.readComponents(id, release);
    }

    @GetMapping("/byid")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<EngineeringBomWoChildren> byId(@NotNull @RequestParam Long id,
                                                   @RequestParam(required = false, defaultValue = "0") Long release) {
        return bomService.readShortDtoById(id, release);
    }

    @GetMapping("/byid/tree")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<BomActiveReleaseDto> byIdTree(@NotNull @RequestParam Long id,
                                                  @RequestParam(required = false, defaultValue = "0") Long release) {
        return bomService.readDtoTreeById(id, release);
    }

    @DeleteMapping("/{id}")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public EngineeringBomWoChildren delete(@PathVariable Long id,
                                            @RequestParam(required = false, defaultValue = "false") boolean deleteComponents) {
        return bomService.softDelete(id, deleteComponents).convert(EngineeringBomWoChildren.class);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/cad/CadController.java =====
package com.ua.crow.plm.controller.cad;

import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.service.fusionbom.FusionBomFileService;
import com.ua.crow.plm.service.fusionbom.FusionBomImportService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cad")
public class CadController {

    @Autowired
    private FusionBomImportService importService;

    @Autowired
    private FusionBomFileService fileService;

    @GetMapping("/url")
    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    public Optional<String> getStepFileUrl(@RequestParam String fusionId,
                                           @RequestParam String revisionId) {
        return importService.checkIfExists(FusionId.id(fusionId, revisionId))
                .map(fileService::getStepFileUrl);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/EngineeringBomItemController.java =====
package com.ua.crow.plm.controller;

import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.service.engbom.BomService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebomitem")
@Validated
public class EngineeringBomItemController {
    @Autowired
    private BomService bomService;
    @GetMapping("/bybomid")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public List<ComponentActiveReleaseDto> byId(@NotNull @RequestParam Long id){
        return bomService.readComponents(id,0L);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/ActiveReleaseComponentController.java =====
package com.ua.crow.plm.controller;

import com.ua.crow.plm.dto.requests.ComponentRequestDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.service.ComponentService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/component")
@Validated
public class ActiveReleaseComponentController {

    @Autowired
    ComponentService componentService;

    @GetMapping("/byid")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<ComponentActiveReleaseDto> byId(@NotNull @RequestParam Long id){
        throw new UnsupportedOperationException("Not implemented yet");
    }
    @GetMapping("/list")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Stream<ComponentActiveReleaseDto> list(ComponentRequestDto req){
        return componentService.list(req);
    }

    @PostMapping("/byid")
    @RolesAllowed({"ADMIN", "RESEARCH"})
    public Optional<ComponentActiveReleaseDto> save(){
        throw new UnsupportedOperationException();
    }





}



// ===== File: crow/src/main/java/com/ua/crow/plm/controller/ProductVersionController.java =====
package com.ua.crow.plm.controller;

import com.ua.crow.plm.converters.mappers.ReleaseVersionMapper;
import com.ua.crow.plm.dto.released.ReleaseVersionDTO;
import com.ua.crow.plm.service.product.ProductService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/versions")
@Validated
public class ProductVersionController {
    @Autowired
    ProductService productService;
    @Autowired
    private ReleaseVersionMapper releaseVersionMapper;
    @GetMapping
    public List<ReleaseVersionDTO> getProductVersions(@RequestParam @NotNull Long productid) {
        return productService.getAllVersions(productid)
                .stream()
                .map(releaseVersionMapper::toDto)
                .toList();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbomitem/FusionBomItemService.java =====
package com.ua.crow.plm.service.fusionbomitem;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.fusion.*;
import com.ua.crow.plm.database.repo.FusionComponentRelRepository;
import com.ua.crow.plm.database.repo.FusionComponentRepository;
import com.ua.crow.plm.database.repo.FusionBomRepository;
import com.ua.crow.plm.database.repo.FusionBomRelRepository;
import com.ua.crow.plm.database.repo.MaterialRepository;
import com.ua.crow.plm.dto.fusion.Body;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.service.TypeDetector;
import com.ua.crow.service.BadRequest;
import com.ua.crow.service.NotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FusionBomItemService {
    @Autowired
    TypeDetector typeDetector;
    @Autowired
    FusionComponentRepository fusionComponentRepository;
    @Autowired
    MaterialRepository materialRepository;
    @Autowired
    FusionBomRepository fusionBomRepository;
    @Autowired
    FusionBomRelRepository fusionBomRelRepository;
    @Autowired
    FusionComponentRelRepository repository;
    @Transactional(readOnly = true)
    public Optional<FusionComponentDto> readById(@NotNull String itemId, @NotNull String revisionId, boolean includeProperties) {
        Optional<FusionComponent> item = fusionComponentRepository.findById(new FusionId(itemId, revisionId));
        if (item.isPresent()) {
            Optional<FusionComponentDto> dto = item.map(fbom -> fbom.convert(FusionComponentDto.class));
            if (includeProperties) {
                dto.get().setBodies(item.get().getPhysicalProperties().stream().map(p -> p.convert(Body.class)).collect(Collectors.toSet()));
            }
            return dto;
        }
        return Optional.empty();
    }

    public FusionComponentDto updateType(String id,String revisionId, ItemTypes type) {
        FusionComponent fbom = fusionComponentRepository.findById(FusionId.id(id,revisionId))
                .orElseThrow(() -> new NotFoundException(id, FusionComponent.class));
        fbom.setType(type);
        fusionComponentRepository.save(fbom);
        return fbom.convert(FusionComponentDto.class);
    }

    @Transactional(readOnly = true)
    public Optional<FusionComponent> findLastByPartNumber(String partNumber, String revisionId) {
        return fusionComponentRepository.findByPartNumberAndRevisionId(partNumber,revisionId);
    }

    @Transactional(readOnly = true)
    public Optional<FusionComponent> findLastByPartNumber(String partNumber) {
        return fusionComponentRepository.findLastByPartNumber(partNumber);
    }

    public FusionComponentRel addChild(FusionBom bom, FusionComponent component, FusionComponent relatedEntity) {
        return addChild(bom, component, relatedEntity,1d);
    }

    public FusionComponentRel addChild(FusionBom bom, FusionComponent parent, FusionComponent child, Double quantity) {
        Optional<FusionComponentRel> relationshipOpt = repository.findChildrenForBom(parent.getFusionId(),parent.getRevisionId(),bom.getFusionId(),bom.getRevisionId())
                .filter(f -> f.getBomId().equals(bom.getFusionId())&&f.getBomRevisionId().equals(bom.getRevisionId()) &&
                f.getFusionChildId().equals(child.getFusionId()) && f.getChildRevisionId().equals(child.getRevisionId())&&
                f.getFusionParentId().equals(parent.getFusionId())&&f.getParentRevisionId().equals(parent.getRevisionId())).findFirst();

        Optional<FusionComponentRel> checkReverse = repository.findChildrenForBom(child.getFusionId(),child.getRevisionId(),bom.getFusionId(),bom.getRevisionId())
                .filter(f -> f.getBomId().equals(bom.getFusionId()) && f.getBomRevisionId().equals(bom.getRevisionId())&&
                        f.getFusionChildId().equals(parent.getFusionId()) && f.getChildRevisionId().equals(parent.getRevisionId())&&
                        f.getFusionParentId().equals(child.getFusionId())&&f.getParentRevisionId().equals(child.getRevisionId())).findFirst();
        FusionComponentRel relationship;
        if (checkReverse.isPresent()){
            throw new BadRequest("Attempt to add cyclomatic node");
        }
        if (relationshipOpt.isPresent()) {
            relationship = relationshipOpt.get();
            relationship.setQuantity(relationshipOpt.get().getQuantity() + quantity);

        } else {
            relationship = new FusionComponentRel();
            relationship.setParent(parent);
            relationship.setBom(bom);
            relationship.setChild(child);
            relationship.setQuantity(quantity);
        }

        FusionComponentRel saved = repository.save(relationship);

        if (child.isRoot()) {
            fusionBomRepository.findByRoot(child.getFusionId(), child.getRevisionId())
                .ifPresent(childBom -> {
                    if (!bom.getFusionId().equals(childBom.getFusionId()) || !bom.getRevisionId().equals(childBom.getRevisionId())) {
                        fusionBomRelRepository.findRelation(bom.getFusionId(), bom.getRevisionId(), childBom.getFusionId(), childBom.getRevisionId())
                                .map(rel -> {
                                    rel.setQuantity(saved.getQuantity());
                                    return fusionBomRelRepository.save(rel);
                                })
                                .orElseGet(() -> {
                                    FusionBomRel r = new FusionBomRel();
                                    r.setParentBom(bom);
                                    r.setChildBom(childBom);
                                    r.setQuantity(saved.getQuantity());
                                    return fusionBomRelRepository.save(r);
                                });
                    }
                });
        }

        return saved;
    }

    public Stream<FusionComponentRel> getChildren(FusionComponent component, FusionBom bom){
        return repository.findChildrenForBom(component.getFusionId(),component.getRevisionId(),bom.getFusionId(),bom.getRevisionId());
    }
    @Transactional
    public FusionComponent create(@NotNull FusionComponentDto dto,@NotNull FusionBom bom) {
        Optional<FusionComponent> candidate = findLastByPartNumber(dto.getPartNumber(),dto.getRevisionId());
        FusionComponent item;
        if(candidate.isPresent()){
            item =  candidate.get();
        }else {
            item = dto.convert(FusionComponent.class);
            if (!item.getPhysicalProperties().isEmpty()) {
                for (FusionPhysicalProperty property : item.getPhysicalProperties()) {
                    if (property.getMaterial() != null) {
                        Material material = materialRepository.findById(property.getMaterial().getId()).orElseGet(() -> {
                            Material m = property.getMaterial();
                            return materialRepository.save(m);
                        });
                        property.setMaterial(material);
                    }
                }
            }
            item = typeDetector.autodetectType(item);
            item = fusionComponentRepository.save(item);
        }

        FusionComponentDto parent = dto.getParent();
        if (!dto.isRoot() && (dto.getParent()==null||dto.getParent().getFusionId()==null)) {
            throw new BadRequest("Component must have to be root or has a parent");
        } else  if(parent != null && parent.getFusionId() != null){
            Optional<FusionComponent> parentItem = fusionComponentRepository.findById(FusionId.id(parent.getFusionId(),parent.getRevisionId()));
            FusionComponent p = parentItem.orElseThrow(() -> new NotFoundException(parent.getFusionId(), FusionComponent.class));
            addChild(bom, p, item);
        }

        return item;
    }
    @Valid
    @Transactional
    public FusionComponent addChildById(@NotNull FusionBom bom, @NotNull FusionId childId, @NotNull FusionId parentId) {
        FusionComponent item = findComponentByIdOrThrow(childId);
        FusionComponent parent = findComponentByIdOrThrow(parentId);
        addChild(bom, parent, item);
        fusionComponentRepository.save(item);
        return item;
    }

    @Transactional(readOnly = true)
    public FusionComponent findComponentByIdOrThrow(@NotNull FusionId fusionId){
        return fusionComponentRepository.findById(fusionId)
                .orElseThrow(() -> new NotFoundException(fusionId, FusionComponent.class));
    }

    @Transactional
    public FusionComponentDto merge(@NotNull String sourceFusionId,
                                    @NotNull String sourceRevisionId,
                                    @NotNull String targetFusionId,
                                    @NotNull String targetRevisionId) {
        if(sourceFusionId.equals(targetFusionId) && sourceRevisionId.equals(targetRevisionId)) {
            throw new BadRequest("Source and target cannot be the same");
        }

        FusionComponentRel sourceRel = repository.findByChild(sourceFusionId, sourceRevisionId)
                .findFirst()
                .orElseThrow(() -> new NotFoundException(sourceFusionId, FusionComponentRel.class));
        FusionComponentRel targetRel = repository.findByChild(targetFusionId, targetRevisionId)
                .findFirst()
                .orElseThrow(() -> new NotFoundException(targetFusionId, FusionComponentRel.class));

        if(!sourceRel.getBomId().equals(targetRel.getBomId()) ||
           !sourceRel.getBomRevisionId().equals(targetRel.getBomRevisionId())) {
            throw new BadRequest("Both items must belong to the same BOM revision");
        }

        if(!sourceRel.getFusionParentId().equals(targetRel.getFusionParentId()) ||
           !sourceRel.getParentRevisionId().equals(targetRel.getParentRevisionId())) {
            throw new BadRequest("Cannot merge items from different assemblies");
        }

        Double newQty =
                (targetRel.getQuantity() == null ? 0d : targetRel.getQuantity()) +
                (sourceRel.getQuantity() == null ? 0d : sourceRel.getQuantity());

        targetRel.setQuantity(newQty);
        repository.save(targetRel);
        repository.delete(sourceRel);

        FusionComponentDto dto = targetRel.getChild().convert(FusionComponentDto.class);
        dto.setQuantity(newQty);
        return dto;
    }


}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/ComponentGroupService.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.ComponentGroup;
import com.ua.crow.plm.database.repo.ComponentGroupRepository;
import com.ua.crow.plm.dto.base.ComponentGroupDto;
import com.ua.crow.service.graph.AbstractTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ComponentGroupService extends AbstractTreeService<ComponentGroup, Long> {

    private final ComponentGroupRepository repository;

    @Autowired
    public ComponentGroupService(ComponentGroupRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Optional<ComponentGroupDto> findById(Long id) {
        return repository.findById(id).map(e -> e.convert(ComponentGroupDto.class));
    }

    @Override
    protected CrudRepository<ComponentGroup, Long> getRepository() {
        return repository;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/PartNumberProvider.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.PartNumberPool;
import com.ua.crow.plm.database.PartNumberReference;
import com.ua.crow.plm.database.PartNumberReferenceType;
import com.ua.crow.plm.database.repo.PartNumberPoolRepository;
import com.ua.crow.plm.service.engbom.BomService;
import com.ua.crow.plm.service.fusionbom.FusionBomManagementService;
import com.ua.crow.plm.service.fusionbomitem.FusionBomItemService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class PartNumberProvider {
    @Autowired
    PartNumberPoolRepository partNumberPool;

    @Autowired
    BomService bomService;

    @Autowired
    ComponentService service;



    @Autowired
    FusionBomManagementService fusionBomService;

    @Autowired
    ComponentService componentService;

    @Autowired
    FusionBomItemService fusionBomItemService;



    public Optional<PartNumberReference> findOrCreate(Optional<String> partNumber) {
        if(partNumber.isPresent()&&!"".equals(partNumber.get())){
            return find(partNumber.get()).or(() -> Optional.of(issue()));
        }else {
            return Optional.of(issue());
        }
    }

    @Transactional
    public PartNumberReference issue() {
        PartNumberPool pool = new PartNumberPool();
        pool.setIssueDate(new Date());
        PartNumberPool pn = partNumberPool.save(pool);
        PartNumberReference ref = new PartNumberReference();
        ref.setPartNumber(pn.getId().toString());
        ref.setReferenceType(PartNumberReferenceType.POOL);
        return ref;
    }

    @Transactional
    public Optional<PartNumberReference> findFirstBom(@NotBlank String partNumber) {
        return findBoms(partNumber).findFirst();
    }

    @Transactional
    public Optional<PartNumberReference> findFirstFusionBom(@NotBlank String partNumber) {
        return findFusionBoms(partNumber).findFirst();
    }

    @Transactional
    public Optional<PartNumberReference> findFirstComponent(@NotBlank String partNumber) {
        return findComponents(partNumber).findFirst();
    }

    @Transactional
    public Optional<PartNumberReference> findFirstFusionBomItem(@NotBlank String partNumber) {
        return findFusionBomItems(partNumber);
    }

    @Transactional
    public Stream<PartNumberReference> findBoms(@NotBlank String partNumber) {
        return bomService.findByPartNumber(partNumber)
                .map(b -> b.convert(PartNumberReference.class))
                .toList()
                .stream();
    }

    @Transactional
    public Stream<PartNumberReference> findFusionBoms(@NotBlank String partNumber) {
        return fusionBomService.readByPartNumber(partNumber)
                .map(fb -> fb.convert(PartNumberReference.class))
                .toList()
                .stream();
    }

    @Transactional
    public Stream<PartNumberReference> findComponents(@NotBlank String partNumber) {
        return componentService.findByPartNumber(partNumber)
                .map(c -> c.convert(PartNumberReference.class))
                .toList()
                .stream();
    }

    @Transactional
    public Optional<PartNumberReference> findFusionBomItems(@NotBlank String partNumber) {
        return fusionBomItemService.findLastByPartNumber(partNumber)
                .map(fusionBomItem -> fusionBomItem.convert(PartNumberReference.class));
    }

    @Transactional
    public Optional<PartNumberReference> find(String partNumber) {
        return findFirstFusionBomItem(partNumber)
                .or(() -> findFirstFusionBom(partNumber))
                .or(() -> findFirstComponent(partNumber))
                .or(() -> findFirstBom(partNumber))
                .or(() -> findInPool(partNumber).map(p -> convert(p)));
    }

    private Optional<PartNumberPool> findInPool(String partNumber) {
        try {
            Long id = Long.valueOf(partNumber);
            return partNumberPool.findById(id);
        }catch (Exception e){
            return Optional.empty();
        }

    }

    private PartNumberReference convert(PartNumberPool p) {
        PartNumberReference ref = new PartNumberReference();
        ref.setReferenceType(PartNumberReferenceType.POOL);
        ref.setPartNumber(p.getId().toString());
        return ref;
    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/PropertyTypeProvider.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.repo.EngineeringBomItemPropertyTypeRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
@Lazy
public class PropertyTypeProvider {

    private final EngineeringBomItemPropertyTypeRepository repository;
    private final Map<String, BomItemPropertyType> cache = new HashMap<>();

    public PropertyTypeProvider(EngineeringBomItemPropertyTypeRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void init() {
        repository.findAll().forEach(pt -> cache.put(pt.getName(), pt));
    }

    public BomItemPropertyType get(String name) {
        return cache.get(name);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/RelationshipCache.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.active.BomComponentRel;
import com.ua.crow.plm.database.active.BomComponentRelId;
import com.ua.crow.plm.database.active.ComponentPartRelationshipId;
import com.ua.crow.plm.database.active.ComponentRel;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RelationshipCache {
    private final ThreadLocal<Map<ComponentPartRelationshipId, ComponentRel>> cache = ThreadLocal.withInitial(HashMap::new);
    private final ThreadLocal<Map<BomComponentRelId, BomComponentRel>> processedBomRels = ThreadLocal.withInitial(HashMap::new);


    public Map<ComponentPartRelationshipId, ComponentRel> getProcessedComponentRels() {
        return cache.get();
    }
    public Map<BomComponentRelId, BomComponentRel> getProcessedBomRels() {
        return processedBomRels.get();
    }






    @PreDestroy
    public void clear() {
        cache.remove();
    }
}


// ===== File: crow/src/main/java/com/ua/crow/plm/service/QuantitiveComponent.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.active.ComponentActiveRelease;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class QuantitiveComponent extends ComponentActiveRelease {
    private Double quantity;

    public QuantitiveComponent() {
        super();
    }

    public QuantitiveComponent(ComponentActiveRelease componentActiveRelease) {
        BeanUtils.copyProperties(componentActiveRelease, this);
    }

    public QuantitiveComponent(ComponentActiveRelease componentActiveRelease,Double quantity) {
        BeanUtils.copyProperties(componentActiveRelease, this);
        this.quantity = quantity;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/product/ActiveReleaseProductService.java =====
package com.ua.crow.plm.service.product;

import com.ua.crow.plm.database.active.CompleteSet;
import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.repo.ActiveReleaseProductRepository;
import com.ua.crow.plm.database.repo.CompleteSetRepository;
import com.ua.crow.plm.database.repo.ReleasedProductRepository;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.ua.crow.service.minio.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.ua.crow.plm.database.released.ReleasableId.releasableId;

@Service
public class ActiveReleaseProductService {

    @Autowired
    private ActiveReleaseProductRepository activeReleaseProductRepository;
    @Autowired
    private ReleasedProductRepository releasedProductRepository;

    @Autowired
    CompleteSetRepository completeSetRepository;

    @Value("${tempdir.url}")
    String tempBufferAddress;

    @Autowired
    MinioService minioService;

    public Stream<ProductActiveRelease> findAll(boolean deleted) {
        if(deleted) {
            return StreamSupport.stream(activeReleaseProductRepository.findAll().spliterator(),false);
        }else {
            return StreamSupport.stream(activeReleaseProductRepository.findByDeletedFalse().spliterator(),false);
        }
    }

    public Optional<ProductActiveRelease> findById(Long id) {
        Optional<ProductActiveRelease> activeRelease = activeReleaseProductRepository.findById(releasableId(id));
        return activeRelease;
    }


    @Transactional
    public ProductActiveRelease createProduct(ProductActiveReleaseDto dto){
        ProductActiveRelease productActiveRelease = dto.convert(ProductActiveRelease.class);
        productActiveRelease = activeReleaseProductRepository.save(productActiveRelease);
        if(dto.getThumbnailUrl() != null) {
            productActiveRelease.getAttachmentService().addThumbnail(dto.getThumbnailUrl());
        }
        CompleteSet defaultCompleteSet = new CompleteSet();
        defaultCompleteSet.setName("default");
        completeSetRepository.save(defaultCompleteSet);

        productActiveRelease.setDefaultCompleteSet(defaultCompleteSet);
        activeReleaseProductRepository.save(productActiveRelease);

        return productActiveRelease;
    }

    @Transactional
    public ProductActiveRelease updateProduct(ProductActiveRelease productActiveRelease) {
        ProductActiveRelease savedProductActiveRelease = activeReleaseProductRepository.save(productActiveRelease);
        return savedProductActiveRelease;
    }
    public void deleteById(Long id) {
        activeReleaseProductRepository.deleteById(releasableId(id));
    }


    public Optional<ProductActiveRelease> findByName(String name) {
        return activeReleaseProductRepository.findByName(name);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/product/FusionBomCsvAttachment.java =====
package com.ua.crow.plm.service.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FusionBomCsvAttachment {
    byte[] file;

    String path;
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/product/ProductService.java =====
package com.ua.crow.plm.service.product;

import com.ua.crow.plm.database.ReleaseVersion;
import com.ua.crow.plm.database.active.CompleteSet;
import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.plm.database.repo.ActiveReleaseProductRepository;
import com.ua.crow.plm.database.repo.ReleasedProductRepository;
import com.ua.crow.service.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

import static com.ua.crow.plm.database.released.ReleasableId.releasableId;

@Service
public class ProductService {
    @Autowired
    ActiveReleaseProductRepository activeReleaseProductRepository;
    @Autowired
    ReleasedProductRepository releasedProductRepository;

    public ProductActiveRelease findById(Long id){
        return activeReleaseProductRepository.findById(releasableId(id)).orElseThrow(()->new NotFoundException(id, ProductService.class));
    }


    @Transactional(readOnly = true)
    public List<ReleaseVersion> getAllVersions(Long id) {
        ReleaseVersion current = new ReleaseVersion();
        current.setId(0L);
        current.setVer(0d);
        current.setName("HEAD");
        return Stream.concat(Stream.of(current),
                releasedProductRepository.findAllProductReleases(id, false).stream()
                        .map(product -> product.getReleaseVersion()))
                .toList();
    }

    @Transactional(readOnly = true)
    public CompleteSet getDefaultCompleteSet(Long productId){
        return activeReleaseProductRepository.findById(ReleasableId.releasableId(productId)).orElseThrow(()->new NotFoundException("Default complete set is missing")).getDefaultCompleteSet();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/product/ProductAttachmentServiceProvider.java =====
package com.ua.crow.plm.service.product;

import com.ua.crow.plm.database.base.ProductBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ProductAttachmentServiceProvider {

    @Autowired
    private ApplicationContext applicationContext;

    public ProductAttachmentService create(ProductBase product) {
        // Создание нового экземпляра ProductAttachmentService с прототипом
        return applicationContext.getBean(ProductAttachmentService.class, product);
    }
}


// ===== File: crow/src/main/java/com/ua/crow/plm/service/product/ProductAttachmentService.java =====
package com.ua.crow.plm.service.product;

import com.ua.crow.config.Buckets;
import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.base.ProductBase;
import com.ua.crow.plm.database.released.ProductReleased;
import com.ua.crow.service.minio.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.Optional;

@Service
@Scope("prototype")
public class ProductAttachmentService {
    private final ProductBase product;

    private static final String THUMB_FOLDER = "thumbnails/";


    @Autowired
    private MinioService minio;

    public ProductAttachmentService(ProductBase product) {
        this.product = product;
    }

    public String getProductFolder() {
        if (product.getId()==null){
            throw new NullPointerException("Product must be saved!");
        }
        String path;
        if(product instanceof ProductActiveRelease) {
            path = new StringBuilder().append(product.getId()).append("_").append(0).append("_").append(product.getName()).append('/').toString();
        }else {
            ProductReleased released = (ProductReleased) product;
            path = new StringBuilder().append(released.getId()).append("_").append(released.getRelease_ver()).append("_").append(released.getName()).append('/').toString();
        }
        return path;

    }

    public String getThumbFolderForProduct() {
        return new StringBuilder().append(getProductFolder()).append(THUMB_FOLDER).toString();
    }


    public void addThumbnail(String thumbnailUrl) {
        minio.uploadFileTemporaryStorage(Buckets.products,thumbnailUrl,getThumbFolderForProduct());
    }

    public void saveFusionBomCsv(Long id,byte[] csv) {
        minio.put(Buckets.cad,getFusionBomFolder(id)+"bom.csv",new ByteArrayInputStream(csv),csv.length, "text/csv");

    }

    private String getFusionBomFolder(Long id) {
        return new StringBuilder().append(getProductFolder()).append(id).append('/').toString();
    }

    public FusionBomCsvAttachment getFusionBomCsv(Long id) {
        String objectId = getFusionBomFolder(id) + "bom.csv";
        return new FusionBomCsvAttachment( minio.getObjectAsBytes(Buckets.cad,objectId),objectId);
    }

    public Optional<String> getFirstThumbnailUrl() {
        return minio.getSignedUrlForTheFirstObjectInFolder(Buckets.products,getThumbFolderForProduct());
    }


    public void deleteFusionBomCsv(Long id) {
        String objectId = getFusionBomFolder(id) + "bom.csv";
        minio.delete(Buckets.cad,objectId);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/TypeDetector.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.repo.ItemTypeNameMappingRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TypeDetector {

    private final ItemTypeNameMappingRepository itemTypeNameMappingRepository;
    private final Map<String, ItemTypes> cache = new HashMap<>();

    @Autowired
    public TypeDetector(ItemTypeNameMappingRepository itemTypeNameMappingRepository) {
        this.itemTypeNameMappingRepository = itemTypeNameMappingRepository;
    }

    @PostConstruct
    public void init() {
        List<ItemTypeNameMapping> allMappings = (List<ItemTypeNameMapping>) itemTypeNameMappingRepository.findAll();
        for (ItemTypeNameMapping mapping : allMappings) {
            cache.put(mapping.getName().toLowerCase(), mapping.getType());
        }
    }

    public ItemTypes autodetectType(String val, ItemTypes def) {
        if (val == null) {
            return def;
        }
        for (String key : cache.keySet()) {
            if (val.toLowerCase().contains(key)) {
                return cache.get(key);
            }
        }
        return def;
    }

    public FusionComponent autodetectType(FusionComponent item) {
        if (item == null) {
            return null;
        }
        if(item.isRoot()){
            item.setType(ItemTypes.BOM);
            return item;
        }

        ItemTypes detectedType = autodetectType(item.getPartName(), item.getType());

        if (detectedType == item.getType()) {
            detectedType = autodetectType(item.getDescription(), item.getType());
        }

        item.setType(detectedType);
        return item;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/engbom/BomCrudService.java =====
package com.ua.crow.plm.service.engbom;

import com.ua.crow.plm.database.active.*;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.plm.database.repo.BomRelRepository;
import com.ua.crow.plm.database.repo.EngineeringBomRepository;
import com.ua.crow.plm.service.RelationshipCache;
import com.ua.crow.plm.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class BomCrudService {
    @Autowired
    EngineeringBomRepository engineeringBomRepository;
    @Autowired
    BomRelRepository bomRelRepository;
    @Autowired
    RelationshipCache cache;
    @Autowired
    ProductService productService;
    @Transactional
    public BomActiveRelease create(BomActiveRelease bom) {
        bom.setRelease_ver(0L);
        return engineeringBomRepository.save(bom);
    }

    @Transactional
    public Optional<BomActiveRelease> readById(Long id) {
        return engineeringBomRepository.findById(ReleasableId.releasableId(id))
                .filter(b -> !b.isDeleted());
    }


    public void addChildToBom(BomActiveRelease bom, ComponentActiveRelease childComponent) {
        addChildToBom(bom, childComponent, 1d);

    }

    public void addChildToBom(BomActiveRelease bom, ComponentActiveRelease childComponent,Double quantity) {
        if(bom.getProduct()==null){
            throw new RuntimeException("Invalid product");
        }
        addChildToBom(bom, childComponent, quantity,productService.findById(bom.getProduct().getId()).getDefaultCompleteSet());
    }

    @Transactional
    public void addChildToBom(BomActiveRelease bom, ComponentActiveRelease childComponent, Double quantity, CompleteSet completeSet) {
        Map<BomComponentRelId, BomComponentRel> processed = cache.getProcessedBomRels();
        BomComponentRelId id = new BomComponentRelId(bom.getId(),bom.getRelease_ver(),childComponent.getId(),childComponent.getRelease_ver(),completeSet.getId());
        BomComponentRel currentTransaction = processed.get(id);
        if (currentTransaction!=null){
            currentTransaction.setQuantity(currentTransaction.getQuantity()+quantity);
        }else {
            currentTransaction = bomRelRepository.findById(id).or(()->{
                BomComponentRel relationship = new BomComponentRel();
                relationship.setParentBomId(bom.getId());
                relationship.setParentBomReleaseVer(bom.getRelease_ver());
                relationship.setChildId(childComponent.getId());
                relationship.setChildReleaseVer(childComponent.getRelease_ver());
                relationship.setQuantity(quantity);
                relationship.setCompleteSetId(completeSet.getId());
                return relationship.optional();
            }).get();
        }
        processed.put(id,bomRelRepository.save(currentTransaction));
    }

}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/engbom/BomItemPropertyTypeService.java =====
package com.ua.crow.plm.service.engbom;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.repo.BomItemPropertyTypeRepository;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BomItemPropertyTypeService {
    private final BomItemPropertyTypeRepository repository;

    @Autowired
    public BomItemPropertyTypeService(BomItemPropertyTypeRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<BomItemPropertyType> findAll() {
        return repository.findAll(Sort.by("id"));
    }

    @Transactional(readOnly = true)
    public Optional<BomItemPropertyTypeDto> findById(Long id) {
        return repository.findById(id).map(e -> e.convert(BomItemPropertyTypeDto.class));
    }

    @Transactional
    public BomItemPropertyType save(BomItemPropertyType type) {
        return repository.save(type);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/engbom/BomItemPropertyTypeGroupService.java =====
package com.ua.crow.plm.service.engbom;

import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.database.repo.BomItemPropertyTypeGroupRepository;
import com.ua.crow.plm.dto.base.BomItemPropertyTypeGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BomItemPropertyTypeGroupService {
    private final BomItemPropertyTypeGroupRepository repository;

    @Autowired
    public BomItemPropertyTypeGroupService(BomItemPropertyTypeGroupRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<BomItemPropertyTypeGroup> findAll() {
        return repository.findAll(Sort.by("id"));
    }

    @Transactional(readOnly = true)
    public Optional<BomItemPropertyTypeGroupDto> findById(Long id) {
        return repository.findById(id).map(e -> e.convert(BomItemPropertyTypeGroupDto.class));
    }

    @Transactional
    public BomItemPropertyTypeGroup save(BomItemPropertyTypeGroup group) {
        return repository.save(group);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/engbom/BomService.java =====
package com.ua.crow.plm.service.engbom;

import com.ua.crow.plm.database.active.*;
import com.ua.crow.plm.database.base.BaseRel;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.plm.database.released.BomReleased;
import com.ua.crow.plm.database.released.ComponentReleased;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.repo.EngineeringBomRepository;
import com.ua.crow.plm.database.repo.BomReleasedRepository;
import com.ua.crow.plm.database.repo.ComponentReleasedRepository;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.plm.service.ComponentService;
import com.ua.crow.plm.service.QuantitiveComponent;
import com.ua.crow.plm.service.fusionbom.CadToEngBomConversionService;
import com.ua.crow.service.NotFoundException;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Stream;

@Service
public class BomService {
    @Autowired
    private EngineeringBomRepository engineeringBomRepository;
    @Autowired
    BomCrudService bomCrudService;
    @Autowired
    ComponentService componentService;
    @Autowired
    BomReleasedRepository bomReleasedRepository;
    @Autowired
    ComponentReleasedRepository componentReleasedRepository;
    @Autowired
    CadToEngBomConversionService cadToEngBomConversionService;

    @Transactional(readOnly = true)
    public java.util.List<com.ua.crow.plm.database.ReleaseVersion> getAllVersions(Long id) {
        com.ua.crow.plm.database.ReleaseVersion current = new com.ua.crow.plm.database.ReleaseVersion();
        current.setId(0L);
        current.setVer(0d);
        current.setName("HEAD");
        return java.util.stream.Stream.concat(java.util.stream.Stream.of(current),
                bomReleasedRepository.findAllBomReleases(id, false).stream()
                        .map(com.ua.crow.plm.database.released.BomReleased::getReleaseVersion))
                .toList();
    }

    @Transactional(readOnly = true)
    public Stream<BomActiveRelease> findByPartNumber(@NotBlank String partNumber) {
        return engineeringBomRepository.findByPartNumber(partNumber);
    }
    @Transactional(readOnly = true)
    public List<EngineeringBomWoChildren> listByProductId(@NotNull Long productId, @NotNull Long releaseVer, Pageable pageable, boolean rootOnly) {
        if (releaseVer == 0L) {
            if (rootOnly) {
                return engineeringBomRepository.findRootBomsByProductId(productId, releaseVer, pageable)
                        .stream().map(b -> b.convert(EngineeringBomWoChildren.class)).toList();
            }
            return engineeringBomRepository.findBomsByProductId(productId, releaseVer, pageable)
                    .stream().map(b -> b.convert(EngineeringBomWoChildren.class)).toList();
        }
        if (rootOnly) {
            return bomReleasedRepository.findRootBomsByProductId(productId, releaseVer, pageable)
                    .stream().map(this::convertReleasedBom).toList();
        }
        return bomReleasedRepository.findBomsByProductId(productId, releaseVer, pageable)
                .stream().map(this::convertReleasedBom).toList();
    }

    public Stream<EngineeringBomWoChildren> listOfRootsByProductId(@NotNull Long productId, @NotNull Long releaseVer) {
        if (releaseVer == 0L) {
            return engineeringBomRepository.findRootBomsByProductId(productId, releaseVer)
                    .map(b -> b.convert(EngineeringBomWoChildren.class));
        }
        return bomReleasedRepository.findRootBomsByProductId(productId, releaseVer)
                .map(this::convertReleasedBom);
    }

    public Optional<EngineeringBomWoChildren> readShortDtoById(Long id, Long release) {
        if (release == null || release == 0L) {
            return engineeringBomRepository.findById(ReleasableId.releasableId(id))
                    .filter(b -> !b.isDeleted())
                    .map(b -> b.convert(EngineeringBomWoChildren.class));
        }
        return bomReleasedRepository.findById(new ReleasableId(id, release))
                .filter(b -> !b.isDeleted())
                .map(this::convertReleasedBom);
    }

    @Transactional(readOnly = true)
    public Optional<BomActiveReleaseDto> readDtoTreeById(Long id, Long release) {
        if (release == null || release == 0L) {
            return bomCrudService.readById(id)
                    .filter(b -> !b.isDeleted())
                    .map(bom -> {
                        BomActiveReleaseDto dto = bom.convert(BomActiveReleaseDto.class);
                        java.util.Set<ComponentActiveReleaseDto> children = bom.getChildren().stream()
                                .map(rel -> readComponentsrecursive(rel.getChild()))
                                .collect(java.util.stream.Collectors.toSet());
                        dto.setChildren(children);
                        return dto;
                    });
        }
        return bomReleasedRepository.findById(new ReleasableId(id, release))
                .filter(b -> !b.isDeleted())
                .map(bom -> {
                    BomActiveReleaseDto dto = new BomActiveReleaseDto();
                    dto.setId(bom.getId());
                    dto.setName(bom.getName());
                    dto.setPartNumber(bom.getPartNumber());
                    dto.setDescription(bom.getDescription());
                    dto.setFusionVersion(bom.getFusionVersion());
                    dto.setFusionId(bom.getFusionId());
                    dto.setLibraryItem(bom.isLibraryItem());
                    dto.setFusionRevisionId(bom.getFusionRevisionId());
                    dto.setConfiguration(bom.isConfiguration());
                    dto.setConfiguredDesign(bom.isConfiguredDesign());
                    dto.setConsistent(bom.isConsistent());
                    java.util.Set<ComponentActiveReleaseDto> children = componentReleasedRepository
                            .findByParentBom(id, release)
                            .stream()
                            .map(this::readComponentsrecursive)
                            .collect(java.util.stream.Collectors.toSet());
                    dto.setChildren(children);
                    return dto;
                });
    }

    @Transactional
    public List<ComponentActiveReleaseDto> readComponents(Long id, Long release) {
        if (release == null || release == 0L) {
            BomActiveRelease bomActiveRelease = bomCrudService.readById(id)
                    .orElseThrow(() -> new NotFoundException(id, BomActiveRelease.class));
            List<ComponentActiveReleaseDto> children = bomActiveRelease.getChildren().stream()
                    .map(c -> readComponentsrecursive(c.getChild()))
                    .toList();
            ComponentActiveReleaseDto root = convertBomToComponent(bomActiveRelease, children);
            return java.util.List.of(root);
        }
        BomReleased bom = bomReleasedRepository.findById(new ReleasableId(id, release))
                .orElseThrow(() -> new NotFoundException(id, BomReleased.class));
        List<ComponentActiveReleaseDto> children = componentReleasedRepository.findByParentBom(id, release)
                .stream()
                .map(this::readComponentsrecursive)
                .toList();
        ComponentActiveReleaseDto root = convertBomToComponent(bom, children);
        return java.util.List.of(root);
    }

    private ComponentActiveReleaseDto convertBomToComponent(BomActiveRelease bom, java.util.List<ComponentActiveReleaseDto> children) {
        ComponentActiveReleaseDto dto = new ComponentActiveReleaseDto();
        dto.setId(bom.getId());
        dto.setName(bom.getName());
        dto.setPartNumber(bom.getPartNumber());
        dto.setDescription(bom.getDescription());
        dto.setItemType(ItemTypes.BOM.name());
        dto.setParts(children);
        return dto;
    }

    private ComponentActiveReleaseDto convertBomToComponent(BomReleased bom, java.util.List<ComponentActiveReleaseDto> children) {
        ComponentActiveReleaseDto dto = new ComponentActiveReleaseDto();
        dto.setId(bom.getId());
        dto.setName(bom.getName());
        dto.setPartNumber(bom.getPartNumber());
        dto.setDescription(bom.getDescription());
        dto.setItemType(ItemTypes.BOM.name());
        dto.setParts(children);
        return dto;
    }


    private ComponentActiveReleaseDto readComponentsrecursive(ComponentActiveRelease comp) {
        ComponentActiveReleaseDto res = comp.convert(ComponentActiveReleaseDto.class);
        for (ComponentRel rel : comp.getParts()) {
            ComponentActiveReleaseDto child = readComponentsrecursive(rel.getChild());
            child.setQuantity(rel.getQuantity());
            res.getParts().add(child);
        }
        return res;
    }

    @Transactional
    public Stream<QuantitiveComponent> shortList(Long id) {
        HashMap<String, QuantitiveComponent> shortList = new HashMap<>();
        BomActiveRelease bom = bomCrudService.readById(id).orElseThrow(() -> new NotFoundException(id, FusionBom.class));
        for (BomComponentRel c : bom.getChildren()) {
            shortList(c, shortList);
        }
        return shortList.values().stream();
    }


    private void shortList(BaseRel root, HashMap<String, QuantitiveComponent> shortList) {
        QuantitiveComponent i = shortList.get(root.getChild().getPartNumber());
        if (i != null) {
            i.setQuantity(i.getQuantity() + 1);
        } else {
            shortList.put(root.getChild().getPartNumber(), new QuantitiveComponent(root.getChild(), root.getQuantity()));
        }
        for (ComponentRel item : root.getChild().getParts()) {
            shortList(item, shortList);
        }
    }

    @Transactional
    public BomActiveRelease importFusionBom(FusionId id) {
        return cadToEngBomConversionService.importFusionBom(id);
    }

    @Transactional
    public Optional<BomActiveReleaseDto> readDtoById(Long id) {
        return bomCrudService.readById(id).orElseThrow(()->new NotFoundException(id,BomActiveRelease.class)).convert(BomActiveReleaseDto.class).optional();
    }

    private EngineeringBomWoChildren convertReleasedBom(BomReleased bom) {
        EngineeringBomWoChildren dto = new EngineeringBomWoChildren();
        dto.setId(bom.getId());
        dto.setName(bom.getName());
        dto.setPartNumber(bom.getPartNumber());
        return dto;
    }

    private ComponentActiveReleaseDto readComponentsrecursive(ComponentReleased comp) {
        ComponentActiveReleaseDto res = new ComponentActiveReleaseDto();
        res.setId(comp.getId());
        res.setName(comp.getName());
        res.setPartNumber(comp.getPartNumber());
        if (comp.getParts() != null) {
            List<ComponentActiveReleaseDto> children = comp.getParts().stream()
                    .map(this::readComponentsrecursive).toList();
            res.setParts(children);
        }
        return res;
    }

    @Transactional
    public BomActiveRelease softDelete(Long id, boolean deleteComponents) {
        BomActiveRelease bom = bomCrudService.readById(id)
                .orElseThrow(() -> new NotFoundException(id, BomActiveRelease.class));
        if (deleteComponents) {
            // Use a defensive copy to avoid ConcurrentModificationException when
            // Hibernate flushes updates while iterating over the collection
            for (BomComponentRel rel : new java.util.ArrayList<>(bom.getChildren())) {
                ComponentActiveRelease child = rel.getChild();
                if (child != null && !child.isDeleted()) {
                    child.setDeleted(true);
                    componentService.save(child);
                }
            }
        }
        bom.setDeleted(true);
        engineeringBomRepository.save(bom);
        return bom;
    }


}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/ItemTypeNameMappingService.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.database.repo.ItemTypeNameMappingRepository;
import com.ua.crow.plm.dto.base.ItemTypeNameMappingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class ItemTypeNameMappingService {
    private final ItemTypeNameMappingRepository repository;

    @Autowired
    public ItemTypeNameMappingService(ItemTypeNameMappingRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<ItemTypeNameMapping> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).toList();
    }

    @Transactional(readOnly = true)
    public Optional<ItemTypeNameMappingDto> findById(Long id) {
        return repository.findById(id).map(e -> e.convert(ItemTypeNameMappingDto.class));
    }

    @Transactional
    public ItemTypeNameMapping save(ItemTypeNameMapping mapping) {
        return repository.save(mapping);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/ComponentService.java =====
package com.ua.crow.plm.service;

import com.ua.crow.plm.database.active.*;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.plm.database.repo.ComponentRelRepository;
import com.ua.crow.plm.database.repo.ComponentRepository;
import com.ua.crow.plm.database.repo.ComponentPropertiesRepository;
import com.ua.crow.plm.dto.requests.ComponentRequestDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.service.product.ProductService;
import com.ua.crow.service.NotFoundException;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

@Service
public class ComponentService {
    @Autowired
    ComponentRepository componentRepository;

    @Autowired
    ComponentPropertiesRepository propertiesRepository;

    @Autowired
    ProductService productService;
    @Autowired
    private ComponentRelRepository componentRelRepo;


    @Transactional
    public Stream<ComponentActiveRelease> findByPartNumber(String partNumber) {
        return componentRepository.findByPartNumber(partNumber);
    }


    @Transactional
    public ComponentActiveRelease merge(@NotNull Long itemId, @NotNull Set<Long> items) {
        ComponentActiveRelease item = componentRepository.findById(ReleasableId.releasableId(itemId))
                .orElseThrow(() -> new NotFoundException(itemId, FusionComponent.class));
        Double qty = 1d + items.size();
        for (Long i : items) {
            ComponentActiveRelease itemToMerge = componentRepository.findById(ReleasableId.releasableId(i))
                    .orElseThrow(() -> new NotFoundException(itemId, FusionComponent.class));
            itemToMerge.setDescription(item.getDescription());
            itemToMerge.setPartNumber(item.getPartNumber());
            itemToMerge.setName(item.getName());
            itemToMerge.setItemType(item.getItemType());
            componentRepository.save(itemToMerge);
        }
        return item;
    }

    @Transactional
    public Optional<ComponentActiveRelease> findByPartNumberAndBomId(String partNumber, Long id) {
        return componentRepository.findByPartNumberAndBomId(partNumber, id);
    }

    public Stream<ComponentActiveReleaseDto> list(ComponentRequestDto req) {
        throw new UnsupportedOperationException();
    }

    @Transactional
    public ComponentActiveRelease save(ComponentActiveRelease child) {
        return componentRepository.save(child);
    }

    @Autowired
    RelationshipCache cache;


    @Transactional
    public void addChild(ComponentActiveRelease parent, ComponentActiveRelease child, double quantity, BomActiveRelease bom) {
        addChild(parent, child, quantity, bom, productService.getDefaultCompleteSet(bom.getProduct().getId()));
    }


    private void addChild(ComponentActiveRelease parent, ComponentActiveRelease child, double quantity, BomActiveRelease bom, CompleteSet completeSet) {
        Map<ComponentPartRelationshipId, ComponentRel> processed = cache.getProcessedComponentRels();
        if (bom == null || bom.getId() == null || completeSet == null) {
            throw new RuntimeException("Complete set and bom should not be empty");
        }


        ComponentPartRelationshipId id = new ComponentPartRelationshipId(parent.getId(), parent.getRelease_ver(),
                child.getId(), child.getRelease_ver(), bom.getId(), bom.getRelease_ver(), completeSet.getId());
        ComponentRel existingTransactionRel = processed.get(id);

        if (existingTransactionRel != null) {
            existingTransactionRel.setQuantity(existingTransactionRel.getQuantity() + quantity);
        } else if (existingTransactionRel == null) {
            existingTransactionRel = componentRelRepo.findById(id).or(() -> {
                ComponentRel relationship = new ComponentRel();
                relationship.setBomId(bom.getId());
                relationship.setBomVersion(bom.getRelease_ver());
                relationship.setCompleteSetId(completeSet.getId());
                relationship.setParent(parent);
                relationship.setParentId(parent.getId());
                relationship.setParentReleaseVer(parent.getRelease_ver());
                relationship.setChildId(child.getId());
                relationship.setChildReleaseVer(child.getRelease_ver());
                relationship.setQuantity(quantity);
                return Optional.of(relationship);
            }).get();
        }


        processed.put(id, componentRelRepo.save(existingTransactionRel));


    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbom/FusionBomFileService.java =====
package com.ua.crow.plm.service.fusionbom;

import com.ua.crow.config.Buckets;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.database.repo.FusionBomRepository;
import com.ua.crow.service.minio.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FusionBomFileService {

    private static final String STEP_NAME = "model.step";

    @Autowired
    private MinioService minioService;

    @Autowired
    private FusionBomRepository fusionBomRepository;

    private String getFolder(FusionId id) {
        return new StringBuilder()
                .append("fusionbom/")
                .append(id.getFusionId())
                .append('_')
                .append(id.getRevisionId())
                .append('/')
                .toString();
    }

    public void uploadStepFile(FusionId id, MultipartFile file) throws IOException {
        String objectName = getFolder(id) + STEP_NAME;
        minioService.put(Buckets.cad, objectName, file.getInputStream(), file.getSize(), file.getContentType());
    }

    public String getStepFileUrl(FusionBom bom) {
        String objectName = getFolder(FusionId.id(bom.getFusionId(), bom.getRevisionId())) + STEP_NAME;
        if (!minioService.exist(Buckets.cad, objectName)) {
            return null;
        }
        return minioService.sign(Buckets.cad, objectName);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbom/FusionBomTreeService.java =====
package com.ua.crow.plm.service.fusionbom;

import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionComponentRel;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.database.repo.FusionBomRepository;
import com.ua.crow.plm.database.repo.FusionComponentRelRepository;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.dto.fusion.Body;
import com.ua.crow.plm.service.fusionbomitem.FusionBomItemService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

@Service
@Validated
public class FusionBomTreeService {

    @Autowired
    FusionBomRepository fusionBomRepository;

    @Autowired
    FusionBomItemService fusionBomItemService;
    @Autowired
    FusionComponentRelRepository componentRelRepository;

    @Transactional(readOnly = true)
    public Optional<FusionBomDto> readFullTree(@NotNull FusionId fusionId){
        return readFullTree(fusionId, false);
    }

    @Transactional(readOnly = true)
    public Optional<FusionBomDto> readFullTree(@NotNull FusionId fusionId, boolean includeBodies){
        return fusionBomRepository.findById(fusionId)
            .filter(fb -> !fb.isDeleted() && fb.isConsistent())
            .map(fb -> buildFullTreeDto(fb, includeBodies));
    }

    public Stream<FusionComponentRel> findChildrenForBom(FusionComponent parent, @NotNull FusionBom bom) {
        return componentRelRepository.findChildrenForBom(parent.getFusionId(),parent.getRevisionId(), bom.getFusionId(),bom.getRevisionId());
    }

    private FusionBomDto buildFullTreeDto(FusionBom fusionBom, boolean includeBodies) {
        FusionBomDto dto = fusionBom.convert(FusionBomDto.class);
        FusionComponent rootComponent = fusionBom.getRoot();
        dto.setRootPart(convertComponentTree(rootComponent, fusionBom, new HashSet<>(), includeBodies));
        return dto;
    }

    private FusionComponentDto convertComponentTree(FusionComponent component, FusionBom bom, Set<String> visited, boolean includeBodies) {
        if (visited.contains(component.getFusionId())) {
            throw new IllegalStateException("Cycle detected for component ID: " + component.getFusionId());
        }
        visited.add(component.getFusionId());
        FusionComponentDto componentDto = component.convert(FusionComponentDto.class);
        if (includeBodies) {
            componentDto.setBodies(component.getPhysicalProperties().stream()
                    .map(p -> p.convert(Body.class))
                    .collect(Collectors.toSet()));
        }
        fusionBomItemService.getChildren(component, bom).forEach(childRel -> {
            FusionComponentDto childDto = convertComponentTree(childRel.getChild(), bom, visited, includeBodies);
            childDto.setQuantity(childRel.getQuantity());
            componentDto.addChild(childDto);
        });

        visited.remove(component.getFusionId());
        return componentDto;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbom/FusionBomImportService.java =====
package com.ua.crow.plm.service.fusionbom;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.database.repo.FusionBomRepository;
import com.ua.crow.plm.database.repo.FusionComponentRelRepository;
import com.ua.crow.plm.dto.fusion.AddChildRequest;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.service.ResourceAlreadyExist;
import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FusionBomImportService {
    @Autowired
    FusionBomManagementService fusionBomService;
    @Autowired
    FusionBomFacadeService fusionBomFacadeService;

    @Autowired
    FusionBomRepository fusionBomRepository;

    @Autowired
    FusionComponentRelRepository fusionComponentRelRepository;

    private static final Logger logger = LoggerFactory.getLogger(FusionBomImportService.class);
    private static final int TRANSACTION_TIMEOUT_SECONDS = 60;  // Example timeout duration


    @Autowired
    private JpaTransactionManager tm;


    @Transactional(propagation = Propagation.REQUIRED)
    public FusionBomDto save(@NotNull FusionBomDto dto) {
        FusionId fusionId = FusionId.id(dto.getFusionId(), dto.getRevisionId());
        Optional<FusionBom> fbo = checkIfExists(fusionId);
        if (fbo.isPresent()) {
            FusionBom existing = fbo.get();
            if (dto.getProduct() != null) {
                existing.setProduct(dto.getProduct().convert(ProductActiveRelease.class));
            }
            existing.setDocumentName(dto.getDocumentName());
            existing.setVersion(dto.getVersion());
            existing.setProcessed(dto.isProcessed());
            existing.setEngineeringBomId(dto.getEngineeringBomId());
            existing.setDescription(dto.getDescription());
            existing.setLibraryItem(dto.isLibraryItem());
            existing.setPartNumber(dto.getPartNumber());
            existing.setConfiguration(dto.isConfiguration());
            existing.setConfiguredDesign(dto.isConfiguredDesign());
            existing.setDeleted(dto.isDeleted());
            existing.setName(dto.getName());
            if (dto.getRootPart() != null) {
                FusionComponentDto rootDto = dto.getRootPart();
                rootDto.setRoot(true);
                FusionComponent root = fusionBomService.updateItem(rootDto.convert(FusionComponent.class), true);
                existing.setRoot(root);
            }
            FusionBom saved = fusionBomRepository.save(existing);
            fusionBomService.ensureBomRelations(saved);
            return saved.convert(FusionBomDto.class);
        } else {
            return fusionBomFacadeService.create(dto);
        }
    }

    @Transactional
    public Optional<FusionBom> checkIfExists(FusionId fusionId) {
        Optional<FusionBom> bom = fusionBomRepository.findById(fusionId);
        return bom;

    }

    public FusionComponent saveItem(FusionComponentDto dto) {
        FusionId componentId = FusionId.id(dto.getFusionId(), dto.getRevisionId());
        Optional<FusionComponent> existing = fusionBomService.fusionComponentRepository.findById(componentId);
        if (existing.isPresent()) {
            return fusionBomService.updateItem(dto.convert(FusionComponent.class), true);
        }
        return fusionBomService.createItem(dto);

    }


    public FusionComponent addChildItem(AddChildRequest dto) {
        return fusionBomService.addChildItem(dto);
    }

    public FusionBom delete(FusionId id) {
        return fusionBomService.hardDeleteBomRelations(id);
    }

    public FusionBomDto commitTransaction(FusionId id) {
        return fusionBomService.commit(id).convert(FusionBomDto.class);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbom/CadToEngBomConversionService.java =====
package com.ua.crow.plm.service.fusionbom;

import com.ua.crow.plm.database.active.*;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionComponentRel;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.database.fusion.FusionBomEngineeringBom;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.repo.EngineeringBomRepository;
import com.ua.crow.plm.service.engbom.BomCrudService;
import com.ua.crow.plm.service.ComponentService;
import com.ua.crow.plm.service.fusionbomitem.FusionBomItemService;
import com.ua.crow.plm.service.RelationshipCache;
import com.ua.crow.service.NotFoundException;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CadToEngBomConversionService {
    @Autowired
    FusionBomManagementService fusionBomService;

    @Autowired
    FusionBomTreeService fusionBomTreeService;

    @Autowired
    FusionBomItemService fusionBomItemService;

    @Autowired
    private EngineeringBomRepository engineeringBomRepository;

    @Autowired
    BomCrudService bomCrudService;

    @Autowired
    ComponentService componentService;

    @Autowired
    RelationshipCache relationshipCache;

    private double toQuantity(Double quantity) {
        return quantity == null ? 1d : quantity;
    }

    @Transactional
    public BomActiveRelease importFusionBom(@NotNull FusionId id) {

        FusionBom fb = fusionBomService.readById(id).orElseThrow(() -> new NotFoundException(id, FusionComponent.class));
        BomActiveRelease ebom = bomCrudService.create(fb.convert(BomActiveRelease.class));
        fb.setEngineeringBomId(ebom.getId());
        ebom.getFusionBoms()
            .add(new FusionBomEngineeringBom(fb, ebom,
                "Engineering BOM creation using Fusion 360 model"));
        fusionBomService.save(fb);
        ebom.setRoot(true);
        fusionBomItemService.getChildren(fb.getRoot(), fb).forEach(c -> {
            ComponentActiveRelease component = convertToEngineeringBomItemRecursive(ebom, c, fb);
            if (component != null) {
                component.setParentBom(ebom);
                bomCrudService.addChildToBom(ebom, component, toQuantity(c.getQuantity()));
            }
        });
        ebom.setConsistent(true);
        return engineeringBomRepository.save(ebom);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public ComponentActiveRelease convertToEngineeringBomItemRecursive(BomActiveRelease bomParent,  FusionComponentRel fusionComponentRel, @NotNull FusionBom fusionBom) {
        FusionComponent fusionComponent = fusionComponentRel.getChild();

        if (fusionComponent.getType() == ItemTypes.NONE) {
            return null;
        }

        ComponentActiveRelease component = componentService
                .findByPartNumberAndBomId(fusionComponent.getPartNumber(), bomParent.getId())
                .orElse(componentService.save(fusionComponent.convert(ComponentActiveRelease.class)));
        component.setParentBom(bomParent);
        switch (fusionComponent.getType()) {
            case BOM -> {
                BomActiveRelease childBom = fusionComponent.convert(BomActiveRelease.class);
                childBom.setProduct(fusionBom.getProduct());
                childBom.setParentComponent(component);
                childBom = bomCrudService.create( childBom);
                List<FusionComponentRel> children = fusionBomTreeService.findChildrenForBom(fusionComponent, fusionBom).collect(Collectors.toList());
                for (FusionComponentRel f : children) {
                    ComponentActiveRelease c = convertToEngineeringBomItemRecursive(childBom, f, fusionBom);
                    if (c != null) {
                        bomCrudService.addChildToBom(childBom, c, toQuantity(f.getQuantity()));
                        componentService.addChild(component, c, toQuantity(f.getQuantity()), childBom);
                    }
                }
                childBom = bomCrudService.create(childBom);
                component.setChildBom(childBom);
                //create new bom
            }
            case THRDPARTY, FASTENER -> {
                //leaf components without child BOMs
            }
            case PART, COMPONENT -> {
                fusionBomItemService.getChildren(fusionComponent, fusionBom).forEach(fbiRel -> {
                    ComponentActiveRelease child = convertToEngineeringBomItemRecursive(bomParent, fbiRel, fusionBom);
                    if (child != null) {
                        double qty = toQuantity(fbiRel.getQuantity());
                        componentService.addChild(component, child, qty, bomParent);
                        bomCrudService.addChildToBom(bomParent, child, qty);
                    }
                });
            }
        }
        return component;
    }

    /**
     * Merges the structure of the given Fusion BOM into an existing Engineering BOM.
     * Components are created if missing and appended to the target BOM root.
     */
    @Transactional
    public BomActiveRelease mergeFusionIntoEngineeringBom(@NotNull FusionId id, @NotNull Long engineeringBomId) {
        FusionBom fb = fusionBomService.readById(id)
                .orElseThrow(() -> new NotFoundException(id, FusionBom.class));
        BomActiveRelease ebom = bomCrudService.readById(engineeringBomId)
                .orElseThrow(() -> new NotFoundException(engineeringBomId, BomActiveRelease.class));

        fusionBomItemService.getChildren(fb.getRoot(), fb).forEach(rel -> {
            ComponentActiveRelease component = convertToEngineeringBomItemRecursive(ebom, rel, fb);
            if (component != null) {
                component.setParentBom(ebom);
                bomCrudService.addChildToBom(ebom, component, toQuantity(rel.getQuantity()));
            }
        });

        return engineeringBomRepository.save(ebom);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbom/FusionBomManagementService.java =====
package com.ua.crow.plm.service.fusionbom;

import com.ua.crow.plm.database.active.ProductActiveRelease;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionBomRel;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.plm.database.repo.ActiveReleaseProductRepository;
import com.ua.crow.plm.database.repo.FusionBomRepository;
import com.ua.crow.plm.database.repo.FusionComponentRelRepository;
import com.ua.crow.plm.database.repo.FusionComponentRepository;
import com.ua.crow.plm.dto.fusion.AddChildRequest;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.plm.service.fusionbomitem.FusionBomItemService;
import com.ua.crow.service.NotFoundException;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@Validated
public class FusionBomManagementService {

    @Autowired
    FusionBomRepository fusionBomRepository;

    @Autowired
    FusionComponentRepository fusionComponentRepository;

    @Autowired
    FusionComponentRelRepository fusionComponentRelRepository;

    @Autowired
    com.ua.crow.plm.database.repo.FusionBomRelRepository fusionBomRelRepository;

    @Autowired
    ActiveReleaseProductRepository productRepository;

    @Autowired
    FusionBomItemService itemService;

    /**
     * Ensures that BOM-to-BOM relations exist for the given BOM. When a BOM is
     * created after its parent assemblies were uploaded, the relations to those
     * parent BOMs are not created automatically. This method scans all
     * {@link com.ua.crow.plm.database.fusion.FusionComponentRel} entries where
     * the current BOM's root component is used as a child and creates the
     * corresponding {@link com.ua.crow.plm.database.fusion.FusionBomRel}
     * relations if they are missing.
     */
    @Transactional
    public void ensureBomRelations(@NotNull FusionBom bom) {
        FusionComponent root = bom.getRoot();
        if (root == null) {
            return;
        }

        fusionComponentRelRepository
            .findByChild(root.getFusionId(), root.getRevisionId())
            .forEach(rel -> {
                FusionId parentId = new FusionId(rel.getBomId(), rel.getBomRevisionId());
                fusionBomRepository.findById(parentId).ifPresent(parentBom -> {
                    // Skip relation to itself
                    if (parentBom.getFusionId().equals(bom.getFusionId()) &&
                        parentBom.getRevisionId().equals(bom.getRevisionId())) {
                        return;
                    }

                    fusionBomRelRepository
                        .findRelation(parentBom.getFusionId(), parentBom.getRevisionId(),
                                       bom.getFusionId(), bom.getRevisionId())
                        .map(existing -> {
                            existing.setQuantity(rel.getQuantity());
                            return fusionBomRelRepository.save(existing);
                        })
                        .orElseGet(() -> {
                            FusionBomRel r = new FusionBomRel();
                            r.setParentBom(parentBom);
                            r.setChildBom(bom);
                            r.setQuantity(rel.getQuantity());
                            return fusionBomRelRepository.save(r);
                        });
                });
            });
    }

    @Transactional(readOnly = true)
    public Optional<FusionBom> readById(@NotNull FusionId fusionId) {
        return fusionBomRepository.findById(fusionId).filter(fb -> !fb.isDeleted() && fb.isConsistent());
    }
    @Transactional
    public FusionBom create(@NotNull FusionBom bom, FusionComponentDto dtoRoot) {
        bom = fusionBomRepository.save(bom);
        bom.setRoot(itemService.create(dtoRoot, bom));
        // If this BOM's root component already exists in other assemblies,
        // create corresponding BOM hierarchy relations immediately.
        ensureBomRelations(bom);
        return bom;
    }

    @Transactional
    public FusionBom commit(@NotNull FusionId id) {
        FusionBom bom = fusionBomRepository.findById(id)
            .filter(f->!f.isDeleted())
            .orElseThrow(() -> new NotFoundException(id, FusionBom.class));
        bom.setConsistent(true);
        return fusionBomRepository.save(bom);
    }

    @Transactional(readOnly = true)
    public Optional<FusionBomDto> readDtoById(@NotNull FusionId fusionId) {
        return fusionBomRepository.findById(fusionId)
            .filter(fb -> !fb.isDeleted() && fb.isConsistent())
            .map(f->f.convert(FusionBomDto.class));
    }

    @Transactional(readOnly = true)
    public Stream<FusionBom> readAll() {
        return fusionBomRepository.findNotDeleted();
    }


    @Transactional
    public FusionComponent updateItem(FusionComponent updatedComponent, boolean updatePhysicalProperties) {
        FusionComponent existingComponent = fusionComponentRepository
                .findById(new FusionId(updatedComponent.getFusionId(), updatedComponent.getRevisionId()))
                .orElseThrow(() -> new NotFoundException(updatedComponent.getFusionId(), FusionComponent.class));
        existingComponent.setType(updatedComponent.getType());
        existingComponent.setPartName(updatedComponent.getPartName());
        existingComponent.setPartNumber(updatedComponent.getPartNumber());
        existingComponent.setDescription(updatedComponent.getDescription());
        existingComponent.setSourceFile(updatedComponent.getSourceFile());
        existingComponent.setPath(updatedComponent.getPath());
        existingComponent.setRoot(updatedComponent.isRoot());
        existingComponent.setTenantId(updatedComponent.getTenantId());
        existingComponent.setDeleted(updatedComponent.isDeleted());
        if (updatePhysicalProperties) {
            existingComponent.getPhysicalProperties().clear();
            existingComponent.getPhysicalProperties().addAll(updatedComponent.getPhysicalProperties());

        }
        FusionComponent savedComponent = fusionComponentRepository.save(existingComponent);
        return savedComponent;
    }

    @Transactional
    public FusionComponent addChildItem(@NotNull AddChildRequest dto) {
        FusionBom fusionBom = fusionBomRepository.findById(dto.getBomId())
            .orElseThrow(() -> new NotFoundException(dto.getBomId(), FusionBom.class));

        return itemService.addChildById(fusionBom, dto.getChildId(), dto.getParentId());
    }

    @Transactional
    public FusionBom hardDeleteBomRelations(@NotNull FusionId id) {
        FusionBom fb = fusionBomRepository.findById(id)
            .orElseThrow(() -> new NotFoundException(id, FusionBom.class));
        fusionComponentRelRepository.hardDeleteBomRelations(id.getFusionId(), id.getRevisionId());
        fusionBomRepository.delete(fb);
        return fb;
    }

    @Transactional
    public void unlinkFromParents(@NotNull FusionId id) {
        fusionBomRelRepository.findParents(id.getFusionId(), id.getRevisionId())
                .forEach(fusionBomRelRepository::delete);
        fusionComponentRelRepository.findByChild(id.getFusionId(), id.getRevisionId())
                .forEach(fusionComponentRelRepository::delete);
    }

    @Transactional
    public FusionBom softDelete(@NotNull FusionId id) {
        unlinkFromParents(id);
        FusionBom fb = fusionBomRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, FusionBom.class));
        fb.setDeleted(true);
        return fusionBomRepository.save(fb);
    }

    @Transactional
    public FusionComponent createItem(@NotNull FusionComponentDto bomItemDto) {
        FusionId fusionId = FusionId.id(bomItemDto.getParentBom().getFusionId(), bomItemDto.getParentBom().getRevisionId());
        FusionBom bom = fusionBomRepository.findById(fusionId)
                .orElseThrow(() -> new NotFoundException(fusionId, FusionBom.class));

        return itemService.create(bomItemDto, bom);
    }

    @Transactional(readOnly = true)
    public List<FusionBom> readUnprocessedBomsByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return fusionBomRepository.findUnprocessedByProductId(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBom> readProcessedBomsByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return fusionBomRepository.findProcessedByProductId(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBom> readByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return fusionBomRepository.findByProductIdAndReleaseVerConsistentNotDeleted(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBom> readRootUnprocessedByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return fusionBomRepository.findRootUnprocessedByProductId(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBom> readRootProcessedByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return fusionBomRepository.findRootProcessedByProductId(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBom> readRootByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return fusionBomRepository.findRootByProductId(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public Stream<FusionBom> readRootAll() {
        return fusionBomRepository.findRootNotDeleted();
    }

    @Transactional(readOnly = true)
    public java.util.List<FusionBomDto> buildBomTree(java.util.List<FusionBom> boms, java.util.List<FusionBom> roots) {
        java.util.Map<com.ua.crow.plm.database.fusion.FusionId, FusionBomDto> map = boms.stream()
                .collect(java.util.stream.Collectors.toMap(
                        b -> new FusionId(b.getFusionId(), b.getRevisionId()),
                        b -> b.convert(FusionBomDto.class)));

        boms.forEach(b -> {
            java.util.List<com.ua.crow.plm.database.fusion.FusionBomRel> rels =
                    fusionBomRelRepository.findChildren(b.getFusionId(), b.getRevisionId());
            FusionBomDto parentDto = map.get(new FusionId(b.getFusionId(), b.getRevisionId()));
            rels.forEach(r -> {
                com.ua.crow.plm.database.fusion.FusionId cid = new FusionId(r.getChildBomId(), r.getChildBomRevisionId());
                FusionBomDto childDto = map.get(cid);
                if (childDto != null) {
                    if (parentDto.getChildren().isEmpty()) {
                        parentDto.setChildren(new java.util.ArrayList<>());
                    }
                    parentDto.getChildren().add(copyDto(childDto));
                }
            });
        });

        java.util.Set<com.ua.crow.plm.database.fusion.FusionId> rootIds = roots.stream()
                .map(r -> new FusionId(r.getFusionId(), r.getRevisionId()))
                .collect(java.util.stream.Collectors.toSet());

        return rootIds.stream()
                .map(map::get)
                .filter(java.util.Objects::nonNull)
                .collect(java.util.stream.Collectors.toList());
    }

    @Transactional(readOnly = true)
    public java.util.List<FusionBomDto> readUnprocessedBomTreeByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        java.util.List<FusionBom> all = readUnprocessedBomsByProduct(productId, releaseVer);
        java.util.List<FusionBom> roots = readRootUnprocessedByProduct(productId, releaseVer);
        return buildBomTree(all, roots);
    }

    @Transactional(readOnly = true)
    public java.util.List<FusionBomDto> readProcessedBomTreeByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        java.util.List<FusionBom> all = readProcessedBomsByProduct(productId, releaseVer);
        java.util.List<FusionBom> roots = readRootProcessedByProduct(productId, releaseVer);
        return buildBomTree(all, roots);
    }

    @Transactional(readOnly = true)
    public java.util.List<FusionBomDto> readBomTreeByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        java.util.List<FusionBom> all = readByProduct(productId, releaseVer);
        java.util.List<FusionBom> roots = readRootByProduct(productId, releaseVer);
        return buildBomTree(all, roots);
    }

    @Transactional(readOnly = true)
    public java.util.List<com.ua.crow.plm.dto.fusion.FusionRevisionDto> readRevisionDtos(
            @NotNull Long productId,
            @NotNull Long releaseVer,
            @NotBlank String fusionId) {
        java.util.List<FusionBom> list = readByProduct(productId, releaseVer)
                .stream()
                .filter(b -> fusionId.equals(b.getFusionId()))
                .sorted(java.util.Comparator.comparing(FusionBom::getCreatedAt))
                .toList();

        java.util.List<com.ua.crow.plm.dto.fusion.FusionRevisionDto> result = new java.util.ArrayList<>();
        int num = 1;
        for (FusionBom b : list) {
            com.ua.crow.plm.dto.fusion.FusionRevisionDto dto = new com.ua.crow.plm.dto.fusion.FusionRevisionDto();
            dto.setRevisionId(b.getRevisionId());
            dto.setNumber(num++);
            result.add(dto);
        }
        return result;
    }

    @Transactional
    public FusionBom mapProduct(@NotNull FusionId fusionId, @NotNull Long productId) {
        ProductActiveRelease product = productRepository.findById(ReleasableId.releasableId(productId))
                .orElseThrow(() -> new NotFoundException(productId, ProductActiveRelease.class));

        FusionBom bom = fusionBomRepository.findById(fusionId)
                .orElseThrow(() -> new NotFoundException(fusionId, FusionBom.class));

        bom.setProduct(product);
        return fusionBomRepository.save(bom);
    }

    @Transactional
    public Stream<FusionBom> readByPartNumber(@NotBlank String partNumber) {
        return fusionBomRepository.findByPartNumber(partNumber);
    }

    @Transactional
    public FusionBom save(FusionBom bom) {
        return fusionBomRepository.save(bom);
    }

    @Transactional
    public void deleteComponent(@NotNull FusionId id) {
        fusionBomRepository.findByRoot(id.getFusionId(), id.getRevisionId())
                .ifPresent(b -> { throw new com.ua.crow.service.BadRequest("Cannot delete root component of a BOM"); });

        fusionComponentRelRepository.findByChild(id.getFusionId(), id.getRevisionId())
                .forEach(fusionComponentRelRepository::delete);
        fusionComponentRelRepository.findByParent(id.getFusionId(), id.getRevisionId())
                .forEach(fusionComponentRelRepository::delete);

        fusionComponentRepository.deleteById(id);
    }

    private FusionBomDto copyDto(FusionBomDto source) {
        FusionBomDto target = new FusionBomDto();
        org.springframework.beans.BeanUtils.copyProperties(source, target);
        if (source.getChildren() != null && !source.getChildren().isEmpty()) {
            java.util.List<FusionBomDto> children = new java.util.ArrayList<>();
            for (FusionBomDto child : source.getChildren()) {
                children.add(copyDto(child));
            }
            target.setChildren(children);
        } else {
            target.setChildren(null);
        }
        return target;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/fusionbom/FusionBomFacadeService.java =====
package com.ua.crow.plm.service.fusionbom;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.fusion.FusionBom;
import com.ua.crow.plm.database.fusion.FusionComponent;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.dto.fusion.AddChildRequest;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.service.conversion.Convertable;
import com.ua.crow.views.components.fusionbom.edit.FusionComponentTreeGrid;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.plm.dto.merge.MergeBomTreesDto;
import com.ua.crow.plm.database.active.BomActiveRelease;
import com.ua.crow.plm.database.released.ReleasableId;
import com.ua.crow.plm.database.repo.EngineeringBomRepository;
import com.ua.crow.plm.service.engbom.BomCrudService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Validated
public class FusionBomFacadeService {

    @Autowired
    FusionBomTreeService treeService;

    @Autowired
    FusionBomManagementService managementService;

    @Autowired
    CadToEngBomConversionService conversionService;

    @Autowired
    EngineeringBomRepository engineeringBomRepository;

    @Autowired
    BomCrudService bomCrudService;

    @Transactional(readOnly = true)
    public Optional<FusionBomDto> readFullTree(@NotNull FusionId fusionId) {
        return treeService.readFullTree(fusionId);
    }

    @Transactional(readOnly = true)
    public Optional<FusionBomDto> readFullTree(@NotNull FusionId fusionId, boolean includeBodies) {
        return treeService.readFullTree(fusionId, includeBodies);
    }

    @Transactional(readOnly = true)
    public Optional<FusionBomDto> readDtoById(@NotNull FusionId fusionId) {
        return managementService.readDtoById(fusionId);
    }

    @Transactional
    public FusionBomDto create(@NotNull FusionBomDto dto) {
        FusionBom bom = dto.convert(FusionBom.class);
        FusionComponentDto dtoRoot = dto.getRootPart();
        dtoRoot.setRoot(true);
        return managementService.create(bom,dtoRoot).convert(FusionBomDto.class);
    }


    @Transactional(readOnly = true)
    public List<FusionBomDto> readAllTreeDto() {
        java.util.List<com.ua.crow.plm.database.fusion.FusionBom> all = managementService.readAll().collect(java.util.stream.Collectors.toList());
        java.util.List<com.ua.crow.plm.database.fusion.FusionBom> roots = managementService.readRootAll().collect(java.util.stream.Collectors.toList());
        return managementService.buildBomTree(all, roots);
    }

    @Transactional
    public FusionComponentDto updateItem(FusionComponentDto dto, boolean updatePhysicalProperties) {
        FusionComponent updatedComponent = dto.convert(FusionComponent.class);
        FusionComponent bom = managementService.updateItem(updatedComponent, updatePhysicalProperties);
        return bom.convert(FusionComponentDto.class);
    }

    @Transactional
    public FusionComponent addChildItem(@NotNull AddChildRequest dto) {
        return managementService.addChildItem(dto);
    }
    @Transactional(readOnly = true)
    public List<FusionBomDto> readUnprocessedBomTreeDtosByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return managementService.readUnprocessedBomTreeByProduct(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBomDto> readProcessedBomTreeDtosByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return managementService.readProcessedBomTreeByProduct(productId, releaseVer);
    }

    @Transactional(readOnly = true)
    public List<FusionBomDto> readBomTreeDtoByProduct(@NotNull Long productId, @NotNull Long releaseVer) {
        return managementService.readBomTreeByProduct(productId, releaseVer);
    }

    public FusionComponentDto updateItemType(String id, String revId, ItemTypes type) {
        return managementService.itemService.updateType(id, revId, type).convert(FusionComponentDto.class);
    }
    @Transactional
    public FusionBomDto mapProduct(@NotNull FusionId fusionId, @NotNull Long productId) {
        return managementService.mapProduct(fusionId, productId).convert(FusionBomDto.class);
    }

    /**
     * Merge a Fusion BOM into an existing Engineering BOM.
     */
    @Transactional
    public BomActiveRelease mergeFusionIntoEngineeringBom(@NotNull FusionId fusionId, @NotNull Long engineeringBomId) {
        return conversionService.mergeFusionIntoEngineeringBom(fusionId, engineeringBomId);
    }

    @Transactional(readOnly = true)
    public java.util.List<com.ua.crow.plm.dto.fusion.FusionRevisionDto> readRevisionDtos(
            @NotNull String fusionId,
            @NotNull Long productId,
            @NotNull Long releaseVer) {
        return managementService.readRevisionDtos(productId, releaseVer, fusionId);
    }

    /**
     * Find a mergeable Engineering BOM for the given Fusion BOM.
     */
    @Transactional(readOnly = true)
    public Optional<EngineeringBomWoChildren> findMergeableEngineeringBom(@NotNull FusionId fusionId) {
        return managementService.readById(fusionId).flatMap(fb -> {
            if (fb.getEngineeringBomId() != null) {
                return engineeringBomRepository.findById(ReleasableId.releasableId(fb.getEngineeringBomId()))
                        .map(b -> b.convert(EngineeringBomWoChildren.class));
            }
            if (fb.getProduct() == null) {
                return Optional.empty();
            }
            List<BomActiveRelease> list = engineeringBomRepository.findBomsByProductId(fb.getProduct().getId(),0L, Pageable.unpaged());
            return list.stream()
                    .max(java.util.Comparator.comparing(BomActiveRelease::getCreatedAt))
                    .map(b -> b.convert(EngineeringBomWoChildren.class));
        });
    }

    /**
     * Load both Fusion and Engineering BOM trees for merge UI.
     */
    @Transactional(readOnly = true)
    public Optional<MergeBomTreesDto> loadMergeTrees(@NotNull FusionId fusionId, @NotNull Long engineeringBomId) {
        Optional<FusionBomDto> fusion = treeService.readFullTree(fusionId);
        Optional<BomActiveReleaseDto> eff = bomCrudService.readById(engineeringBomId)
                .map(b -> b.convert(BomActiveReleaseDto.class));
        if (fusion.isPresent() && eff.isPresent()) {
            MergeBomTreesDto dto = new MergeBomTreesDto();
            dto.setFusionBom(fusion.get());
            dto.setEngineeringBom(eff.get());
            return Optional.of(dto);
        }
        return Optional.empty();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/plm/service/UriEncodingService.java =====
package com.ua.crow.plm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UriEncodingService {

    public String encodeUrl(String url) {
        // Parse the URL
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(url).build();

        // Rebuild and encode the URL
        UriComponents encodedUriComponents = UriComponentsBuilder.newInstance()
                .scheme(uriComponents.getScheme())
                .host(uriComponents.getHost())
                .port(uriComponents.getPort())
                .path(uriComponents.getPath())
                .query(uriComponents.getQuery())
                .build()
                .encode();

        return encodedUriComponents.toUriString();
    }

    public String encodeUrlWithParams(String url, String paramName, String paramValue) {
        // Parse the URL and add query parameters
        UriComponents encodedUriComponents = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam(paramName, paramValue)
                .build()
                .encode();

        return encodedUriComponents.toUriString();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/Application.java =====
package com.ua.crow;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.shared.communication.PushMode;
import com.vaadin.flow.shared.ui.Transport;
import com.vaadin.flow.spring.VaadinMVCWebAppInitializer;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.ua.crow" })
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}



// ===== File: crow/src/main/java/com/ua/crow/util/SecurityContext.java =====
package com.ua.crow.util;

import java.util.Optional;
import java.util.function.Predicate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityContext {

    private static Optional<User> getUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null || auth.getPrincipal() == null) {
            return Optional.empty();
        }
        User userDetails = (User) auth.getPrincipal();
        return Optional.of(userDetails);
    }

    private static Optional<String> getUserName() {
        Predicate<UserDetails> userAccountIsEnabled = userDetails ->
                userDetails.isAccountNonLocked() && userDetails.isAccountNonExpired() && userDetails.isEnabled();

        Predicate<UserDetails> usernameExistsAndNonEmpty = userDetails ->
                userDetails.getUsername() != null && !userDetails.getUsername().isEmpty();

        return getUser().flatMap(userDetails -> {
            if (userAccountIsEnabled.and(usernameExistsAndNonEmpty).test(userDetails)) {
                return Optional.of(userDetails.getUsername());
            }
            return Optional.empty();
        });
    }

    public static String getUsernameOrElseThrow() throws RuntimeException {
        return getUserName().orElse("user");
    }
}



// ===== File: crow/src/main/java/com/ua/crow/util/SpringContext.java =====
package com.ua.crow.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware {

    private static ApplicationContext context;

    public static ConversionService getConversionService() {
        return getBean("mvcConversionService",ConversionService.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }



    public static <T> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }

    public static <T> T getBean(String name, Class<T> beanClass) {
        return context.getBean(name, beanClass);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/Conversion.java =====
package com.ua.crow.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;

@Configuration
public class Conversion implements WebMvcConfigurer {

    private final ApplicationContext applicationContext;


    @Autowired
    public Conversion(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // Получение всех бинов, которые реализуют Converter
        Map<String, Converter> converters = applicationContext.getBeansOfType(Converter.class);
        for (Converter<?, ?> converter : converters.values()) {
            // Проверка, что бин находится в пакете com.ua.converters
            if (converter.getClass().getPackage().getName().startsWith("com.ua.crow.plm.converters")) {
                registry.addConverter(converter);
            }
        }
    }

}



// ===== File: crow/src/main/java/com/ua/crow/config/Minio.java =====
package com.ua.crow.config;


import io.minio.MinioClient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Minio {

    private MinioClient client;


}



// ===== File: crow/src/main/java/com/ua/crow/config/AuditConfig.java =====
package com.ua.crow.config;

import com.ua.crow.util.SecurityContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class AuditConfig {
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.ofNullable(SecurityContext.getUsernameOrElseThrow()); // Замените на актуальное получение текущего пользователя
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/SecurityConfig.java =====
package com.ua.crow.config;

import com.ua.crow.views.pages.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import com.ua.crow.service.CrowUserService;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import javax.sql.DataSource;

@EnableWebSecurity // <1>
@Configuration
public class SecurityConfig extends VaadinWebSecurity { // <2>
    private final CrowUserService userService;
    private final PasswordEncoder passwordEncoder;
    private final DataSource dataSource;

    public SecurityConfig(CrowUserService crowUserService, PasswordEncoder passwordEncoder, DataSource dataSource) {
        this.userService = crowUserService;
        this.passwordEncoder = passwordEncoder;
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth ->
                auth.requestMatchers(
                        AntPathRequestMatcher.antMatcher(HttpMethod.GET, "/images/*")
                ).permitAll());
        super.configure(http);

        http.rememberMe(rm -> rm
                .userDetailsService(userService)
                .tokenValiditySeconds(60 * 60 * 24 * 14)
                .tokenRepository(persistentTokenRepository())
                .key("remember-me"));

        setLoginView(http, LoginView.class); // <4>
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        // Customize your WebSecurity configuration.
        web.ignoring()
                .requestMatchers(
                        AntPathRequestMatcher.antMatcher( "/fusion/*"),
                        AntPathRequestMatcher.antMatcher( "/fusionbom/*"),
                        AntPathRequestMatcher.antMatcher( "/fusionbomitem/*")
                );
        super.configure(web);
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        if (!persistentLoginsExists()) {
            tokenRepository.setCreateTableOnStartup(true);
        }
        return tokenRepository;
    }

    private boolean persistentLoginsExists() {
        try (var connection = dataSource.getConnection()) {
            var metaData = connection.getMetaData();
            try (var rs = metaData.getTables(null, null, "persistent_logins", null)) {
                if (rs.next()) {
                    return true;
                }
            }
            // Some databases (e.g. PostgreSQL) store table names in upper case
            try (var rs = metaData.getTables(null, null, "PERSISTENT_LOGINS", null)) {
                return rs.next();
            }
        } catch (Exception e) {
            return false;
        }
    }





}


// ===== File: crow/src/main/java/com/ua/crow/config/I18nConfig.java =====
package com.ua.crow.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class I18nConfig implements WebMvcConfigurer {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.ENGLISH);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        return interceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/AsyncConfig.java =====
package com.ua.crow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("Async-");
        executor.initialize();
        return executor;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/LocaleServiceInitListener.java =====
package com.ua.crow.config;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LocaleServiceInitListener implements VaadinServiceInitListener {

    @Override
    public void serviceInit(ServiceInitEvent event) {
        event.getSource().addUIInitListener(uiInitEvent ->
                uiInitEvent.getUI().addBeforeEnterListener(e ->
                        UI.getCurrent().setLocale(LocaleContextHolder.getLocale())
                )
        );
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/SecurityService.java =====
package com.ua.crow.config;

import com.vaadin.flow.spring.security.AuthenticationContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class SecurityService {

    private final AuthenticationContext authenticationContext;

    public SecurityService(AuthenticationContext authenticationContext) {
        this.authenticationContext = authenticationContext;
    }

    public UserDetails getAuthenticatedUser() {
        return authenticationContext.getAuthenticatedUser(UserDetails.class).get();
    }

    public void logout() {
        authenticationContext.logout();
    }
}


// ===== File: crow/src/main/java/com/ua/crow/config/PasswordEncoderConfig.java =====
package com.ua.crow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncoderConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


// ===== File: crow/src/main/java/com/ua/crow/config/cad/fusion/ItemTypeNameMappingInitializer.java =====
package com.ua.crow.config.cad.fusion;

import com.ua.crow.plm.database.ItemTypeNameMapping;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.database.repo.ItemTypeNameMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

import java.util.Arrays;
import java.util.List;

@Component
public class ItemTypeNameMappingInitializer implements InitializingBean {

    @Autowired
    private ItemTypeNameMappingRepository itemTypeNameMappingRepository;

    @Override
    public void afterPropertiesSet() {
        initializeItemTypes();
    }

    private void initializeItemTypes() {
        List<String> fastenerNames = Arrays.asList("bolt", "nut", "washer", "screw", "бовт", "гайка", "шайба", "гвинт");

        saveItemTypes(ItemTypes.FASTENER, fastenerNames);
    }

    private void saveItemTypes(ItemTypes type, List<String> names) {
        for (String name : names) {
            saveItemType(type, name);
        }
    }

    private void saveItemType(ItemTypes type, String name) {
        if (!itemTypeNameMappingRepository.findByName(name).isPresent()) {
            ItemTypeNameMapping itemTypeNameMapping = new ItemTypeNameMapping();
            itemTypeNameMapping.setType(type);
            itemTypeNameMapping.setName(name);
            itemTypeNameMappingRepository.save(itemTypeNameMapping);
            System.out.println("Created item type: " + name);
        } else {
            System.out.println("Item type already exists: " + name);
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/cad/fusion/EngineeringBomItemPropertyTypeInitializer.java =====
package com.ua.crow.config.cad.fusion;

import com.ua.crow.database.models.common.DataTypes;
import com.ua.crow.database.models.common.Units;
import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.BomItemPropertyTypeGroup;
import com.ua.crow.plm.database.repo.EngineeringBomItemPropertyTypeGroupRepository;
import com.ua.crow.plm.database.repo.EngineeringBomItemPropertyTypeRepository;
import com.ua.crow.database.repository.UnitsRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("unitInitializer")
public class EngineeringBomItemPropertyTypeInitializer implements ApplicationContextAware {

    private EngineeringBomItemPropertyTypeRepository propertyTypeRepository;
    private EngineeringBomItemPropertyTypeGroupRepository propertyTypeGroupRepository;
    private UnitsRepository unitsRepository;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.propertyTypeRepository = applicationContext.getBean(EngineeringBomItemPropertyTypeRepository.class);
        this.propertyTypeGroupRepository = applicationContext.getBean(EngineeringBomItemPropertyTypeGroupRepository.class);
        this.unitsRepository = applicationContext.getBean(UnitsRepository.class);
        initializePropertyTypes();
    }

    private void initializePropertyTypes() {
        BomItemPropertyTypeGroup group = initializeGroup("Dimensional Values", "Вимірювальні значення");
        initializePropertyType("widthMm", "ширина мм", "mm", group);
        initializePropertyType("lengthMm", "довжина мм", "mm", group);
        initializePropertyType("heightMm", "висота мм", "mm", group);
        initializePropertyType("volumeCm3", "об'єм см³", "cm³", group);
        initializePropertyType("areaCm2", "площа см²", "cm²", group);
        initializePropertyType("massKg", "маса кг", "kg", group);
        initializePropertyType("densityKgCm3", "щільність кг/см³", "kg/cm³", group);
    }

    private BomItemPropertyTypeGroup initializeGroup(String name, String ukrName) {
        return propertyTypeGroupRepository.findByName(name)
            .orElseGet(() -> {
                BomItemPropertyTypeGroup group = new BomItemPropertyTypeGroup();
                group.setName(name);
                group.setUkrName(ukrName);
                return propertyTypeGroupRepository.save(group);
            });
    }

    private void initializePropertyType(String name, String ukrName, String unitShortName, BomItemPropertyTypeGroup group) {
        if (!propertyTypeRepository.findByName(name).isPresent()) {
            Units unit = unitsRepository.findByShortName(unitShortName)
                .orElseThrow(() -> new RuntimeException("Unit not found: " + unitShortName));
            
            BomItemPropertyType propertyType = new BomItemPropertyType();
            propertyType.setName(name);
            propertyType.setUkrName(ukrName);
            propertyType.setUnits(unit);
            propertyType.setGroup(group);
            propertyType.setDataType(DataTypes.NUMBER);
            propertyTypeRepository.save(propertyType);
            System.out.println("Created property type with name: " + name + ", ukrName: " + ukrName + ", unit: " + unitShortName);
        } else {
            System.out.println("Property type with name: " + name + " already exists.");
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/cad/fusion/FusionEngineeringBomItemPropertyTypeConfig.java =====
package com.ua.crow.config.cad.fusion;

import com.ua.crow.plm.database.BomItemPropertyType;
import com.ua.crow.plm.database.repo.EngineeringBomItemPropertyTypeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class FusionEngineeringBomItemPropertyTypeConfig {

    private final EngineeringBomItemPropertyTypeRepository propertyTypeRepository;

    public FusionEngineeringBomItemPropertyTypeConfig(EngineeringBomItemPropertyTypeRepository propertyTypeRepository) {
        this.propertyTypeRepository = propertyTypeRepository;
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType widthMm() {
        return propertyTypeRepository.findByName("widthMm")
            .orElseThrow(() -> new RuntimeException("widthMm not found"));
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType lengthMm() {
        return propertyTypeRepository.findByName("lengthMm")
            .orElseThrow(() -> new RuntimeException("lengthMm not found"));
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType heightMm() {
        return propertyTypeRepository.findByName("heightMm")
            .orElseThrow(() -> new RuntimeException("heightMm not found"));
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType volumeCm3() {
        return propertyTypeRepository.findByName("volumeCm3")
            .orElseThrow(() -> new RuntimeException("volumeCm3 not found"));
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType areaCm2() {
        return propertyTypeRepository.findByName("areaCm2")
            .orElseThrow(() -> new RuntimeException("areaCm2 not found"));
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType massKg() {
        return propertyTypeRepository.findByName("massKg")
            .orElseThrow(() -> new RuntimeException("massKg not found"));
    }

    @Bean
    @DependsOn("engineeringBomItemPropertyTypeInitializer")
    public BomItemPropertyType densityKgCm3() {
        return propertyTypeRepository.findByName("densityKgCm3")
            .orElseThrow(() -> new RuntimeException("densityKgCm3 not found"));
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/MinioConfiguration.java =====
package com.ua.crow.config;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.errors.*;
import io.minio.messages.Bucket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MinioConfiguration {

    @Value("${minio.url}")
    String miniourl;

    @Value("${minio.accesskey}")
    String minioaccesskey;

    @Value("${minio.secret}")
    String miniosecret;

    @Bean("minio")
    Minio minio() {
        return new Minio(MinioClient.builder()
                .endpoint(miniourl)
                .credentials(minioaccesskey, miniosecret)
                .build());
    }
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/ConversionConfig.java =====
package com.ua.crow.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class ConversionConfig {

    @Bean
    public ConversionService conversionService(@Autowired Set<Converter<?, ?>> converters) {
        ConversionServiceFactoryBean factoryBean = new ConversionServiceFactoryBean();
        factoryBean.setConverters(converters);
        factoryBean.afterPropertiesSet();

        return factoryBean.getObject();
    }

}



// ===== File: crow/src/main/java/com/ua/crow/config/Buckets.java =====
package com.ua.crow.config;

public enum Buckets {
    products,
    components,
    cad;

    public String getDirectory() {
        return this.name();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/dbinit/FusionComponentTypeConstraintUpdater.java =====
package com.ua.crow.config.dbinit;

import jakarta.annotation.PostConstruct;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Ensures that the fusion_component type check constraint
 * allows the NONE value.
 */
@Component
public class FusionComponentTypeConstraintUpdater {

    private final JdbcTemplate jdbcTemplate;

    public FusionComponentTypeConstraintUpdater(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void updateConstraint() {
        try {
            jdbcTemplate.execute(
                "ALTER TABLE fusion_component DROP CONSTRAINT IF EXISTS fusion_component_type_check");
            jdbcTemplate.execute(
                "ALTER TABLE fusion_component ADD CONSTRAINT fusion_component_type_check " +
                "CHECK (type in ('COMPONENT','PART','BOM','FASTENER','THRDPARTY','NONE'))");
        } catch (Exception ex) {
            System.err.println(
                "Unable to update fusion_component_type_check constraint: " + ex.getMessage());
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/dbinit/MinioInit.java =====
package com.ua.crow.config.dbinit;

import com.ua.crow.config.Buckets;
import com.ua.crow.config.Minio;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.errors.*;
import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Component
@DependsOn("minio")
public class MinioInit implements ApplicationContextAware {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    Minio minio;

    @PostConstruct
    public void minioBucket() throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        String[] list = new String[]{"products","components","cad"};

        // Make 'asiatrip' bucket if not exist.
        for (Buckets bucket : Buckets.values()) {
            boolean found = minio.getClient().bucketExists(BucketExistsArgs.builder().bucket(bucket.name()).build());
            if (!found) {
                minio.getClient().makeBucket(MakeBucketArgs.builder().bucket(bucket.name()).build());
                logger.info("Bucket '"+bucket.name()+"' created.");
            } else {
                logger.info("Bucket '"+bucket.name()+"' already exists.");
            }
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.minio = applicationContext.getBean(Minio.class);

    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/dbinit/DatabaseFeeder.java =====
package com.ua.crow.config.dbinit;

import com.ua.crow.inventory.repo.ItemRepository;
import com.ua.crow.inventory.repo.ToolTypeRepository;
import com.ua.crow.mes.database.TaskStatus;
import com.ua.crow.database.repository.*;
import com.ua.crow.mes.repo.TaskRepository;
import com.ua.crow.mes.repo.TaskStatusRepository;
import com.ua.crow.mes.repo.TaskTypeRepository;
import com.ua.crow.plm.database.repo.ComponentRepository;
import com.ua.crow.plm.database.repo.EngineeringBomRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFeeder {
    final TaskRepository taskRepository;

    private final TaskStatusRepository taskStatusRepository;

    final UserRepository userRepository;

    private final EngineeringBomRepository engineeringBomRepository;

    private final ComponentRepository bomItemRepository;

    private final ItemRepository itemRepository;

    private final UnitsRepository unitsRepository;

    private final ToolTypeRepository toolTypeRepository;


    final TaskTypeRepository taskTypeRepository;

    public DatabaseFeeder(
            TaskRepository taskRepository,
            TaskStatusRepository taskStatusRepository,
            EngineeringBomRepository engineeringBomRepository,
            ComponentRepository bomItemRepository,
            ItemRepository itemRepository,
            UnitsRepository unitsRepository,
            ToolTypeRepository toolTypeRepository,

            TaskTypeRepository taskTypeRepository,
            UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.taskStatusRepository = taskStatusRepository;
        this.engineeringBomRepository = engineeringBomRepository;
        this.bomItemRepository = bomItemRepository;
        this.itemRepository = itemRepository;
        this.unitsRepository = unitsRepository;
        this.toolTypeRepository = toolTypeRepository;

        this.taskTypeRepository = taskTypeRepository;
        this.userRepository = userRepository;
    }

    @PostConstruct
    @Transactional
    public void postConstruct() {
        taskStatusRepository.findById(3L).map(taskStatus -> {
            List<TaskStatus> availableNextStatuses = new ArrayList<>();
            availableNextStatuses.add(taskStatusRepository.findById(2L).get());
            taskStatus.setAvailableNextStatuses(availableNextStatuses);
            taskStatusRepository.save(taskStatus);
            return taskStatus;
        });
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/dbinit/UnitInitializer.java =====
package com.ua.crow.config.dbinit;

import com.ua.crow.database.models.common.TypeOfUnits;
import com.ua.crow.database.models.common.Units;
import com.ua.crow.database.repository.UnitsRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class UnitInitializer implements ApplicationContextAware {

    private UnitsRepository unitsRepository;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.unitsRepository = applicationContext.getBean(UnitsRepository.class);

    }


    @PostConstruct
    private void initializeUnits() {
        initializeUnit("Square Meter", "m²", TypeOfUnits.SQUARE);
        initializeUnit("Square Centimeter", "cm²", TypeOfUnits.SQUARE);
        initializeUnit("Square Millimeter", "mm²", TypeOfUnits.SQUARE);
        initializeUnit("Square Foot", "ft²", TypeOfUnits.SQUARE);

        // Единицы длины
        initializeUnit("Meter", "m", TypeOfUnits.UNITS_LENGTH);
        initializeUnit("Millimeter", "mm", TypeOfUnits.UNITS_LENGTH);
        initializeUnit("Foot", "ft", TypeOfUnits.UNITS_LENGTH);
        // Единицы веса
        initializeUnit("Kilogram", "kg", TypeOfUnits.MASS);
        initializeUnit("Gram", "g", TypeOfUnits.MASS);
        initializeUnit("Pound", "lb", TypeOfUnits.MASS);
        // Единицы объема
        initializeUnit("Liter", "l", TypeOfUnits.VOLUME);
        initializeUnit("Milliliter", "ml", TypeOfUnits.VOLUME);
        initializeUnit("Cubic Meter", "m³", TypeOfUnits.VOLUME);
        initializeUnit("Cubic Centimeter", "cm³", TypeOfUnits.VOLUME);

        // Единицы плотности
        initializeUnit("Kilogram per Cubic Meter", "kg/m³", TypeOfUnits.DENSITY);
        initializeUnit("Kilogram per Cubic Centimeter", "kg/cm³", TypeOfUnits.DENSITY);
        initializeUnit("Gram per Cubic Centimeter", "g/cm³", TypeOfUnits.DENSITY);
        initializeUnit("Pound per Cubic Foot", "lb/ft³", TypeOfUnits.DENSITY);

        // Единицы давления
        initializeUnit("Pascal", "Pa", TypeOfUnits.PRESSURE);
        initializeUnit("Bar", "bar", TypeOfUnits.PRESSURE);
        initializeUnit("Pound per Square Inch", "psi", TypeOfUnits.PRESSURE);

        // Единицы температуры
        initializeUnit("Celsius", "°C", TypeOfUnits.TEMPERATURE);
        initializeUnit("Fahrenheit", "°F", TypeOfUnits.TEMPERATURE);
        initializeUnit("Kelvin", "K", TypeOfUnits.TEMPERATURE);

    }

    private void initializeUnit(String name, String shortName, TypeOfUnits type) {
        if (!unitsRepository.findByShortName(shortName).isPresent()) {
            Units unit = new Units();
            unit.setName(name);
            unit.setShortName(shortName);
            unit.setType(type);
            unitsRepository.save(unit);
            System.out.println("Created unit with name: " + name + ", shortName: " + shortName + " and type: " + type);
        } else {
            System.out.println("Unit with shortName: " + shortName + " already exists.");
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/dbinit/DefaultUserFeeder.java =====
package com.ua.crow.config.dbinit;

import com.ua.crow.database.models.auth.Role;
import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.models.auth.UserRole;
import com.ua.crow.database.repository.UserRepository;
import com.ua.crow.database.repository.UserRoleRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserFeeder {
    final UserRepository userRepository;
    final UserRoleRepository userRoleRepository;
    final PasswordEncoder passwordEncoder;

    public DefaultUserFeeder(UserRepository userRepository,
                             UserRoleRepository userRoleRepository,PasswordEncoder passwordEncoder ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRoleRepository = userRoleRepository;
    }

    @PostConstruct
    public void init() {
        createUserIfAbsent("admin", Role.ADMIN);
        createUserIfAbsent("user", Role.WORKER);
    }

    private void createUserIfAbsent(String username, Role role) {
        if (userRepository.findByUsername(username).isPresent()) {
            return;
        }
        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setEnabled(true);
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setPassword(passwordEncoder.encode("password"));
        UserRole userRole = new UserRole(role);
        userRole.setUser(user);
        userRepository.save(user);
        userRole.setUserId(user.getId());
        userRoleRepository.save(userRole);
        user.setUserRole(userRole);
        userRepository.save(user);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/config/AppI18NProvider.java =====
package com.ua.crow.config;

import com.vaadin.flow.i18n.I18NProvider;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.*;

@Component
public class AppI18NProvider implements I18NProvider {

    private static final String BUNDLE_PREFIX = "messages";
    private final Map<Locale, ResourceBundle> bundles = new HashMap<>();

    public AppI18NProvider() {
        for (Locale locale : getProvidedLocales()) {
            bundles.put(locale, ResourceBundle.getBundle(BUNDLE_PREFIX, locale));
        }
    }

    @Override
    public List<Locale> getProvidedLocales() {
        return List.of(Locale.ENGLISH, new Locale("ru"));
    }

    @Override
    public String getTranslation(String key, Locale locale, Object... params) {
        ResourceBundle bundle = bundles.getOrDefault(locale, bundles.get(Locale.ENGLISH));
        try {
            String value = bundle.getString(key);
            if (params.length > 0) {
                value = MessageFormat.format(value, params);
            }
            return value;
        } catch (MissingResourceException e) {
            return key;
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/workspace/WorkspaceType.java =====
package com.ua.crow.workspace;

public enum WorkspaceType {
    RND,
    ASSEMBLY,
    LOGISTICS,
    ADMIN
}



// ===== File: crow/src/main/java/com/ua/crow/workspace/Workspace.java =====
package com.ua.crow.workspace;

import java.util.Set;

public class Workspace {
    private WorkspaceType type;
    private String name;
    private Set<String> permissions;

    public Workspace(WorkspaceType type, String name, Set<String> permissions) {
        this.type = type;
        this.name = name;
        this.permissions = permissions;
    }

    public WorkspaceType getType() {
        return type;
    }

    public void setType(WorkspaceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/TimeLogDto.java =====
package com.ua.crow.mes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeLogDto extends NamedBasicEntityWithNumericIdDto {
    private Long taskId;
    private double amount;
    private UserDto loggedBy;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date date;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/TaskRef.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.*;

@Getter
@Setter
public class TaskRef extends NamedBasicEntityWithNumericIdDto {
    private TaskStatusDto status;
    private TaskTypeDto type;
    private UserDto assignee;
    private UserDto reporter;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/TaskTypeDto.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.basic.NamedNumericIdEntityDto;

public class TaskTypeDto extends NamedNumericIdEntityDto {}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/Exception.java =====
package com.ua.crow.mes.dto;

public record Exception(String msg) {}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/AttachmentDto.java =====
package com.ua.crow.mes.dto;

public record AttachmentDto(String url) {}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/PasswordChangeDto.java =====
package com.ua.crow.mes.dto;

public record PasswordChangeDto(String password) {}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/BasicEntityWithNumericId.java =====
package com.ua.crow.mes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

import com.ua.crow.dto.basic.NumericIdEntityDto;
import lombok.*;

@Getter
@Setter
public class BasicEntityWithNumericId extends NumericIdEntityDto {
    private String creator = null;

    private String modifier = null;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createdAt = null;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date modifiedAt = null;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/TaskDto.java =====
package com.ua.crow.mes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.*;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.plm.dto.BomDtoShort;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto extends NamedBasicEntityWithNumericIdDto {
    private UserDto assignee;
    private boolean isSubtask;
    private UserDto reporter;
    private String description;
    private BomDtoShort bom;
    private TaskStatusDto status;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date start;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date end;

    private List<TimeLogDto> hoursLogged;
    private List<CommentDto> comments;
    private List<AttachmentDto> attachments;
    private Set<SubtaskDto> subtasks = new TreeSet<>(Comparator.comparing(SubtaskDto::getSequence));
    private SeverityDto severity;
    private TaskTypeDto taskType;
    private String audioUrl;
    private Double totalHoursLogged;
    private int subtasksCount;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/CreateUserDto.java =====
package com.ua.crow.mes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {
    private String username;
    private String name;
    private String password;
    private boolean enabled = true;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/CreateTaskRequest.java =====
package com.ua.crow.mes.dto;

import java.util.Date;
import lombok.*;

@Getter
@Setter
public class CreateTaskRequest {

    String name;

    String description;

    Date start;

    Date end;

    Long assignee;

    Long reporter;

    Long parent;

    Long taskType;

    Integer severity;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/SubtaskDto.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubtaskDto extends NamedBasicEntityWithNumericIdDto {
    private Integer sequence;
    private TaskRef task;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/SeverityDto.java =====
package com.ua.crow.mes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeverityDto {
    private String name;
    private String color;
    private int value;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/UserDto.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.basic.NumericIdEntityDto;
import lombok.*;

@Getter
@Setter
public class UserDto extends NumericIdEntityDto {
    private String username;
    private boolean enabled;
    private String name;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/UpdateTaskRequest.java =====
package com.ua.crow.mes.dto;

import lombok.*;

@Getter
@Setter
public class UpdateTaskRequest extends CreateTaskRequest {
    private Long status;

    public UpdateTaskRequest() {}
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/FileUploadRequest.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.FileTypes;
import org.springframework.web.multipart.MultipartFile;

public record FileUploadRequest(Long taskId, Boolean isPrimaryAudio, FileTypes fileType, MultipartFile file) {}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/TaskStatusDto.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.basic.NamedNumericIdEntityDto;
import lombok.*;

@Getter
@Setter
public class TaskStatusDto extends NamedNumericIdEntityDto {
    private TaskTypeDto taskType;
    boolean initialStatus;
    private boolean terminatedStatus;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/dto/CommentDto.java =====
package com.ua.crow.mes.dto;

import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import lombok.*;

@Getter
@Setter
public class CommentDto extends NamedBasicEntityWithNumericIdDto {

    private String imageUrl;

    private String audioUrl;

    private UserDto author;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/TaskStatus.java =====
package com.ua.crow.mes.database;

import com.ua.crow.database.models.common.basic.NamedNumericIdEntity;
import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;
import lombok.*;

@Getter
@Setter
@Entity
public class TaskStatus extends NamedNumericIdEntity {

    @ManyToMany
    @JoinTable(
            name = "available_next_statuses",
            joinColumns = @JoinColumn(name = "status_id"),
            inverseJoinColumns = @JoinColumn(name = "next_status_id"))
    private List<TaskStatus> availableNextStatuses;

    @ManyToOne
    private TaskType taskType;

    private boolean initialStatus;

    private boolean terminatedStatus;

    private boolean plannedStatus;

    private boolean inProgressStatus;

    private boolean backlogStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskStatus that)) return false;
        return Objects.equals(availableNextStatuses, that.availableNextStatuses)
                && Objects.equals(taskType, that.taskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableNextStatuses, taskType);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/TaskType.java =====
package com.ua.crow.mes.database;

import com.ua.crow.database.models.common.basic.NamedNumericIdEntity;
import jakarta.persistence.Entity;

@Entity
public class TaskType extends NamedNumericIdEntity {}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/Severity.java =====
package com.ua.crow.mes.database;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public enum Severity {
    EXTRAHIGHT(50, "#b91c1c"),
    HIGHT(40, "#eab308"),
    MEDIUM(30, "#3b82f6"),
    LOW(20, "#22c55e"),
    EXTRALOW(10, "#71717a");

    @Getter
    private final Integer value;

    @Getter
    private final String color;

    Severity(@NotNull int value, @NotNull String color) {
        this.value = value;
        this.color = color;
    }

    public static Severity fromValue() {
        return MEDIUM;
    }

    public static Severity fromValue(@NotNull Integer value) throws IllegalArgumentException {
        for (Severity severity : Severity.values()) {
            if (severity.getValue().equals(value)) {
                return severity;
            }
        }
        throw new IllegalArgumentException("No severity with value " + value);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/Comment.java =====
package com.ua.crow.mes.database;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Entity
public class Comment extends NamedBasicEntityWithNumericId {

    private String imageUrl;

    private String audioUrl;

    @ManyToOne
    private UserEntity author;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/Task.java =====
package com.ua.crow.mes.database;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.plm.database.active.BomActiveRelease;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Task extends NamedBasicEntityWithNumericId {

    @ManyToOne
    private UserEntity assignee;

    private boolean isSubtask;

    @ManyToOne
    private UserEntity reporter;

    private String description;

    @ManyToOne
    private BomActiveRelease bomActiveRelease;

    @ManyToOne
    private TaskStatus status;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date start;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date endTime;

    @OneToMany
    private List<TimeLog> hoursLogged;

    @OneToMany
    private List<Comment> comments;

    @OneToMany
    private Set<Subtask> subtasks = new TreeSet<>(Comparator.comparing(Subtask::getSequence));

    @Convert(converter = SeverityConverter.class)
    private Severity severity;

    @ManyToOne
    private TaskType taskType;

    public Task() {}
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/TimeLog.java =====
package com.ua.crow.mes.database;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.*;

@Getter
@Setter
@Entity
public class TimeLog extends NamedBasicEntityWithNumericId {

    @ManyToOne
    @JoinColumn(name = "task_id")
    Task task;

    private double amount;

    @ManyToOne
    @JoinColumn(name = "loggedBy")
    private UserEntity loggedBy;

    private Date date;
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/SeverityConverter.java =====
package com.ua.crow.mes.database;

import jakarta.persistence.AttributeConverter;
import org.springframework.lang.NonNull;

public class SeverityConverter implements AttributeConverter<Severity, Integer> {
    @Override
    public Integer convertToDatabaseColumn(@NonNull Severity severity) {
        return severity.getValue();
    }

    @Override
    public Severity convertToEntityAttribute(@NonNull Integer integer) {
        return Severity.fromValue(integer);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/database/Subtask.java =====
package com.ua.crow.mes.database;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Subtask extends NamedBasicEntityWithNumericId {
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private Integer sequence;

    public Subtask() {}

    public Subtask(Task task, int sequence) {
        this.task = task;
        this.sequence = sequence;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/CommentsMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Comment;
import com.ua.crow.mes.dto.CommentDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CommentsMapper {
    public abstract CommentDto toDto(Comment comment);
    public abstract List<CommentDto> map(List<Comment> comments);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/SubtaskMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Subtask;
import com.ua.crow.mes.dto.SubtaskDto;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {TaskMapper.class})
public abstract class SubtaskMapper {
    public abstract SubtaskDto toDto(Subtask severity);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/TaskTypeMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.TaskType;
import com.ua.crow.mes.dto.TaskTypeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TaskTypeMapper {
    public abstract TaskTypeDto toDto(TaskType taskType);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/TimeLogMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.TimeLog;
import com.ua.crow.mes.dto.TimeLogDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TimeLogMapper {
    public abstract TimeLogDto toDto(TimeLog timeLog);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/UserEntityMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.mes.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserEntityMapper {
    public abstract UserDto toDto(UserEntity user);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/SeverityMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Severity;
import com.ua.crow.mes.dto.SeverityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class SeverityMapper {
    @Mapping(target = "name", expression = "java(severity.toString())")
    public abstract SeverityDto toDto(Severity severity);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/TaskMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.dto.TaskDto;
import com.ua.crow.mes.dto.TaskRef;
import com.ua.crow.plm.converters.mappers.BomShortMapper;
import com.ua.crow.mes.service.TaskService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN,
        componentModel = "spring",
        uses = {
            TaskTypeMapper.class,
            UserEntityMapper.class,
            CommentsMapper.class,
            SeverityMapper.class,
            TimeLogMapper.class,
            BomShortMapper.class,
            TaskService.class
        })
public abstract class TaskMapper {

    @Autowired
    protected TaskService taskService;

    @Mapping(target = "totalHoursLogged", expression = "java(taskService.computeTotalHoursLogged(task))")
    @Mapping(target = "subtasksCount", expression = "java(taskService.getSubtasksCount(task))")
    public abstract TaskDto toDto(Task task);

    @Mapping(source = "taskType", target = "type")
    public abstract TaskRef toRef(Task task);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/conversion/TaskStatusMapper.java =====
package com.ua.crow.mes.conversion;

import com.ua.crow.mes.database.TaskStatus;
import com.ua.crow.mes.dto.TaskStatusDto;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, componentModel = "spring")
public abstract class TaskStatusMapper {
    public abstract TaskStatusDto toDto(TaskStatus task);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/service/WorkLogService.java =====
package com.ua.crow.mes.service;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.database.TimeLog;
import com.ua.crow.mes.repo.TaskRepository;
import com.ua.crow.database.repository.UserRepository;
import com.ua.crow.mes.repo.WorklogRepository;
import com.ua.crow.util.SecurityContext;
import jakarta.transaction.Transactional;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WorkLogService {
    final TaskRepository taskRepository;
    final UserRepository userRepository;
    final WorklogRepository worklogRepository;

    public WorkLogService(
            TaskRepository taskRepository, UserRepository userRepository, WorklogRepository worklogRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.worklogRepository = worklogRepository;
    }

    @Transactional
    public Task logWork(Date date, Double amount, Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("Task not found"));
        UserEntity user = userRepository
                .findByUsername(SecurityContext.getUsernameOrElseThrow())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (task.getHoursLogged() == null) {
            task.setHoursLogged(List.of());
        }

        TimeLog timeLog = new TimeLog();
        timeLog.setAmount(amount);
        timeLog.setDate(date);
        timeLog.setLoggedBy(user);
        timeLog.setCreatedAt(new Date());
        timeLog.setCreator(user.getUsername());

        task.getHoursLogged().add(timeLog);

        timeLog.setTask(task);

        worklogRepository.save(timeLog);

        return task;
    }

    @Transactional
    public Task deleteWorkLog(Long timeLogId, Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("Task not found"));
        TimeLog timeLog =
                worklogRepository.findById(timeLogId).orElseThrow(() -> new RuntimeException("Time log not found"));

        task.getHoursLogged().remove(timeLog);

        worklogRepository.delete(timeLog);
        taskRepository.save(task);

        return task;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/service/CurrentUserTaskSearchService.java =====
package com.ua.crow.mes.service;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.models.common.basic.NumericIdEntity;
import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.repo.TaskSearchRepository;
import com.ua.crow.mes.repo.TaskStatusRepository;
import com.ua.crow.database.repository.UserRepository;
import com.ua.crow.util.SecurityContext;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Supplier;
import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserTaskSearchService {
    final TaskSearchRepository taskSearchRepository;
    final TaskStatusRepository taskStatusRepository;
    final UserRepository userRepository;

    public CurrentUserTaskSearchService(
            TaskSearchRepository taskRepository,
            TaskStatusRepository taskStatusRepository,
            UserRepository userRepository) {
        this.taskSearchRepository = taskRepository;
        this.taskStatusRepository = taskStatusRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public Page<Task> getPlannedForTodayTasksOfUser(Pageable pageable) {
        UserEntity user = detectCurrentUser();

        List<Long> statuses = taskStatusRepository
                .findByPlannedStatusIsTrue()
                .map(NumericIdEntity::getId)
                .toList();

        return taskSearchRepository.findAllByAssigneeIdOrIsNullAndDeletedAndIsSubtaskAndStatusIdInForToday(
                user.getId(), false, statuses, LocalDateTime.now(), pageable);
    }

    @Transactional
    public Page<Task> getInProgressTasksOfUser(Pageable pageable) {
        UserEntity user = detectCurrentUser();

        List<Long> statuses = taskStatusRepository
                .findByInProgressStatusIsTrue()
                .map(NumericIdEntity::getId)
                .toList();

        return taskSearchRepository.findAllByAssigneeIdOrIsNullAndDeletedAndIsSubtaskAndStatusIdIn(
                user.getId(), false, statuses, pageable);
    }

    @Transactional
    public Page<Task> getPlannedTasksOfUser(Pageable pageable) {
        UserEntity user = detectCurrentUser();

        List<Long> statuses = taskStatusRepository
                .findByPlannedStatusIsTrue()
                .map(NumericIdEntity::getId)
                .toList();

        return taskSearchRepository.findAllByAssigneeIdOrIsNullAndDeletedAndIsSubtaskAndStatusIdIn(
                user.getId(), false, statuses, pageable);
    }

    @Transactional
    public Page<Task> computeBacklog(Pageable pageable) {
        UserEntity user = detectCurrentUser();

        List<Long> statuses = taskStatusRepository
                .findByBacklogStatusIsTrue()
                .map(NumericIdEntity::getId)
                .toList();

        return taskSearchRepository.findAllByAssigneeIdOrIsNullAndDeletedAndIsSubtaskAndStatusIdIn(
                user.getId(), false, statuses, pageable);
    }

    @SneakyThrows
    private UserEntity detectCurrentUser() {
        return userRepository
                .findByUsername(SecurityContext.getUsernameOrElseThrow())
                .orElseThrow((Supplier<Throwable>) () -> new UsernameNotFoundException("User not found"));
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/service/TaskService.java =====
package com.ua.crow.mes.service;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.repository.*;
import com.ua.crow.mes.dto.CreateTaskRequest;
import com.ua.crow.mes.dto.UpdateTaskRequest;
import com.ua.crow.mes.database.*;
import com.ua.crow.mes.repo.SubTaskRepository;
import com.ua.crow.mes.repo.TaskRepository;
import com.ua.crow.mes.repo.TaskStatusRepository;
import com.ua.crow.mes.repo.TaskTypeRepository;
import com.ua.crow.service.CrowUserService;
import com.ua.crow.service.BadRequest;
import com.ua.crow.util.SecurityContext;
import jakarta.transaction.Transactional;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    final TaskRepository taskRepository;
    final CrowUserService crowUserService;
    final TaskTypeRepository taskTypeRepository;
    final TaskStatusRepository taskStatusRepository;
    final UserRepository userRepository;
    final SubTaskRepository subTaskRepository;

    public TaskService(
            TaskRepository taskRepository,
            CrowUserService crowUserService,
            TaskTypeRepository taskTypeRepository,
            TaskStatusRepository taskStatusRepository,
            UserRepository userRepository,
            SubTaskRepository subTaskRepository
            ) {
        this.taskRepository = taskRepository;
        this.crowUserService = crowUserService;
        this.taskTypeRepository = taskTypeRepository;
        this.taskStatusRepository = taskStatusRepository;
        this.userRepository = userRepository;
        this.subTaskRepository = subTaskRepository;
    }

    @Transactional
    public Task createTask(CreateTaskRequest taskRequest) {
        if (taskRequest.getName() == null || taskRequest.getName().isEmpty()) {
            throw new BadRequest("Name is required");
        }
        if (taskRequest.getAssignee() == null) {
            throw new BadRequest("Assignee is required");
        }

        UserEntity appsmithUserAssignee = crowUserService.getUserEntity(taskRequest.getAssignee());
        UserEntity assignee = userRepository
                .findByUsername(appsmithUserAssignee.getUsername())
                .orElseThrow(() -> new BadRequest("Assignee login not found"));

        UserEntity appsmithUserCurrent = crowUserService.getUserEntity(SecurityContext.getUsernameOrElseThrow());

        UserEntity appsmithUserReporter = crowUserService.getUserEntity(taskRequest.getReporter());
        UserEntity reporter = taskRequest.getReporter() == null ? appsmithUserCurrent : appsmithUserReporter;

        Long taskTypeId = taskRequest.getTaskType() != null ? taskRequest.getTaskType() : 1L;
        TaskType taskType =
                taskTypeRepository.findById(taskTypeId).orElseThrow(() -> new BadRequest("Task type not found"));

        TaskStatus taskStatus = taskStatusRepository
                .findByTaskTypeAndInitialStatusIsTrue(taskType)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Initial Task status for type is not defined"));

        Severity severity =
                taskRequest.getSeverity() == null ? Severity.MEDIUM : Severity.fromValue(taskRequest.getSeverity());

        Task task = new Task();

        task.setName(taskRequest.getName());
        task.setDescription(taskRequest.getDescription());
        task.setAssignee(assignee);
        task.setReporter(reporter);
        task.setStart(taskRequest.getStart());
        task.setEndTime(taskRequest.getEnd());
        task.setCreator(appsmithUserCurrent.getUsername());
        task.setCreatedAt(new Date());
        task.setTaskType(taskType);
        task.setStatus(taskStatus);
        task.setSeverity(severity);

        if (taskRequest.getParent() != null) {
            task.setSubtask(true);

            Subtask subtask = new Subtask();
            subtask.setTask(task);
            subtask.setCreator(appsmithUserCurrent.getUsername());
            subtask.setCreatedAt(new Date());

            Task parentTask = taskRepository
                    .findById(taskRequest.getParent())
                    .orElseThrow(() -> new BadRequest("Parent task not found"));

            Set<Subtask> subtasks = parentTask.getSubtasks();
            if (subtasks == null) {
                subtasks = Set.of(subtask);
            }

            subtasks.add(subtask);
            parentTask.setSubtasks(subtasks);
            subTaskRepository.save(subtask);
            taskRepository.save(parentTask);
        }
        return taskRepository.save(task);
    }

    @Transactional
    public Optional<Task> getTaskById(long id) {
        return taskRepository.findById(id);
    }

    @Transactional
    public void deleteTask(long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setDeleted(true);
        taskRepository.save(task);
    }

    @Transactional
    public Task updateName(String name, Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setName(name);
        taskRepository.save(task);
        return task;
    }

    @Transactional
    public Task updateTaskProperty(UpdateTaskRequest request, Long id) {
        boolean updateStatus = false;
        Task task = taskRepository.findById(id).orElseThrow(() -> new BadRequest("Task not found"));
        if (request.getStatus() != null) {
            task = changeStatus(request.getStatus(), task);
            updateStatus = true;
        }
        if (request.getSeverity() != null) {
            task.setSeverity(Severity.fromValue(request.getSeverity()));
            updateStatus = true;
        }
        if (request.getName() != null) {
            task.setName(request.getName());
            updateStatus = true;
        }
        if (request.getDescription() != null) {
            task.setDescription(request.getDescription());
            updateStatus = true;
        }
        if (request.getAssignee() != null) {
            task.setAssignee(crowUserService.getUserEntity(request.getAssignee()));
            updateStatus = true;
        }
        if (request.getReporter() != null) {
            task.setReporter(crowUserService.getUserEntity(request.getReporter()));
            updateStatus = true;
        }
        if (request.getParent() != null) {
            Task parent = taskRepository
                    .findById(request.getParent())
                    .orElseThrow(() -> new RuntimeException("Parent task not found"));
            Set<Subtask> subtasks = parent.getSubtasks();
            if (subtasks == null) {
                subtasks = Set.of();
            }
            Task finalTask = task;
            if (subtasks.stream().anyMatch(subtask -> subtask.getTask().getId().equals(finalTask.getId()))) {
                throw new BadRequest("Task already in subtasks");
            }
            Optional<Subtask> max = subtasks.stream().max(Comparator.comparing(Subtask::getSequence));
            Subtask subtask = new Subtask();
            subtask.setTask(task);
            subtask.setSequence(max.map(value -> value.getSequence() + 10).orElse(1));
            subtasks.add(subtask);
            parent.setSubtasks(subtasks);
            taskRepository.save(parent);
            task.setSubtask(true);
            taskRepository.save(task);
        }
        if (request.getTaskType() != null) {
            task.setTaskType(taskTypeRepository
                    .findById(request.getTaskType())
                    .orElseThrow(() -> new RuntimeException("Task type not found")));
            updateStatus = true;
        }
        if (request.getEnd() != null) {
            task.setEndTime(request.getEnd());
            updateStatus = true;
        }
        if (request.getStart() != null) {
            task.setStart(request.getStart());
            updateStatus = true;
        }
        if (updateStatus) {
            task.setModifiedAt(new Date());
            task.setModifier(SecurityContext.getUsernameOrElseThrow());
            taskRepository.save(task);
        }
        return task;
    }

    private Task changeStatus(Long status, Task task) {
        TaskStatus currentStatus = task.getStatus();
        if (currentStatus == null) {
            throw new BadRequest("Task status is not defined. Unable to determine next status");
        }
        if (currentStatus.getId().equals(status)) {
            return task;
        }
        // getting object with all fields
        currentStatus = taskStatusRepository
                .findById(currentStatus.getId())
                .orElseThrow(() -> new RuntimeException("Task status not found"));
        if (currentStatus.getAvailableNextStatuses() == null
                || currentStatus.getAvailableNextStatuses().isEmpty()) {
            throw new BadRequest("Task status is not defined. Unable to determine next status");
        }
        if (currentStatus.getAvailableNextStatuses().stream()
                .noneMatch(taskStatus -> taskStatus.getId().equals(status))) {
            throw new BadRequest("Unable to perform status transition");
        }
        TaskStatus newStatus =
                taskStatusRepository.findById(status).orElseThrow(() -> new RuntimeException("Task status not found"));
        task.setStatus(newStatus);
        return task;
    }

    public Double computeTotalHoursLogged(Task task) {
        if (task != null && task.getHoursLogged() != null) {
            return task.getHoursLogged().stream().map(TimeLog::getAmount).reduce(0d, Double::sum);
        }
        return null;
    }

    public int getSubtasksCount(Task task) {
        if (task != null && task.getSubtasks() != null) {
            return task.getSubtasks().size();
        }
        return 0;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/controllers/WorkLogController.java =====
package com.ua.crow.mes.controllers;

import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.conversion.TaskMapper;
import com.ua.crow.mes.dto.TaskDto;
import com.ua.crow.mes.dto.TimeLogDto;
import com.ua.crow.mes.service.WorkLogService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("worklogs")
public class WorkLogController {
    final WorkLogService workLogService;
    final TaskMapper taskMapper;

    public WorkLogController(WorkLogService workLogService, TaskMapper taskMapper) {
        this.workLogService = workLogService;
        this.taskMapper = taskMapper;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @PostMapping
    public TaskDto logWork(@RequestBody TimeLogDto timeLogDto) {
        if (timeLogDto.getTaskId() == null) {
            throw new RuntimeException("Task id is required");
        }

        Task task = workLogService.logWork(timeLogDto.getDate(), timeLogDto.getAmount(), timeLogDto.getTaskId());
        return taskMapper.toDto(task);
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @DeleteMapping("{timeLogId}/task/{taskId}")
    public TaskDto deleteWorkLog(@PathVariable Long timeLogId, @PathVariable Long taskId) {
        if (taskId == null) {
            throw new RuntimeException("Task id is required");
        }
        if (timeLogId == null) {
            throw new RuntimeException("Time log id is required");
        }
        Task task = workLogService.deleteWorkLog(timeLogId, taskId);
        return taskMapper.toDto(task);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/controllers/TaskController.java =====
package com.ua.crow.mes.controllers;

import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.conversion.TaskMapper;
import com.ua.crow.mes.dto.CreateTaskRequest;
import com.ua.crow.mes.dto.TaskDto;
import com.ua.crow.mes.dto.UpdateTaskRequest;
import com.ua.crow.mes.service.TaskService;
import jakarta.annotation.security.RolesAllowed;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("tasks")
public class TaskController {

    final TaskService taskService;
    final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping(value = "{id}", produces = "application/json")
    public ResponseEntity<TaskDto> getTask(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskById(id);
//        FileSearchService.TaskFiles files = fileSearchService.getFilesForTask(id);
        return task.map(value -> {
                    TaskDto taskDto = taskMapper.toDto(value);
//                    taskDto.setAudioUrl(files.primaryAudio());
//                    taskDto.setAttachments(files.attachments());
                    return ResponseEntity.ok(taskDto);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @PostMapping(produces = "application/json")
    public ResponseEntity<TaskDto> createTask(@RequestBody CreateTaskRequest taskRequest) {
        Task task = taskService.createTask(taskRequest);
        return ResponseEntity.ok(taskMapper.toDto(task));
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @PatchMapping("{id}")
    public TaskDto updateTask(@RequestBody UpdateTaskRequest request, @PathVariable Long id) {
        return taskMapper.toDto(taskService.updateTaskProperty(request, id));
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @DeleteMapping(value = "{id}", produces = "application/json")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<?> handleException(Exception exception) {
        return ResponseEntity.badRequest().body(new Exception(exception.getMessage()));
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/controllers/FileUploadController.java =====
package com.ua.crow.mes.controllers;

import com.ua.crow.dto.FileTypes;
import com.ua.crow.mes.dto.AttachmentDto;
import com.ua.crow.mes.dto.Exception;
import com.ua.crow.mes.dto.FileUploadRequest;
import com.ua.crow.exceptions.FileUploadException;
import jakarta.annotation.security.RolesAllowed;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.security.InvalidParameterException;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("files")
public class FileUploadController {

    public FileUploadController( ) {

    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @PostMapping("/upload")
    public ResponseEntity<AttachmentDto> upload(@ModelAttribute FileUploadRequest request, ModelMap modelMap)
            throws IOException, InvalidParameterException {
        modelMap.addAttribute(request);

        if (request.taskId() == null) throw new FileUploadException("Missing task Id");
        if (request.fileType().equals(FileTypes.AUDIO)
                && request.isPrimaryAudio().equals(null))
            throw new FileUploadException("Missing audioUploadSettings parameter");

//        String path = fileUploadService.uploadFile(
//                request.taskId(), request.fileType(), request.isPrimaryAudio(), request.file());
        return ResponseEntity.ok(new AttachmentDto(""));
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/s3/**")
    public @ResponseBody byte[] download(HttpServletRequest request) throws IOException {
        String filePath = request.getRequestURL().toString().split("s3/")[1];
        return null;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @DeleteMapping("/s3/**")
    public ResponseEntity<?> delete(HttpServletRequest request) {
        String filePath = request.getRequestURL().toString().split("s3/")[1];
//        fileUploadService.deleteFile(filePath);
        return ResponseEntity.ok().build();
    }

    @ExceptionHandler({FileUploadException.class})
    public ResponseEntity<?> handleInvalidParameterException(FileUploadException ex) {
        return ResponseEntity.badRequest().body(new Exception(ex.getMessage()));
    }

    @ExceptionHandler({IOException.class})
    public ResponseEntity<?> handleIOException(IOException ex) {
        return ResponseEntity.internalServerError().body(new Exception(ex.getMessage()));
    }

}



// ===== File: crow/src/main/java/com/ua/crow/mes/controllers/ReferenceController.java =====
package com.ua.crow.mes.controllers;

import com.ua.crow.mes.database.Severity;
import com.ua.crow.mes.repo.TaskStatusRepository;
import com.ua.crow.mes.repo.TaskTypeRepository;
import com.ua.crow.mes.conversion.SeverityMapper;
import com.ua.crow.mes.conversion.TaskStatusMapper;
import com.ua.crow.mes.conversion.TaskTypeMapper;
import com.ua.crow.mes.dto.SeverityDto;
import com.ua.crow.mes.dto.TaskStatusDto;
import com.ua.crow.mes.dto.TaskTypeDto;
import jakarta.annotation.security.RolesAllowed;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("references")
public class ReferenceController {
    final TaskStatusRepository taskStatusRepository;
    final TaskTypeRepository taskTypeRepository;
    final SeverityMapper severityMapper;
    final TaskStatusMapper taskStatusMapper;
    final TaskTypeMapper taskTypeMapper;

    public ReferenceController(
            TaskStatusRepository taskStatusRepository,
            TaskTypeRepository taskTypeRepository,
            SeverityMapper severityMapper,
            TaskStatusMapper taskStatusMapper,
            TaskTypeMapper taskTypeMapper) {
        this.taskStatusRepository = taskStatusRepository;
        this.taskTypeRepository = taskTypeRepository;
        this.severityMapper = severityMapper;
        this.taskStatusMapper = taskStatusMapper;
        this.taskTypeMapper = taskTypeMapper;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/severityList")
    public List<SeverityDto> severityList() {
        return Stream.of(Severity.values()).map(severityMapper::toDto).toList();
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/taskStatusList")
    public List<TaskStatusDto> taskStatusList() {
        List<TaskStatusDto> list = new LinkedList<>();
        taskStatusRepository.findAll().forEach(taskStatus -> list.add(taskStatusMapper.toDto(taskStatus)));
        return list;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/nextStatusList")
    public List<TaskStatusDto> nextStatusList(@RequestParam Long id) {
        List<TaskStatusDto> list = new LinkedList<>();
        taskStatusRepository.findById(id).ifPresent(taskStatus -> taskStatus
                .getAvailableNextStatuses()
                .forEach(status -> list.add(taskStatusMapper.toDto(status))));
        return list;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/task-types")
    public List<TaskTypeDto> getTaskTypes() {
        return StreamSupport.stream(taskTypeRepository.findAll().spliterator(), false)
                .filter(taskType -> !taskType.isDeleted())
                .map(taskTypeMapper::toDto)
                .toList();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/controllers/CurrentUserTaskController.java =====
package com.ua.crow.mes.controllers;

import com.ua.crow.mes.database.Task;
import com.ua.crow.mes.conversion.TaskMapper;
import com.ua.crow.mes.dto.TaskDto;
import com.ua.crow.service.CrowUserService;
import com.ua.crow.mes.service.CurrentUserTaskSearchService;
import com.ua.crow.mes.service.TaskService;
import jakarta.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-tasks")
public class CurrentUserTaskController {
    final TaskService taskService;

    final CurrentUserTaskSearchService currentUserTaskSearchService;

    final TaskMapper taskMapper;

    final CrowUserService crowUserService;

    public CurrentUserTaskController(
            TaskService taskService,
            CurrentUserTaskSearchService currentUserTaskSearchService,
            TaskMapper taskMapper,
            CrowUserService crowUserService) {
        this.taskService = taskService;
        this.currentUserTaskSearchService = currentUserTaskSearchService;
        this.taskMapper = taskMapper;
        this.crowUserService = crowUserService;
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/planned-for-today")
    public Page<TaskDto> getMyTodayTasks(
            @PageableDefault(size = 20)
                    @SortDefault.SortDefaults({@SortDefault(sort = "severity", direction = Sort.Direction.DESC)})
                    Pageable pageable) {
        return currentUserTaskSearchService
                .getPlannedForTodayTasksOfUser(pageable)
                .map(taskMapper::toDto);
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/planned")
    public Page<TaskDto> getMyPlannedTasks(
            @PageableDefault(page = 0, size = 20)
                    @SortDefault.SortDefaults({@SortDefault(sort = "severity", direction = Sort.Direction.DESC)})
                    Pageable pageable) {
        return currentUserTaskSearchService.getPlannedTasksOfUser(pageable).map(taskMapper::toDto);
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/in-progress")
    public Page<TaskDto> getMyInProgressTasks(
            @PageableDefault(page = 0, size = 20)
                    @SortDefault.SortDefaults({@SortDefault(sort = "severity", direction = Sort.Direction.DESC)})
                    Pageable pageable) {
        return currentUserTaskSearchService.getInProgressTasksOfUser(pageable).map(taskMapper::toDto);
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping("/backlog")
    public Page<TaskDto> getMyTasks(
            @PageableDefault(page = 0, size = 20)
                    @SortDefault.SortDefaults({@SortDefault(sort = "severity", direction = Sort.Direction.DESC)})
                    Pageable pageable) {
        return currentUserTaskSearchService.computeBacklog(pageable).map(taskMapper::toDto);
    }

    @RolesAllowed({"ADMIN", "RESEARCH", "WORKER"})
    @GetMapping
    public ResponseEntity<List<TaskDto>> getMyTasks(@RequestParam Long[] ids) {
        List<Task> list = new ArrayList<>();
        for (Long id : ids) {
            Optional<Task> task = taskService.getTaskById(id);
            if (task.isEmpty()) return ResponseEntity.notFound().build();
            list.add(task.get());
        }
        return ResponseEntity.ok(list.stream().map(taskMapper::toDto).toList());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/mes/repo/WorklogRepository.java =====
package com.ua.crow.mes.repo;

import com.ua.crow.mes.database.TimeLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorklogRepository extends CrudRepository<TimeLog, Long> {}



// ===== File: crow/src/main/java/com/ua/crow/mes/repo/SubTaskRepository.java =====
package com.ua.crow.mes.repo;

import com.ua.crow.mes.database.Subtask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTaskRepository extends CrudRepository<Subtask, Long> {}



// ===== File: crow/src/main/java/com/ua/crow/mes/repo/TaskSearchRepository.java =====
package com.ua.crow.mes.repo;

import com.ua.crow.mes.database.Task;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskSearchRepository extends PagingAndSortingRepository<Task, Long> {
    @Query(
            "select t from Task t where (t.assignee.id = ?1  or t.assignee is null) and t.deleted = false and t.isSubtask = ?2 and t.status.id in(?3) order by t.severity desc")
    Page<Task> findAllByAssigneeIdOrIsNullAndDeletedAndIsSubtaskAndStatusIdIn(
            Long assigneeId, boolean isSubtask, List<Long> taskStatusId, Pageable pageable);

    @Query(
            "select t from Task t where (t.assignee.id = ?1  or t.assignee is null) and t.deleted = false and t.isSubtask = ?2 and t.status.id in(?3) and (?4) between t.start and t.endTime order by t.severity desc")
    Page<Task> findAllByAssigneeIdOrIsNullAndDeletedAndIsSubtaskAndStatusIdInForToday(
            Long assigneeId, boolean isSubtask, List<Long> taskStatusId, LocalDateTime today, Pageable pageable);
}



// ===== File: crow/src/main/java/com/ua/crow/mes/repo/TaskRepository.java =====
package com.ua.crow.mes.repo;

import com.ua.crow.mes.database.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {}



// ===== File: crow/src/main/java/com/ua/crow/mes/repo/TaskTypeRepository.java =====
package com.ua.crow.mes.repo;

import com.ua.crow.mes.database.TaskType;
import org.springframework.data.repository.CrudRepository;

public interface TaskTypeRepository extends CrudRepository<TaskType, Long> {}



// ===== File: crow/src/main/java/com/ua/crow/mes/repo/TaskStatusRepository.java =====
package com.ua.crow.mes.repo;

import com.ua.crow.mes.database.TaskStatus;
import com.ua.crow.mes.database.TaskType;
import java.util.stream.Stream;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStatusRepository extends CrudRepository<TaskStatus, Long> {
    Stream<TaskStatus> findByTaskTypeAndInitialStatusIsTrue(TaskType taskType);

    Stream<TaskStatus> findByTaskTypeAndTerminatedStatusIsFalse(TaskType taskType);

    Stream<TaskStatus> findByTerminatedStatusIsFalse();

    Stream<TaskStatus> findByInProgressStatusIsTrue();

    Stream<TaskStatus> findByPlannedStatusIsTrue();

    Stream<TaskStatus> findByBacklogStatusIsTrue();
}



// ===== File: crow/src/main/java/com/ua/crow/AppShell.java =====
package com.ua.crow;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.shared.communication.PushMode;
import com.vaadin.flow.shared.ui.Transport;
import com.vaadin.flow.theme.Theme;

@Push(value = PushMode.AUTOMATIC, transport = Transport.WEBSOCKET)
@Theme(value = "crow")

public class AppShell implements AppShellConfigurator {
}



// ===== File: crow/src/main/java/com/ua/crow/exceptions/MinioException.java =====
package com.ua.crow.exceptions;

public class MinioException extends RuntimeException{
    public MinioException() {
        super();
    }

    public MinioException(String message) {
        super(message);
    }

    public MinioException(String message, Throwable cause) {
        super(message, cause);
    }

    public MinioException(Throwable cause) {
        super(cause);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/exceptions/FileUploadException.java =====
package com.ua.crow.exceptions;

import java.security.InvalidParameterException;

public class FileUploadException extends InvalidParameterException {
    public FileUploadException(String msg) {
        super(msg);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/ItemGroup.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

// screws, nuts, grinders etc customised by customer, any catalogs defined by user
@Getter
@Setter
@Entity
public class ItemGroup extends BasicEntityWithNumericId {}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/ToolType.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.basic.NamedNumericIdEntity;
import jakarta.persistence.Entity;

// Matherials
// Tools managed by the system
// Electric tools independent on system
// Manual tools etc
@Entity
public class ToolType extends NamedNumericIdEntity {}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/ResourceItem.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.plm.database.WithdrawAlgorythm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ResourceItem extends NamedBasicEntityWithNumericId {

    @Enumerated(EnumType.STRING)
    private WithdrawAlgorythm withdrawAlgorythm;

    private double minimalUnitToWithdraw;

    private double price;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private ResourceGroup group;


}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/operations/InventoryPurchase.java =====
package com.ua.crow.inventory.database.operations;

import com.ua.crow.database.models.cashbox.Cashbox;
import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.database.models.common.basic.Currency;
import com.ua.crow.inventory.database.ToolItem;
import jakarta.persistence.*;
import lombok.*;

// Add tools withdraw tools from inventory

@Getter
@Setter
@Entity
public class InventoryPurchase extends BasicEntityWithNumericId {
    @ManyToOne
    private ToolItem tool;

    private Double price;

    @ManyToOne
    private Currency currency;

    @ManyToOne
    Cashbox cashbox;

    private Double amount;
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/operations/InventoryDecomissioning.java =====
package com.ua.crow.inventory.database.operations;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.inventory.database.ToolItem;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class InventoryDecomissioning extends BasicEntityWithNumericId {

    @ManyToOne
    private ToolItem item;

    private String reason;

    private Double amount;
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/operations/Inventarisation.java =====
package com.ua.crow.inventory.database.operations;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import jakarta.persistence.Entity;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Inventarisation extends BasicEntityWithNumericId {
    private Date inventarisationDateStart;
    private Date inventarisationDateEnd;
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/operations/InventoryCheckIn.java =====
package com.ua.crow.inventory.database.operations;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.inventory.database.ToolItem;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InventoryCheckIn extends BasicEntityWithNumericId {
    @ManyToOne
    private ToolItem item;

    private Date checkInDate;

    @ManyToOne
    private Inventarisation inventarisation;
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/ToolItem.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.Units;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class ToolItem extends NamedBasicEntityWithNumericId {

    private boolean participatesInventarisation;

    @ManyToOne
    private ToolType type;

    private String barcode;

    private String photo;

    @ManyToOne
    private ItemGroup itemGroup;

    @ManyToOne
    private Units units;
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/InventoryLeftovers.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.basic.NumericIdEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class InventoryLeftovers extends NumericIdEntity {
    @ManyToOne
    Stock stock;

    @ManyToOne
    ToolItem item;

    Double leftover;

    Date effectiveDate;
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/Stock.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Stock extends BasicEntityWithNumericId {}



// ===== File: crow/src/main/java/com/ua/crow/inventory/database/ResourceGroup.java =====
package com.ua.crow.inventory.database;

import com.ua.crow.database.models.common.AbstractResourceGroup;
import com.ua.crow.plm.database.WithdrawAlgorythm;
import com.ua.crow.service.conversion.Convertable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ResourceGroup extends AbstractResourceGroup<ResourceGroup> implements Convertable {

    @Enumerated(EnumType.STRING)
    private WithdrawAlgorythm withdrawAlgorythm;

    private double minimalUnitToWithdraw;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<ResourceItem> resources;


}



// ===== File: crow/src/main/java/com/ua/crow/inventory/conversion/ResourceGroupDtoToEntity.java =====
package com.ua.crow.inventory.conversion;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.plm.dto.ResourceGroupDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ResourceGroupDtoToEntity implements Converter<ResourceGroupDto, ResourceGroup> {

    @Override
    public ResourceGroup convert(ResourceGroupDto source) {
        return toEntity(source);
    }

    public ResourceGroup toEntity(ResourceGroupDto dto) {
        if (dto == null) {
            return null;
        }

        ResourceGroup resourceGroup = new ResourceGroup();
        resourceGroup.setId(dto.getId());
        resourceGroup.setName(dto.getName());
        resourceGroup.setCreatedAt(dto.getCreatedAt());
        resourceGroup.setModifiedAt(dto.getModifiedAt());
        resourceGroup.setCreator(dto.getCreator());
        resourceGroup.setModifier(dto.getModifier());
        resourceGroup.setDeleted(dto.isDeleted());
        resourceGroup.setUkrName(dto.getUkrName());
        resourceGroup.setWithdrawAlgorythm(dto.getWithdrawAlgorythm());
        resourceGroup.setMinimalUnitToWithdraw(dto.getMinimalUnitToWithdraw());
        resourceGroup.setResources(dto.getResources());
        resourceGroup.setParent(dto.getParent());

        // Explicitly ignore children
        resourceGroup.setChildren(null);

        return resourceGroup;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/conversion/ResourceGroupToDto.java =====
package com.ua.crow.inventory.conversion;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.plm.converters.mappers.ResourceGroupMapper;
import com.ua.crow.plm.dto.ResourceGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ResourceGroupToDto implements Converter<ResourceGroup, ResourceGroupDto> {

    @Autowired
    private  ResourceGroupMapper resourceGroupMapper;

    @Override
    public ResourceGroupDto convert(ResourceGroup source) {
        return toDto(source);
    }

    public ResourceGroupDto toDto(ResourceGroup resourceGroup) {
        if (resourceGroup == null) {
            return null;
        }

        ResourceGroupDto dto = new ResourceGroupDto();
        dto.setId(resourceGroup.getId());
        dto.setName(resourceGroup.getName());
        dto.setCreatedAt(resourceGroup.getCreatedAt());
        dto.setModifiedAt(resourceGroup.getModifiedAt());
        dto.setCreator(resourceGroup.getCreator());
        dto.setModifier(resourceGroup.getModifier());
        dto.setDeleted(resourceGroup.isDeleted());
        dto.setUkrName(resourceGroup.getUkrName());
        dto.setWithdrawAlgorythm(resourceGroup.getWithdrawAlgorythm());
        dto.setMinimalUnitToWithdraw(resourceGroup.getMinimalUnitToWithdraw());
        dto.setResources(resourceGroup.getResources());
        dto.setParent(resourceGroup.getParent());

        // Explicitly ignore children
        dto.setChildren(null);

        return dto;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/service/ResourceGroupService.java =====
package com.ua.crow.inventory.service;

import com.ua.crow.inventory.database.ResourceGroup;
import com.ua.crow.inventory.repo.ResourceGroupRepository;
import com.ua.crow.plm.dto.ResourceGroupDto;
import com.ua.crow.service.graph.AbstractTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class ResourceGroupService extends AbstractTreeService<ResourceGroup, Long> {

    private final ResourceGroupRepository resourceGroupRepository;

    @Autowired
    public ResourceGroupService(ResourceGroupRepository resourceGroupRepository) {
        this.resourceGroupRepository = resourceGroupRepository;

    }



    @Transactional(readOnly = true)
    public Optional<ResourceGroupDto> findById(Long id) {
        Optional<ResourceGroup> resourceGroup = resourceGroupRepository.findById(id);
        return resourceGroup.map(e->e.convert(ResourceGroupDto.class));
    }


    @Override
    protected CrudRepository<ResourceGroup, Long> getRepository() {
        return resourceGroupRepository;
    }

//    @Transactional(readOnly = true)
//    public List<ResourceGroupDto> getTree() {
//        List<ResourceGroup> allGroups = StreamSupport.stream(resourceGroupRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//        List<ResourceGroup> tree = buildTree(allGroups);
//        return tree.stream().map(resourceGroupMapper::toDto).collect(Collectors.toList());
//    }




}



// ===== File: crow/src/main/java/com/ua/crow/inventory/repo/ToolTypeRepository.java =====
package com.ua.crow.inventory.repo;

import com.ua.crow.inventory.database.ToolType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolTypeRepository extends CrudRepository<ToolType, Long> {}



// ===== File: crow/src/main/java/com/ua/crow/inventory/repo/ResourceGroupRepository.java =====
package com.ua.crow.inventory.repo;

import com.ua.crow.inventory.database.ResourceGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceGroupRepository extends CrudRepository<ResourceGroup, Long> {
}



// ===== File: crow/src/main/java/com/ua/crow/inventory/repo/ItemRepository.java =====
package com.ua.crow.inventory.repo;

import com.ua.crow.inventory.database.ToolItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<ToolItem, Long> {}



// ===== File: crow/src/main/java/com/ua/crow/service/ResourceAlreadyExist.java =====
package com.ua.crow.service;

public class ResourceAlreadyExist extends RuntimeException{

    public ResourceAlreadyExist() {
    }

    public ResourceAlreadyExist(String message) {
        super(message);
    }

    public ResourceAlreadyExist(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceAlreadyExist(Throwable cause) {
        super(cause);
    }

    public ResourceAlreadyExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/service/BadRequest.java =====
package com.ua.crow.service;

public class BadRequest extends RuntimeException {
    public BadRequest(String message) {
        super(message);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/service/graph/AbstractTreeService.java =====
package com.ua.crow.service.graph;

import com.ua.crow.database.models.common.AbstractResourceGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public abstract class AbstractTreeService<E extends AbstractResourceGroup<E>, ID> {

    protected abstract CrudRepository<E, ID> getRepository();

    @Transactional(readOnly = true)
    public List<E> findAll() {
        return StreamSupport.stream(getRepository().findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<E> getTree() {
        List<E> allGroups = findAll();
        return buildTree(allGroups);
    }

    protected List<E> buildTree(List<E> allGroups) {
        List<E> roots = allGroups.stream()
                .filter(group -> group.getParent() == null)
                .collect(Collectors.toList());
        roots.forEach(root -> setChildren(root, allGroups));
        return roots;
    }

    private void setChildren(E parent, List<E> allGroups) {
        List<E> children = allGroups.stream()
                .filter(group -> group.getParent() != null && group.getParent().getId().equals(parent.getId()))
                .collect(Collectors.toList());
        parent.setChildren(children);
        children.forEach(child -> setChildren(child, allGroups));
    }

    @Transactional
    public E save(E entity) {
        return getRepository().save(entity);
    }

    @Transactional
    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }
}


// ===== File: crow/src/main/java/com/ua/crow/service/minio/MinioService.java =====
package com.ua.crow.service.minio;

import com.ua.crow.config.Buckets;
import com.ua.crow.config.Minio;
import com.ua.crow.exceptions.MinioException;
import com.ua.crow.plm.service.UriEncodingService;
import io.minio.*;
import io.minio.errors.*;
import io.minio.http.Method;
import io.minio.messages.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class MinioService {
    @Autowired
    Minio minio;
    @Value("${tempdir.url}")
    private String tempBufferAddress;

    @Value("${minio.url}")
    private String url;
    @Autowired
    UriEncodingService encodingService;

    @Autowired
    RestTemplate restTemplate;

    public void createFolder(Buckets bucket, String directoryName) {
        try {
            minio.getClient().putObject(
                    PutObjectArgs.builder()
                            .bucket(bucket.name())
                            .object(removeNonLetters(directoryName) + "/") // имя "файла" с завершающим слэшем указывает на каталог
                            .stream(new ByteArrayInputStream(new byte[]{}), 0, -1)
                            .build()
            );
        } catch (ServerException | InsufficientDataException | ErrorResponseException | IOException |
                 NoSuchAlgorithmException | InvalidKeyException | InvalidResponseException | XmlParserException |
                 InternalException e) {
            throw new MinioException(e);
        }
    }

    public static String removeNonLetters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        // Используем регулярное выражение для удаления всех символов, кроме букв (латиница и кириллица)
        String lettersOnly = input.replaceAll("[^a-zA-Zа-яА-Я_0-9/]", "");
        // Преобразуем строку в верхний регистр
        return lettersOnly;
    }

    public void uploadFileFromUrl(Buckets bucket, String folder, String thumbnailUrl) {
        uploadFileFromUrl(bucket, folder, thumbnailUrl, null);
    }

    public Stream<Result<Item>> list(Buckets bucket, String folder) {
        return StreamSupport.stream(minio.getClient()
                .listObjects(ListObjectsArgs.builder().bucket(bucket.name())
                        .prefix(folder)
                        .recursive(false)
                        .build()).spliterator(), false);

    }

    public Optional<String> getSignedUrlForTheFirstObjectInFolder(Buckets bucket, String folder) {
        return list(bucket, folder).map(i -> get(i)).findFirst().flatMap(i -> Optional.of(sign(bucket, i.objectName())));
    }

    private Item get(Result<Item> i) {
        try {
            return i.get();
        } catch (Exception e) {
            throw new MinioException("Error occurred while getting signed URL for the first object", e);
        }
    }


    public String sign(Buckets bucket, String objectName) {
        try {
            return minio.getClient()
                    .getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder()
                            .method(Method.GET)
                            .bucket(bucket.name())
                            .object(objectName)
                            .expiry(1, TimeUnit.HOURS)
                            .build());
        } catch (Exception e) {
            throw new MinioException(e);
        }
    }

    public byte[] getObjectAsBytes(Buckets bucket, String objectName) {
        try (InputStream stream = minio.getClient().getObject(
                GetObjectArgs.builder()
                        .bucket(bucket.name())
                        .object(objectName)
                        .build());
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = stream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while getting object from MinIO", e);
        }
    }


    public void uploadFileFromUrl(Buckets bucket, String folder, String thumbnailUrl, String filename) {

        InputStream inputStream;
        HttpResponse<InputStream> response = httpGet(thumbnailUrl);
        // Получение InputStream из файла
        inputStream = response.body();

        if (filename == null) {
            filename = UUID.randomUUID().toString();

        }
        // Определение имени объекта для MinIO
        if (folder == null) {
            throw new NullPointerException("Folder is empty");
        }
        String objectName = folder + "/" + filename;

        Optional<String> contentLength = response.headers().firstValue("Content-Length");
        long length = contentLength.map(Long::parseLong).orElse(-1L);

        // Получение типа содержимого
        Optional<String> contentType = response.headers().firstValue("Content-Type");
        String type = contentType.orElse("application/octet-stream");

        // Загрузка файла в MinIO
        put(bucket, objectName, inputStream, length, type);


    }

    public HttpResponse<InputStream> httpGet(String url) {
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

            // Проверка ответа сервера
            if (response.statusCode() != 200) {
                throw new RuntimeException("Failed to connect to URL: " + url);
            }
            return response;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error occurred while downloading the file", e);
        }

    }

    public void put(Buckets bucket, String objectName, InputStream inputStream, long length, String type) {
        try {
            minio.getClient().putObject(
                    PutObjectArgs.builder()
                            .bucket(bucket.name())
                            .object(objectName)
                            .stream(inputStream, length, -1)
                            .contentType(type)
                            .build());
        } catch (Exception e) {
            throw new MinioException(e);
        }
    }

    public void uploadFileTemporaryStorage(Buckets buckets, String url, String path) {
        uploadFileFromUrl(buckets, path, tempBufferAddress + url);
    }



    public String getUrl() {
        return url;
    }

    public void delete(Buckets buckets, String objectName) {
        if(exist(buckets,objectName)) {
            String bucketName = buckets.name();
            try {
                minio.getClient().removeObject(
                        io.minio.RemoveObjectArgs.builder()
                                .bucket(bucketName)
                                .object(objectName)
                                .build()
                );
                System.out.println("File " + objectName + " successfully deleted from bucket " + bucketName);
            } catch (Exception e) {
                throw new MinioException("Error occurred while deleting the file", e);
            }
        }
    }

    public boolean exist(Buckets bucket, String objectName) {
        try {
            minio.getClient().statObject(
                    StatObjectArgs.builder()
                            .bucket(bucket.name())
                            .object(objectName)
                            .build()
            );
            return true;
        } catch (ErrorResponseException e) {
            if (e.errorResponse().code().equals("NoSuchKey")) {
                return false;
            }
            throw new MinioException("Error occurred while checking the file", e);
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while checking the file", e);
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/service/conversion/Optionalable.java =====
package com.ua.crow.service.conversion;

import java.util.Optional;

public interface Optionalable<T> {
    default Optional<T> optional(){
        return Optional.of((T)this);
    }

}



// ===== File: crow/src/main/java/com/ua/crow/service/conversion/Convertable.java =====
package com.ua.crow.service.conversion;

import com.ua.crow.util.SpringContext;

public interface Convertable {

   default  <T> T convert(Class<T> type){
       return SpringContext.getConversionService().convert(this,type);
   }

}



// ===== File: crow/src/main/java/com/ua/crow/service/CrowUserService.java =====
package com.ua.crow.service;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.database.repository.UserRepository;
import com.ua.crow.dto.appsmith.Data;
import com.ua.crow.util.SecurityContext;
import com.ua.crow.workspace.WorkspaceType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Service
public class CrowUserService extends JdbcUserDetailsManager implements UserDetailsPasswordService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private SecurityContextHolderStrategy securityContextHolderStrategy;
    private AuthenticationManager authenticationManager;


    @Autowired
    public CrowUserService(DataSource dataSource, UserRepository userRepository) {
        super(dataSource);  // Pass DataSource to JdbcUserDetailsManager
        this.userRepository = userRepository;
    }
    public UserEntity getUserEntity(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }

    public UserEntity getUserEntity(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with ID: " + userId));
    }

    public UserEntity updateUserDetailsIfRequired(Data userData) {
        Optional<UserEntity> optionalUserEntity = userRepository.findByUsername(userData.getUsername());
        UserEntity existingUser = optionalUserEntity.orElseGet(() -> userRepository.save(convertUser(userData)));

        UserEntity newUserEntity = convertUser(userData);
        newUserEntity.setId(existingUser.getId());

        if (!newUserEntity.equals(existingUser)) {
            existingUser = userRepository.save(newUserEntity);
        }

        return existingUser;
    }

    private UserEntity convertUser(Data userData) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userData.getUsername());
        userEntity.setName(userData.getName());
        userEntity.setEmail(userData.getEmail());
        userEntity.setAnonymous(userData.isAnonymous());
        userEntity.setEnabled(userData.isEnabled());
        userEntity.setAccountNonExpired(userData.isAccountNonExpired());
        userEntity.setAccountNonLocked(userData.isAccountNonLocked());
        userEntity.setCredentialsNonExpired(userData.isCredentialsNonExpired());
        return userEntity;
    }

    public UserDetails getUserDetails(UserEntity userEntity) {
        return User.builder()
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .authorities(List.of(new SimpleGrantedAuthority("ADMIN"))) // adjust as necessary
                .accountExpired(!userEntity.isAccountNonExpired())
                .accountLocked(!userEntity.isAccountNonLocked())
                .credentialsExpired(!userEntity.isCredentialsNonExpired())
                .disabled(!userEntity.isEnabled())
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = getUserEntity(username);
        return getUserDetails(userEntity);
    }

    @Override
    public boolean userExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    @Override
    public UserDetails updatePassword(UserDetails user, String newPassword) {
        UserEntity userEntity = getUserEntity(user.getUsername());
        userEntity.setPassword(newPassword);
        userRepository.save(userEntity);
        return getUserDetails(userEntity);
    }

    public void setSecurityContextHolderStrategy(SecurityContextHolderStrategy securityContextHolderStrategy) {
        Assert.notNull(securityContextHolderStrategy, "securityContextHolderStrategy cannot be null");
        this.securityContextHolderStrategy = securityContextHolderStrategy;
    }

    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    public UserEntity create(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public UserEntity update(UserEntity user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public UserEntity changePassword(Long id, String newPassword) {
        UserEntity entity = getUserEntity(id);
        entity.setPassword(passwordEncoder.encode(newPassword));
        return userRepository.save(entity);
    }

    public UserEntity getCurrentUser() {
        String username = SecurityContext.getUsernameOrElseThrow();
        return getUserEntity(username);
    }

    public void switchWorkspace(WorkspaceType workspace) {
        UserEntity user = getCurrentUser();
        user.setCurrentWorkspace(workspace);
        userRepository.save(user);
    }
}


// ===== File: crow/src/main/java/com/ua/crow/service/NotFoundException.java =====
package com.ua.crow.service;

import com.ua.crow.plm.database.fusion.FusionId;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {
    private  Long id;
    private  Class entityType;
    private  String searchCriteria;
    private  FusionId fusionId;


    public NotFoundException() {
        id = null;
        entityType = null;
        searchCriteria = null;
    }

    public NotFoundException(Long id, Class entityType) {
        super("Entity "+entityType.getName()+" with id: "+id+" not found");
        this.id = id;
        this.entityType = entityType;
        searchCriteria = null;
    }

    public NotFoundException(String searchCriteria, Class entityType) {
        super("Entity "+entityType.getName()+" with field: "+searchCriteria+" not found");
        this.searchCriteria = searchCriteria;
        this.entityType = entityType;
        this.id = null;
    }

    public NotFoundException(String errorMessage) {
        super(errorMessage);
        this.searchCriteria = null;
        this.entityType = null;
        this.id = null;
    }

    public NotFoundException(FusionId searchCriteria, Class entityType) {
        super("Entity "+entityType.getName()+" with field: "+searchCriteria+" not found");
        this.fusionId = searchCriteria;
        this.searchCriteria = null;
        this.entityType = null;
        this.id = null;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/controllers/ExceptionHandlers.java =====
package com.ua.crow.controllers;

import static com.ua.crow.dto.ErrorInfo.createErrorInfo;

import com.ua.crow.database.models.common.basic.BasicEntityWithNumericId;
import com.ua.crow.database.models.common.basic.NamedBasicEntityWithNumericId;
import com.ua.crow.dto.basic.NumericIdEntityDto;
import com.ua.crow.dto.basic.NamedBasicEntityWithNumericIdDto;
import com.ua.crow.dto.ErrorInfo;
import com.ua.crow.service.BadRequest;
import com.ua.crow.service.NotFoundException;
import com.ua.crow.service.ResourceAlreadyExist;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlers.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    ErrorInfo handle404(HttpServletRequest req, Exception e) {
        logger.error(e.getMessage());
        return createErrorInfo(404, e.getMessage(), req.getRequestURI());
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(ResourceAlreadyExist.class)
    @ResponseBody
    ErrorInfo handle409(HttpServletRequest req, ResourceAlreadyExist e) {
        logger.error(e.getMessage(),e);
        return createErrorInfo(409, e.getMessage(), req.getRequestURI());
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequest.class)
    @ResponseBody
    ErrorInfo handleBadRequest(HttpServletRequest req, Exception e) {
        logger.error(e.getMessage(),e);

        return createErrorInfo(400, e.getMessage(), req.getRequestURI());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    ErrorInfo handleConstraintViolation(HttpServletRequest req, ConstraintViolationException e){
        StringBuilder stringBuilder = new StringBuilder();
        e.getConstraintViolations().forEach(constraintViolation -> {
            stringBuilder.append("Constraint violation exception:"+constraintViolation.getMessage()).append('\n')
                    .append("Recieved:").append(constraintViolation.getInvalidValue()).append("\n");
            if(constraintViolation.getRootBean() instanceof NamedBasicEntityWithNumericId) {
                NamedBasicEntityWithNumericId bean = (NamedBasicEntityWithNumericId) constraintViolation.getRootBean();
                if (bean.getName() != null && !"".equals(bean.getName())) {
                    stringBuilder.append("Invalid object name: ").append(bean.getName()).append(" ;");
                }
            }
            if(constraintViolation.getRootBean() instanceof BasicEntityWithNumericId) {
                BasicEntityWithNumericId bean = (BasicEntityWithNumericId) constraintViolation.getRootBean();
                if(bean.getId()!=null){
                    stringBuilder.append("Invalid object id: ").append(bean.getId()).append(" ;");
                }
            }

            if(constraintViolation.getRootBean() instanceof NamedBasicEntityWithNumericIdDto) {
                NamedBasicEntityWithNumericId bean = (NamedBasicEntityWithNumericId) constraintViolation.getRootBean();
                if (bean.getName() != null && !"".equals(bean.getName())) {
                    stringBuilder.append("Invalid object name: ").append(bean.getName()).append(" ;");
                }
            }
            if(constraintViolation.getRootBean() instanceof NumericIdEntityDto) {
                BasicEntityWithNumericId bean = (BasicEntityWithNumericId) constraintViolation.getRootBean();
                if(bean.getId()!=null){
                    stringBuilder.append("Invalid object id: ").append(bean.getId()).append(" ;");
                }
            }
        });
        logger.error(e.getMessage(),e);
        return createErrorInfo(400, stringBuilder.toString(), req.getRequestURI());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/controllers/OptionalAspect.java =====
package com.ua.crow.controllers;

import com.ua.crow.service.NotFoundException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

@Aspect
@Component
public class OptionalAspect {

    // Pointcut для всех методов в контроллерах, аннотированных @RestController
    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void restController() {}

    // Pointcut для всех методов, возвращающих Optional, внутри контроллеров
    @Pointcut("execution(java.util.Optional *(..)) && restController()")
    public void optionalReturnMethods() {}

    @AfterReturning(pointcut = "optionalReturnMethods()", returning = "result")
    public void checkOptionalReturnValue(JoinPoint joinPoint, Object result) {

        if (result instanceof Optional) {
            Optional<?> optionalResult = (Optional<?>) result;
            if (optionalResult.isEmpty()) {
                String className = joinPoint.getTarget().getClass().getName();
                String methodName = joinPoint.getSignature().getName();
                Object[] methodArgs = joinPoint.getArgs();

                // Получаем метод
                Method method = null;
                for (Method m : joinPoint.getTarget().getClass().getMethods()) {
                    if (m.getName().equals(methodName) && m.getParameterCount() == methodArgs.length) {
                        method = m;
                        break;
                    }
                }

                // Получаем значение из @RequestMapping
                String requestMappingValue = "";
                if (method != null) {
                    RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                    if (requestMapping != null) {
                        requestMappingValue = String.join(", ", requestMapping.value());
                    }
                }

                // Конструируем сообщение об ошибке
                String errorMessage = String.format("Class: %s, Method: %s, Params: %s, RequestMapping: %s",
                        className, methodName, Arrays.toString(methodArgs), requestMappingValue);

                throw new NotFoundException(errorMessage);

            }
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/controllers/TestController.java =====
package com.ua.crow.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/example.step")
    public ResponseEntity<Resource> getExampleStep() throws IOException {
        ClassPathResource resource = new ClassPathResource("example.step");
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=example.step")
                .contentLength(resource.contentLength())
                .body(resource);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/controllers/UserController.java =====
package com.ua.crow.controllers;

import com.ua.crow.database.models.auth.UserEntity;
import com.ua.crow.mes.conversion.UserEntityMapper;
import com.ua.crow.mes.dto.CreateUserDto;
import com.ua.crow.mes.dto.PasswordChangeDto;
import com.ua.crow.mes.dto.UserDto;
import com.ua.crow.service.CrowUserService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final CrowUserService userService;
    private final UserEntityMapper mapper;

    public UserController(CrowUserService userService, UserEntityMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping
    @RolesAllowed("ADMIN")
    public List<UserDto> getAll() {
        return userService.findAll().stream().map(mapper::toDto).toList();
    }

    @GetMapping("/{id}")
    @RolesAllowed("ADMIN")
    public Optional<UserDto> getById(@PathVariable Long id) {
        return userService.findById(id).map(mapper::toDto);
    }

    @PostMapping
    @RolesAllowed("ADMIN")
    public UserDto create(@RequestBody CreateUserDto dto) {
        UserEntity user = new UserEntity();
        user.setUsername(dto.getUsername());
        user.setName(dto.getName());
        user.setEnabled(dto.isEnabled());
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setPassword(dto.getPassword());
        return mapper.toDto(userService.create(user));
    }

    @PutMapping("/{id}")
    @RolesAllowed("ADMIN")
    public UserDto update(@PathVariable Long id, @RequestBody UserDto dto) {
        UserEntity user = userService.getUserEntity(id);
        user.setUsername(dto.getUsername());
        user.setName(dto.getName());
        user.setEnabled(dto.isEnabled());
        return mapper.toDto(userService.update(user));
    }

    @DeleteMapping("/{id}")
    @RolesAllowed("ADMIN")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @PostMapping("/{id}/password")
    @RolesAllowed("ADMIN")
    public void changePassword(@PathVariable Long id, @RequestBody PasswordChangeDto dto) {
        userService.changePassword(id, dto.password());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/navigation/BreadcrumbBar.java =====
package com.ua.crow.views.navigation;

import com.ua.crow.views.service.HistoryEntry;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BreadcrumbBar extends HorizontalLayout {

    private final NavigationHistoryService historyService;

    public BreadcrumbBar(NavigationHistoryService historyService) {
        this.historyService = historyService;

        setSpacing(true);
        refresh();
    }

    public void refresh() {
        removeAll();

        // 1. Получаем текущую точку входа
        Optional<HistoryEntry<?>> current = historyService.getLast();
        if (current.isEmpty()) return;

        // 3. Добавляем кнопки
        for (HistoryEntry<?> entry : historyService.context) {
            Button crumb = new Button(entry.getLabel(), click -> UI.getCurrent().navigate(entry.getPath()));
            add(crumb);
        }
    }

}



// ===== File: crow/src/main/java/com/ua/crow/views/navigation/NavigationMenuBuilder.java =====
package com.ua.crow.views.navigation;

import com.ua.crow.plm.dto.base.ProductDto;
import com.ua.crow.views.components.product.views.ProductPage;
import com.ua.crow.views.components.product.views.ProductsListView;
import com.ua.crow.views.pages.NotFoundView;
import com.ua.crow.views.components.settings.MasterDataView;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;

/**
 * Utility class for building and updating the application side navigation
 * menu based on the current navigation context.
 */
public final class NavigationMenuBuilder {

    private NavigationMenuBuilder() {
        // Utility class
    }

    /**
     * Creates a new {@link SideNav} configured according to the given
     * {@link NavigationHistoryService}.
     */
    public static SideNav createSideNav(NavigationHistoryService historyService) {
        SideNav nav = new SideNav();
        updateSideNav(nav, historyService);
        return nav;
    }

    /**
     * Updates the given navigation menu to reflect the latest state of the
     * navigation history.
     */
    public static void updateSideNav(SideNav nav, NavigationHistoryService historyService) {
        java.util.Map<String, Boolean> expanded = captureExpanded(nav.getItems());

        nav.removeAll();
        nav.addItem(new SideNavItem("All products", ProductsListView.class));

        historyService.getContext(ProductPage.class)
                .map(entry -> (ProductDto) entry.getContextObject())
                .ifPresent(product -> addProductNavigation(nav, product));

        SideNavItem settings = new SideNavItem("Settings");
        settings.addItem(new SideNavItem("Mastering data",
                com.ua.crow.views.components.settings.MasterDataView.class));
        settings.addItem(new SideNavItem("Users",
                com.ua.crow.views.components.settings.UsersView.class));
        nav.addItem(settings);

        nav.addItem(new SideNavItem("CNC", com.ua.crow.views.pages.CncRndInterfaceView.class));
        applyExpanded(nav.getItems(), expanded);
    }

    private static java.util.Map<String, Boolean> captureExpanded(java.util.List<SideNavItem> items) {
        java.util.Map<String, Boolean> map = new java.util.HashMap<>();
        for (SideNavItem item : items) {
            map.put(item.getLabel(), item.isExpanded());
            map.putAll(captureExpanded(item.getItems()));
        }
        return map;
    }

    private static void applyExpanded(java.util.List<SideNavItem> items, java.util.Map<String, Boolean> state) {
        for (SideNavItem item : items) {
            Boolean expanded = state.get(item.getLabel());
            if (expanded != null) {
                item.setExpanded(expanded);
            }
            applyExpanded(item.getItems(), state);
        }
    }

    private static void addProductNavigation(SideNav nav, ProductDto product) {
        String id = String.valueOf(product.getId());

        SideNavItem productGroup = new SideNavItem("Product: " + product.getName());
        productGroup.setExpanded(true);
        productGroup.addItem(new SideNavItem("Overview", "/product/" + id));
        productGroup.addItem(new SideNavItem("CAD BOMs", "/product/" + id + "/newcadboms"));
        productGroup.addItem(new SideNavItem("Fusion components", NotFoundView.class));
        productGroup.addItem(new SideNavItem("Engineering Boms", "/product/" + id + "/engineeringboms"));
        productGroup.addItem(new SideNavItem("Components", NotFoundView.class));
        nav.addItem(productGroup);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/navigation/NavigationContextAware.java =====
package com.ua.crow.views.navigation;


import com.ua.crow.views.service.HistoryEntry;

import java.util.LinkedList;
import java.util.Optional;

public interface NavigationContextAware {

    NavigationHistoryService getHistoryService();

    HistoryEntry<?> getCurrentContext();

    default HistoryEntry<?> addToHistory() {

        NavigationHistoryService historyService = getHistoryService();
        HistoryEntry<?> currentContext = getCurrentContext();

        LinkedList<HistoryEntry<?>> history = historyService.context;

        Optional<HistoryEntry<?>> existingEntryOpt = history.stream()
                .filter(entry -> entry.getPath().equals(currentContext.getPath()))
                .findFirst();

        if (existingEntryOpt.isPresent()) {
            // If the entry already exists, remove everything after it
            int index = history.indexOf(existingEntryOpt.get());
            history.subList(index + 1, history.size()).clear();
            history.getLast().setChildContext(null);
        } else {
            // If the entry is new, append it
            Optional<HistoryEntry<?>> parentContextOp = historyService.getLast();
            currentContext.setParentContext(parentContextOp.orElse(null));
            history.add(currentContext);
            if (parentContextOp.isPresent()) {
                parentContextOp.get().setChildContext(currentContext);
            }
        }

        return currentContext;
    }
    default void clearHistory() {
        getHistoryService().clear();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/navigation/NavigationHistoryService.java =====
package com.ua.crow.views.navigation;

import com.ua.crow.plm.dto.base.ProductDto;
import com.ua.crow.views.components.product.views.ProductPage;
import com.ua.crow.views.service.HistoryEntry;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
@Component
@UIScope
public class NavigationHistoryService {
    LinkedList<HistoryEntry<?>> context = new LinkedList<>();
    public Optional<HistoryEntry<?>> getRoot() {
        if (context.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(context.getFirst());
    }
    public void clear() {
        context.clear();
    }
    public Optional<HistoryEntry<?>> getLast() {
        if(context.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(context.getLast());
    }

    public  Optional<HistoryEntry<?>> getContext(Class contextClass) {
        return context.stream()
                .filter(entry -> contextClass.equals(entry.getContext()))
                .findFirst();

    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/navigation/NavigationPathUtil.java =====
package com.ua.crow.views.navigation;

import com.ua.crow.views.components.engineeringbom.list.BomActiveReleaseListView;
import com.ua.crow.views.components.engineeringbom.tree.BomActiveReleaseTreeView;
import com.ua.crow.views.components.fusionbom.edit.CADBomView;
import com.ua.crow.views.components.fusionbom.list.CADBomListView;
import com.ua.crow.views.components.product.views.ProductPage;
import com.ua.crow.views.pages.NotFoundView;
import com.vaadin.flow.router.RouteParameters;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Helper methods for resolving view classes and route parameters
 * from navigation paths.
 */
public final class NavigationPathUtil {

    private NavigationPathUtil() {
        // Utility class
    }

    /** Normalizes the given path to always start with a forward slash. */
    public static String normalizePath(String path) {
        if (path == null || path.isBlank()) {
            return "/";
        }
        return path.startsWith("/") ? path : "/" + path;
    }

    /**
     * Determines the Vaadin view class that corresponds to the given navigation path.
     */
    public static Class<?> resolveViewClass(String path) {
        if (path.startsWith("product/") && (path.contains("/newboms") || path.contains("/fusionboms"))) {
            return CADBomListView.class;
        } else if (path.startsWith("product/") && path.contains("/eboms")) {
            return BomActiveReleaseListView.class;
        } else if (path.startsWith("product/") && path.contains("/ebom/")) {
            return BomActiveReleaseTreeView.class;
        } else if (path.startsWith("product/")) {
            return ProductPage.class;
        } else if (path.startsWith("fusionbom/")) {
            return CADBomView.class;
        }
        return NotFoundView.class;
    }

    /**
     * Extracts {@link RouteParameters} from the given navigation path.
     */
    public static RouteParameters buildRouteParameters(String path) {
        Map<String, String> map = new LinkedHashMap<>();

        if (path.matches("product/\\d+")) {
            String[] parts = path.split("/");
            map.put("productId", parts[1]);
        } else if (path.matches("product/\\d+/(fusionboms|newboms)")) {
            String[] parts = path.split("/");
            map.put("productId", parts[1]);
        } else if (path.matches("product/\\d+/eboms")) {
            String[] parts = path.split("/");
            map.put("productId", parts[1]);
        } else if (path.matches("product/\\d+/ebom/\\d+")) {
            String[] parts = path.split("/");
            map.put("productId", parts[1]);
            map.put("bomId", parts[3]);
        } else if (path.matches("product/\\d+/fusionbom/[^?]+.*")) {
            String[] parts = path.split("/");
            map.put("productId", parts[1]);
            map.put("fusionId", parts[3]);

            if (path.contains("?revisionId=")) {
                String revId = path.substring(path.indexOf("?revisionId=") + 12);
                map.put("revisionId", revId);
            }
        }

        return new RouteParameters(map);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/assembly/AssemblyInstructionsView.java =====
package com.ua.crow.views.workspaces.assembly;

import com.ua.crow.views.MainLayout;
import com.ua.crow.views.workspaces.WorkspaceRestrictedView;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "assembly/instructions", layout = MainLayout.class)
@PageTitle("Assembly Instructions")
@PermitAll
public class AssemblyInstructionsView extends WorkspaceRestrictedView {

    public AssemblyInstructionsView() {
        add(new Span("Assembly Instructions"));
    }

    @Override
    public WorkspaceType requiredWorkspace() {
        return WorkspaceType.ASSEMBLY;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/assembly/AssemblyChecklistView.java =====
package com.ua.crow.views.workspaces.assembly;

import com.ua.crow.views.MainLayout;
import com.ua.crow.views.workspaces.WorkspaceRestrictedView;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "assembly/checklist", layout = MainLayout.class)
@PageTitle("Checklist")
@PermitAll
public class AssemblyChecklistView extends WorkspaceRestrictedView {

    public AssemblyChecklistView() {
        add(new Span("Assembly Checklist"));
    }

    @Override
    public WorkspaceType requiredWorkspace() {
        return WorkspaceType.ASSEMBLY;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/WorkspaceRestrictedView.java =====
package com.ua.crow.views.workspaces;

import com.ua.crow.service.CrowUserService;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public abstract class WorkspaceRestrictedView extends VerticalLayout implements BeforeEnterObserver {

    @Autowired
    private CrowUserService userService;

    protected abstract WorkspaceType requiredWorkspace();

    /**
     * Workspaces allowed to access this view. By default only the
     * {@link #requiredWorkspace()} is permitted.
     */
    protected Set<WorkspaceType> allowedWorkspaces() {
        WorkspaceType required = requiredWorkspace();
        return required == null ? Collections.emptySet() : EnumSet.of(required);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        WorkspaceType current = userService.getCurrentUser().getCurrentWorkspace();
        if (!allowedWorkspaces().contains(current)) {
            event.rerouteTo(com.ua.crow.views.pages.NotFoundView.class);
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/rnd/RndBomView.java =====
package com.ua.crow.views.workspaces.rnd;

import com.ua.crow.views.MainLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "rnd/bom", layout = MainLayout.class)
@PageTitle("BOM Viewer")
@PermitAll
public class RndBomView extends RndWorkspaceRestrictedView {

    public RndBomView() {
        add(new Span("BOM Viewer"));
    }

}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/rnd/RndWorkspaceRestrictedView.java =====
package com.ua.crow.views.workspaces.rnd;

import com.ua.crow.views.workspaces.WorkspaceRestrictedView;
import com.ua.crow.workspace.WorkspaceType;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/**
 * Base view restricting access to R&D workspace.
 */
public abstract class RndWorkspaceRestrictedView extends WorkspaceRestrictedView {

    private final Set<WorkspaceType> allowed;

    protected RndWorkspaceRestrictedView() {
        this(EnumSet.of(WorkspaceType.RND));
    }

    protected RndWorkspaceRestrictedView(Set<WorkspaceType> allowed) {
        this.allowed = allowed == null ? Collections.emptySet() : EnumSet.copyOf(allowed);
    }

    @Override
    protected WorkspaceType requiredWorkspace() {
        return WorkspaceType.RND;
    }

    @Override
    protected Set<WorkspaceType> allowedWorkspaces() {
        return allowed.isEmpty() ? EnumSet.of(WorkspaceType.RND) : allowed;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/rnd/RndCadView.java =====
package com.ua.crow.views.workspaces.rnd;

import com.ua.crow.views.MainLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "rnd/cad", layout = MainLayout.class)
@PageTitle("CAD Editor")
@PermitAll
public class RndCadView extends RndWorkspaceRestrictedView {

    public RndCadView() {
        add(new Span("CAD Editor"));
    }

}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/logistics/LogisticsOutgoingView.java =====
package com.ua.crow.views.workspaces.logistics;

import com.ua.crow.views.MainLayout;
import com.ua.crow.views.workspaces.WorkspaceRestrictedView;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "logistics/outgoing", layout = MainLayout.class)
@PageTitle("Outgoing")
@PermitAll
public class LogisticsOutgoingView extends WorkspaceRestrictedView {

    public LogisticsOutgoingView() {
        add(new Span("Outgoing"));
    }

    @Override
    public WorkspaceType requiredWorkspace() {
        return WorkspaceType.LOGISTICS;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/workspaces/logistics/LogisticsIncomingView.java =====
package com.ua.crow.views.workspaces.logistics;

import com.ua.crow.views.MainLayout;
import com.ua.crow.views.workspaces.WorkspaceRestrictedView;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "logistics/incoming", layout = MainLayout.class)
@PageTitle("Incoming")
@PermitAll
public class LogisticsIncomingView extends WorkspaceRestrictedView {

    public LogisticsIncomingView() {
        add(new Span("Incoming"));
    }

    @Override
    public WorkspaceType requiredWorkspace() {
        return WorkspaceType.LOGISTICS;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/dashboard/TestService.java =====
package com.ua.crow.views.dashboard;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String getHello() {
        return "Hello from injected service!";
    }
}


// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/UsersView.java =====
package com.ua.crow.views.components.settings;

import com.ua.crow.controllers.UserController;
import com.ua.crow.mes.dto.CreateUserDto;
import com.ua.crow.mes.dto.PasswordChangeDto;
import com.ua.crow.mes.dto.UserDto;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.toolbar.GridToolbar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

import static com.ua.crow.views.components.toolbar.ButtonKeys.DELETE;
import static com.ua.crow.views.components.toolbar.ButtonKeys.EDIT;

@Route(value = UsersView.ROUTE, layout = MainLayout.class)
@PageTitle("Users")
@PermitAll
public class UsersView extends VerticalLayout {
    public static final String ROUTE = "settings/users";

    private final UserController controller;
    private final Grid<UserDto> grid;
    private final GridToolbar toolbar;

    public UsersView(UserController controller) {
        this.controller = controller;
        this.grid = new Grid<>(UserDto.class, false);
        grid.addColumn(UserDto::getId).setHeader("ID");
        grid.addColumn(UserDto::getUsername).setHeader("Username");
        grid.addColumn(UserDto::getName).setHeader("Name");
        grid.addColumn(UserDto::isEnabled).setHeader("Enabled");
        grid.setItems(controller.getAll());
        this.toolbar = createToolbar();
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());
        add(toolbar, grid);
        setSizeFull();
        setFlexGrow(1, grid);
    }

    private GridToolbar createToolbar() {
        GridToolbar tb = new GridToolbar(true, true, true, false);
        tb.setAddHandler(b -> openDialog(null));
        tb.setEditHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(this::openDialog));
        tb.setDeleteHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> {controller.delete(dto.getId()); refresh();}));
        tb.addButtonStateHandler(EDIT, b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        tb.addButtonStateHandler(DELETE, b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        return tb;
    }

    private void openDialog(UserDto dto) {
        UserForm form = new UserForm();
        Dialog dialog = createDialog(form, () -> {
            if (dto == null) {
                CreateUserDto toCreate = new CreateUserDto();
                toCreate.setUsername(form.username.getValue());
                toCreate.setName(form.name.getValue());
                toCreate.setEnabled(form.enabled.getValue());
                toCreate.setPassword(form.password.getValue());
                controller.create(toCreate);
            } else {
                UserDto upd = new UserDto();
                upd.setId(dto.getId());
                upd.setUsername(form.username.getValue());
                upd.setName(form.name.getValue());
                upd.setEnabled(form.enabled.getValue());
                controller.update(dto.getId(), upd);
                if (!form.password.getValue().isBlank()) {
                    controller.changePassword(dto.getId(), new PasswordChangeDto(form.password.getValue()));
                }
            }
            refresh();
        });
        if (dto != null) {
            form.username.setValue(dto.getUsername());
            form.name.setValue(dto.getName() != null ? dto.getName() : "");
            form.enabled.setValue(dto.isEnabled());
        }
        dialog.open();
    }

    private Dialog createDialog(UserForm form, Runnable saveHandler) {
        Dialog dialog = new Dialog();
        Button save = new Button("Save", e -> {saveHandler.run(); dialog.close();});
        Button cancel = new Button("Cancel", e -> dialog.close());
        dialog.add(form, new com.vaadin.flow.component.orderedlayout.HorizontalLayout(save, cancel));
        return dialog;
    }

    private void refresh() {
        grid.setItems(controller.getAll());
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/MasterDataView.java =====
package com.ua.crow.views.components.settings;

import com.ua.crow.plm.controller.settings.BomItemPropertyTypeController;
import com.ua.crow.plm.controller.settings.BomItemPropertyTypeGroupController;
import com.ua.crow.plm.controller.settings.ComponentGroupController;
import com.ua.crow.plm.controller.settings.ItemTypeNameMappingController;
import com.ua.crow.plm.dto.base.*;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.toolbar.GridToolbar;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = MasterDataView.ROUTE, layout = MainLayout.class)
@PageTitle("Mastering data")
@PermitAll
public class MasterDataView extends VerticalLayout {
    public static final String ROUTE = "settings/masterdata";

    public MasterDataView(BomItemPropertyTypeController typeController,
                          BomItemPropertyTypeGroupController groupController,
                          ComponentGroupController componentGroupController,
                          ItemTypeNameMappingController mappingController) {
        TabSheet tabs = new TabSheet();
        tabs.add("Property Types", createPropertyTypeTab(typeController));
        tabs.add("Property Type Groups", createPropertyTypeGroupTab(groupController));
        tabs.add("Component Groups", createComponentGroupTab(componentGroupController));
        tabs.add("Item Type Mapping", createItemTypeMappingTab(mappingController));
        add(tabs);
        tabs.setSizeFull();
        setSizeFull();
    }

    private Component createPropertyTypeTab(BomItemPropertyTypeController controller) {
        Grid<BomItemPropertyTypeDto> grid = new Grid<>(BomItemPropertyTypeDto.class, false);
        grid.addColumn(BomItemPropertyTypeDto::getId).setHeader("ID");
        grid.addColumn(BomItemPropertyTypeDto::getName).setHeader("Name");
        grid.addColumn(BomItemPropertyTypeDto::getUkrName).setHeader("Ukr Name");
        grid.setItems(controller.getAll());
        GridToolbar toolbar = createToolbar();
        toolbar.setAddHandler(b -> openPropertyTypeDialog(controller, grid, null));
        toolbar.setEditHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> openPropertyTypeDialog(controller, grid, dto)));
        toolbar.setDeleteHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> {controller.delete(dto.getId()); grid.setItems(controller.getAll());}));
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());
        VerticalLayout layout = new VerticalLayout(toolbar, grid);
        layout.setFlexGrow(1, grid);
        return layout;
    }

    private void openPropertyTypeDialog(BomItemPropertyTypeController controller, Grid<BomItemPropertyTypeDto> grid, BomItemPropertyTypeDto dto) {
        BomItemPropertyTypeForm form = new BomItemPropertyTypeForm();
        Dialog dialog = createDialog(form, () -> {
            BomItemPropertyTypeDto toSave = new BomItemPropertyTypeDto();
            toSave.setName(form.name.getValue());
            toSave.setUkrName(form.ukrName.getValue());
            if (dto != null) {
                toSave.setId(dto.getId());
                controller.update(dto.getId(), toSave);
            } else {
                controller.create(toSave);
            }
            grid.setItems(controller.getAll());
        });
        if (dto != null) {
            form.name.setValue(dto.getName());
            form.ukrName.setValue(dto.getUkrName());
        }
        dialog.open();
    }

    private Component createPropertyTypeGroupTab(BomItemPropertyTypeGroupController controller) {
        Grid<BomItemPropertyTypeGroupDto> grid = new Grid<>(BomItemPropertyTypeGroupDto.class, false);
        grid.addColumn(BomItemPropertyTypeGroupDto::getId).setHeader("ID");
        grid.addColumn(BomItemPropertyTypeGroupDto::getName).setHeader("Name");
        grid.addColumn(BomItemPropertyTypeGroupDto::getUkrName).setHeader("Ukr Name");
        grid.setItems(controller.getAll());
        GridToolbar toolbar = createToolbar();
        toolbar.setAddHandler(b -> openPropertyTypeGroupDialog(controller, grid, null));
        toolbar.setEditHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> openPropertyTypeGroupDialog(controller, grid, dto)));
        toolbar.setDeleteHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> {controller.delete(dto.getId()); grid.setItems(controller.getAll());}));
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());
        VerticalLayout layout = new VerticalLayout(toolbar, grid);
        layout.setFlexGrow(1, grid);
        return layout;
    }

    private void openPropertyTypeGroupDialog(BomItemPropertyTypeGroupController controller, Grid<BomItemPropertyTypeGroupDto> grid, BomItemPropertyTypeGroupDto dto) {
        BomItemPropertyTypeGroupForm form = new BomItemPropertyTypeGroupForm();
        Dialog dialog = createDialog(form, () -> {
            BomItemPropertyTypeGroupDto toSave = new BomItemPropertyTypeGroupDto();
            toSave.setName(form.name.getValue());
            toSave.setUkrName(form.ukrName.getValue());
            if (dto != null) {
                toSave.setId(dto.getId());
                controller.update(dto.getId(), toSave);
            } else {
                controller.create(toSave);
            }
            grid.setItems(controller.getAll());
        });
        if (dto != null) {
            form.name.setValue(dto.getName());
            form.ukrName.setValue(dto.getUkrName());
        }
        dialog.open();
    }

    private Component createComponentGroupTab(ComponentGroupController controller) {
        Grid<ComponentGroupDto> grid = new Grid<>(ComponentGroupDto.class, false);
        grid.addColumn(ComponentGroupDto::getId).setHeader("ID");
        grid.addColumn(ComponentGroupDto::getName).setHeader("Name");
        grid.addColumn(ComponentGroupDto::getUkrName).setHeader("Ukr Name");
        grid.setItems(controller.getAll());
        GridToolbar toolbar = createToolbar();
        toolbar.setAddHandler(b -> openComponentGroupDialog(controller, grid, null));
        toolbar.setEditHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> openComponentGroupDialog(controller, grid, dto)));
        toolbar.setDeleteHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> {controller.delete(dto.getId()); grid.setItems(controller.getAll());}));
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());
        VerticalLayout layout = new VerticalLayout(toolbar, grid);
        layout.setFlexGrow(1, grid);
        return layout;
    }

    private void openComponentGroupDialog(ComponentGroupController controller, Grid<ComponentGroupDto> grid, ComponentGroupDto dto) {
        ComponentGroupForm form = new ComponentGroupForm();
        Dialog dialog = createDialog(form, () -> {
            ComponentGroupDto toSave = new ComponentGroupDto();
            toSave.setName(form.name.getValue());
            toSave.setUkrName(form.ukrName.getValue());
            if (dto != null) {
                toSave.setId(dto.getId());
                controller.update(dto.getId(), toSave);
            } else {
                controller.create(toSave);
            }
            grid.setItems(controller.getAll());
        });
        if (dto != null) {
            form.name.setValue(dto.getName());
            form.ukrName.setValue(dto.getUkrName());
        }
        dialog.open();
    }

    private Component createItemTypeMappingTab(ItemTypeNameMappingController controller) {
        Grid<ItemTypeNameMappingDto> grid = new Grid<>(ItemTypeNameMappingDto.class, false);
        grid.addColumn(ItemTypeNameMappingDto::getId).setHeader("ID");
        grid.addColumn(ItemTypeNameMappingDto::getName).setHeader("Name");
        grid.addColumn(ItemTypeNameMappingDto::getType).setHeader("Type");
        grid.setItems(controller.getAll());
        GridToolbar toolbar = createToolbar();
        toolbar.setAddHandler(b -> openItemTypeMappingDialog(controller, grid, null));
        toolbar.setEditHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> openItemTypeMappingDialog(controller, grid, dto)));
        toolbar.setDeleteHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(dto -> {controller.delete(dto.getId()); grid.setItems(controller.getAll());}));
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());
        VerticalLayout layout = new VerticalLayout(toolbar, grid);
        layout.setFlexGrow(1, grid);

        return layout;
    }

    private void openItemTypeMappingDialog(ItemTypeNameMappingController controller, Grid<ItemTypeNameMappingDto> grid, ItemTypeNameMappingDto dto) {
        ItemTypeNameMappingForm form = new ItemTypeNameMappingForm();
        Dialog dialog = createDialog(form, () -> {
            ItemTypeNameMappingDto toSave = new ItemTypeNameMappingDto();
            toSave.setName(form.name.getValue());
            toSave.setType(form.getType());
            if (dto != null) {
                toSave.setId(dto.getId());
                controller.update(dto.getId(), toSave);
            } else {
                controller.create(toSave);
            }
            grid.setItems(controller.getAll());
        });
        if (dto != null) {
            form.name.setValue(dto.getName());
            form.setType(dto.getType());
        }
        dialog.open();
    }

    private GridToolbar createToolbar() {
        GridToolbar toolbar = new GridToolbar(true, true, true, false);
        toolbar.addButtonStateHandler("EDIT", b -> b.setEnabled(false));
        toolbar.addButtonStateHandler("DELETE", b -> b.setEnabled(false));
        return toolbar;
    }

    private Dialog createDialog(NamedEntityForm form, Runnable saveHandler) {
        Dialog dialog = new Dialog();
        Button save = new Button("Save", e -> { saveHandler.run(); dialog.close(); });
        Button cancel = new Button("Cancel", e -> dialog.close());
        dialog.add(form, new com.vaadin.flow.component.orderedlayout.HorizontalLayout(save, cancel));
        return dialog;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/ItemTypeNameMappingForm.java =====
package com.ua.crow.views.components.settings;

import com.ua.crow.plm.database.ItemTypes;
import com.vaadin.flow.component.combobox.ComboBox;

public class ItemTypeNameMappingForm extends NamedEntityForm {
    private final ComboBox<ItemTypes> type = new ComboBox<>("Type");

    public ItemTypeNameMappingForm() {
        super();
        type.setItems(ItemTypes.values());
        add(type);
    }

    public ItemTypes getType() {
        return type.getValue();
    }

    public void setType(ItemTypes t) {
        type.setValue(t);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/ComponentGroupForm.java =====
package com.ua.crow.views.components.settings;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.NumberField;

public class ComponentGroupForm extends NamedEntityForm {
    private final NumberField parentId = new NumberField("Parent ID");

    public ComponentGroupForm() {
        super();
        add(parentId);
        parentId.setStep(1);
    }

    public Long getParentId() {
        return parentId.getValue() != null ? parentId.getValue().longValue() : null;
    }

    public void setParentId(Long val) {
        if (val == null) {
            parentId.clear();
        } else {
            parentId.setValue(val.doubleValue());
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/BomItemPropertyTypeForm.java =====
package com.ua.crow.views.components.settings;

public class BomItemPropertyTypeForm extends NamedEntityForm {
    public BomItemPropertyTypeForm() {
        super();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/NamedEntityForm.java =====
package com.ua.crow.views.components.settings;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;

public class NamedEntityForm extends FormLayout {
    protected final TextField name = new TextField("Name");
    protected final TextField ukrName = new TextField("Ukrainian Name");

    public NamedEntityForm() {
        add(name, ukrName);
    }

    public void clear() {
        name.clear();
        ukrName.clear();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/UserForm.java =====
package com.ua.crow.views.components.settings;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

public class UserForm extends FormLayout {
    TextField username = new TextField("Username");
    TextField name = new TextField("Name");
    PasswordField password = new PasswordField("Password");
    Checkbox enabled = new Checkbox("Enabled");

    public UserForm() {
        add(username, name, password, enabled);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/settings/BomItemPropertyTypeGroupForm.java =====
package com.ua.crow.views.components.settings;

public class BomItemPropertyTypeGroupForm extends NamedEntityForm {
    public BomItemPropertyTypeGroupForm() {
        super();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/Badge.java =====
package com.ua.crow.views.components;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.html.Span;
public class Badge extends Span {

    public enum BadgeTypeEnum {
        PRIMARY, SUCCESS, ERROR, CONTRAST, NORMAL
    }

    public Badge(String text, BadgeTypeEnum type, VaadinIcon vaadinIcon) {
        getElement().getThemeList().add("badge " + type.name().toLowerCase());
        getStyle().set("padding", "var(--lumo-space-xs)");

        if (vaadinIcon != null) {
            Icon icon = createIcon(vaadinIcon, text != null ? text : "");
            add(icon);
        }

        if (text != null && !text.isEmpty()) {
            Span label = new Span(text);
            label.getStyle().set("padding-left", "var(--lumo-space-xs)");
            add(label);
        }
    }

    private Icon createIcon(VaadinIcon vaadinIcon, String label) {
        Icon icon = vaadinIcon.create();
        icon.getStyle().set("padding", "var(--lumo-space-xs)");
        icon.getElement().setAttribute("aria-label", label);
        icon.getElement().setAttribute("title", label);
        return icon;
    }

    public Badge(String text, BadgeTypeEnum type) {
        this(text, type, null);
    }

    public static Badge confirmedBadge(String text) {
        return new Badge(text, BadgeTypeEnum.SUCCESS, VaadinIcon.CHECK);
    }

    public static Badge cancelledBadge(String text) {
        return new Badge(text, BadgeTypeEnum.ERROR, VaadinIcon.CLOSE_SMALL);
    }

    public static Badge pendingBadge(String text) {
        return new Badge(text, BadgeTypeEnum.PRIMARY, null);
    }

    public static Badge contrastBadge(String text) {
        return new Badge(text, BadgeTypeEnum.CONTRAST, null);
    }

    public static Badge normalBadge(String text) {
        return new Badge(text, BadgeTypeEnum.NORMAL, null);
    }

    public static Badge addedItemsBadge(String text) {
        return new Badge(text, BadgeTypeEnum.SUCCESS, VaadinIcon.PLUS);
    }

    public static Badge removedItemsBadge(String text) {
        return new Badge(text, BadgeTypeEnum.ERROR, VaadinIcon.MINUS);
    }

    public static Badge modifiedItemsBadge(String text) {
        return new Badge(text, BadgeTypeEnum.CONTRAST, VaadinIcon.EDIT);
    }
}


// ===== File: crow/src/main/java/com/ua/crow/views/components/toolbar/ButtonKeys.java =====
package com.ua.crow.views.components.toolbar;

/**
 * String constants identifying common toolbar buttons.
 */
public final class ButtonKeys {
    private ButtonKeys() {}

    public static final String ADD = "add";
    public static final String EDIT = "edit";
    public static final String DELETE = "delete";
    public static final String REFRESH = "refresh";

    public static final String EXPAND_ALL = "expandAll";
    public static final String COLLAPSE_ALL = "collapseAll";
    public static final String COMPONENT = "component";
    public static final String CONVERT = "convert";
    public static final String SAVE = "save";
    public static final String CANCEL = "cancel";
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/toolbar/GridToolbar.java =====
package com.ua.crow.views.components.toolbar;

import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.theme.lumo.LumoIcon;

import static com.ua.crow.views.components.toolbar.ButtonKeys.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class GridToolbar extends MenuBar {
    private MenuItem addButton;
    private MenuItem editButton;
    private MenuItem deleteButton;
    private MenuItem refreshButton;
    private final Map<String, MenuItem> customButtons = new HashMap<>();
    private final Map<String, List<Consumer<MenuItem>>> buttonStateHandlers = new HashMap<>();


    public GridToolbar(boolean add, boolean edit, boolean delete, boolean refresh) {
        setWidthFull();
        setHeight("50px");
        addClassName("grid-toolbar");

        if (add) {
            addButton = createItem("Add", LumoIcon.PLUS.create());
        }
        if (edit) {
            editButton = createItem("Edit", LumoIcon.EDIT.create());
        }
        if (delete) {
            deleteButton = createItem("Delete", LumoIcon.CROSS.create());
        }
        if (refresh) {
            refreshButton = createItem("Refresh", LumoIcon.REDO.create());
        }
    }

    private MenuItem createItem(String label, Icon icon) {
        MenuItem item = addItem(shortenLabel(label));
        item.addComponentAsFirst(icon);
        return item;
    }

    private String shortenLabel(String label) {
        int spaceIdx = label.indexOf(' ');
        return spaceIdx > 0 ? label.substring(0, spaceIdx) : label;
    }

    public void setAddHandler(Consumer<MenuItem> handler) {
        setButtonHandler(addButton, handler);
    }

    public void setEditHandler(Consumer<MenuItem> handler) {
        setButtonHandler(editButton, handler);
    }

    public void setDeleteHandler(Consumer<MenuItem> handler) {
        setButtonHandler(deleteButton, handler);
    }

    public void setRefreshHandler(Consumer<MenuItem> handler) {
        setButtonHandler(refreshButton, handler);
    }

    private void setButtonHandler(MenuItem button, Consumer<MenuItem> handler) {
        if (button != null) {
            button.addClickListener(event -> handler.accept(button));
        }
    }

    public MenuItem addCustomButton(String key, String label, Icon icon, Consumer<MenuItem> handler) {
        MenuItem button = createItem(label, icon);
        button.addClickListener(e -> handler.accept(button));
        customButtons.put(key, button);
        return button;
    }

    public void setButtonVisibility(String key, boolean visible) {
        MenuItem button = customButtons.get(key);
        if (button != null) {
            button.setVisible(visible);
        }
    }

    public void setButtonEnabled(String key, boolean enabled) {
        MenuItem button = customButtons.get(key);
        if (button != null) {
            button.setEnabled(enabled);
        }
    }

    /**
     * Enables or disables one of the default toolbar buttons by key.
     * Supported keys are defined in {@link ButtonKeys}.
     */
    public void setDefaultButtonEnabled(String key, boolean enabled) {
        MenuItem target = getButtonByKey(key);
        if (target != null) {
            target.setEnabled(enabled);
        }
    }

    /**
     * Registers a handler that will be invoked when {@link #refreshButtonsStates()} is called.
     * The handler receives a reference to the button identified by {@code key}.
     *
     * @param key      identifier of the button (use constants from {@link ButtonKeys} or custom key)
     * @param handler  handler to invoke for the button
     */
    public void addButtonStateHandler(String key, Consumer<MenuItem> handler) {
        buttonStateHandlers.computeIfAbsent(key, k -> new ArrayList<>()).add(handler);
    }

    /**
     * Invokes all registered state handlers for their respective buttons.
     * Missing buttons are ignored.
     */
    public void refreshButtonsStates() {
        buttonStateHandlers.forEach((key, handlers) -> {
            MenuItem btn = getButtonByKey(key);
            if (btn != null) {
                handlers.forEach(h -> h.accept(btn));
            }
        });
    }

    private MenuItem getButtonByKey(String key) {
        return switch (key) {
            case ADD -> addButton;
            case EDIT -> editButton;
            case DELETE -> deleteButton;
            case REFRESH -> refreshButton;
            default -> customButtons.get(key);
        };
    }

    public void addSpacer() {
        MenuItem spacer = addItem("");
        spacer.getElement().getStyle().set("flexGrow", "1");
        spacer.setEnabled(false);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/toolbar/TreeGridToolbar.java =====
package com.ua.crow.views.components.toolbar;

import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.theme.lumo.LumoIcon;

import java.util.Collection;
import java.util.List;

import static com.ua.crow.views.components.toolbar.ButtonKeys.*;

/**
 * Toolbar for {@link TreeGrid} components. Provides expand and collapse buttons
 * in addition to the standard toolbar functionality.
 */
public class TreeGridToolbar extends GridToolbar {

    public TreeGridToolbar(boolean add, boolean edit, boolean delete, boolean refresh) {
        super(add, edit, delete, refresh);
    }

    /**
     * Adds expand/collapse management for the provided {@link TreeGrid}. Two
     * additional buttons "Expand All" and "Collapse All" are appended and will
     * operate on the currently selected node. The buttons are disabled when no
     * selection exists.
     *
     * @param grid the {@link TreeGrid} instance to manage
     * @param <T>  grid item type
     */
    public <T> void manageTreeGrid(TreeGrid<T> grid) {
        addCustomButton(EXPAND_ALL, "Expand All", LumoIcon.ANGLE_DOWN.create(),
                btn -> adjustTreeGrid(grid, true));
        addCustomButton(COLLAPSE_ALL, "Collapse All", LumoIcon.ANGLE_RIGHT.create(),
                btn -> adjustTreeGrid(grid, false));

        addButtonStateHandler(EXPAND_ALL,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        addButtonStateHandler(COLLAPSE_ALL,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        grid.addSelectionListener(e -> refreshButtonsStates());
        refreshButtonsStates();
    }

    private static <T> void adjustTreeGrid(TreeGrid<T> grid, boolean expand) {
        T selected = grid.asSingleSelect().getValue();
        Collection<T> targets = selected != null
                ? List.of(selected)
                : grid.getTreeData().getRootItems();

        if (expand) {
            grid.expandRecursively(targets, Integer.MAX_VALUE);
        } else {
            grid.collapseRecursively(targets, Integer.MAX_VALUE);
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/Online3DViewer.java =====
package com.ua.crow.views.components;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;

@Tag("div")
@JsModule("./online-viewer.ts")
@NpmPackage(value = "online-3d-viewer", version = "^0.16.0")
public class Online3DViewer extends Div {

    private String modelUrl;

    public Online3DViewer() {
        setId("online_3d_viewer");
        setSizeFull();
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        getElement().executeJs("window.initViewer($0)", getElement());
        if (modelUrl != null) {
            getElement().executeJs("window.updateViewer($0)", modelUrl);
        }
    }

    public void loadModel(String url) {
        if (url == null) {
            return;
        }
        this.modelUrl = url;
        if (isAttached()) {
            getElement().executeJs("window.updateViewer($0)", url);
        }
    }

    public void highlightComponent(String path) {
        if (isAttached()) {
            getElement().executeJs("window.highlightComponent($0)", path);
        }
    }
}


// ===== File: crow/src/main/java/com/ua/crow/views/components/itemtype/ItemTypeComponent.java =====
package com.ua.crow.views.components.itemtype;

import com.ua.crow.plm.database.ItemTypes;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import java.util.EnumMap;
import java.util.Map;

public class ItemTypeComponent extends HorizontalLayout {

    private static final Map<ItemTypes, String> ICONS = new EnumMap<>(ItemTypes.class);
    static {
        ICONS.put(ItemTypes.COMPONENT, "Component icon.jpg");
        ICONS.put(ItemTypes.PART, "Part icon.jpg");
        ICONS.put(ItemTypes.BOM, "BomIcon copy.jpg");
        ICONS.put(ItemTypes.FASTENER, "Nut icon copy.jpg");
        ICONS.put(ItemTypes.THRDPARTY, "3rd-partyicon.jpg");
        ICONS.put(ItemTypes.NONE, "nonetype icon.jpg");
    }

    public ItemTypeComponent(ItemTypes type) {
        setSpacing(true);
        setPadding(false);
        if (type == null) {
            return;
        }
        String path = "images/componenttypes/" + ICONS.getOrDefault(type, "nonetype icon.jpg");
        Image icon = new Image(path, type.name());
        icon.setWidth("20px");
        icon.setHeight("20px");
        Span label = new Span(UI.getCurrent().getTranslation("itemType." + type.name().toLowerCase()));
        add(icon, label);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/itemtype/ItemTypeSelect.java =====
package com.ua.crow.views.components.itemtype;

import com.ua.crow.plm.database.ItemTypes;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.data.renderer.ComponentRenderer;

public class ItemTypeSelect extends ComboBox<ItemTypes> {

    public ItemTypeSelect() {
        setItems(ItemTypes.values());
        setItemLabelGenerator(type -> UI.getCurrent().getTranslation("itemType." + type.name().toLowerCase()));
        setRenderer(new ComponentRenderer<>(ItemTypeComponent::new));
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/product/grids/ProjectListGrid.java =====
package com.ua.crow.views.components.product.grids;

import com.flowingcode.vaadin.addons.gridhelpers.GridHelper;
import com.ua.crow.plm.controller.ProductController;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.data.provider.CallbackDataProvider;

public class ProjectListGrid extends Grid<ProductActiveReleaseDto> {
    private final ProductController controller;
    public ProjectListGrid(ProductController controller) {
        super(ProductActiveReleaseDto.class);
        this.controller = controller;
        removeAllColumns();
        addColumn(ProductActiveReleaseDto::getId).setHeader("ID");
        addColumn(ProductActiveReleaseDto::getName).setHeader("Name");
        addColumn(ProductActiveReleaseDto::getUkrName).setHeader("Ukrainian Name");
        addColumn(ProductActiveReleaseDto::getCreator).setHeader("Creator");
        addColumn(ProductActiveReleaseDto::getModifier).setHeader("Modifier");
        addColumn(ProductActiveReleaseDto::getCreatedAt).setHeader("Created At");
        addColumn(ProductActiveReleaseDto::getModifiedAt).setHeader("Modified At");
        GridHelper.setSelectOnClick(this, true);
        setSelectionMode(SelectionMode.SINGLE);
        GridHelper.setSelectionColumnHidden(this, true);
        setDataProvider(new CallbackDataProvider<>(
                query -> controller.getAllProducts().stream()
                        .skip(query.getOffset())
                        .limit(query.getLimit()),
                query -> controller.getAllProducts().size()
        ));
    }
    public void refresh() {
        getDataProvider().refreshAll();
    }
}


// ===== File: crow/src/main/java/com/ua/crow/views/components/product/items/ProductForm.java =====
package com.ua.crow.views.components.product.items;

import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ProductForm extends FormLayout {

    private final TextField name = new TextField("Name");
    private final TextField ukrName = new TextField("Ukrainian Name");
    private final TextField thumbnailUrl = new TextField("Thumbnail URL");

    public ProductForm() {
        add(name, ukrName, thumbnailUrl);
    }

    public void setProduct(ProductActiveReleaseDto productDto) {
        name.setValue(productDto.getName() != null ? productDto.getName() : "");
        ukrName.setValue(productDto.getUkrName() != null ? productDto.getUkrName() : "");
        thumbnailUrl.setValue(productDto.getThumbnailUrl() != null ? productDto.getThumbnailUrl() : "");
    }

    public ProductActiveReleaseDto getProductDto() {
        ProductActiveReleaseDto p = new ProductActiveReleaseDto();
        p.setName(name.getValue().trim());
        p.setUkrName(ukrName.getValue().trim());
        p.setThumbnailUrl("".equals(thumbnailUrl.getValue().trim())?null:thumbnailUrl.getValue().trim());
        return p;

    }

    public void clear() {
        name.clear();
        ukrName.clear();
        thumbnailUrl.clear();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/product/items/ProductCreatePopup.java =====
package com.ua.crow.views.components.product.items;

import com.ua.crow.plm.controller.ProductController;
import com.ua.crow.plm.dto.active.ProductActiveReleaseDto;
import com.vaadin.componentfactory.EnhancedDialog;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.notification.Notification;


public class ProductCreatePopup extends Dialog {

    private final ProductForm productForm;
    private final ProductController productController;

    public ProductCreatePopup(ProductController productController) {
        super();
        this.productController = productController;
        this.productForm = new ProductForm();
        initLayout();
    }

    private void initLayout() {
        setWidth("400px");
        setHeight("auto");
        setCloseOnEsc(true);
        setCloseOnOutsideClick(true);
        setModal(true);
        setDraggable(true);
        Button saveButton = new Button("Save", e -> save());
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button cancelButton = new Button("Cancel", e -> close());

        HorizontalLayout footer = new HorizontalLayout(saveButton, cancelButton);
        footer.setJustifyContentMode(FlexComponent.JustifyContentMode.END);

        getHeader().add(new Span("Create New Product"));

        add(productForm);
        getFooter().add(footer);
    }

    @Override
    public void open() {
        productForm.clear();
        super.open();
    }

    private void save() {
        ProductActiveReleaseDto productDto = productForm.getProductDto();

        if (productDto.getName().isEmpty()) {
            Notification.show("Name is required!", 3000, Notification.Position.TOP_CENTER);
            return;
        }

        productController.createProduct(productDto);
        Notification.show("Product saved successfully.", 2000, Notification.Position.TOP_CENTER);
        close();
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/product/views/ProductsListView.java =====
package com.ua.crow.views.components.product.views;

import com.ua.crow.plm.controller.ProductController;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.product.grids.ProjectListGrid;
import com.ua.crow.views.components.product.items.ProductCreatePopup;
import com.ua.crow.views.components.toolbar.GridToolbar;
import com.ua.crow.views.service.HistoryEntry;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

import static com.ua.crow.views.components.toolbar.ButtonKeys.DELETE;
import static com.ua.crow.views.components.toolbar.ButtonKeys.EDIT;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Products")
@PermitAll
public class ProductsListView extends RndWorkspaceRestrictedView implements BeforeEnterObserver , NavigationContextAware {
    private final ProductController productController;
    private final ProjectListGrid grid;
    private final GridToolbar toolbar;
    private final ProductCreatePopup productCreatePopup;

    private final NavigationHistoryService historyService;

    public ProductsListView(ProductController productController, NavigationHistoryService historyService) {
        this.productController = productController;
        productCreatePopup = new ProductCreatePopup(productController);
        grid = new ProjectListGrid(productController);
        this.historyService = historyService;
        toolbar = createToolbar();
        grid.addItemDoubleClickListener(event -> {
            Long id = event.getItem().getId(); // Предполагаем, что ProductDto имеет getId()
            UI.getCurrent().navigate("product/" + id);
        });
        setSizeFull();
        add(toolbar, grid);
        setFlexGrow(1, grid);
    }

    private GridToolbar createToolbar() {
        GridToolbar toolbar = new GridToolbar(true,true,true,true);
        toolbar.setRefreshHandler(b->grid.refresh());
        toolbar.setAddHandler(b->productCreatePopup.open());
        toolbar.setEditHandler((b) -> {/* Implement edit logic */});
        toolbar.setDeleteHandler((b) -> {/* Implement delete logic */});
        toolbar.addButtonStateHandler(EDIT,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        toolbar.addButtonStateHandler(DELETE,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());

        return toolbar;
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Очищаем старую структуру и создаём новый корень контекста
        historyService.clear();
        addToHistory();
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<?> getCurrentContext() {
        return new HistoryEntry<>(ProductsListView.class,
                "Products",
                "",
                null,
                () -> null);

    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/product/views/ProductPage.java =====
package com.ua.crow.views.components.product.views;

import com.ua.crow.plm.controller.ProductController;
import com.ua.crow.plm.dto.base.ProductDto;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.navigation.BreadcrumbBar;
import com.ua.crow.views.service.HistoryEntry;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.vaadin.flow.router.*;
import jakarta.annotation.security.PermitAll;

@Route(value = ProductPage.ROUTE, layout = MainLayout.class)
@PermitAll
public class ProductPage extends RndWorkspaceRestrictedView implements BeforeEnterObserver, NavigationContextAware {

    public static final String ROUTE = "product/:productId";
    public static final String PRODUCT_ROUTE_PREFIX = "product/";

    private final ProductController productController;
    private final BreadcrumbBar breadcrumbBar;
    private final NavigationHistoryService historyService;
    private Long productId;
    private ProductDto product;

    public ProductPage(ProductController productController, NavigationHistoryService historyService) {
        this.productController = productController;
        this.historyService = historyService;
        this.breadcrumbBar = new BreadcrumbBar(historyService);
        add(breadcrumbBar);
        setSizeFull();
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<ProductDto> getCurrentContext() {
        return new HistoryEntry<>(ProductPage.class,
                product.getName(),
                PRODUCT_ROUTE_PREFIX + product.getId(),
                product, ()-> productController.getProductById(product.getId()).orElseThrow());
    }
    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        productId = event.getRouteParameters()
                .get("productId")
                .map(Long::parseLong)
                .orElse(null);

        if (productId == null) {
            event.rerouteTo("not-found");
            return;
        }

        try {
            product = productController.getProductById(productId).orElseThrow();
            addToHistory();
        } catch (Exception e) {
            event.rerouteTo("not-found");
            return;
        }

        breadcrumbBar.refresh();
        add(new H2("Product: " + product.getName()));
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/bomitem/FusionComponentPanel.java =====
package com.ua.crow.views.components.fusionbom.bomitem;

import com.ua.crow.plm.dto.fusion.Body;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.editor.Editor;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.ua.crow.views.components.toolbar.GridToolbar;
import static com.ua.crow.views.components.toolbar.ButtonKeys.*;

import java.util.List;
import java.util.Set;

public class FusionComponentPanel extends VerticalLayout {

    private final boolean enableCrud;
    private GridToolbar toolbar;
    private final Binder<Body> binder = new Binder<>(Body.class);
    private final Editor<Body> editor;
    private ListDataProvider<Body> dataProvider;

    private final TextField partName = new TextField("Part Name");
    private final TextField partNumber = new TextField("Part Number");
    private final TextArea description = new TextArea("Description");
    private final TextField sourceFile = new TextField("Source File");
    private final TextField path = new TextField("Path");

    private final Grid<Body> bodyGrid = new Grid<>();

    public FusionComponentPanel() {
        this(false);
    }

    public FusionComponentPanel(boolean enableCrud) {
        this.enableCrud = enableCrud;
        this.editor = bodyGrid.getEditor();

        setWidthFull();
        partNumber.setReadOnly(true);
        sourceFile.setReadOnly(true);
        path.setReadOnly(true);

        FlexLayout fieldsLayout = new FlexLayout();
        fieldsLayout.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        fieldsLayout.setWidthFull();
        fieldsLayout.setAlignItems(Alignment.END);
        fieldsLayout.setJustifyContentMode(JustifyContentMode.START);
        fieldsLayout.getStyle().set("gap", "10px");
        fieldsLayout.add(partName, partNumber, description, sourceFile, path);

        add(fieldsLayout);

        if (enableCrud) {
            toolbar = new GridToolbar(true, true, true, false);
            add(toolbar);
            configureToolbar();
        }

        add(bodyGrid);
        setupBodyGrid();
    }

    private void setupBodyGrid() {
        bodyGrid.setWidthFull();
        // Use a mutable collection as ListDataProvider modifies the backing list
        dataProvider = new ListDataProvider<>(new java.util.ArrayList<>());
        bodyGrid.setDataProvider(dataProvider);

        var nameCol = bodyGrid.addColumn(Body::getBodyName).setHeader("Body Name");
        var descCol = bodyGrid.addColumn(Body::getDescription).setHeader("Description");
        bodyGrid.addColumn(Body::getWidthMm).setHeader("Width (mm)");
        bodyGrid.addColumn(Body::getLengthMm).setHeader("Length (mm)");
        bodyGrid.addColumn(Body::getHeightMm).setHeader("Height (mm)");
        bodyGrid.addColumn(Body::getVolumeCm3).setHeader("Volume (cm³)");
        bodyGrid.addColumn(Body::getAreaCm2).setHeader("Area (cm²)");
        bodyGrid.addColumn(Body::getMassKg).setHeader("Mass (kg)");
        bodyGrid.addColumn(b -> b.getMaterial() != null ? b.getMaterial().getName() : "").setHeader("Material");

        if (enableCrud) {
            editor.setBinder(binder);
            editor.setBuffered(true);

            TextField nameField = new TextField();
            binder.forField(nameField).bind(Body::getBodyName, Body::setBodyName);
            nameCol.setEditorComponent(nameField);

            TextField descField = new TextField();
            binder.forField(descField).bind(Body::getDescription, Body::setDescription);
            descCol.setEditorComponent(descField);

            bodyGrid.addItemDoubleClickListener(e -> {
                if (editor.isOpen()) {
                    editor.cancel();
                }
                editor.editItem(e.getItem());
            });
        }
    }

    private void configureToolbar() {
        toolbar.setAddHandler(b -> {
            Body body = new Body();
            dataProvider.getItems().add(body);
            dataProvider.refreshAll();
            bodyGrid.select(body);
            editor.editItem(body);
        });

        toolbar.setEditHandler(b -> {
            Body selected = bodyGrid.asSingleSelect().getValue();
            if (selected != null) {
                editor.editItem(selected);
            }
        });

        toolbar.setDeleteHandler(b -> {
            Body selected = bodyGrid.asSingleSelect().getValue();
            if (selected != null) {
                editor.cancel();
                dataProvider.getItems().remove(selected);
                dataProvider.refreshAll();
            }
        });

        toolbar.addButtonStateHandler(EDIT,
                btn -> btn.setEnabled(!bodyGrid.getSelectedItems().isEmpty()));
        toolbar.addButtonStateHandler(DELETE,
                btn -> btn.setEnabled(!bodyGrid.getSelectedItems().isEmpty()));
        bodyGrid.addSelectionListener(e -> toolbar.refreshButtonsStates());
    }

    public void setComponent(FusionComponentDto componentDto) {
        partName.setValue(componentDto.getPartName() != null ? componentDto.getPartName() : "");
        partNumber.setValue(componentDto.getPartNumber() != null ? componentDto.getPartNumber() : "");
        description.setValue(componentDto.getDescription() != null ? componentDto.getDescription() : "");
        sourceFile.setValue(componentDto.getSourceFile() != null ? componentDto.getSourceFile() : "");
        path.setValue(componentDto.getPath() != null ? componentDto.getPath() : "");
        List<Body> bodies = componentDto.getBodies() == null ? List.of() : List.copyOf(componentDto.getBodies());
        dataProvider.getItems().clear();
        dataProvider.getItems().addAll(bodies);
        dataProvider.refreshAll();
    }

    public FusionComponentDto getUpdatedComponent(FusionComponentDto original) {
        original.setPartName(partName.getValue());
        original.setDescription(description.getValue());
        if (enableCrud) {
            original.setBodies(Set.copyOf(dataProvider.getItems()));
        }
        // partNumber, sourceFile, and path remain unchanged due to readonly.
        return original;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/bomitem/ComponentView.java =====
package com.ua.crow.views.components.fusionbom.bomitem;

import com.ua.crow.plm.controller.fusion.FusionBomItemController;
import com.ua.crow.plm.database.fusion.FusionId;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "comp/:id/compver/:compver", layout = MainLayout.class)
@PageTitle("Component View")
@PermitAll
public class ComponentView extends RndWorkspaceRestrictedView implements BeforeEnterObserver {

    private final FusionBomItemController itemController;

    private String componentId;
    private String componentVersion;

    public ComponentView(FusionBomItemController itemController) {
        this.itemController = itemController;
        setSizeFull();
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        componentId = event.getRouteParameters().get("id").orElse(null);
        componentVersion = event.getRouteParameters().get("compver").orElse(null);
        if (componentId == null || componentVersion == null) {
            event.rerouteTo("not-found");
            return;
        }
        FusionComponentDto component = itemController.readById(componentId, componentVersion,false);
        if (component == null) {
            event.rerouteTo("not-found");
            return;
        }
        removeAll();
        add(new H2("Component: " + component.getPartName()));
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/util/FusionComponentUtils.java =====
package com.ua.crow.views.components.fusionbom.util;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;

import java.lang.reflect.Type;

/**
 * Utility methods for processing Fusion BOM components.
 */
public final class FusionComponentUtils {

    private FusionComponentUtils() {
        // Utility class
    }

    /**
     * Checks if the given component has multiple bodies and the type is either
     * COMPONENT or BOM. Only such components are considered problematic.
     */
    public static boolean hasMultipleBodiesIssue(FusionComponentDto component) {
        if (component == null) {
            return false;
        }
        ItemTypes type = component.getType();
        boolean problematicType = type == ItemTypes.COMPONENT || type == ItemTypes.BOM|| type == ItemTypes.PART;
        return problematicType && component.getBodies() != null && component.getBodies().size() > 1;
    }

    /**
     * Recursively checks if the given component or any of its children have the
     * multiple bodies issue.
     */
    public static boolean containsMultipleBodiesIssue(FusionComponentDto component) {
        if (component == null) {
            return false;
        }
        if (hasMultipleBodiesIssue(component)) {
            return true;
        }
        for (FusionComponentDto child : component.getChildren()) {
            if (containsMultipleBodiesIssue(child)) {
                return true;
            }
        }
        return false;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/merge/MergeGridItem.java =====
package com.ua.crow.views.components.fusionbom.merge;

import com.ua.crow.plm.database.ItemTypes;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Row item combining CAD and Engineering BOM data for merge grid.
 */
@Getter
@Setter
public class MergeGridItem {
    private String cadName;
    private String cadPartNumber;
    private ItemTypes cadType;
    private Double cadQty;

    private String engName;
    private String engPartNumber;
    private ItemTypes engType;
    private Double engQty;
    private int engLevel;

    private boolean toAdd;
    private boolean toDelete;

    private List<MergeGridItem> children = new ArrayList<>();
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/merge/FusionBomMergeView.java =====
package com.ua.crow.views.components.fusionbom.merge;

import com.ua.crow.plm.controller.EngineeringBomController;
import com.ua.crow.plm.controller.fusion.FusionBomController;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.toolbar.TreeGridToolbar;
import com.ua.crow.views.navigation.BreadcrumbBar;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.ua.crow.views.service.HistoryEntry;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.ua.crow.views.components.fusionbom.merge.UiMergeService;
import com.ua.crow.views.components.fusionbom.merge.MergeGridItem;
import com.vaadin.flow.router.*;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * View for comparing and merging Fusion and Engineering BOMs using a single TreeGrid.
 */
@Route(value = FusionBomMergeView.ROUTE, layout = MainLayout.class)
@PageTitle("Merge BOMs")
@PermitAll
public class FusionBomMergeView extends RndWorkspaceRestrictedView implements BeforeEnterObserver, NavigationContextAware {

    public static final String ROUTE = "product/:productId/fusionbom/:fusionId/rev/:revId/merge/:engineeringBomId";

    private final FusionBomController fusionBomController;
    private final EngineeringBomController engineeringBomController;
    private final NavigationHistoryService historyService;
    private final UiMergeService uiMergeService;

    private final MergeTreeGrid treeGrid;
    private final TreeGridToolbar toolbar;
    private final BreadcrumbBar breadcrumbBar;

    private Long productId;
    private String fusionId;
    private String revisionId;
    private Long engineeringBomId;

    @Autowired
    public FusionBomMergeView(FusionBomController fusionBomController,
                              EngineeringBomController engineeringBomController,
                              NavigationHistoryService historyService,
                              UiMergeService uiMergeService) {
        this.fusionBomController = fusionBomController;
        this.engineeringBomController = engineeringBomController;
        this.historyService = historyService;
        this.uiMergeService = uiMergeService;
        this.treeGrid = new MergeTreeGrid();
        this.toolbar = new TreeGridToolbar(false, false, false, true);
        this.breadcrumbBar = new BreadcrumbBar(historyService);

        toolbar.manageTreeGrid(treeGrid);
        toolbar.setRefreshHandler(b -> loadData());

        setSizeFull();
        add(breadcrumbBar, toolbar, treeGrid);
        setFlexGrow(1, treeGrid);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        productId = event.getRouteParameters().get("productId").map(Long::parseLong).orElse(null);
        fusionId = event.getRouteParameters().get("fusionId").orElse(null);
        revisionId = event.getRouteParameters().get("revId").orElse(null);
        engineeringBomId = event.getRouteParameters().get("engineeringBomId").map(Long::parseLong).orElse(null);
        if (fusionId == null || revisionId == null || engineeringBomId == null) {
            event.rerouteTo("not-found");
            return;
        }
        addToHistory();
        loadData();
    }

    private void loadData() {
        FusionBomDto fusion = fusionBomController.getFusionBomTree(fusionId, revisionId, false).orElse(null);
        BomActiveReleaseDto engBom = engineeringBomController.byIdTree(engineeringBomId, 0L).orElse(null);
        if (fusion != null && fusion.getRootPart() != null) {
            MergeGridItem root = uiMergeService.buildGridData(fusion.getRootPart(), engBom);
            treeGrid.setData(root);
        }
        breadcrumbBar.refresh();
        toolbar.refreshButtonsStates();
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<?> getCurrentContext() {
        return new HistoryEntry<>(
                FusionBomMergeView.class,
                "Merge BOMs",
                "product/" + productId + "/fusionbom/" + fusionId + "/rev/" + revisionId + "/merge/" + engineeringBomId,
                null,
                null
        );
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/merge/UiMergeService.java =====
package com.ua.crow.views.components.fusionbom.merge;

import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.dto.active.BomActiveReleaseDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Service preparing data for {@link MergeTreeGrid}.
 */
@Service
public class UiMergeService {

    private static class EngInfo {
        ComponentActiveReleaseDto dto;
        int level;
    }

    public MergeGridItem buildGridData(FusionComponentDto fusionRoot, BomActiveReleaseDto engBom) {
        if (engBom == null) {
            return buildGridData(fusionRoot, Collections.emptyList());
        }
        ComponentActiveReleaseDto root = convertBomToComponent(engBom);
        return buildGridData(fusionRoot, List.of(root));
    }

    public MergeGridItem buildGridData(FusionComponentDto fusionRoot, Collection<ComponentActiveReleaseDto> engRoots) {
        Map<String, EngInfo> engIndex = indexEngineering(engRoots);
        FusionComponentDto rootCopy = fusionRoot.convert(FusionComponentDto.class);
        insertDeletionItems(rootCopy, engRoots);
        return convert(rootCopy, engIndex);
    }

    private MergeGridItem convert(FusionComponentDto cad, Map<String, EngInfo> engIndex) {
        MergeGridItem item = new MergeGridItem();

        boolean cadExists = cad.getFusionId() != null;
        EngInfo info = cad.getPartNumber() == null ? null : engIndex.get(cad.getPartNumber());
        boolean engExists = info != null;

        if (cadExists) {
            item.setCadName(cad.getPartName());
            item.setCadPartNumber(cad.getPartNumber());
            item.setCadType(cad.getType());
            item.setCadQty(cad.getQuantity());
        }

        if (engExists) {
            item.setEngName(info.dto.getName());
            item.setEngPartNumber(info.dto.getPartNumber());
            if (info.dto.getItemType() != null) {
                item.setEngType(ItemTypes.valueOf(info.dto.getItemType()));
            }
            item.setEngQty(info.dto.getQuantity());
            item.setEngLevel(info.level);
        }

        item.setToDelete(!cadExists && engExists);
        item.setToAdd(cadExists && !engExists);

        if (cad.getChildren() != null) {
            for (FusionComponentDto child : cad.getChildren()) {
                item.getChildren().add(convert(child, engIndex));
            }
        }
        return item;
    }

    private ComponentActiveReleaseDto convertBomToComponent(BomActiveReleaseDto bom) {
        ComponentActiveReleaseDto dto = new ComponentActiveReleaseDto();
        dto.setId(bom.getId());
        dto.setName(bom.getName());
        dto.setPartNumber(bom.getPartNumber());
        dto.setItemType(ItemTypes.BOM.name());
        if (bom.getChildren() != null) {
            dto.setParts(new ArrayList<>(bom.getChildren()));
        }
        return dto;
    }

    private Map<String, EngInfo> indexEngineering(Collection<ComponentActiveReleaseDto> roots) {
        Map<String, EngInfo> map = new HashMap<>();
        if (roots == null) return map;
        Deque<Map.Entry<ComponentActiveReleaseDto, Integer>> stack = new ArrayDeque<>();
        for (ComponentActiveReleaseDto r : roots) {
            stack.push(new AbstractMap.SimpleEntry<>(r, 0));
        }
        while (!stack.isEmpty()) {
            Map.Entry<ComponentActiveReleaseDto, Integer> entry = stack.pop();
            ComponentActiveReleaseDto item = entry.getKey();
            int level = entry.getValue();
            if (item.getPartNumber() != null) {
                EngInfo info = new EngInfo();
                info.dto = item;
                info.level = level;
                map.put(item.getPartNumber(), info);
            }
            if (item.getParts() != null) {
                for (ComponentActiveReleaseDto child : item.getParts()) {
                    stack.push(new AbstractMap.SimpleEntry<>(child, level + 1));
                }
            }
        }
        return map;
    }

    private void insertDeletionItems(FusionComponentDto fusionRoot, Collection<ComponentActiveReleaseDto> engRoots) {
        for (ComponentActiveReleaseDto engRoot : engRoots) {
            processChildren(fusionRoot, engRoot.getParts());
        }
    }

    private void processChildren(FusionComponentDto fusionParent, Collection<ComponentActiveReleaseDto> engChildren) {
        if (engChildren == null) return;
        Map<String, FusionComponentDto> childMap = fusionParent.getChildren().stream()
                .filter(f -> f.getPartNumber() != null)
                .collect(Collectors.toMap(FusionComponentDto::getPartNumber, f -> f, (a, b) -> a));
        for (ComponentActiveReleaseDto child : engChildren) {
            if (child.getPartNumber() == null) continue;
            FusionComponentDto match = childMap.get(child.getPartNumber());
            if (match != null) {
                processChildren(match, child.getParts());
            } else {
                FusionComponentDto group = ensureDeleteGroup(fusionParent);
                group.addChild(child.convert(FusionComponentDto.class));
            }
        }
    }

    private FusionComponentDto ensureDeleteGroup(FusionComponentDto parent) {
        for (FusionComponentDto c : parent.getChildren()) {
            if ("items to delete".equalsIgnoreCase(c.getPartName())) {
                return c;
            }
        }
        FusionComponentDto group = new FusionComponentDto();
        group.setPartName("items to delete");
        parent.addChild(group);
        return group;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/merge/MergeTreeGrid.java =====
package com.ua.crow.views.components.fusionbom.merge;

import com.ua.crow.views.components.Badge;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.ua.crow.views.components.itemtype.ItemTypeComponent;

import java.util.Collections;

/**
 * TreeGrid displaying merged CAD and Engineering BOM data.
 */



@StyleSheet("themes/crow/theme-editor.css")
@CssImport("themes/crow/theme-editor.css")
public class MergeTreeGrid extends TreeGrid<MergeGridItem> {

    private static final int NAME_MAX_LENGTH = 20;

    public MergeTreeGrid() {
        super(MergeGridItem.class);
        removeAllColumns();
        setSizeFull();

        addComponentHierarchyColumn(item -> {
            String name = item.getCadName();
            Span span = new Span(trim(name, NAME_MAX_LENGTH));
            span.getElement().setProperty("title", name == null ? "" : name);
            return span;
        })
                .setHeader("CAD Name")
                .setFlexGrow(1)
                .setAutoWidth(true);

        Column<MergeGridItem> column = addColumn(MergeGridItem::getCadPartNumber)
                .setHeader("CAD Part Number")
                .setAutoWidth(true);
        column.setRenderer(new ComponentRenderer<>(c -> {
            if (c.isToDelete()) {
                return Badge.removedItemsBadge(c.getEngPartNumber());
            }
            if (c.isToAdd()) {
                return Badge.addedItemsBadge(c.getCadPartNumber());
            }
            return Badge.confirmedBadge(c.getCadPartNumber());
        }));
        addColumn(new ComponentRenderer<>(comp -> new ItemTypeComponent(comp.getCadType())))
                .setHeader("CAD Type")
                .setAutoWidth(true);

        addColumn(c -> formatQuantity(c.getCadQty()))
                .setHeader("CAD Qty")
                .setAutoWidth(true);

        addColumn(new ComponentRenderer<>(c -> {
            String full = indent(c.getEngName(), c.getEngLevel());
            Span span = new Span(trim(full, NAME_MAX_LENGTH));
            span.getElement().setProperty("title", c.getEngName() == null ? "" : c.getEngName());
            return span;
        })).setHeader("Eng Name").setAutoWidth(true);

        addColumn(c -> indent(c.getEngPartNumber(), c.getEngLevel()))
                .setHeader("Eng Part Number").setAutoWidth(true);

        addColumn(new ComponentRenderer<>(c -> new ItemTypeComponent(c.getEngType())))
                .setHeader("Eng Type").setAutoWidth(true);

        addColumn(c -> formatQuantity(c.getEngQty()))
                .setHeader("Eng Qty").setAutoWidth(true);
    }


    public void setData(MergeGridItem root) {
        setItems(Collections.singletonList(root), MergeGridItem::getChildren);
        expandRecursively(Collections.singletonList(root), 2);
    }

    private String formatQuantity(Double qty) {
        if (qty == null) return "";
        return String.valueOf(qty);
    }

    private String trim(String text, int maxLength) {
        if (text == null) {
            return "";
        }
        String t = text.trim();
        return t.length() > maxLength ? t.substring(0, Math.max(0, maxLength - 3)) + "..." : t;
    }

    private String indent(String text, int level) {
        if (text == null) {
            return "";
        }
        String indent = "\u00A0".repeat(Math.max(0, level) * 2);
        return indent + text;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/edit/FusionComponentTreeGrid.java =====
package com.ua.crow.views.components.fusionbom.edit;

import com.ua.crow.plm.controller.fusion.FusionBomController;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.views.components.fusionbom.util.FusionComponentUtils;
import com.ua.crow.views.components.itemtype.ItemTypeComponent;
import com.ua.crow.views.components.itemtype.ItemTypeSelect;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.dnd.GridDropMode;
import com.vaadin.flow.component.grid.dnd.GridDragStartEvent;
import com.vaadin.flow.component.grid.editor.Editor;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import java.util.function.BiConsumer;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class FusionComponentTreeGrid extends TreeGrid<FusionComponentDto> {

    private final FusionBomController controller;
    private final Binder<FusionComponentDto> binder;
    private final Editor<FusionComponentDto> editor;
    private FusionComponentDto draggedItem;
    private BiConsumer<FusionComponentDto, FusionComponentDto> mergeHandler;

    private static final int NAME_MAX_LENGTH = 40;

    public FusionComponentTreeGrid(FusionBomController controller) {
        super(FusionComponentDto.class);
        this.controller = controller;
        this.binder = new Binder<>(FusionComponentDto.class);
        this.editor = getEditor();

        initializeGrid();
        configureEditor();
        configureColumns();
        configureEditComponents();
        configureListeners();
        configureDragAndDrop();
        configureRowStyles();
    }

    private void initializeGrid() {
        removeAllColumns();
        setSizeFull();
    }

    private void configureColumns() {
        addComponentHierarchyColumn(item -> {
            String name = item.getPartName();
            Span span = new Span(trim(name, NAME_MAX_LENGTH));
            span.getElement().setProperty("title", name == null ? "" : name);
            return span;
        })
                .setHeader("Part Name")
                .setFlexGrow(1)
                .setAutoWidth(true);

        addColumn(FusionComponentDto::getPartNumber)
                .setHeader("Part Number")
                .setAutoWidth(true);

        addColumn(new ComponentRenderer<>(comp -> new ItemTypeComponent(comp.getType())))
                .setHeader("Type")
                .setAutoWidth(true);

        addColumn(c -> formatQuantity(c.getQuantity()))
                .setHeader("Quantity")
                .setAutoWidth(true);

        createBodiesColumn();

        addColumn(FusionComponentDto::getDescription)
                .setHeader("Description")
                .setFlexGrow(2)
                .setAutoWidth(true);


    }

    private void configureEditor() {
        editor.setBinder(binder);
        editor.setBuffered(true);
    }

    private void configureEditComponents() {
        var partNameColumn = getColumns().get(0);
        var typeColumn = getColumns().get(2);
        var quantityColumn = getColumns().get(3);
        var descriptionColumn = getColumns().get(5);

        TextField partNameField = new TextField();
        binder.forField(partNameField).bind(FusionComponentDto::getPartName, FusionComponentDto::setPartName);
        partNameColumn.setEditorComponent(partNameField);

        ItemTypeSelect typeSelect = new ItemTypeSelect();
        binder.forField(typeSelect).bind(FusionComponentDto::getType, FusionComponentDto::setType);
        typeColumn.setEditorComponent(typeSelect);

        TextField quantityField = new TextField();
        binder.forField(quantityField)
                .withConverter(Double::valueOf, String::valueOf)
                .bind(FusionComponentDto::getQuantity, FusionComponentDto::setQuantity);
        quantityColumn.setEditorComponent(quantityField);

        TextField descriptionField = new TextField();
        binder.forField(descriptionField).bind(FusionComponentDto::getDescription, FusionComponentDto::setDescription);
        descriptionColumn.setEditorComponent(descriptionField);
    }

    private void configureListeners() {
        addItemDoubleClickListener(event -> {
            if (editor.isOpen()) {
                editor.cancel();
            }
            editor.editItem(event.getItem());
        });

        editor.addOpenListener(e -> {
            var partNameField = (TextField) getColumns().get(0).getEditorComponent();
            partNameField.focus();
        });
    }

    private void configureDragAndDrop() {
        setRowsDraggable(true);
        setDropMode(GridDropMode.ON_TOP);

        addDragStartListener(this::onDragStart);

        addDropListener(event -> event.getDropTargetItem().ifPresent(targetItem -> {
            if (draggedItem != null && !draggedItem.equals(targetItem)) {
                ConfirmDialog confirmDialog = new ConfirmDialog("Merge Items",
                        "Do you want to merge '" + draggedItem.getPartName() + "' into '" + targetItem.getPartName() + "'?",
                        "Merge", e -> mergeItems(draggedItem, targetItem),
                        "Cancel", e -> {});
                confirmDialog.open();
            }
        }));

        addDragEndListener(event -> draggedItem = null);
    }

    private void configureRowStyles() {
        setClassNameGenerator(item -> {
            if (FusionComponentUtils.hasMultipleBodiesIssue(item)) {
                System.out.println("Multiple bodies: " + item.getPartName());
                return "multiple-bodies";
            }
            return null;
        });
    }

    private void onDragStart(GridDragStartEvent<FusionComponentDto> event) {
        draggedItem = event.getDraggedItems().stream().findFirst().orElse(null);
    }

    private void mergeItems(FusionComponentDto source, FusionComponentDto target) {
        if (mergeHandler != null) {
            mergeHandler.accept(source, target);
        }
    }
    public void setMergeHandler(BiConsumer<FusionComponentDto, FusionComponentDto> handler) {
        this.mergeHandler = handler;
    }




    public void setRoot(FusionComponentDto root) {
        setItems(List.of(root), FusionComponentDto::getChildren);
        expandRecursively(List.of(root), Integer.MAX_VALUE);
    }

    public void refresh() {
        getDataProvider().refreshAll();
    }

    private String formatQuantity(Double quantity) {
        if (quantity == null) return "";
        return new DecimalFormat("#.###").format(quantity);
    }

    private String trim(String text, int maxLength) {
        if (text == null) {
            return "";
        }
        String t = text.trim();
        return t.length() > maxLength ? t.substring(0, Math.max(0, maxLength - 3)) + "..." : t;
    }

    private int getBodiesCount(FusionComponentDto component) {
        Collection<?> bodies = component.getBodies();
        return bodies == null ? 0 : bodies.size();
    }

    private void createBodiesColumn() {
        Column<FusionComponentDto> column = addColumn(this::getBodiesCount)
                .setHeader("Bodies")
                .setAutoWidth(true);
        column.setClassNameGenerator(item ->
                FusionComponentUtils.hasMultipleBodiesIssue(item) ? "highlight-cell" : null);

        column.setRenderer(new ComponentRenderer<>(this::createBodiesCell));
    }

    private Span createBodiesCell(FusionComponentDto item) {
        Span cell = new Span(String.valueOf(getBodiesCount(item)));
        if (FusionComponentUtils.hasMultipleBodiesIssue(item)) {
            cell.getStyle().setColor("var(--lumo-error-text-color)");
        }
        return cell;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/edit/CADBomView.java =====
package com.ua.crow.views.components.fusionbom.edit;

import com.ua.crow.plm.controller.EngineeringBomController;
import com.ua.crow.plm.controller.fusion.FusionBomController;
import com.ua.crow.plm.controller.fusion.FusionBomItemController;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.fusion.FusionComponentDto;
import com.ua.crow.service.NotFoundException;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.Online3DViewer;
import com.ua.crow.plm.controller.cad.CadController;
import com.ua.crow.views.components.fusionbom.bomitem.FusionComponentPanel;
import com.ua.crow.views.components.toolbar.TreeGridToolbar;

import static com.ua.crow.views.components.toolbar.ButtonKeys.*;

import com.ua.crow.views.navigation.BreadcrumbBar;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.ua.crow.views.service.HistoryEntry;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.vaadin.flow.component.splitlayout.SplitLayout;

import java.util.List;
import java.util.Map;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.UI;
import com.ua.crow.plm.dto.fusion.FusionRevisionDto;
import org.springframework.data.domain.Pageable;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.views.components.fusionbom.merge.FusionBomMergeView;
import com.vaadin.flow.router.*;
import com.vaadin.flow.theme.lumo.LumoIcon;
import com.ua.crow.views.components.fusionbom.util.FusionComponentUtils;

import jakarta.annotation.security.PermitAll;

@Route(value = "product/:productId/fusionbom/:fusionId/rev/:revId", layout = MainLayout.class)

@PageTitle("Fusion BOM")
@PermitAll
public class CADBomView extends RndWorkspaceRestrictedView implements BeforeEnterObserver, NavigationContextAware {

    private final FusionBomController fusionBomController;
    private final EngineeringBomController engineeringBomController;
    private final NavigationHistoryService historyService;
    private final FusionBomItemController itemController;
    private final CadController cadController;
    private final FusionComponentTreeGrid treeGrid;
    private final BreadcrumbBar breadcrumbBar;
    private final Online3DViewer viewerComponent;
    private final VerticalLayout viewerLayout;
    private final SplitLayout splitLayout;

    private Long productId;
    private String fusionId;
    private String revisionId;
    private FusionBomDto bom;

    private TreeGridToolbar toolbar;
    private MenuItem convertButton;
    private ComboBox<FusionRevisionDto> versionSwitcher;

    public CADBomView(FusionBomController fusionBomController,
                      EngineeringBomController engineeringBomController,
                      NavigationHistoryService historyService,
                      FusionBomItemController itemController,
                      CadController cadController) {
        this.fusionBomController = fusionBomController;
        this.engineeringBomController = engineeringBomController;
        this.historyService = historyService;
        this.itemController = itemController;
        this.cadController = cadController;
        this.treeGrid = new FusionComponentTreeGrid(fusionBomController);
        this.treeGrid.setMergeHandler(this::mergeComponents);
        this.breadcrumbBar = new BreadcrumbBar(historyService);
        this.viewerComponent = new Online3DViewer();
        //<theme-editor-local-classname>
        addClassName("fusion-bom-view-div-1");

        toolbar = new TreeGridToolbar(false, false, true, true);
        versionSwitcher = new ComboBox<>();
        versionSwitcher.setItemLabelGenerator(v -> "Revision " + v.getNumber());
        toolbar.addButtonStateHandler(DELETE,
                b -> b.setEnabled(!treeGrid.getSelectedItems().isEmpty()));
        toolbar.setDeleteHandler(b -> treeGrid.getSelectedItems().stream()
                .findFirst()
                .ifPresent(this::handleDelete));
        treeGrid.addSelectionListener(e -> {
            toolbar.refreshButtonsStates();
            e.getFirstSelectedItem().ifPresentOrElse(
                    comp -> viewerComponent.highlightComponent(createPathfromPartNumbers()),
                    () -> viewerComponent.highlightComponent(null)
            );
        });
        toolbar.addCustomButton(COMPONENT, "View component", LumoIcon.PLUS.create(), btn -> {
            FusionComponentDto selected = treeGrid.asSingleSelect().getValue();
            if (selected != null) {
                openComponentModal(selected.getFusionId(), selected.getRevisionId());
            } else {
                Notification.show("Please select a component first.", 2000, Notification.Position.MIDDLE);
            }
        });

        convertButton = toolbar.addCustomButton(CONVERT, "Convert", LumoIcon.DOWNLOAD.create(), btn -> {
        });
        var convertMenu = convertButton.getSubMenu();
        convertMenu.addItem("Convert to New Engineering BOM", e -> convertBom());
        convertMenu.addItem("Merge into Existing Engineering BOM", e -> openMergeDialog());
        toolbar.addButtonStateHandler(CONVERT, b ->
                b.setEnabled(bom != null && !FusionComponentUtils.containsMultipleBodiesIssue(bom.getRootPart())));
        toolbar.addSpacer();

        versionSwitcher.addValueChangeListener(e -> {
            if (e.getValue() != null && !e.getValue().getRevisionId().equals(revisionId)) {
                UI.getCurrent().navigate(CADBomView.class,
                        new RouteParameters(
                                java.util.Map.of(
                                        "productId", String.valueOf(productId),
                                        "fusionId", fusionId,
                                        "revId", e.getValue().getRevisionId()
                                )));
            }
        });
        toolbar.addItem(versionSwitcher);

        toolbar.manageTreeGrid(treeGrid);
        toolbar.setRefreshHandler(b -> refresh());

        toolbar.addCustomButton(SAVE, "Save", LumoIcon.CHECKMARK.create(), btn -> treeGrid.getEditor().save()).setVisible(false);
        toolbar.addCustomButton(CANCEL, "Cancel", LumoIcon.CROSS.create(), btn -> treeGrid.getEditor().cancel()).setVisible(false);

        treeGrid.getEditor().addOpenListener(e -> {
            toolbar.setButtonVisibility(SAVE, true);
            toolbar.setButtonVisibility(CANCEL, true);
        });

        treeGrid.getEditor().addCloseListener(e -> {
            toolbar.setButtonVisibility(SAVE, false);
            toolbar.setButtonVisibility(CANCEL, false);
        });

        treeGrid.getEditor().addSaveListener(e -> {
            itemController.update(e.getItem(), false);
            Notification.show("Changes saved successfully", 3000, Notification.Position.TOP_END);
            treeGrid.refresh();
            toolbar.refreshButtonsStates();
        });

        this.splitLayout = new SplitLayout();

        VerticalLayout bomLayout = new VerticalLayout(toolbar, treeGrid);
        bomLayout.setSizeFull();
        bomLayout.setFlexGrow(1, treeGrid);


        this.viewerLayout = new VerticalLayout(viewerComponent);
        this.viewerLayout.setSizeFull();
        this.viewerLayout.setPadding(false);

        splitLayout.addToPrimary(bomLayout);
        splitLayout.addToSecondary(viewerLayout);
        splitLayout.setSizeFull();
        splitLayout.setSplitterPosition(50);

        setSizeFull();
        add(breadcrumbBar, splitLayout);
        setFlexGrow(1, splitLayout);
    }

    private String createPathfromPartNumbers() {
        return null;
    }

    private void openComponentModal(String compId, String compVer) {
        Dialog dialog = new Dialog();
        dialog.setWidth("90%");
        dialog.setHeight("90%");
        dialog.setModal(true);
        dialog.setDraggable(true);
        dialog.setResizable(true);

        FusionComponentDto selectedComponent = itemController.readById(compId, compVer, true);

        if (selectedComponent == null) {
            Notification.show("Please select a component first.", 2000, Notification.Position.MIDDLE);
            return;
        }

        FusionComponentPanel componentPanel = new FusionComponentPanel(true);
        componentPanel.setComponent(selectedComponent);

        Button save = new Button("Save", e -> {
            itemController.update(componentPanel.getUpdatedComponent(selectedComponent), false);
            treeGrid.refresh();
            dialog.close();
        });
        Button cancel = new Button("Cancel", e -> dialog.close());

        dialog.add(componentPanel,
                new com.vaadin.flow.component.orderedlayout.HorizontalLayout(save, cancel));
        dialog.open();
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        try {
            productId = event.getRouteParameters()
                    .get("productId")
                    .map(Long::parseLong)
                    .orElse(null);
            fusionId = event.getRouteParameters().get("fusionId").orElse(null);
            revisionId = event.getRouteParameters().get("revId").orElse(null);

            if (productId == null || fusionId == null) {
                event.rerouteTo("not-found");
                return;
            }

            if (!loadBom()) {
                event.rerouteTo("not-found");
                return;
            }

            addToHistory();
            loadAvailableRevisions();
            updateView();
            loadModel(bom.getRootPart());

        } catch (NotFoundException e) {
            event.rerouteTo("not-found");
        }
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<?> getCurrentContext() {
        return new HistoryEntry<>(
                CADBomView.class,
                bom.getName(),
                "product/" + productId + "/fusionbom/" + fusionId + "/rev/" + revisionId,
                bom, () -> fusionBomController.getFusionBom(fusionId, revisionId)
        );
    }

    private void mergeComponents(FusionComponentDto source, FusionComponentDto target) {
        try {
            var request = new com.ua.crow.plm.dto.requests.MergeBomItemsRequest();
            request.setSourceFusionId(source.getFusionId());
            request.setSourceRevisionId(source.getRevisionId());
            request.setTargetFusionId(target.getFusionId());
            request.setTargetRevisionId(target.getRevisionId());
            itemController.merge(request);
            Notification.show("Items merged", 3000, Notification.Position.TOP_END);
            refresh();
        } catch (Exception e) {
            Notification.show("Merge failed: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
        }
    }


    private void convertBom() {
        try {
            var response = engineeringBomController.convertToEngineeringBom(fusionId, revisionId);
            if (response.getStatusCode().is2xxSuccessful()) {
                Notification.show("BOM converted successfully", 3000, Notification.Position.TOP_END);
            } else {
                Notification.show("Conversion failed", 3000, Notification.Position.TOP_END);
            }
        } catch (Exception e) {
            Notification.show("Conversion failed", 3000, Notification.Position.TOP_END);
        }
    }

    private void handleDelete(FusionComponentDto dto) {
        com.vaadin.flow.component.dialog.Dialog dialog = new com.vaadin.flow.component.dialog.Dialog();
        dialog.add("Delete or remove the selected component from the BOM?");
        com.vaadin.flow.component.button.Button removeBtn =
                new com.vaadin.flow.component.button.Button("Delete from BOM", e -> {
                    unlinkComponent(dto);
                    dialog.close();
                });
        com.vaadin.flow.component.button.Button deleteBtn =
                new com.vaadin.flow.component.button.Button("Delete", e -> {
                    deleteComponent(dto);
                    dialog.close();
                });
        com.vaadin.flow.component.button.Button cancelBtn =
                new com.vaadin.flow.component.button.Button("Cancel", e -> dialog.close());
        com.vaadin.flow.component.orderedlayout.HorizontalLayout hl =
                new com.vaadin.flow.component.orderedlayout.HorizontalLayout(removeBtn, deleteBtn, cancelBtn);
        dialog.add(hl);
        dialog.open();
    }

    private void unlinkComponent(FusionComponentDto dto) {
        fusionBomController.unlink(new com.ua.crow.plm.database.fusion.FusionId(dto.getFusionId(), dto.getRevisionId()));
        refresh();
    }

    private void deleteComponent(FusionComponentDto dto) {
        fusionBomController.deleteComponent(dto.getFusionId(), dto.getRevisionId());
        refresh();
    }

    private void openMergeDialog() {
        Dialog dialog = new Dialog();
        dialog.setWidth("400px");
        dialog.setHeight("250px");

        ComboBox<EngineeringBomWoChildren> bomSelect = new ComboBox<>("Engineering BOM");
        bomSelect.setItemLabelGenerator(EngineeringBomWoChildren::getName);
        List<EngineeringBomWoChildren> boms = engineeringBomController
                .listByProductId(productId, 0L, Pageable.unpaged(), true);
        bomSelect.setItems(boms);
        var mergeableResponse = fusionBomController.mergeableEngineeringBom(fusionId, revisionId);
        if (mergeableResponse.getStatusCode().is2xxSuccessful() && mergeableResponse.getBody() != null) {
            bomSelect.setValue(mergeableResponse.getBody());
        }

        Button mergeBtn = new Button("Open Merge", e -> {
            EngineeringBomWoChildren selected = bomSelect.getValue();
            if (selected != null) {
                dialog.close();
                UI.getCurrent().navigate(FusionBomMergeView.class, new RouteParameters(
                        Map.of(
                                "productId", String.valueOf(productId),
                                "fusionId", String.valueOf(fusionId),
                                "revId", String.valueOf(revisionId),
                                "engineeringBomId", String.valueOf(selected.getId())
                        )
                ));
            }
        });

        dialog.add(bomSelect, mergeBtn);
        dialog.open();
    }

    private void showModelNotFound() {
        viewerLayout.removeAll();
        viewerLayout.add(new H2("Model not found"));
        splitLayout.setSplitterPosition(100);
    }

    private void loadModel(FusionComponentDto component) {
        try {
            String url = cadController.getStepFileUrl(component.getFusionId(), component.getRevisionId())
                    .orElse(null);
            if (url != null) {
                viewerLayout.removeAll();
                viewerLayout.add(viewerComponent);
                splitLayout.setSplitterPosition(50);
                viewerComponent.loadModel(url);
            } else {
                showModelNotFound();
            }
        } catch (NotFoundException e) {
            showModelNotFound();
        }
    }

    /**
     * Fetches BOM data from the controller.
     *
     * @return true if BOM was successfully loaded
     */
    private boolean loadBom() {
        bom = fusionBomController.getFusionBomTree(fusionId, revisionId, true).orElse(null);
        return bom != null && bom.getRootPart() != null;
    }

    /**
     * Applies loaded BOM data to UI components.
     */
    private void updateView() {
        breadcrumbBar.refresh();
        treeGrid.setRoot(bom.getRootPart());
        toolbar.refreshButtonsStates();
        if (bom.getRootPart() != null) {
            loadModel(bom.getRootPart());
        }
    }

    /**
     * Refreshes data and updates UI. Toolbar buttons are disabled while data is being loaded.
     */
    private void refresh() {
        setButtonsEnabled(false);
        if (loadBom()) {
            updateView();
        }
        setButtonsEnabled(true);
        toolbar.refreshButtonsStates();
    }

    /**
     * Enables or disables toolbar and custom buttons.
     */
    private void setButtonsEnabled(boolean enabled) {
        toolbar.setDefaultButtonEnabled(REFRESH, enabled);
        toolbar.setButtonEnabled(EXPAND_ALL, enabled);
        toolbar.setButtonEnabled(COLLAPSE_ALL, enabled);
        toolbar.setButtonEnabled(COMPONENT, enabled);
        toolbar.setButtonEnabled(SAVE, enabled);
        toolbar.setButtonEnabled(CANCEL, enabled);
        convertButton.setEnabled(enabled);
        toolbar.refreshButtonsStates();
    }

    private void loadAvailableRevisions() {
        java.util.List<FusionRevisionDto> revs = fusionBomController.revisions(
                fusionId, productId, 0L);
        versionSwitcher.setItems(revs);
        revs.stream()
                .filter(r -> r.getRevisionId().equals(revisionId))
                .findFirst()
                .ifPresent(versionSwitcher::setValue);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/list/CADBomGrid.java =====
package com.ua.crow.views.components.fusionbom.list;

import com.flowingcode.vaadin.addons.gridhelpers.GridHelper;
import com.ua.crow.plm.controller.fusion.FusionBomController;
import com.ua.crow.plm.dto.fusion.FusionBomDto;
import com.ua.crow.plm.dto.requests.FusionBomsListRequest;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class CADBomGrid extends TreeGrid<FusionBomDto>  {

    private final FusionBomController controller;
    private Long productId = null;
    private Long release = 0L;
    private boolean unprocessed = true;
    private String partNumber;
    private static final int NAME_MAX_LENGTH = 40;

    public CADBomGrid(FusionBomController controller) {
        super(FusionBomDto.class);
        this.controller = controller;

        // ✅ Setup columns
        removeAllColumns();
        addColumn(FusionBomDto::getVersion).setHeader("Version");
        addColumn(FusionBomDto::getPartNumber).setHeader("Part Number");
        addComponentHierarchyColumn(item -> {
            String name = item.getName();
            Span span = new Span(trim(name, NAME_MAX_LENGTH));
            span.getElement().setProperty("title", name == null ? "" : name);
            return span;
        }).setHeader("Name");
        addColumn(f -> f.getProduct() != null ? f.getProduct().getName() : "").setHeader("Product");
        addColumn(FusionBomDto::getCreatedAt).setHeader("Created At");
        addColumn(FusionBomDto::getModifiedAt).setHeader("Modified At");

        // Grid behavior
        GridHelper.setSelectOnClick(this, true);
        setSelectionMode(SelectionMode.SINGLE);
        GridHelper.setSelectionColumnHidden(this, true);

        refresh();

        // ✅ Navigation on double click
        addItemDoubleClickListener(event -> {
            FusionBomDto item = event.getItem();
            UI.getCurrent().navigate("product/" + productId + "/fusionbom/" + item.getFusionId()+"/rev/" + item.getRevisionId());
        });
    }

    private List<FusionBomDto> fetchItems() {
        FusionBomsListRequest request = new FusionBomsListRequest();
        if (productId != null) {
            request.setProductId(Optional.of(productId));
            request.setRelease(Optional.ofNullable(release));
            // When filtering by "Unprocessed" only send the flag when the
            // checkbox is checked. Unchecked means show both processed and
            // unprocessed BOMs, so the flag must be absent.
            if (unprocessed) {
                request.setUnprocessed(Optional.of(true));
            }
        }
        if (partNumber != null && !partNumber.isBlank()) {
            request.setPartNumber(Optional.of(partNumber));
        }
        return controller.fusionBoms(request, Pageable.unpaged());
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setRelease(Long release) {
        this.release = release == null ? 0L : release;
    }

    public void setUnprocessed(boolean unprocessed) {
        this.unprocessed = unprocessed;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void refresh() {
        List<FusionBomDto> items = fetchItems();
        if (items == null) {
            items = java.util.Collections.emptyList();
        }
        items = filterLastVersions(items);
        setItems(items, FusionBomDto::getChildren);
        if (!items.isEmpty()) {
            expandRecursively(items, 1);
        }
    }

    private List<FusionBomDto> filterLastVersions(List<FusionBomDto> items) {
        java.util.Map<String, FusionBomDto> map = new java.util.HashMap<>();
        for (FusionBomDto dto : items) {
            FusionBomDto existing = map.get(dto.getFusionId());
            if (existing == null || dto.getRevisionId().compareTo(existing.getRevisionId()) > 0) {
                map.put(dto.getFusionId(), dto);
            }
        }
        return new java.util.ArrayList<>(map.values());
    }

    private String trim(String text, int maxLength) {
        if (text == null) {
            return "";
        }
        String t = text.trim();
        return t.length() > maxLength ? t.substring(0, Math.max(0, maxLength - 3)) + "..." : t;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/fusionbom/list/CADBomListView.java =====
package com.ua.crow.views.components.fusionbom.list;

import com.ua.crow.plm.controller.ProductController;
import com.ua.crow.plm.controller.fusion.FusionBomController;
import com.ua.crow.plm.dto.base.ProductDto;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.toolbar.TreeGridToolbar;
import com.ua.crow.views.navigation.BreadcrumbBar;
import com.ua.crow.views.service.HistoryEntry;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.vaadin.flow.router.*;
import jakarta.annotation.security.PermitAll;

import static com.ua.crow.views.components.toolbar.ButtonKeys.DELETE;
import static com.ua.crow.views.components.toolbar.ButtonKeys.EDIT;

@Route(value = CADBomListView.ROUTE, layout = MainLayout.class)
@PageTitle("Fusion BOMs")
@PermitAll
public class CADBomListView extends RndWorkspaceRestrictedView implements BeforeEnterObserver, NavigationContextAware {

    public static final String ROUTE = "product/:productId/newcadboms";

    private final FusionBomController fusionBomController;
    private final NavigationHistoryService historyService;
    private final CADBomGrid grid;
    private final TreeGridToolbar toolbar;
    private final BreadcrumbBar breadcrumbBar;
    private final com.ua.crow.plm.service.product.ProductService productService;

    private Long productId;
    private Long release = 0L;
    private ProductDto product;

    private final com.vaadin.flow.component.textfield.TextField partNumberField;
    private final com.vaadin.flow.component.checkbox.Checkbox unprocessedBox;

    public CADBomListView(FusionBomController fusionBomController,
                                     NavigationHistoryService historyService,
                                     ProductController productController,
                                     com.ua.crow.plm.service.product.ProductService productService) {
        this.fusionBomController = fusionBomController;
        this.historyService = historyService;
        this.productService = productService;
        this.grid = new CADBomGrid(fusionBomController);
        this.partNumberField = new com.vaadin.flow.component.textfield.TextField();
        this.unprocessedBox = new com.vaadin.flow.component.checkbox.Checkbox("Unprocessed");
        this.toolbar = createToolbar();
        this.breadcrumbBar = new BreadcrumbBar(historyService);

        setSizeFull();
        add(breadcrumbBar, toolbar, grid);
        setFlexGrow(1, grid);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        productId = event.getRouteParameters()
                .get("productId")
                .map(Long::parseLong)
                .orElse(null);
        String relParam = event.getLocation().getQueryParameters().getParameters().getOrDefault("release", java.util.List.of("0")).get(0);
        release = Long.parseLong(relParam);
        if (productId == null) {
            event.rerouteTo("not-found");
            return;
        }
        product = new ProductDto();
        product.setId(productId);
        addToHistory();
        grid.setProductId(productId);
        grid.setRelease(release);
        grid.setUnprocessed(unprocessedBox.getValue());
        grid.setPartNumber(partNumberField.getValue());
        grid.refresh();
        breadcrumbBar.refresh();
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<ProductDto> getCurrentContext() {
        return new HistoryEntry<>(CADBomListView.class,"Fusion BOMs", "product/" + productId + "/newcadboms", product,()->null);
    }

    private void handleDelete(com.ua.crow.plm.dto.fusion.FusionBomDto dto) {
        boolean isRoot = grid.getTreeData().getParent(dto) == null;
        if (isRoot) {
            com.vaadin.flow.component.confirmdialog.ConfirmDialog dialog = new com.vaadin.flow.component.confirmdialog.ConfirmDialog(
                    "Delete CAD BOM",
                    "Delete selected BOM?",
                    "Delete",
                    e -> { deleteBom(dto); },
                    "Cancel",
                    e -> {});
            dialog.open();
        } else {
            com.vaadin.flow.component.dialog.Dialog d = new com.vaadin.flow.component.dialog.Dialog();
            d.add("Detach or delete the selected BOM?");
            com.vaadin.flow.component.button.Button detach = new com.vaadin.flow.component.button.Button("Detach", ev -> { unlinkBom(dto); d.close(); });
            com.vaadin.flow.component.button.Button del = new com.vaadin.flow.component.button.Button("Delete", ev -> { unlinkBom(dto); deleteBom(dto); d.close(); });
            com.vaadin.flow.component.button.Button cancel = new com.vaadin.flow.component.button.Button("Cancel", ev -> d.close());
            com.vaadin.flow.component.orderedlayout.HorizontalLayout hl = new com.vaadin.flow.component.orderedlayout.HorizontalLayout(detach, del, cancel);
            d.add(hl);
            d.open();
        }
    }

    private void deleteBom(com.ua.crow.plm.dto.fusion.FusionBomDto dto) {
        fusionBomController.delete(new com.ua.crow.plm.database.fusion.FusionId(dto.getFusionId(), dto.getRevisionId()));
        grid.refresh();
    }

    private void unlinkBom(com.ua.crow.plm.dto.fusion.FusionBomDto dto) {
        fusionBomController.unlink(new com.ua.crow.plm.database.fusion.FusionId(dto.getFusionId(), dto.getRevisionId()));
        grid.refresh();
    }


    private TreeGridToolbar createToolbar() {
        TreeGridToolbar toolbar = new TreeGridToolbar(true,true,true,true);
        toolbar.manageTreeGrid(grid);
        toolbar.setRefreshHandler(b->grid.refresh());
        toolbar.setAddHandler((b) -> {/* Implement creation */});
        toolbar.setEditHandler((b) -> {/* Implement edit */});
        toolbar.setDeleteHandler((b) -> grid.getSelectedItems().stream().findFirst().ifPresent(this::handleDelete));
        toolbar.addButtonStateHandler(EDIT,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        toolbar.addButtonStateHandler(DELETE,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        toolbar.addSpacer();
        partNumberField.setPlaceholder("Part Number");
        partNumberField.setClearButtonVisible(true);
        partNumberField.addValueChangeListener(e -> {
            grid.setPartNumber(e.getValue());
            grid.refresh();
        });
        toolbar.addItem(partNumberField);
        unprocessedBox.setValue(true);
        unprocessedBox.addValueChangeListener(e -> {
            grid.setUnprocessed(e.getValue());
            grid.refresh();
        });
        toolbar.addItem(unprocessedBox);
        return toolbar;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/engineeringbom/tree/BomActiveReleaseTreeView.java =====
package com.ua.crow.views.components.engineeringbom.tree;

import com.ua.crow.plm.controller.EngineeringBomController;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.toolbar.TreeGridToolbar;
import com.ua.crow.views.navigation.BreadcrumbBar;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.ua.crow.views.service.HistoryEntry;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.ua.crow.views.components.engineeringbom.tree.ComponentDetailTabs;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

import java.util.List;
import java.util.ArrayList;

@Route(value = BomActiveReleaseTreeView.ROUTE, layout = MainLayout.class)
@PageTitle("Engineering BOM")
@PermitAll
public class BomActiveReleaseTreeView extends RndWorkspaceRestrictedView implements BeforeEnterObserver, NavigationContextAware {

    public static final String ROUTE = "product/:productId/engineeringbom/:bomId";

    private final EngineeringBomController engineeringBomController;
    private final NavigationHistoryService historyService;
    private final BomActiveReleaseTreeGrid treeGrid;
    private final TreeGridToolbar toolbar;
    private final BreadcrumbBar breadcrumbBar;
    private final ComponentDetailTabs detailTabs;
    private final com.ua.crow.plm.service.engbom.BomService bomService;
    private final com.vaadin.flow.component.combobox.ComboBox<com.ua.crow.plm.database.ReleaseVersion> versionBox;

    private Long productId;
    private Long bomId;
    private Long release = 0L;
    private EngineeringBomWoChildren bom;

    public BomActiveReleaseTreeView(EngineeringBomController engineeringBomController,
                                    NavigationHistoryService historyService,
                                    com.ua.crow.plm.service.engbom.BomService bomService) {
        this.engineeringBomController = engineeringBomController;
        this.historyService = historyService;
        this.bomService = bomService;
        this.treeGrid = new BomActiveReleaseTreeGrid();
        this.toolbar = new TreeGridToolbar(false, true, true, true);
        this.breadcrumbBar = new BreadcrumbBar(historyService);
        this.versionBox = new com.vaadin.flow.component.combobox.ComboBox<>();

        toolbar.manageTreeGrid(treeGrid);
        toolbar.setRefreshHandler(b -> refresh());
        versionBox.setItemLabelGenerator(v -> v.getName());
        versionBox.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                release = e.getValue().getId();
                refresh();
            }
        });
        toolbar.addItem(versionBox);
        treeGrid.addSelectionListener(e -> {
            toolbar.refreshButtonsStates();
            showProperties(e.getFirstSelectedItem().orElse(null));
        });

        setSizeFull();

        VerticalLayout bomLayout = new VerticalLayout(toolbar, treeGrid);
        bomLayout.setSizeFull();
        bomLayout.setFlexGrow(1, treeGrid);

        detailTabs = new ComponentDetailTabs();
        detailTabs.setSizeFull();

        VerticalLayout propertiesLayout = new VerticalLayout(detailTabs);
        propertiesLayout.setSizeFull();

        SplitLayout content = new SplitLayout();
        content.addToPrimary(bomLayout);
        content.addToSecondary(propertiesLayout);
        content.setSizeFull();
        content.setSplitterPosition(50);

        add(breadcrumbBar, content);
        setFlexGrow(1, content);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        productId = event.getRouteParameters()
                .get("productId")
                .map(Long::parseLong)
                .orElse(null);
        String relParam = event.getLocation().getQueryParameters().getParameters().getOrDefault("release", java.util.List.of("0")).get(0);
        release = Long.parseLong(relParam);
        bomId = event.getRouteParameters()
                .get("bomId")
                .map(Long::parseLong)
                .orElse(null);

        if (bomId == null) {
            event.rerouteTo("not-found");
            return;
        }

        if (!loadBom()) {
            event.rerouteTo("not-found");
            return;
        }

        addToHistory();
        versionBox.setItems(bomService.getAllVersions(bomId));
        versionBox.setValue(versionBox.getDataProvider().fetch(new com.vaadin.flow.data.provider.Query<>()).findFirst().orElse(null));
        updateView();
        breadcrumbBar.refresh();
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<?> getCurrentContext() {
        return new HistoryEntry<>(BomActiveReleaseTreeView.class,
                bom.getName(),
                "product/" + productId + "/engineeringbom/" + bomId,
                bom, () -> engineeringBomController.byId(bomId, release).orElse(null));
    }

    private boolean loadBom() {
        bom = engineeringBomController.byId(bomId, release).orElse(null);
        return bom != null;
    }

    private void updateView() {
        List<ComponentActiveReleaseDto> roots = engineeringBomController.fullbyId(bomId, release);
        treeGrid.setRoots(roots);
        toolbar.refreshButtonsStates();
    }

    private void refresh() {
        if (loadBom()) {
            updateView();
        }
    }

    private void showProperties(ComponentActiveReleaseDto component) {
        detailTabs.showComponent(component);
    }
}




// ===== File: crow/src/main/java/com/ua/crow/views/components/engineeringbom/tree/ComponentDetailTabs.java =====
package com.ua.crow.views.components.engineeringbom.tree;

import com.ua.crow.database.models.common.DataTypes;
import com.ua.crow.plm.dto.active.CompPropertiesActiveReleaseDto;
import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.dto.base.ComponentPropertiesDTO;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

import java.util.List;
import java.util.stream.Collectors;

public class ComponentDetailTabs extends TabSheet {

    private final VerticalLayout propertiesLayout = new VerticalLayout();
    private final VerticalLayout tasksLayout = new VerticalLayout();
    private final VerticalLayout assetsLayout = new VerticalLayout();
    private final VerticalLayout instrumentsLayout = new VerticalLayout();
    private final VerticalLayout camArtefactsLayout = new VerticalLayout();

    private final VerticalLayout propertyGroupsLayout = new VerticalLayout();
    private final FormLayout componentForm = new FormLayout();

    private final TextField nameField = new TextField("Name");
    private final TextField ukrNameField = new TextField("Ukrainian Name");
    private final TextField partNumberField = new TextField("Part Number");
    private final NumberField quantityField = new NumberField("Quantity");
    private final TextArea descriptionField = new TextArea("Description");
    private final TextField creatorField = new TextField("Creator");
    private final TextField createdAtField = new TextField("Created At");
    private final TextField modifierField = new TextField("Modifier");
    private final TextField modifiedAtField = new TextField("Modified At");

    private final Button saveButton = new Button("Save");
    private final Button cancelButton = new Button("Cancel");

    public ComponentDetailTabs() {
        setSizeFull();

        propertiesLayout.setSizeFull();
        tasksLayout.setSizeFull();
        assetsLayout.setSizeFull();
        instrumentsLayout.setSizeFull();
        camArtefactsLayout.setSizeFull();

        creatorField.setReadOnly(true);
        createdAtField.setReadOnly(true);
        modifierField.setReadOnly(true);
        modifiedAtField.setReadOnly(true);

        HorizontalLayout buttons = new HorizontalLayout(saveButton, cancelButton);

        componentForm.add(nameField, ukrNameField, partNumberField,
                quantityField, descriptionField, creatorField,
                createdAtField, modifierField, modifiedAtField);

        propertiesLayout.add(buttons, componentForm, propertyGroupsLayout);
        propertiesLayout.setFlexGrow(1, propertyGroupsLayout);

        add("Properties", propertiesLayout);
        add("Tasks", tasksLayout);
        add("Assets", assetsLayout);
        add("Instruments", instrumentsLayout);
        add("CAM Artefacts", camArtefactsLayout);
    }

    public void showComponent(ComponentActiveReleaseDto component) {
        propertyGroupsLayout.removeAll();

        if (component == null) {
            clearFields();
            return;
        }

        nameField.setValue(component.getName() != null ? component.getName() : "");
        ukrNameField.setValue(component.getUkrName() != null ? component.getUkrName() : "");
        partNumberField.setValue(component.getPartNumber() != null ? component.getPartNumber() : "");
        quantityField.setValue(component.getQuantity());
        descriptionField.setValue(component.getDescription() != null ? component.getDescription() : "");
        creatorField.setValue(component.getCreator() != null ? component.getCreator() : "");
        createdAtField.setValue(component.getCreatedAt() != null ? component.getCreatedAt().toString() : "");
        modifierField.setValue(component.getModifier() != null ? component.getModifier() : "");
        modifiedAtField.setValue(component.getModifiedAt() != null ? component.getModifiedAt().toString() : "");

        if (component.getProperties() != null) {
            component.getProperties().stream()
                    .collect(Collectors.groupingBy(p -> {
                        var group = p.getPropertyType().getGroup();
                        return group != null ? group.getName() : "Ungrouped";
                    }))
                    .forEach((groupName, props) -> {
                        H3 title = new H3(groupName);
                        Grid<CompPropertiesActiveReleaseDto> grid = createPropertyGrid(props);
                        propertyGroupsLayout.add(title, grid);
                    });
        }
    }

    private void clearFields() {
        nameField.clear();
        ukrNameField.clear();
        partNumberField.clear();
        quantityField.clear();
        descriptionField.clear();
        creatorField.clear();
        createdAtField.clear();
        modifierField.clear();
        modifiedAtField.clear();
    }

    private Grid<CompPropertiesActiveReleaseDto> createPropertyGrid(List<CompPropertiesActiveReleaseDto> props) {
        Grid<CompPropertiesActiveReleaseDto> grid = new Grid<>();
        grid.addColumn(p -> p.getPropertyType().getName()).setHeader("Property");
        grid.addComponentColumn(this::createValueField).setHeader("Value");
        grid.setItems(props);
        grid.setWidthFull();
        return grid;
    }

    private Component createValueField(ComponentPropertiesDTO property) {
        if (property.getPropertyType().getDataType() == DataTypes.NUMBER) {
            NumberField field = new NumberField();
            if (property.getNumericValue() != null) {
                field.setValue(property.getNumericValue());
            }
            field.addValueChangeListener(e -> property.setNumericValue(e.getValue()));
            return field;
        }
        TextField field = new TextField();
        field.setValue(property.getStringValue() != null ? property.getStringValue() : "");
        field.addValueChangeListener(e -> property.setStringValue(e.getValue()));
        return field;
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/components/engineeringbom/tree/BomActiveReleaseTreeGrid.java =====
package com.ua.crow.views.components.engineeringbom.tree;

import com.ua.crow.plm.dto.active.ComponentActiveReleaseDto;
import com.ua.crow.plm.database.ItemTypes;
import com.ua.crow.views.components.itemtype.ItemTypeComponent;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import java.util.Collection;
import java.util.List;

public class BomActiveReleaseTreeGrid extends TreeGrid<ComponentActiveReleaseDto> {

    private static final int NAME_MAX_LENGTH = 40;

    public BomActiveReleaseTreeGrid() {
        super(ComponentActiveReleaseDto.class);
        removeAllColumns();
        setSizeFull();

        addComponentHierarchyColumn(item -> {
            String formatted = formatName(item);
            Span span = new Span(formatted);
            span.getElement().setProperty("title", item.getName() == null ? "" : item.getName());
            return span;
        })
                .setHeader("Name")
                .setFlexGrow(1)
                .setAutoWidth(true);

        addColumn(new ComponentRenderer<>(dto -> {
            ItemTypes type = dto.getItemType() == null ? ItemTypes.NONE : ItemTypes.valueOf(dto.getItemType());
            return new ItemTypeComponent(type);
        }))
                .setHeader("Type")
                .setAutoWidth(true);

        addColumn(dto -> formatQuantity(dto.getQuantity()))
                .setHeader("Quantity")
                .setAutoWidth(true);

    }

    public void setRoots(Collection<ComponentActiveReleaseDto> roots) {
        setItems(roots, ComponentActiveReleaseDto::getParts);
        expandRecursively(roots, 2);
    }

    public void refresh() {
        getDataProvider().refreshAll();
    }

    private String trim(String text, int maxLength) {
        if (text == null) {
            return "";
        }
        String t = text.trim();
        return t.length() > maxLength ? t.substring(0, Math.max(0, maxLength - 3)) + "..." : t;
    }

    private String formatQuantity(Double quantity) {
        if (quantity == null) return "";
        return String.valueOf(quantity);
    }

    private String formatName(ComponentActiveReleaseDto dto) {
        String name = trim(dto.getName(), NAME_MAX_LENGTH);
        String partNumber = dto.getPartNumber();
        String quantity = formatQuantity(dto.getQuantity());
        boolean hasPartNumber = partNumber != null && !partNumber.isBlank();
        boolean hasQuantity = quantity != null && !quantity.isBlank();
        if (!hasPartNumber && !hasQuantity) {
            return name;
        }
        StringBuilder sb = new StringBuilder(name).append(" (");
        if (hasPartNumber) {
            sb.append("Part Number: ").append(partNumber);
        }
        if (hasQuantity) {
            if (hasPartNumber) {
                sb.append(", ");
            }
            sb.append("Quantity: ").append(quantity);
        }
        sb.append(")");
        return sb.toString();
    }
}




// ===== File: crow/src/main/java/com/ua/crow/views/components/engineeringbom/list/BomActiveReleaseGrid.java =====
package com.ua.crow.views.components.engineeringbom.list;

import com.flowingcode.vaadin.addons.gridhelpers.GridHelper;
import com.ua.crow.plm.controller.EngineeringBomController;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.provider.CallbackDataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BomActiveReleaseGrid extends Grid<EngineeringBomWoChildren> {

    private final EngineeringBomController controller;
    private Long productId;
    private Long release = 0L;

    private static final int NAME_MAX_LENGTH = 40;

    public BomActiveReleaseGrid(EngineeringBomController controller) {
        super(EngineeringBomWoChildren.class);
        this.controller = controller;

        removeAllColumns();
        addColumn(EngineeringBomWoChildren::getPartNumber).setHeader("Part Number");
        addColumn(new ComponentRenderer<>(item -> {
            String name = item.getName();
            String shortName = trim(name, NAME_MAX_LENGTH);
            Span span = new Span(shortName);
            span.getElement().setProperty("title", name == null ? "" : name);
            return span;
        })).setHeader("Name");
        addColumn(b -> b.getProduct() != null ? b.getProduct().getName() : "")
                .setHeader("Product");
        addColumn(EngineeringBomWoChildren::getCreatedAt).setHeader("Created At");
        addColumn(EngineeringBomWoChildren::getModifiedAt).setHeader("Modified At");

        GridHelper.setSelectOnClick(this, true);
        setSelectionMode(SelectionMode.SINGLE);
        GridHelper.setSelectionColumnHidden(this, true);

        setDataProvider(new CallbackDataProvider<>(
                query -> fetchItems(query.getOffset(), query.getLimit()).stream(),
                query -> fetchItems(0, Integer.MAX_VALUE).size()
        ));

        addItemDoubleClickListener(event -> {
            EngineeringBomWoChildren item = event.getItem();
            UI.getCurrent().navigate("product/" + productId + "/engineeringbom/" + item.getId());
        });
    }

    private String trim(String text, int maxLength) {
        if (text == null) {
            return "";
        }
        String t = text.trim();
        return t.length() > maxLength ? t.substring(0, Math.max(0, maxLength - 3)) + "..." : t;
    }

    private List<EngineeringBomWoChildren> fetchItems(int offset, int limit) {
        if (productId == null) {
            return List.of();
        }
        List<EngineeringBomWoChildren> items = controller
                .listByProductId(productId, release, Pageable.unpaged(), true);
        items = filterLastVersions(items);
        return items.stream().skip(offset).limit(limit).toList();
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setRelease(Long release) {
        this.release = release == null ? 0L : release;
    }

    public void refresh() {
        getDataProvider().refreshAll();
    }

    private List<EngineeringBomWoChildren> filterLastVersions(List<EngineeringBomWoChildren> items) {
        java.util.Map<String, EngineeringBomWoChildren> map = new java.util.HashMap<>();
        for (EngineeringBomWoChildren b : items) {
            EngineeringBomWoChildren existing = map.get(b.getPartNumber());
            if (existing == null || b.getId() > existing.getId()) {
                map.put(b.getPartNumber(), b);
            }
        }
        return new java.util.ArrayList<>(map.values());
    }
}




// ===== File: crow/src/main/java/com/ua/crow/views/components/engineeringbom/list/BomActiveReleaseListView.java =====
package com.ua.crow.views.components.engineeringbom.list;

import com.ua.crow.plm.controller.EngineeringBomController;
import com.ua.crow.plm.controller.ProductController;
import com.ua.crow.plm.dto.base.ProductDto;
import com.ua.crow.views.MainLayout;
import com.ua.crow.views.components.toolbar.GridToolbar;
import com.ua.crow.views.navigation.BreadcrumbBar;
import com.ua.crow.views.navigation.NavigationContextAware;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.ua.crow.views.service.HistoryEntry;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.ua.crow.plm.dto.active.EngineeringBomWoChildren;
import com.ua.crow.views.workspaces.rnd.RndWorkspaceRestrictedView;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

import static com.ua.crow.views.components.toolbar.ButtonKeys.DELETE;
import static com.ua.crow.views.components.toolbar.ButtonKeys.EDIT;
import static com.ua.crow.views.components.toolbar.ButtonKeys.ADD;

@Route(value = BomActiveReleaseListView.ROUTE, layout = MainLayout.class)
@PageTitle("Engineering BOMs")
@PermitAll
public class BomActiveReleaseListView extends RndWorkspaceRestrictedView implements BeforeEnterObserver, NavigationContextAware {

    public static final String ROUTE = "product/:productId/engineeringboms";

    private final EngineeringBomController engineeringBomController;
    private final NavigationHistoryService historyService;
    private final BomActiveReleaseGrid grid;
    private final GridToolbar toolbar;
    private final BreadcrumbBar breadcrumbBar;
    private final com.ua.crow.plm.service.product.ProductService productService;

    private Long productId;
    private Long release = 0L;
    private ProductDto product;

    public BomActiveReleaseListView(EngineeringBomController engineeringBomController,
                                    NavigationHistoryService historyService,
                                    ProductController productController,
                                    com.ua.crow.plm.service.product.ProductService productService) {
        this.engineeringBomController = engineeringBomController;
        this.historyService = historyService;
        this.productService = productService;
        this.grid = new BomActiveReleaseGrid(engineeringBomController);
        this.toolbar = createToolbar();
        this.breadcrumbBar = new BreadcrumbBar(historyService);

        setSizeFull();
        add(breadcrumbBar, toolbar, grid);
        setFlexGrow(1, grid);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        productId = event.getRouteParameters()
                .get("productId")
                .map(Long::parseLong)
                .orElse(null);
        String relParam = event.getLocation().getQueryParameters().getParameters().getOrDefault("release", java.util.List.of("0")).get(0);
        release = Long.parseLong(relParam);
        if (productId == null) {
            event.rerouteTo("not-found");
            return;
        }
        product = new ProductDto();
        product.setId(productId);
        addToHistory();
         grid.setProductId(productId);
        grid.setRelease(release);
        grid.refresh();
        breadcrumbBar.refresh();
    }

    @Override
    public NavigationHistoryService getHistoryService() {
        return historyService;
    }

    @Override
    public HistoryEntry<ProductDto> getCurrentContext() {
        return new HistoryEntry<>(BomActiveReleaseListView.class,
                "Engineering BOMs",
                "product/" + productId + "/engineeringboms",
                product, () -> null);
    }

    private GridToolbar createToolbar() {
        GridToolbar toolbar = new GridToolbar(true, true, true, true);
        toolbar.setRefreshHandler(b -> grid.refresh());
        toolbar.setAddHandler(b -> {/* Implement creation */});
        toolbar.setEditHandler(b -> {/* Implement edit */});
        toolbar.setDeleteHandler(b -> grid.getSelectedItems().stream().findFirst().ifPresent(this::handleDelete));
        toolbar.addButtonStateHandler(EDIT,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        toolbar.addButtonStateHandler(DELETE,
                b -> b.setEnabled(!grid.getSelectedItems().isEmpty()));
        grid.addSelectionListener(e -> toolbar.refreshButtonsStates());
        return toolbar;
    }

    private void handleDelete(com.ua.crow.plm.dto.active.EngineeringBomWoChildren dto) {
        com.vaadin.flow.component.dialog.Dialog dialog = new com.vaadin.flow.component.dialog.Dialog();
        dialog.add("Delete selected BOM only or delete with components?");
        com.vaadin.flow.component.button.Button bomOnly = new com.vaadin.flow.component.button.Button("Delete BOM", e -> {
            engineeringBomController.delete(dto.getId(), false);
            dialog.close();
            grid.refresh();
        });
        com.vaadin.flow.component.button.Button fullDelete = new com.vaadin.flow.component.button.Button("Delete with Components", e -> {
            engineeringBomController.delete(dto.getId(), true);
            dialog.close();
            grid.refresh();
        });
        com.vaadin.flow.component.button.Button cancel = new com.vaadin.flow.component.button.Button("Cancel", e -> dialog.close());
        com.vaadin.flow.component.orderedlayout.HorizontalLayout hl = new com.vaadin.flow.component.orderedlayout.HorizontalLayout(bomOnly, fullDelete, cancel);
        dialog.add(hl);
        dialog.open();
    }
}




// ===== File: crow/src/main/java/com/ua/crow/views/MainLayout.java =====
package com.ua.crow.views;

import com.ua.crow.service.CrowUserService;
import com.ua.crow.config.SecurityService;
import com.ua.crow.views.navigation.NavigationHistoryService;
import com.ua.crow.views.navigation.NavigationMenuBuilder;
import com.ua.crow.views.service.WorkspaceUIService;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class MainLayout extends AppLayout {

    private H1 viewTitle;
    private final Image logo = new Image("images/logo2.svg", "Logo");
    private final SideNav nav;


    private final NavigationHistoryService historyService;
    private final WorkspaceUIService workspaceUIService;
    private final CrowUserService userService;
    private final SecurityService securityService;

    public MainLayout(NavigationHistoryService historyService,
                      WorkspaceUIService workspaceUIService,
                      CrowUserService userService,
                      SecurityService securityService) {
        this.historyService = historyService;
        this.workspaceUIService = workspaceUIService;
        this.userService = userService;
        this.securityService = securityService;
        WorkspaceType workspace = userService.getCurrentUser().getCurrentWorkspace();
        if (workspace == null) {
            workspace = WorkspaceType.RND;
            userService.switchWorkspace(workspace);
        }
        this.nav = workspaceUIService.createSideNav(workspace);
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");
        viewTitle = new H1("Crow");
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        ComboBox<WorkspaceType> workspaceSelector = new ComboBox<>();
        workspaceSelector.setItems(WorkspaceType.values());
        WorkspaceType current = userService.getCurrentUser().getCurrentWorkspace();
        workspaceSelector.setValue(current != null ? current : WorkspaceType.RND);
        workspaceSelector.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                userService.switchWorkspace(e.getValue());
                workspaceUIService.populateSideNav(nav, e.getValue());
                UI.getCurrent().navigate("");
            }
        });

        MenuBar userMenu = new MenuBar();
        Avatar avatar = new Avatar(userService.getCurrentUser().getName());
        MenuItem rootItem = userMenu.addItem(avatar);
        SubMenu sub = rootItem.getSubMenu();
        sub.addItem(userService.getCurrentUser().getUsername()).setEnabled(false);
        sub.addItem(workspaceSelector).setEnabled(false);
        sub.addItem("Logout", e -> securityService.logout());

        Div spacer = new Div();
        spacer.getStyle().set("flex-grow", "1");

        addToNavbar(true, toggle, logo, spacer, userMenu);
    }

    private void addDrawerContent() {
        Span appName = new Span(logo);
        appName.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        logo.setHeight(50, Unit.PIXELS);
        Header header = new Header(appName);
        Scroller scroller = new Scroller(nav);
        addToDrawer(header, scroller, createFooter());
    }

    private void updateNavigation() {
        java.util.Map<String, Boolean> expanded = captureExpanded(nav.getItems());

        WorkspaceType workspace = userService.getCurrentUser().getCurrentWorkspace();
        workspaceUIService.populateSideNav(nav, workspace);
        if (workspace == WorkspaceType.RND) {

            NavigationMenuBuilder.updateSideNav(nav, historyService);
        }

        applyExpanded(nav.getItems(), expanded);
    }

    private java.util.Map<String, Boolean> captureExpanded(java.util.List<com.vaadin.flow.component.sidenav.SideNavItem> items) {
        java.util.Map<String, Boolean> map = new java.util.HashMap<>();
        for (com.vaadin.flow.component.sidenav.SideNavItem item : items) {
            map.put(item.getLabel(), item.isExpanded());
            map.putAll(captureExpanded(item.getItems()));
        }
        return map;
    }

    private void applyExpanded(java.util.List<com.vaadin.flow.component.sidenav.SideNavItem> items, java.util.Map<String, Boolean> state) {
        for (com.vaadin.flow.component.sidenav.SideNavItem item : items) {
            Boolean expanded = state.get(item.getLabel());
            if (expanded != null) {
                item.setExpanded(expanded);
            }
            applyExpanded(item.getItems(), state);
        }
    }



    private Footer createFooter() {
        return new Footer();
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
        updateNavigation();
    }

    private String getCurrentPageTitle() {
        return getContent() != null ? getContent().getClass().getSimpleName() : "";
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/service/WorkspaceUIService.java =====
package com.ua.crow.views.service;

import com.ua.crow.views.pages.CncRndInterfaceView;
import com.ua.crow.views.pages.NotFoundView;
import com.ua.crow.views.workspaces.assembly.AssemblyChecklistView;
import com.ua.crow.views.workspaces.assembly.AssemblyInstructionsView;
import com.ua.crow.views.workspaces.logistics.LogisticsIncomingView;
import com.ua.crow.views.workspaces.logistics.LogisticsOutgoingView;
import com.ua.crow.views.workspaces.rnd.RndBomView;
import com.ua.crow.views.workspaces.rnd.RndCadView;
import com.ua.crow.workspace.WorkspaceType;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceUIService {

    public SideNav createSideNav(WorkspaceType workspace) {
        SideNav nav = new SideNav();
        populateSideNav(nav, workspace);
        return nav;
    }

    public void populateSideNav(SideNav nav, WorkspaceType workspace) {
        nav.addItem(new SideNavItem("CNC", CncRndInterfaceView.class));
        switch (workspace) {
            case RND -> {
                nav.addItem(new SideNavItem("CAD Editor", RndCadView.class));
                nav.addItem(new SideNavItem("BOM Viewer", RndBomView.class));
            }
            case ASSEMBLY -> {
                nav.addItem(new SideNavItem("Assembly Instructions", AssemblyInstructionsView.class));
                nav.addItem(new SideNavItem("Checklist", AssemblyChecklistView.class));
            }
            case LOGISTICS -> {
                nav.addItem(new SideNavItem("Incoming", LogisticsIncomingView.class));
                nav.addItem(new SideNavItem("Outgoing", LogisticsOutgoingView.class));
            }
            default -> nav.addItem(new SideNavItem("Home", NotFoundView.class));
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/service/HistoryEntry.java =====
package com.ua.crow.views.service;

import com.ua.crow.views.navigation.NavigationHistoryService;

import java.util.Objects;
import java.util.function.Supplier;

public class HistoryEntry<T> {
    private final Class context;
    private final String label;
    private final String path;
    private T contextObject;
    private Supplier<T> fallbackSupplier;
    private HistoryEntry<?> parentContext;
    private HistoryEntry<?> childContext;

    public HistoryEntry(Class context, String label, String path, T contextObject, Supplier<T> fallbackSupplier) {
        this.context = context;
        this.label = label;
        this.path = path;
        this.contextObject = contextObject;
        this.fallbackSupplier = fallbackSupplier;
    }

    public T getContextObject() {
        if (contextObject == null && fallbackSupplier != null) {
            contextObject = fallbackSupplier.get();
        }
        return contextObject;
    }

    public String getLabel() {
        return label;
    }

    public String getPath() {
        return path;
    }

    public Class<T> getContext() {
        return context;
    }

    public HistoryEntry<?> getParentContext() {
        return parentContext;
    }

    public void setParentContext(HistoryEntry<?> parentContext) {
        this.parentContext = parentContext;
    }

    public HistoryEntry<?> getChildContext() {
        return childContext;
    }

    public void setChildContext(HistoryEntry<?> childContext) {
        this.childContext = childContext;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HistoryEntry<?> other)) return false;
        return Objects.equals(path, other.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }
}


// ===== File: crow/src/main/java/com/ua/crow/views/pages/LoginView.java =====
package com.ua.crow.views.pages;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("login")
@PageTitle("Login | Corvus Forge")
@AnonymousAllowed
public class LoginView extends VerticalLayout implements BeforeEnterObserver {

    private final LoginForm loginForm = new LoginForm();
    private final Checkbox rememberMe = new Checkbox("Remember me");
    private final Image logo = new Image("images/logo1.svg", "Logo");

    public LoginView() {
        addClassName("login-view");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setSpacing(false);

        loginForm.setAction("login");
        logo.setWidth("200px");

        // Correct way: create a custom form layout explicitly
        VerticalLayout customArea = new VerticalLayout();
        customArea.setPadding(false);
        customArea.setSpacing(false);
        customArea.setAlignItems(Alignment.START);

        // Add the checkbox to custom area
        rememberMe.getElement().setAttribute("name", "remember-me");
        customArea.add(rememberMe);

        // Attach custom area to login form slot
        customArea.getElement().setAttribute("slot", "custom-form-area");
        loginForm.getElement().appendChild(customArea.getElement());

        VerticalLayout wrapper = new VerticalLayout();
        wrapper.setSpacing(true);
        wrapper.setAlignItems(Alignment.CENTER);
        wrapper.addClassName("login-wrapper");
        wrapper.add(logo, loginForm);

        add(wrapper);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        if (event.getLocation().getQueryParameters().getParameters().containsKey("error")) {
            loginForm.setError(true);
        }
    }
}



// ===== File: crow/src/main/java/com/ua/crow/views/pages/NotFoundView.java =====
package com.ua.crow.views.pages;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("not-found")
@AnonymousAllowed
public class NotFoundView extends VerticalLayout {
    public NotFoundView() {

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        add(new H1(getTranslation("notfound.title")));
        Button backButton = new Button(getTranslation("notfound.back"), event -> {
            UI.getCurrent().getPage().executeJs("window.history.back()");
        });

        add(backButton);
    }
}


// ===== File: crow/src/main/java/com/ua/crow/views/pages/CncRndInterfaceView.java =====
package com.ua.crow.views.pages;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

import java.util.List;

@Route("cnc-interface")
@PageTitle("CNC RnD Interface")
@PermitAll
public class CncRndInterfaceView extends HorizontalLayout {

    public CncRndInterfaceView() {
        setSizeFull();
        setPadding(true);
        
        // Product Tree
        VerticalLayout productTreeLayout = new VerticalLayout();
        productTreeLayout.add(new H3("Product Tree"));

        TreeGrid<String> productTree = new TreeGrid<>();
        productTree.addHierarchyColumn(String::toString).setHeader("Products");
        productTree.setItems(List.of("Product A", "Product B"), item -> {
            if (item.equals("Product A")) return List.of("Component 1", "Component 2");
            if (item.equals("Product B")) return List.of("Component 3", "Component 4");
            return List.of();
        });
        productTreeLayout.add(productTree);

        // Component Tree
        VerticalLayout componentTreeLayout = new VerticalLayout();
        componentTreeLayout.add(new H3("Component Tree"));

        TreeGrid<String> componentTree = new TreeGrid<>();
        componentTree.addHierarchyColumn(String::toString).setHeader("Components");
        componentTree.setItems(List.of("Root"), item -> {
            if (item.equals("Root")) return List.of("Child Component2", "Selected component3");
            if (item.equals("Selected component5")) return List.of("Child Component4");
            return List.of();
        });

        componentTree.addItemClickListener(event -> {
            if ("Selected component".equals(event.getItem())) {
                showProgramDetails(componentTreeLayout);
            }
        });

        componentTreeLayout.add(componentTree);

        // Git Repository Status
        VerticalLayout gitStatusLayout = new VerticalLayout();
        gitStatusLayout.add(new H3("Git Repository Status"));

        gitStatusLayout.add(new Div(new H3("Current Branch: main"),
            new Div("Uncommitted Changes: 5"),
            new Div("Staged Changes: 3")));

        HorizontalLayout gitButtons = new HorizontalLayout(
                new Button("Commit"), new Button("Push")
        );
        gitStatusLayout.add(gitButtons);

        TreeGrid<String> fileExplorer = new TreeGrid<>();
        fileExplorer.addHierarchyColumn(String::toString).setHeader("File Explorer");
        fileExplorer.setItems(List.of("Documents", "Pictures", "Music"), folder -> {
            switch (folder) {
                case "Documents": return List.of("Resume.pdf", "CoverLetter.docx");
                case "Pictures": return List.of("Vacation.jpg", "Birthday.png");
                case "Music": return List.of("Song.mp3", "Album.flac");
                default: return List.of();
            }
        });

        gitStatusLayout.add(fileExplorer);

        add(productTreeLayout, componentTreeLayout, gitStatusLayout);
        expand(productTreeLayout, componentTreeLayout, gitStatusLayout);
    }

    private void showProgramDetails(VerticalLayout layout) {
        Div details = new Div();
        details.getStyle().set("border", "1px solid #ddd").set("padding", "15px").set("margin-top", "10px");
        details.add(new H3("CNC Program Details of the selected component"));

        HorizontalLayout programA = new HorizontalLayout();
        programA.add(new Span("Program A"), new Button("Execute"), new Button("Setup Sheet"));

        HorizontalLayout programB = new HorizontalLayout();
        programB.add(new Span("Program B"), new Button("Execute"), new Button("Setup Sheet"));

        details.add(programA, programB);

        layout.add(details);
    }
}



// ===== File: crow/src/main/java/com/ua/crow/validation/FusionBomConvert.java =====
package com.ua.crow.validation;

public interface FusionBomConvert {
}



// ===== File: crow/src/main/java/com/ua/crow/validation/annotations/IpAddressValidator.java =====
package com.ua.crow.validation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IpAddressValidator implements ConstraintValidator<IpAddress, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    Pattern pattern =
      Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
    Matcher matcher = pattern.matcher(value);
    try {
      if (!matcher.matches()) {
        return false;
      } else {
        for (int i = 1; i <= 4; i++) {
          int octet = Integer.valueOf(matcher.group(i));
          if (octet > 255) {
            return false;
          }
        }
        return true;
      }
    } catch (Exception e) {
      return false;
    }
  }
}


// ===== File: crow/src/main/java/com/ua/crow/validation/annotations/IpAddress.java =====
package com.ua.crow.validation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = IpAddressValidator.class)
@Documented
public @interface IpAddress {

  String message() default "{IpAddress.invalid}";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}


