package com.example.haspringbootjavademoapp.repository;

import com.example.haspringbootjavademoapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
