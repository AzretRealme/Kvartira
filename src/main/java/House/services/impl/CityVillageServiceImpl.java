package House.services.impl;


import House.dao.CityVillageRepo;
import House.mappers.CityVillageMapper;
import House.models.dto.CityVillageDto;
import House.models.entities.CityVillage;
import House.services.CityVillageService;
import House.services.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityVillageServiceImpl implements CityVillageService {
    private CityVillageRepo cityVillageRepo;
    private RegionService regionService;


    @Override
    public CityVillageDto save(CityVillageDto cityVillageDto) {
        CityVillage cityVillage = CityVillageMapper.INSTANCE.toCityVillage(cityVillageDto);
        cityVillage = cityVillageRepo.save(cityVillage);
        return CityVillageMapper.INSTANCE.toCityVillageDto(cityVillage);
    }

    @Override
    public CityVillageDto update(CityVillageDto cityVillageDto) {
        return null;
    }

    @Override
    public CityVillageDto findById(Long id) {
        CityVillage cityVillage = cityVillageRepo.findById(id).orElseThrow(()->new RuntimeException("CityVillage not found"));
        return CityVillageMapper.INSTANCE.toCityVillageDto(cityVillage);
    }

    @Override
    public List<CityVillageDto> findAll() {
        return null;
    }
}
