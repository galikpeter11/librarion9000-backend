package com.galikpeter11.librarion9000;

import com.galikpeter11.librarion9000.data.model.Book;
import com.galikpeter11.librarion9000.data.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    final Logger log = LoggerFactory.getLogger(getClass());
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1L, "The Hunger Games", 2008, 374, "Lorem Ipsum..."));
        books.add(new Book(2L, "Harry Potter and the Order of the Phoenix", 2004, 870, "Lorem Ipsum..."));
        books.add(new Book(3L, "To Kill a Mockingbird", 2006, 324, "Lorem Ipsum..."));
        books.add(new Book(4L, "Pride and Prejudice", 2000, 279, "Lorem Ipsum..."));
        books.add(new Book(5L, "The Book Thief", 2006, 552, "Lorem Ipsum..."));

        books.stream()
                .peek(book -> log.info("Saving '{}'", book.getTitle()))
                .forEach(bookRepository::save);
    }
}
