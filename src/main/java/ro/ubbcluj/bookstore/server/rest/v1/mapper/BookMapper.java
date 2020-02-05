package ro.ubbcluj.bookstore.server.rest.v1.mapper;

import ro.ubbcluj.bookstore.server.entity.Book;
import ro.ubbcluj.bookstore.server.rest.v1.dto.BookDto;

public class BookMapper {

    public static BookDto mapToDto(final Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .shortDescription(book.getShortDescription())
                .publisher(book.getPublisher())
                .city(book.getCity())
                .year(book.getYear())
                .price(book.getPrice())
                .build();
    }

    public static Book mapToEntity(final BookDto bookDto) {
        return Book.builder()
                .id(bookDto.getId())
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .shortDescription(bookDto.getShortDescription())
                .publisher(bookDto.getPublisher())
                .city(bookDto.getCity())
                .year(bookDto.getYear())
                .price(bookDto.getPrice())
                .build();
    }
}
