package senior.pe.reactive.respositories;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;
import senior.pe.reactive.entities.models.User;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
	@Query("select * from users where age >= $1")
	Flux<User> findByAge(int age);
}