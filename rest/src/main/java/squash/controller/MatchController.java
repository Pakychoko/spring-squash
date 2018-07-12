package squash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import squash.entities.Match;
import squash.persistence.MatchRepository;

@RestController @ComponentScan("squash")
public class MatchController {

	@Autowired
	private MatchRepository match_repository;

	
	@PostMapping("/matches")
	public Match add(@RequestBody Match match) {
		return match_repository.save(match);
	}
	
	@GetMapping("/matches")
	public List<Match> findAll() {
	    return (List<Match>) match_repository.findAll();
	}
	
	@GetMapping("/matches/{id}")
	public Optional<Match> findById(@PathVariable Long id) {	
		return match_repository.findById(id);	
	}
	
	@PutMapping("/matches/{id}")
	public Match update(@PathVariable Long id, @RequestBody Match match) {
		return match_repository.save(match);
	}
	


}
