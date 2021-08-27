package House.mappers;

import House.models.dto.CodeDto;
import House.models.dto.RequestDto;
import House.models.dto.UserDto;
import House.models.entities.Code;
import House.models.entities.Request;
import House.models.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-27T15:48:17+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class RequestMapperImpl implements RequestMapper {

    @Override
    public Request toRequest(RequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Request request = new Request();

        request.setId( requestDto.getId() );
        request.setAddDate( requestDto.getAddDate() );
        request.setSuccess( requestDto.isSuccess() );
        request.setCode( codeDtoToCode( requestDto.getCode() ) );

        return request;
    }

    @Override
    public RequestDto toRequestDto(Request request) {
        if ( request == null ) {
            return null;
        }

        RequestDto requestDto = new RequestDto();

        requestDto.setId( request.getId() );
        requestDto.setAddDate( request.getAddDate() );
        requestDto.setSuccess( request.isSuccess() );
        requestDto.setCode( codeToCodeDto( request.getCode() ) );

        return requestDto;
    }

    @Override
    public List<Request> toRequestList(List<RequestDto> requestDtoList) {
        if ( requestDtoList == null ) {
            return null;
        }

        List<Request> list = new ArrayList<Request>( requestDtoList.size() );
        for ( RequestDto requestDto : requestDtoList ) {
            list.add( toRequest( requestDto ) );
        }

        return list;
    }

    @Override
    public List<RequestDto> toRequestDtoList(List<Request> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<RequestDto> list = new ArrayList<RequestDto>( requestList.size() );
        for ( Request request : requestList ) {
            list.add( toRequestDto( request ) );
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

    protected Code codeDtoToCode(CodeDto codeDto) {
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

    protected CodeDto codeToCodeDto(Code code) {
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
}
