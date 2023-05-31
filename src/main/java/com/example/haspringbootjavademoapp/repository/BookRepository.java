package com.example.haspringbootjavademoapp.repository;

import com.example.haspringbootjavademoapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
