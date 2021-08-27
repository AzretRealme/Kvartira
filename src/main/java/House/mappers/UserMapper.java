package House.mappers;


import House.models.dto.UserDto;
import House.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface UserMapper{

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(UserDto userDto);
    UserDto toUserDto(User user);

    List<User> toUserList(List<UserDto> userDtoList);
    List<UserDto> toUserDtoList(List<User> userList);
}
