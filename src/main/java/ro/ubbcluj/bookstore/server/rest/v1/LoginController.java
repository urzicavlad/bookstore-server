package ro.ubbcluj.bookstore.server.rest.v1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ubbcluj.bookstore.server.rest.v1.dto.LoginDto;
import ro.ubbcluj.bookstore.server.service.LoginService;

@RestController
@RequestMapping(value = "/login")
@CrossOrigin(origins = {"*"})
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public LoginDto login(@RequestBody LoginDto loginDto) {
        return loginService.login(loginDto);
    }
}
