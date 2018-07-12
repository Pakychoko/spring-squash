package squash.persistence;

import org.springframework.data.repository.CrudRepository;

import squash.entities.Squash;

public interface SquashRepository extends CrudRepository<Squash,Long>{

}
