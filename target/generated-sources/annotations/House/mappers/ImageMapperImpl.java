package House.mappers;

import House.models.dto.CityVillageDto;
import House.models.dto.DistrictDto;
import House.models.dto.HouseDto;
import House.models.dto.ImageDto;
import House.models.dto.RegionDto;
import House.models.dto.TypeDto;
import House.models.dto.UserDto;
import House.models.entities.CityVillage;
import House.models.entities.District;
import House.models.entities.House;
import House.models.entities.Image;
import House.models.entities.Region;
import House.models.entities.Type;
import House.models.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T16:19:15+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class ImageMapperImpl implements ImageMapper {

    @Override
    public Image toImage(ImageDto imageDto) {
        if ( imageDto == null ) {
            return null;
        }

        Image image = new Image();

        image.setId( imageDto.getId() );
        image.setHouse( houseDtoToHouse( imageDto.getHouse() ) );
        image.setUrl( imageDto.getUrl() );
        image.setOrderNum( imageDto.getOrderNum() );

        return image;
    }

    @Override
    public ImageDto toImageDto(Image image) {
        if ( image == null ) {
            return null;
        }

        ImageDto imageDto = new ImageDto();

        imageDto.setId( image.getId() );
        imageDto.setHouse( houseToHouseDto( image.getHouse() ) );
        imageDto.setUrl( image.getUrl() );
        imageDto.setOrderNum( image.getOrderNum() );

        return imageDto;
    }

    @Override
    public List<Image> toImageList(List<ImageDto> imageDtoList) {
        if ( imageDtoList == null ) {
            return null;
        }

        List<Image> list = new ArrayList<Image>( imageDtoList.size() );
        for ( ImageDto imageDto : imageDtoList ) {
            list.add( toImage( imageDto ) );
        }

        return list;
    }

    @Override
    public List<ImageDto> toImageDtoList(List<Image> imageList) {
        if ( imageList == null ) {
            return null;
        }

        List<ImageDto> list = new ArrayList<ImageDto>( imageList.size() );
        for ( Image image : imageList ) {
            list.add( toImageDto( image ) );
        }

        return list;
    }

    protected Type typeDtoToType(TypeDto typeDto) {
        if ( typeDto == null ) {
            return null;
        }

        Type type = new Type();

        type.setId( typeDto.getId() );
        type.setName( typeDto.getName() );
        type.setActive( typeDto.isActive() );

        return type;
    }

    protected User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setPhone( userDto.getPhone() );
        user.setBlockDate( userDto.getBlockDate() );

        return user;
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

    protected District districtDtoToDistrict(DistrictDto districtDto) {
        if ( districtDto == null ) {
            return null;
        }

        District district = new District();

        district.setId( districtDto.getId() );
        district.setCityVillage( cityVillageDtoToCityVillage( districtDto.getCityVillage() ) );
        district.setName( districtDto.getName() );

        return district;
    }

    protected House houseDtoToHouse(HouseDto houseDto) {
        if ( houseDto == null ) {
            return null;
        }

        House house = new House();

        house.setId( houseDto.getId() );
        house.setRooms( houseDto.getRooms() );
        house.setDescriptions( houseDto.getDescriptions() );
        house.setFloor( houseDto.getFloor() );
        house.setArea( houseDto.getArea() );
        house.setPrice( houseDto.getPrice() );
        house.setType( typeDtoToType( houseDto.getType() ) );
        house.setInternet( houseDto.isInternet() );
        house.setFurniture( houseDto.isFurniture() );
        house.setUser( userDtoToUser( houseDto.getUser() ) );
        house.setCityVillage( cityVillageDtoToCityVillage( houseDto.getCityVillage() ) );
        house.setDistrict( districtDtoToDistrict( houseDto.getDistrict() ) );
        house.setAddDate( houseDto.getAddDate() );
        house.setEditDate( houseDto.getEditDate() );
        house.setLat( houseDto.getLat() );
        house.setLon( houseDto.getLon() );
        house.setAddress( houseDto.getAddress() );

        return house;
    }

    protected TypeDto typeToTypeDto(Type type) {
        if ( type == null ) {
            return null;
        }

        TypeDto typeDto = new TypeDto();

        typeDto.setId( type.getId() );
        typeDto.setName( type.getName() );
        typeDto.setActive( type.isActive() );

        return typeDto;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setPhone( user.getPhone() );
        userDto.setBlockDate( user.getBlockDate() );

        return userDto;
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

    protected DistrictDto districtToDistrictDto(District district) {
        if ( district == null ) {
            return null;
        }

        DistrictDto districtDto = new DistrictDto();

        districtDto.setId( district.getId() );
        districtDto.setCityVillage( cityVillageToCityVillageDto( district.getCityVillage() ) );
        districtDto.setName( district.getName() );

        return districtDto;
    }

    protected HouseDto houseToHouseDto(House house) {
        if ( house == null ) {
            return null;
        }

        HouseDto houseDto = new HouseDto();

        houseDto.setId( house.getId() );
        houseDto.setRooms( house.getRooms() );
        houseDto.setDescriptions( house.getDescriptions() );
        houseDto.setFloor( house.getFloor() );
        houseDto.setArea( house.getArea() );
        houseDto.setPrice( house.getPrice() );
        houseDto.setType( typeToTypeDto( house.getType() ) );
        houseDto.setInternet( house.isInternet() );
        houseDto.setFurniture( house.isFurniture() );
        houseDto.setUser( userToUserDto( house.getUser() ) );
        houseDto.setCityVillage( cityVillageToCityVillageDto( house.getCityVillage() ) );
        houseDto.setDistrict( districtToDistrictDto( house.getDistrict() ) );
        houseDto.setAddDate( house.getAddDate() );
        houseDto.setEditDate( house.getEditDate() );
        houseDto.setLat( house.getLat() );
        houseDto.setLon( house.getLon() );
        houseDto.setAddress( house.getAddress() );

        return houseDto;
    }
}
