package House.services.impl;


import House.dao.RegionRepo;
import House.mappers.RegionMapper;
import House.models.dto.RegionDto;
import House.models.entities.Region;
import House.services.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService {
//    @Autowired
    private RegionRepo regionRepo;

    @Override
    public RegionDto save(RegionDto regionDto) {
       Region region = RegionMapper.INSTANCE.toRegion(regionDto);
       region = regionRepo.save(region);
       return RegionMapper.INSTANCE.toRegionDto(region);
    }

    @Override
    public RegionDto update(RegionDto regionDto) {
        return null;
    }

    @Override
    public RegionDto findById(Long id) {

        Region region = regionRepo.findById(id).orElseThrow(()->new RuntimeException("Регион по айди не найден!"));
        return RegionMapper.INSTANCE.toRegionDto(region);
    }

    @Override
    public List<RegionDto> findAll() {
        return null;
    }
}
