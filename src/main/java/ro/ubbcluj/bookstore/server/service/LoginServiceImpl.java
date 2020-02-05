package ro.ubbcluj.bookstore.server.service;

import org.springframework.stereotype.Service;
import ro.ubbcluj.bookstore.server.entity.User;
import ro.ubbcluj.bookstore.server.rest.v1.dto.LoginDto;
import ro.ubbcluj.bookstore.server.rest.v1.mapper.UserMapper;

@Service
public class LoginServiceImpl implements LoginService {

    private UserService userService;

    public LoginServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public LoginDto login(LoginDto loginDto) {
        User user = userService.findByUsername(loginDto.getUsername());

        if (user.getPassword().equals(loginDto.getPassword())) {
            LoginDto loginDto1 = new LoginDto();
            loginDto1.setUsername(loginDto.getUsername());
            loginDto1.setPassword(loginDto.getPassword());
            loginDto1.setUserDto(UserMapper.mapToDto(user));
            return loginDto1;
        } else {
            return loginDto;
        }
    }
}
