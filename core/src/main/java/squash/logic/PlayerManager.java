package squash.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import squash.entity.Player;
import squash.persistence.PlayerRepository;

import java.util.List;

/**
 * The type Player manager.
 */
@Service
public class PlayerManager {

    @Autowired
    private PlayerRepository repository;

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Player> findAll() {
        return (List<Player>) repository.findAll();
    }

    /**
     * Find by id match.
     *
     * @param id the id
     * @return the match
     */
    public Player findById(Long id) {
        return repository.findById(id).get();
    }

    /**
     * Save match.
     *
     * @param match the match
     * @return the match
     */
    public Player save(Player match) {
        return repository.save(match);
    }
}
