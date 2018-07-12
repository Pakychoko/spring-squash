package squash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import squash.entity.Player;
import squash.persistence.PlayerRepository;

@RestController @ComponentScan("squash")
public class PlayerController {

	@Autowired
	private PlayerRepository player_repository;
	
	
	@PostMapping("/players")
	public Player add(@RequestBody Player player) {
		return player_repository.save(player);
	}
	
	@GetMapping("/players")
	public List<Player> findAll() {
	    return (List<Player>) player_repository.findAll();
	}
	
	@GetMapping("/players/{id}")
	public Optional<Player> findById(@PathVariable Long id) {
		return player_repository.findById(id);
	}
	
	@PutMapping("/players/{id}")
	public Player update(@PathVariable Long id, @RequestBody Player player) {
		return player_repository.save(player);
	}
	
	@DeleteMapping("/players/{id}")
	public void notActive(@PathVariable Long id, @RequestBody Player player) {
		player_repository.delete(player);
	}
}
