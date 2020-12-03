package com.galikpeter11.librarion9000.data.repository;

import com.galikpeter11.librarion9000.data.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
