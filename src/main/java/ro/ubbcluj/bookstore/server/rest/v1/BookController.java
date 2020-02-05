package ro.ubbcluj.bookstore.server.rest.v1;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ro.ubbcluj.bookstore.server.entity.Book;
import ro.ubbcluj.bookstore.server.rest.v1.dto.BookDto;
import ro.ubbcluj.bookstore.server.rest.v1.mapper.BookMapper;
import ro.ubbcluj.bookstore.server.service.BookService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/books")
//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
@CrossOrigin(origins = {"*"})
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping
    public BookDto update(@RequestBody Book book) {
        return BookMapper.mapToDto(bookService.save(book));
    }

    @PostMapping
    public BookDto add(@RequestBody Book book) {
        return BookMapper.mapToDto(bookService.save(book));
    }

    @GetMapping("/{bookId}")
    public BookDto getById(@PathVariable UUID bookId) {
        return BookMapper.mapToDto(bookService.getById(bookId));
    }

    @DeleteMapping("/{bookId}")
    public void deleteById(@PathVariable UUID bookId) {
        bookService.deleteById(bookId);
    }

    @GetMapping
    public List<BookDto> getAll() {
        return bookService.getAll()
                .stream()
                .map(BookMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping(params = {"page", "size", "sort"})
    public Page<BookDto> findPaginated(Pageable pageable) {
        return bookService.getBooksPaginated(pageable)
                .map(BookMapper::mapToDto);
    }
}
