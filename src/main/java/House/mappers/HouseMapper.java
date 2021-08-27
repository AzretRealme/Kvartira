package House.mappers;


import House.models.dto.HouseDto;
import House.models.entities.House;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface HouseMapper {
    HouseMapper INSTANCE = Mappers.getMapper(HouseMapper.class);

    House toHouse(HouseDto houseDto);
    HouseDto toHouseDto(House house);

    List<House> toHouseList(List<HouseDto> houseDtoList);
    List<HouseDto> toHouseDtoList(List<House> houseList);
}
