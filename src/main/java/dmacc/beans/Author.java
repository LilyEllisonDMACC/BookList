/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Oct 26, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Oct 26, 2023
 */
@Data
@Embeddable
public class Author {
	private String firstName;
	private String lastName;
	
	public Author() {
		super();
		this.lastName = "Anonymous";
		this.firstName = "";
	}
	
	public Author(String lastName) {
		super();
		this.lastName = lastName;
		this.firstName = "";
	}
	

	public Author(String firstName, String lastName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

}
