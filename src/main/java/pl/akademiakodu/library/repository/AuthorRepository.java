package pl.akademiakodu.library.repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.library.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
