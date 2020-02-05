package ro.ubbcluj.bookstore.server.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="order")
public class Order {

    @Id
    private UUID id;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Book> books;
}
