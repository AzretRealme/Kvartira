package House.mappers;

import House.models.dto.TypeDto;
import House.models.entities.Type;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T16:19:15+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class TypeMapperImpl implements TypeMapper {

    @Override
    public Type toType(TypeDto typeDto) {
        if ( typeDto == null ) {
            return null;
        }

        Type type = new Type();

        type.setId( typeDto.getId() );
        type.setName( typeDto.getName() );
        type.setActive( typeDto.isActive() );

        return type;
    }

    @Override
    public TypeDto toTypeDto(Type type) {
        if ( type == null ) {
            return null;
        }

        TypeDto typeDto = new TypeDto();

        typeDto.setId( type.getId() );
        typeDto.setName( type.getName() );
        typeDto.setActive( type.isActive() );

        return typeDto;
    }

    @Override
    public List<Type> toTypeList(List<TypeDto> typeDtoList) {
        if ( typeDtoList == null ) {
            return null;
        }

        List<Type> list = new ArrayList<Type>( typeDtoList.size() );
        for ( TypeDto typeDto : typeDtoList ) {
            list.add( toType( typeDto ) );
        }

        return list;
    }

    @Override
    public List<TypeDto> toTypeDtoList(List<Type> typeList) {
        if ( typeList == null ) {
            return null;
        }

        List<TypeDto> list = new ArrayList<TypeDto>( typeList.size() );
        for ( Type type : typeList ) {
            list.add( toTypeDto( type ) );
        }

        return list;
    }
}
