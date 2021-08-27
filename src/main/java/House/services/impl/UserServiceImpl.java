package House.services.impl;

import House.dao.UserRepo;
import House.mappers.UserMapper;
import House.models.dto.UserDto;
import House.models.entities.User;
import House.services.CodeService;
import House.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CodeService codeService;

    @Override
    public UserDto save(UserDto userDto) {

        User user = UserMapper.INSTANCE.toUser(userDto);
        user = userRepo.save(user);
        return UserMapper.INSTANCE.toUserDto(user);
    }

    @Override
    public UserDto update(UserDto userDto) {
        User user = UserMapper.INSTANCE.toUser(userDto);
        user = userRepo.save(user);
        return UserMapper.INSTANCE.toUserDto(user);
    }

    @Override
    public UserDto findById(Long id) {
        User user = userRepo.findById(id).orElseThrow(()-> new RuntimeException("Пользователь не найден!"));
        return UserMapper.INSTANCE.toUserDto(user);
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }
}
