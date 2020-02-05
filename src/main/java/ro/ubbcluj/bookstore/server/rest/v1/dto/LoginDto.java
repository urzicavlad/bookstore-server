package ro.ubbcluj.bookstore.server.rest.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {

    private String username;
    private String password;
    private UserDto userDto;
}
