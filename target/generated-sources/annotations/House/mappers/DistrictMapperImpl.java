package House.mappers;

import House.models.dto.CityVillageDto;
import House.models.dto.DistrictDto;
import House.models.dto.RegionDto;
import House.models.entities.CityVillage;
import House.models.entities.District;
import House.models.entities.Region;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T15:48:17+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class DistrictMapperImpl implements DistrictMapper {

    @Override
    public District toDistrict(DistrictDto districtDto) {
        if ( districtDto == null ) {
            return null;
        }

        District district = new District();

        district.setId( districtDto.getId() );
        district.setCityVillage( cityVillageDtoToCityVillage( districtDto.getCityVillage() ) );
        district.setName( districtDto.getName() );

        return district;
    }

    @Override
    public DistrictDto toDistrictDto(District district) {
        if ( district == null ) {
            return null;
        }

        DistrictDto districtDto = new DistrictDto();

        districtDto.setId( district.getId() );
        districtDto.setCityVillage( cityVillageToCityVillageDto( district.getCityVillage() ) );
        districtDto.setName( district.getName() );

        return districtDto;
    }

    @Override
    public List<District> toDistrictList(List<DistrictDto> districtDtoList) {
        if ( districtDtoList == null ) {
            return null;
        }

        List<District> list = new ArrayList<District>( districtDtoList.size() );
        for ( DistrictDto districtDto : districtDtoList ) {
            list.add( toDistrict( districtDto ) );
        }

        return list;
    }

    @Override
    public List<DistrictDto> toDistrictDtoList(List<District> districtList) {
        if ( districtList == null ) {
            return null;
        }

        List<DistrictDto> list = new ArrayList<DistrictDto>( districtList.size() );
        for ( District district : districtList ) {
            list.add( toDistrictDto( district ) );
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

    protected CityVillage cityVillageDtoToCityVillage(CityVillageDto cityVillageDto) {
        if ( cityVillageDto == null ) {
            return null;
        }

        CityVillage cityVillage = new CityVillage();

        cityVillage.setId( cityVillageDto.getId() );
        cityVillage.setRegion( regionDtoToRegion( cityVillageDto.getRegion() ) );
        cityVillage.setName( cityVillageDto.getName() );

        return cityVillage;
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

    protected CityVillageDto cityVillageToCityVillageDto(CityVillage cityVillage) {
        if ( cityVillage == null ) {
            return null;
        }

        CityVillageDto cityVillageDto = new CityVillageDto();

        cityVillageDto.setId( cityVillage.getId() );
        cityVillageDto.setRegion( regionToRegionDto( cityVillage.getRegion() ) );
        cityVillageDto.setName( cityVillage.getName() );

        return cityVillageDto;
    }
}
