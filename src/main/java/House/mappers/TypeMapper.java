package House.mappers;


import House.models.dto.TypeDto;
import House.models.entities.Type;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface TypeMapper{
    TypeMapper INSTANCE = Mappers.getMapper(TypeMapper.class);

    Type toType(TypeDto typeDto);
    TypeDto toTypeDto(Type type);

    List<Type> toTypeList(List<TypeDto> typeDtoList);
    List<TypeDto> toTypeDtoList(List<Type> typeList);
}
