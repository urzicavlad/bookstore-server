package ro.ubbcluj.bookstore.server.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ro.ubbcluj.bookstore.server.entity.Book;

import java.util.List;
import java.util.UUID;

public interface BookService {

    Book save(Book book);

    void deleteById(UUID id);

    Book getById(UUID id);

    List<Book> getAll();

    Page<Book> getBooksPaginated(Pageable pageable);
}
