package com.example.haspringbootjavademoapp.bootstrap;

import com.example.haspringbootjavademoapp.domain.Author;
import com.example.haspringbootjavademoapp.domain.Book;
import com.example.haspringbootjavademoapp.repository.AuthorRepository;
import com.example.haspringbootjavademoapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author("Martin", "Fawler");
        Book b1 = new Book("Microservices", "123456789");

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        authorRepository.save(a1);
        bookRepository.save(b1);

        Author a2 = new Author("Josh", "Long");
        Book b2 = new Book("Springframework", "987654321");

        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        authorRepository.save(a2);
        bookRepository.save(b2);

        System.out.println("Authors count: " + authorRepository.count());
        System.out.println("Books count: " + bookRepository.count());
    }
}
