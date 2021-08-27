package House.mappers;

import House.models.dto.RegionDto;
import House.models.entities.Region;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface RegionMapper {
    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);

    Region toRegion(RegionDto regionDto);
    RegionDto toRegionDto(Region region);

    List<Region> toRegionList(List<RegionDto> regionDtoList);
    List<RegionDto> toRegionDtoList(List<Region> regionList);
}
