package House.mappers;

import House.models.dto.RegionDto;
import House.models.entities.Region;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T15:48:16+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class RegionMapperImpl implements RegionMapper {

    @Override
    public Region toRegion(RegionDto regionDto) {
        if ( regionDto == null ) {
            return null;
        }

        Region region = new Region();

        region.setId( regionDto.getId() );
        region.setName( regionDto.getName() );

        return region;
    }

    @Override
    public RegionDto toRegionDto(Region region) {
        if ( region == null ) {
            return null;
        }

        RegionDto regionDto = new RegionDto();

        regionDto.setId( region.getId() );
        regionDto.setName( region.getName() );

        return regionDto;
    }

    @Override
    public List<Region> toRegionList(List<RegionDto> regionDtoList) {
        if ( regionDtoList == null ) {
            return null;
        }

        List<Region> list = new ArrayList<Region>( regionDtoList.size() );
        for ( RegionDto regionDto : regionDtoList ) {
            list.add( toRegion( regionDto ) );
        }

        return list;
    }

    @Override
    public List<RegionDto> toRegionDtoList(List<Region> regionList) {
        if ( regionList == null ) {
            return null;
        }

        List<RegionDto> list = new ArrayList<RegionDto>( regionList.size() );
        for ( Region region : regionList ) {
            list.add( toRegionDto( region ) );
        }

        return list;
    }
}
