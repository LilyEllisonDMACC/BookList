package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Book;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.BookRepository;

@SpringBootApplication
public class BookListApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BookListApplication.class, args);
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		Book b = appContext.getBean("book", Book.class);
//		
//		System.out.println(b.toString());
	}
	
	@Autowired
	BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book b = appContext.getBean("book", Book.class);
		b.setTopic("Chemistry");
		repo.save(b);
		
		Book k = new Book("Dog Train", "Sandra Boynton", "Childrens", 5.99);
		repo.save(k);
		
		List<Book> allMyBooks = repo.findAll();
		for(Book book: allMyBooks) {
			System.out.println(book.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	
	

}
