package saman.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import saman.demo.homework1.*;

import java.util.List;

@ComponentScan("saman.demo")
@Configuration
public class ConfigurationClass {

    @Bean
    @Primary
    public Book book1() {
        return new Book("1984", "George Orwell");
    }

    @Bean
    public Book book2() {
        return new Book("To Kill a Mockingbird", "Harper Lee");
    }

    @Bean
    public Book book3() {
        return new Book("The Great Gatsby", "F. Scott Fitzgerald");
    }

    @Bean
    public Review review1(Book book1) {
        return new Review(book1, "5", "Amazing dystopian novel!");
    }

    @Bean
    public Review review2(Book book2) {
        return new Review(book2, "4", "A powerful story of injustice.");
    }

    @Bean
    public Review review3(Book book3) {
        return new Review(book3, "3", "A timeless classic.");
    }

    @Bean
    public DataInitializer dataInitializer(BookCatalog bookCatalog, ReviewManager reviewManager, Book book1, Book book2, Book book3) {
        return new DataInitializer(bookCatalog, reviewManager, book1, book2, book3);
    }

}
