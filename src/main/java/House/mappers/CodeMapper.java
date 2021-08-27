package House.mappers;


import House.models.dto.CodeDto;
import House.models.entities.Code;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface CodeMapper {
    CodeMapper INSTANCE = Mappers.getMapper(CodeMapper.class);

    Code toCode(CodeDto codeDto);
    CodeDto toCodeDto(Code code);

    List<Code> toCodeList(List<CodeDto> codeDtoList);
    List<CodeDto> toCodeDtoList(List<Code> codeList);
}
