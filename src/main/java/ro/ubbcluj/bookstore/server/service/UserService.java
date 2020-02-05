package ro.ubbcluj.bookstore.server.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ro.ubbcluj.bookstore.server.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User save(User user);

    void deleteById(UUID id);

    User getById(UUID id);

    List<User> getAll();

    Page<User> getClientsPaginated(Pageable pageable);

    User findByUsername(String username);
}
