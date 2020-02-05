package ro.ubbcluj.bookstore.server.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ro.ubbcluj.bookstore.server.entity.User;
import ro.ubbcluj.bookstore.server.exception.UserNotFoundException;
import ro.ubbcluj.bookstore.server.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found!"));
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Page<User> getClientsPaginated(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User not found!"));
    }
}
