package ro.ubbcluj.bookstore.server.rest.v1.mapper;

import ro.ubbcluj.bookstore.server.entity.Order;
import ro.ubbcluj.bookstore.server.rest.v1.dto.OrderDto;

public class OrderMapper {

    public static OrderDto mapToDto(final Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .user(order.getUser())
                .books(order.getBooks())
                .build();
    }

    public static Order mapToEntity(final OrderDto orderDto) {
        return Order.builder()
                .id(orderDto.getId())
                .user(orderDto.getUser())
                .books(orderDto.getBooks())
                .build();
    }
}
