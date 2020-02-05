package ro.ubbcluj.bookstore.server.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ro.ubbcluj.bookstore.server.entity.Book;
import ro.ubbcluj.bookstore.server.exception.BookNotFoundException;
import ro.ubbcluj.bookstore.server.repository.BookRepository;

import java.util.List;
import java.util.UUID;

import static java.util.Objects.isNull;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        if (isNull(book.getId())) book.setId(UUID.randomUUID());
        return bookRepository.save(book);
    }

    @Override
    public void deleteById(UUID id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book getById(UUID id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found!"));
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Page<Book> getBooksPaginated(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
}
