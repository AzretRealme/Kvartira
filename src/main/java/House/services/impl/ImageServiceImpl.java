package House.services.impl;

import House.dao.ImageRepo;
import House.mappers.HouseMapper;
import House.mappers.ImageMapper;
import House.models.dto.HouseDto;
import House.models.dto.ImageDto;
import House.models.entities.Image;
import House.models.inputs.InputImageData;
import House.services.HouseService;
import House.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepo imageRepo;
    @Autowired
    private HouseService houseService;

    @Override
    public List<ImageDto> saveWithInput(List<InputImageData> inputImageDataList) {

        return inputImageDataList.stream().map(x-> {
            ImageDto image = new ImageDto();
            image.setHouse(houseService.findById(x.getHouseId()));
            image.setOrderNum(x.getOrderNum());
            image.setUrl(x.getUrl());
            return save(image);
        }).collect(Collectors.toList());
    }

    @Override
    public void saveWithUrlAndHouse(String url, HouseDto houseDto) {
        ImageDto imageDto = new ImageDto();
        imageDto.setHouse(houseDto);
        imageDto.setUrl(url);
    }

    @Override
    public ImageDto save(ImageDto imageDto) {
        Image image = ImageMapper.INSTANCE.toImage(imageDto);
        image = imageRepo.save(image);
        return ImageMapper.INSTANCE.toImageDto(image);
    }

    @Override
    public ImageDto update(ImageDto imageDto) {
        return null;
    }

    @Override
    public ImageDto findById(Long id) {
        Image image = imageRepo.findById(id).orElseThrow(()->new RuntimeException("Image не найден!"));
        return ImageMapper.INSTANCE.toImageDto(image);
    }

    @Override
    public List<ImageDto> findAll() {
        return null;
    }
}
