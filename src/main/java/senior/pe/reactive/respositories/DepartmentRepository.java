package senior.pe.reactive.respositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Mono;
import senior.pe.reactive.entities.models.Department;

public interface DepartmentRepository extends ReactiveCrudRepository<Department, Integer> {
	Mono<Department> findByUserId(Integer userId);
}