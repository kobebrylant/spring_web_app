package skula.springframework.spring_web_app.repositories;

import org.springframework.data.repository.CrudRepository;
import skula.springframework.spring_web_app.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
