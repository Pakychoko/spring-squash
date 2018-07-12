package squash.persistence;


import org.springframework.data.repository.CrudRepository;

import squash.entities.Match;

public interface MatchRepository extends CrudRepository<Match,Long>{

}
