package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player implements Serializable {

	private int playerId;
	private String playerName;
	private String playerLastName;
	private Date playerDateBirth;
	private boolean playerState;
	private static final long serialVersionUID = 1L;
	private List<MicroEvent> microEvents;
	private Team team;
	

	public Player() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	public int getPlayerId() {
		return playerId;
	}



	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public String getPlayerLastName() {
		return playerLastName;
	}



	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}



	public Date getPlayerDateBirth() {
		return playerDateBirth;
	}



	public void setPlayerDateBirth(Date playerDateBirth) {
		this.playerDateBirth = playerDateBirth;
	}



	public boolean isPlayerState() {
		return playerState;
	}



	public void setPlayerState(boolean playerState) {
		this.playerState = playerState;
	}

	
	
	
	public Player(String playerName, String playerLastName,
			Date playerDateBirth, boolean playerState) {
		super();
		this.playerName = playerName;
		this.playerLastName = playerLastName;
		this.playerDateBirth = playerDateBirth;
		this.playerState = playerState;
	}

	@ManyToOne
	@JoinColumn(insertable = true , name = "idTeam" , referencedColumnName="idTeam")
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@OneToMany(mappedBy = "player")
	public List<MicroEvent> getMicroEvents() {
		return microEvents;
	}

	public void setMicroEvents(List<MicroEvent> microEvents) {
		this.microEvents = microEvents;
	}

	

}
