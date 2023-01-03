package skula.springframework.spring_web_app.repositories;

import org.springframework.data.repository.CrudRepository;
import skula.springframework.spring_web_app.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
