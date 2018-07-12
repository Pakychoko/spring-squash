package squash.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class Player implements Squash {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String surname;
	
	public Player() {
		
	}



	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
}
