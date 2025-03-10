package saman.demo.homework1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Review {

    private final String rating;
    private final String comment;
    private final Book book;

    public Review(Book book, @Value("${review.rating}") String rating, @Value("${review.comment}") String comment) {
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        System.out.println("Review Created: " + rating + " stars, Comment: " + comment);
    }

    @Override
    public String toString() {
        return "Review{book=" + book.getTitle() + ", rating=" + rating + ", comment='" + comment + "'}";
    }
}
