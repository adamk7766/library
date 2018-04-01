package pl.akademiakodu.library.repository;


import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.library.model.User;


public interface UserRepository extends CrudRepository<User,Long> {
}
