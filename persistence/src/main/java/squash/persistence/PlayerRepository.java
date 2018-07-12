package squash.persistence;

import org.springframework.data.repository.CrudRepository;

import squash.entities.Player;

public interface PlayerRepository extends CrudRepository<Player,Long> {

}
