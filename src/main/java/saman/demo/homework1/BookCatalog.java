package saman.demo.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookCatalog {

    private final List<Book> books = new ArrayList<>();
    private final ReviewManager reviewManager;

    @Autowired
    public BookCatalog(ReviewManager reviewManager) {
        this.reviewManager = reviewManager;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added to Catalog: " + book.getTitle());
    }

    public void displayCatalog() {
        System.out.println("Displaying Book Catalog:");
        books.forEach(book -> {
            System.out.println(book);
            reviewManager.displayReviewsForBook(book);
        });
    }
}
