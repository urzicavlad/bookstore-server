package ro.ubbcluj.bookstore.server.rest.v1;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ro.ubbcluj.bookstore.server.entity.User;
import ro.ubbcluj.bookstore.server.rest.v1.dto.UserDto;
import ro.ubbcluj.bookstore.server.rest.v1.mapper.UserMapper;
import ro.ubbcluj.bookstore.server.service.UserService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDto add(@RequestBody User user) {
        return UserMapper.mapToDto(userService.save(user));
    }

    @PutMapping
    public UserDto update(@RequestBody User user) {
        return UserMapper.mapToDto(userService.save(user));
    }

    @GetMapping("/{userId}")
    public UserDto getById(@PathVariable UUID userId) {
        return UserMapper.mapToDto(userService.getById(userId));
    }

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable UUID userId) {
        userService.deleteById(userId);
    }

    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll()
                .stream()
                .map(UserMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping(params = {"page", "size", "sort"})
    public Page<UserDto> findPaginated(Pageable pageable) {
        return userService.getClientsPaginated(pageable)
                .map(UserMapper::mapToDto);
    }
}
