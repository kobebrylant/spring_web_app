package skula.springframework.spring_web_app.repositories;

import org.springframework.data.repository.CrudRepository;
import skula.springframework.spring_web_app.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
