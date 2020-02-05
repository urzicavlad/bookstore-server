package ro.ubbcluj.bookstore.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.ubbcluj.bookstore.server.entity.Order;
import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository<Order, UUID> {
}
