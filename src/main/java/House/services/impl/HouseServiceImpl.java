package House.services.impl;


import House.dao.HouseRepo;
import House.mappers.HouseMapper;
import House.models.dto.HouseDto;
import House.models.entities.House;
import House.models.inputs.InputHouseData;
import House.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseRepo houseRepo;
    @Autowired
    private TypeService typeService;
    @Autowired
    private UserService userService;
    @Autowired
    private CityVillageService cityVillageService;
    @Autowired
    private DistrictService districtService;

    @Override
    public HouseDto saveWithInput(InputHouseData inputHouseData) {
        HouseDto houseDto = new HouseDto();
        houseDto.setAddress(inputHouseData.getAddress());
        houseDto.setArea(inputHouseData.getArea());
        houseDto.setCityVillage(cityVillageService.findById(inputHouseData.getCityVillageId()));
        houseDto.setType(typeService.findById(inputHouseData.getTypeId()));
        houseDto.setUser(userService.findById(inputHouseData.getOwnerUserId()));
        houseDto.setDistrict(districtService.findById(inputHouseData.getDistrictId()));
        houseDto.setFloor(inputHouseData.getFloor());
        houseDto.setFurniture(inputHouseData.isFurniture());
        houseDto.setInternet(inputHouseData.isInternet());
        houseDto.setLat(inputHouseData.getLat());
        houseDto.setLon(inputHouseData.getLon());
        houseDto.setPrice(inputHouseData.getPrice());
        houseDto.setRooms(inputHouseData.getRoom());
        return save(houseDto);
    }

    @Override
    public HouseDto save(HouseDto houseDto) {
         House house = HouseMapper.INSTANCE.toHouse(houseDto);
         house = houseRepo.save(house);
         return HouseMapper.INSTANCE.toHouseDto(house);
    }

    @Override
    public HouseDto update(HouseDto houseDto) {
        return null;
    }

    @Override
    public HouseDto findById(Long id) {
        House house = houseRepo.findById(id).orElseThrow(()->new RuntimeException("Дом не найден!"));
        return HouseMapper.INSTANCE.toHouseDto(house);
    }

    @Override
    public List<HouseDto> findAll() {
        return null;
    }
}
