package saman.demo.homework1;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewManager {
    private final List<Review> reviews = new ArrayList<>();

    public void addReview(Review review) {
        reviews.add(review);
        System.out.println("Review Added: " + review);
    }

    public void displayReviewsForBook(Book book) {
        System.out.println("Displaying Reviews for Book: " + book.getTitle());
        reviews.stream()
                .filter(review -> review.toString().contains(book.getTitle()))
                .forEach(System.out::println);
    }
}
