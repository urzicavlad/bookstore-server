package ro.ubbcluj.bookstore.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ro.ubbcluj.bookstore.server.entity.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {

    Optional<User> findByUsername(String username);
}
