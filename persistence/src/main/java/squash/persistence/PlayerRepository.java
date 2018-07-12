package squash.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import squash.entity.Player;

public interface PlayerRepository extends CrudRepository<Player,Long> {
    
	@Override
    @Modifying
    @Query("UPDATE Player p SET p.isDeleted = true  WHERE p.id = :id")
    void deleteById(@Param("id") Long playerId);

    @Override
    @Query("SELECT p FROM Player p WHERE p.isDeleted = false")
    Iterable<Player> findAll();
}
