package House.mappers;

import House.models.dto.CodeDto;
import House.models.dto.UserDto;
import House.models.entities.Code;
import House.models.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T16:19:15+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class CodeMapperImpl implements CodeMapper {

    @Override
    public Code toCode(CodeDto codeDto) {
        if ( codeDto == null ) {
            return null;
        }

        Code code = new Code();

        code.setId( codeDto.getId() );
        code.setCode( codeDto.getCode() );
        code.setStartDate( codeDto.getStartDate() );
        code.setEndDate( codeDto.getEndDate() );
        code.setCodeStatus( codeDto.getCodeStatus() );
        code.setUser( userDtoToUser( codeDto.getUser() ) );

        return code;
    }

    @Override
    public CodeDto toCodeDto(Code code) {
        if ( code == null ) {
            return null;
        }

        CodeDto codeDto = new CodeDto();

        codeDto.setId( code.getId() );
        codeDto.setCode( code.getCode() );
        codeDto.setStartDate( code.getStartDate() );
        codeDto.setEndDate( code.getEndDate() );
        codeDto.setCodeStatus( code.getCodeStatus() );
        codeDto.setUser( userToUserDto( code.getUser() ) );

        return codeDto;
    }

    @Override
    public List<Code> toCodeList(List<CodeDto> codeDtoList) {
        if ( codeDtoList == null ) {
            return null;
        }

        List<Code> list = new ArrayList<Code>( codeDtoList.size() );
        for ( CodeDto codeDto : codeDtoList ) {
            list.add( toCode( codeDto ) );
        }

        return list;
    }

    @Override
    public List<CodeDto> toCodeDtoList(List<Code> codeList) {
        if ( codeList == null ) {
            return null;
        }

        List<CodeDto> list = new ArrayList<CodeDto>( codeList.size() );
        for ( Code code : codeList ) {
            list.add( toCodeDto( code ) );
        }

        return list;
    }

    protected User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setPhone( userDto.getPhone() );
        user.setBlockDate( userDto.getBlockDate() );

        return user;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setPhone( user.getPhone() );
        userDto.setBlockDate( user.getBlockDate() );

        return userDto;
    }
}
