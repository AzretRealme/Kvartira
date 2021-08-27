package House.services;


import House.models.dto.HouseDto;
import House.models.dto.ImageDto;
import House.models.inputs.InputImageData;

import java.util.List;

public interface ImageService extends BaseCrudService<ImageDto, Long>{
   List<ImageDto>  saveWithInput(List<InputImageData> inputImageDataList);
    void saveWithUrlAndHouse(String url, HouseDto houseDto);
}
