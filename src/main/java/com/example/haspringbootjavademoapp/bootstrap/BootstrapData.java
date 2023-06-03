package com.example.haspringbootjavademoapp.bootstrap;

import com.example.haspringbootjavademoapp.domain.Author;
import com.example.haspringbootjavademoapp.domain.Book;
import com.example.haspringbootjavademoapp.domain.Publisher;
import com.example.haspringbootjavademoapp.repository.AuthorRepository;
import com.example.haspringbootjavademoapp.repository.BookRepository;
import com.example.haspringbootjavademoapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher p1 = new Publisher("Pearson", "No 456, Main Street, Colombo 03", "Colombo", "Western Province", "10000");
        publisherRepository.save(p1);

        Author a1 = new Author("Martin", "Fawler");
        Book b1 = new Book("Microservices", "123456789");

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        p1.getBooks().add(b1);
        b1.setPublisher(p1);

        authorRepository.save(a1);
        bookRepository.save(b1);
        publisherRepository.save(p1);

        Author a2 = new Author("Josh", "Long");
        Book b2 = new Book("Springframework", "987654321");

        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);
        p1.getBooks().add(b2);
        b2.setPublisher(p1);

        authorRepository.save(a2);
        bookRepository.save(b2);
        publisherRepository.save(p1);

        System.out.println("Authors count: " + authorRepository.count());
        System.out.println("Books count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
