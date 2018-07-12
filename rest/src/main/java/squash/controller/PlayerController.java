package squash.controller;

import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import squash.dto.PlayerDTO;
import squash.entity.Player;
import squash.logic.PlayerManager;
import squash.persistence.PlayerRepository;

@RestController @ComponentScan("squash")
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerManager manager;

    @Autowired
    private DozerBeanMapper mapper;

    /**
     * Find all list.
     *
     * @return the list
     */
    @GetMapping("/")
    public List<PlayerDTO> findAll() {
        return (List<PlayerDTO>) mapper.map(manager.findAll(), PlayerDTO.class);
    }

    /**
     * Find by id player dto.
     *
     * @param id the id
     * @return the player dto
     */
    @GetMapping("/{id}")
    public PlayerDTO findById(@PathVariable("id") Long id) {
        return mapper.map(manager.findById(id), PlayerDTO.class);
    }

    /**
     * Save player dto.
     *
     * @param playerDTO the player dto
     * @return the player dto
     */
    @PostMapping("/")
    public PlayerDTO save(@RequestBody PlayerDTO playerDTO) {
        return mapper.map(manager.save(mapper.map(playerDTO, Player.class)), PlayerDTO.class);
    }
}
