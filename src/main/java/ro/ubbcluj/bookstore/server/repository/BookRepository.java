package ro.ubbcluj.bookstore.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ro.ubbcluj.bookstore.server.entity.Book;

import java.util.UUID;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, UUID> {
}
