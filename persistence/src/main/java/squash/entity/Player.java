package squash.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class Player implements Squash {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    private String name, surname, nationality;
    private Integer ranking;
    private Boolean isDeleted;
    
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "player1")
    private Match matchPlayer1;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "player2")
    private Match matchPlayer2;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "winner")
    private Match matchWinner;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "loser")
    private Match matchLoser;
	
	public Player() {
		
	}

	
	
}
