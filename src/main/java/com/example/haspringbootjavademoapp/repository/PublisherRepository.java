package com.example.haspringbootjavademoapp.repository;

import com.example.haspringbootjavademoapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
