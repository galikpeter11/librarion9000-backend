package com.galikpeter11.librarion9000.service;

import com.galikpeter11.librarion9000.data.model.Book;
import com.galikpeter11.librarion9000.data.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(final Long id) {
        return bookRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Book saveBook(final Book book) {
        return bookRepository.save(book);
    }

    public void deleteBookById(final Long id) {
        bookRepository.deleteById(id);
    }
}
