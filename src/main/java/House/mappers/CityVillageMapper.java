package House.mappers;


import House.models.dto.CityVillageDto;
import House.models.entities.CityVillage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface CityVillageMapper {
    CityVillageMapper INSTANCE = Mappers.getMapper(CityVillageMapper.class);

    CityVillage toCityVillage(CityVillageDto cityVillageDto);
    CityVillageDto toCityVillageDto(CityVillage cityVillage);

    List<CityVillage> toCityVillageList(List<CityVillageDto> cityVillageDtoList);
    List<CityVillageDto> toCityVillageDtoList(List<CityVillage> cityVillageList);
}
