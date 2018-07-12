package squash.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Match implements Squash{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_player1")
	private Player player1;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_player2")
	private Player player2;
	
	public Match() {
		
	}

	
}
