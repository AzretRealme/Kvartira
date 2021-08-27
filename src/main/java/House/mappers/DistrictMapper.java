package House.mappers;


import House.models.dto.DistrictDto;
import House.models.entities.District;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface DistrictMapper {
    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);

    District toDistrict(DistrictDto districtDto);
    DistrictDto toDistrictDto(District district);

    List<District> toDistrictList(List<DistrictDto> districtDtoList);
    List<DistrictDto> toDistrictDtoList(List<District> districtList);
}
