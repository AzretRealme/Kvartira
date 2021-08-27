package House.mappers;


import House.models.dto.ImageDto;
import House.models.entities.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ImageMapper {
    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    Image toImage(ImageDto imageDto);
    ImageDto toImageDto(Image image);

    List<Image> toImageList(List<ImageDto> imageDtoList);
    List<ImageDto> toImageDtoList(List<Image> imageList);
}
