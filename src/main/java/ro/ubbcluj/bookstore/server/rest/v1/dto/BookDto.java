package ro.ubbcluj.bookstore.server.rest.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private UUID id;
    private String title;
    private String author;
    private String year;
    private String shortDescription;
    private String publisher;
    private String city;
    private Double price;
}
