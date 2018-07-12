package squash.persistence;


import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import squash.entity.Match;

public interface MatchRepository extends CrudRepository<Match,Long>{

    /**
     * Find by match date between list.
     *
     * @param date1 the date 1
     * @param date2 the date 2
     * @return the list
     */
    List<Match> findByMatchDateBetween(Date date1, Date date2);
}
