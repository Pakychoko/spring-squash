package squash.controller;

import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import squash.controller.validator.MatchControllerHelper;
import squash.dto.MatchDTO;
import squash.entity.Match;
import squash.logic.MatchManager;

@RestController @ComponentScan("squash")
@RequestMapping("/matches")
public class MatchController {

	   @Autowired
	   private MatchManager manager;

	   @Autowired
	   private DozerBeanMapper mapper;

	   @Autowired
	   private MatchControllerHelper helper;


	    /**
	     * Find all list.
	     *
	     * @return the list
	     */
	    @GetMapping("/")
	    public List<MatchDTO> findAll() {
	        return (List<MatchDTO>) mapper.map(manager.findAll(), MatchDTO.class);
	    }

	    /**
	     * Find by id player dto.
	     *
	     * @param id the id
	     * @return the player dto
	     */
	    @GetMapping("/{id}")
	    public MatchDTO findById(@PathVariable("id") Long id) {
	        return mapper.map(manager.findById(id), MatchDTO.class);
	    }

	    /**
	     * Save player dto.
	     *
	     * @param dto the player dto
	     * @return the player dto
	     */
	    @PostMapping("/")
	    public MatchDTO save(@RequestBody MatchDTO dto) {
	        if (!this.helper.isValid(dto)) {
	            throw new IllegalArgumentException("The dto is not valid");
	        }
	        return mapper.map(manager.save(mapper.map(dto, Match.class)), MatchDTO.class);
	    }
	


}
