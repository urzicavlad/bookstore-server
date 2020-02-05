package ro.ubbcluj.bookstore.server.rest.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.ubbcluj.bookstore.server.entity.Book;
import ro.ubbcluj.bookstore.server.entity.User;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private UUID id;
    private User user;
    private List<Book> books;
}
