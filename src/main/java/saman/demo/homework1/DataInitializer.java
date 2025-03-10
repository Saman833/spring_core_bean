package saman.demo.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Autowired
    public DataInitializer(BookCatalog bookCatalog, ReviewManager reviewManager, Book book1, Book book2, Book book3) {
        System.out.println("Constructor Injection: DataInitializer Created");

        bookCatalog.addBook(book1);
        bookCatalog.addBook(book2);
        bookCatalog.addBook(book3);

        reviewManager.addReview(new Review(book1, "5", "Amazing dystopian novel!"));
        reviewManager.addReview(new Review(book2, "4", "A powerful story of injustice."));
        reviewManager.addReview(new Review(book3, "3", "A timeless classic."));
    }
}
