package com.example.ha_spring_boot_java_demo_app.repository;

import com.example.ha_spring_boot_java_demo_app.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
