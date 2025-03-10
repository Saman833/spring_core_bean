package saman.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import saman.demo.homework1.BookCatalog;

public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

		BookCatalog bookCatalog = context.getBean(BookCatalog.class);
		bookCatalog.displayCatalog();
	}
}