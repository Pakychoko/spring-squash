package squash.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Match implements Squash{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_player1")
	private Player player1;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_player2")
	private Player player2;
	

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="winner")
    private Player winner;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="loser")
    private Player loser;

    private String court;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "match")
    private List<MatchSet> matchSets;

    private Date matchDate;	
	
	public Match() {
		
	}

	
}
