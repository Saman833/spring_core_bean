package saman.demo.homework1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    private final String title;
    private final String author;

    // Constructor-based injection
    public Book(@Value("${book.title}") String title, @Value("${book.author}") String author) {
        this.title = title;
        this.author = author;
        System.out.println("Book Created: " + title + " by " + author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
