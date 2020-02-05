package ro.ubbcluj.bookstore.server.service;

import org.springframework.stereotype.Service;
import ro.ubbcluj.bookstore.server.entity.Order;
import ro.ubbcluj.bookstore.server.repository.OrderRepository;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getClientOrders(UUID id) {
        return null;
    }
}
