package com.galikpeter11.librarion9000.controller;

import com.galikpeter11.librarion9000.data.model.Book;
import com.galikpeter11.librarion9000.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public Iterable<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/{id}")
    public Book findBookById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody final Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable final Long id) {
        bookService.deleteBookById(id);
    }


}
