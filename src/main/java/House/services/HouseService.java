package House.services;


import House.models.dto.HouseDto;
import House.models.inputs.InputHouseData;

public interface HouseService extends BaseCrudService<HouseDto, Long>{

    HouseDto saveWithInput(InputHouseData inputHouseData);
}
