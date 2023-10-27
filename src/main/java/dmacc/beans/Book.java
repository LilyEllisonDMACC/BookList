/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Oct 17, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Oct 17, 2023
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String title;
	@Column
	private String author;
	@Column
	private String topic;
	@Column
	private double price;
	

}