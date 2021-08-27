package House.services;


import House.models.dto.DistrictDto;

public interface DistrictService extends BaseCrudService<DistrictDto, Long>{
    DistrictDto findByCityVillageID(Long id);
}
