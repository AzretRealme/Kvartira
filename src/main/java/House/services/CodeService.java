package House.services;


import House.models.dto.CodeDto;
import House.models.dto.UserDto;
import House.models.inputs.InputUserData;

public interface CodeService extends BaseCrudService<CodeDto, Long>{
//    CodeDto findCodeById(Long id);
//    InputUserData chekCode(long code_id, long user_code);
//    CodeDto saveForCode(CodeDto codeDto);

    CodeDto findCodeById(Long id);

    InputUserData chekCode(long code_id, long user_code);

    CodeDto saveForCode(CodeDto codeDto);

    void sendCode(UserDto userDtoSaved);

    boolean putCode(long code, Long userId);

    CodeDto findByUserId(Long id);
}
