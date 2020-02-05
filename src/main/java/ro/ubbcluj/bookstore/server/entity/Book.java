package ro.ubbcluj.bookstore.server.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
public class Book {

    @Id
    private UUID id;

    private String title;

    private String shortDescription;

    private String author;

    private String year;

    private String publisher;

    private String city;

    private Double price;
}
