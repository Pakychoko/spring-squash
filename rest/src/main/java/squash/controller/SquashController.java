package squash.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import squash.entity.Match;
import squash.entity.Player;
import squash.entity.Squash;
import squash.persistence.MatchRepository;
import squash.persistence.PlayerRepository;
/*
@RestController @ComponentScan("squash")
public abstract class SquashController <T extends Squash, ID extends Serializable> {

	@Autowired
	private CrudRepository repository;
	
	
	@PostMapping()
	public T add(@RequestBody T element) {
		return  (T) repository.save(element);
	}
	
	@GetMapping("/")
	public List<T> findAll() {
	    return (List<T>) repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<T> findById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PutMapping("/{id}")
	public T update(@PathVariable Long id, @RequestBody T element) {
		return repository.save(element);
	}
	
	@DeleteMapping("/{id}")
	public void notActive(@PathVariable Long id, @RequestBody T element) {
		repository.delete(element);
	}
	
}
*/