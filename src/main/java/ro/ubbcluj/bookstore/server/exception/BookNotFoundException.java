package ro.ubbcluj.bookstore.server.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}
