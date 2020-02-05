package ro.ubbcluj.bookstore.server.rest.v1.mapper;

import ro.ubbcluj.bookstore.server.entity.User;
import ro.ubbcluj.bookstore.server.rest.v1.dto.UserDto;

public class UserMapper {

    public static UserDto mapToDto(final User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .avatar(user.getAvatar())
                .username(user.getUsername())
                .build();
    }

    public static User mapToEntity(final UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .avatar(userDto.getAvatar())
                .username(userDto.getUsername())
                .build();
    }
}
