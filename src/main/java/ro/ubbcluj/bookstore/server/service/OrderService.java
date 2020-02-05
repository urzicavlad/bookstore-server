package ro.ubbcluj.bookstore.server.service;

import ro.ubbcluj.bookstore.server.entity.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    Order save(Order order);

    List<Order> getClientOrders(UUID id);
}
