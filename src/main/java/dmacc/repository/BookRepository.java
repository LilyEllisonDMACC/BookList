/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Oct 17, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Book;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Oct 17, 2023
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
