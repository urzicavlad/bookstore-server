package ro.ubbcluj.bookstore.server.service;

import ro.ubbcluj.bookstore.server.rest.v1.dto.LoginDto;

public interface LoginService {

    LoginDto login(LoginDto loginDto);
}
