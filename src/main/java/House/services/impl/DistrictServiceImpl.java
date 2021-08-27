package House.services.impl;

import House.dao.DistrictRepo;
import House.mappers.DistrictMapper;
import House.models.dto.DistrictDto;
import House.models.entities.District;
import House.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictRepo districtRepo;

    @Override
    public DistrictDto findByCityVillageID(Long id) {
        return null;
    }

    @Override
    public DistrictDto save(DistrictDto districtDto) {
        District district = DistrictMapper.INSTANCE.toDistrict(districtDto);
        district = districtRepo.save(district);
        return DistrictMapper.INSTANCE.toDistrictDto(district);
    }

    @Override
    public DistrictDto update(DistrictDto districtDto) {
        return null;
    }

    @Override
    public DistrictDto findById(Long id) {
        District district = districtRepo.findById(id).orElseThrow(()->new RuntimeException("Район по айди не найден!"));
        return DistrictMapper.INSTANCE.toDistrictDto(district);

    }

    @Override
    public List<DistrictDto> findAll() {
        return null;
    }
}
