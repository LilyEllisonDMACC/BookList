/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Oct 17, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Book;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Oct 17, 2023
 */
@Configuration
public class BeanConfiguration {
	
//	@Bean
//	public Book book() {
//		Book bean = new Book();
//		return bean;
//	}
	
	@Bean
	public Book book() {
		Book bean = new Book("Holy Bible");
//		bean.setTitle("The Colour of Magic");
//		bean.setAuthor("Terry Pratchett");
//		bean.setTopic("Parody");
//		bean.setPrice(7.99);
		return bean;
	}
}
