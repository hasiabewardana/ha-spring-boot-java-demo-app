package com.example.ha_spring_boot_java_demo_app.repository;

import com.example.ha_spring_boot_java_demo_app.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
