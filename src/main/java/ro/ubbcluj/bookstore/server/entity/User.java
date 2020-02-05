package ro.ubbcluj.bookstore.server.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    private UUID id;

    private String firstName;

    private String lastName;

    private String avatar;

    private String username;

    private String password;

    @OneToMany
    private List<Order> orders;

    @OneToMany
    private List<Book> books;
}
