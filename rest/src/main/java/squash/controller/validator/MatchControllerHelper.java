package squash.controller.validator;

import org.springframework.stereotype.Service;

import squash.dto.MatchDTO;

/**
 * The type Match controller helper.
 */
@Service
public class MatchControllerHelper {

    /**
     * Is valid boolean.
     *
     * @param match the match
     * @return the boolean
     */
    public Boolean isValid(MatchDTO match) {
        return true;
    }
}
