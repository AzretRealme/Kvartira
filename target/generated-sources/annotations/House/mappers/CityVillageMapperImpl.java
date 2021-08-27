package House.mappers;

import House.models.dto.CityVillageDto;
import House.models.dto.RegionDto;
import House.models.entities.CityVillage;
import House.models.entities.Region;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T16:19:15+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class CityVillageMapperImpl implements CityVillageMapper {

    @Override
    public CityVillage toCityVillage(CityVillageDto cityVillageDto) {
        if ( cityVillageDto == null ) {
            return null;
        }

        CityVillage cityVillage = new CityVillage();

        cityVillage.setId( cityVillageDto.getId() );
        cityVillage.setRegion( regionDtoToRegion( cityVillageDto.getRegion() ) );
        cityVillage.setName( cityVillageDto.getName() );

        return cityVillage;
    }

    @Override
    public CityVillageDto toCityVillageDto(CityVillage cityVillage) {
        if ( cityVillage == null ) {
            return null;
        }

        CityVillageDto cityVillageDto = new CityVillageDto();

        cityVillageDto.setId( cityVillage.getId() );
        cityVillageDto.setRegion( regionToRegionDto( cityVillage.getRegion() ) );
        cityVillageDto.setName( cityVillage.getName() );

        return cityVillageDto;
    }

    @Override
    public List<CityVillage> toCityVillageList(List<CityVillageDto> cityVillageDtoList) {
        if ( cityVillageDtoList == null ) {
            return null;
        }

        List<CityVillage> list = new ArrayList<CityVillage>( cityVillageDtoList.size() );
        for ( CityVillageDto cityVillageDto : cityVillageDtoList ) {
            list.add( toCityVillage( cityVillageDto ) );
        }

        return list;
    }

    @Override
    public List<CityVillageDto> toCityVillageDtoList(List<CityVillage> cityVillageList) {
        if ( cityVillageList == null ) {
            return null;
        }

        List<CityVillageDto> list = new ArrayList<CityVillageDto>( cityVillageList.size() );
        for ( CityVillage cityVillage : cityVillageList ) {
            list.add( toCityVillageDto( cityVillage ) );
        }

        return list;
    }

    protected Region regionDtoToRegion(RegionDto regionDto) {
        if ( regionDto == null ) {
            return null;
        }

        Region region = new Region();

        region.setId( regionDto.getId() );
        region.setName( regionDto.getName() );

        return region;
    }

    protected RegionDto regionToRegionDto(Region region) {
        if ( region == null ) {
            return null;
        }

        RegionDto regionDto = new RegionDto();

        regionDto.setId( region.getId() );
        regionDto.setName( region.getName() );

        return regionDto;
    }
}
