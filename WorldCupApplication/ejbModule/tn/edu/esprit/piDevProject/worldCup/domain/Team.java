package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity

public class Team implements Serializable {

	private int idTeam;
	private String teamName;
	private String teamCoach;
	private int teamLoss;
	private int teamVectories;
	private char teamGroupp;
	private static final long serialVersionUID = 1L;
	private List<MicroEvent> microEvents;
	private List<Player> players;
	private List<SubscribedClientTeam> subscribedClientTeams;
	public Team() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCoach() {
		return teamCoach;
	}

	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

	public int getTeamLoss() {
		return teamLoss;
	}

	public void setTeamLoss(int teamLoss) {
		this.teamLoss = teamLoss;
	}

	public int getTeamVectories() {
		return teamVectories;
	}

	public void setTeamVectories(int teamVectories) {
		this.teamVectories = teamVectories;
	}

	public char getTeamGroupp() {
		return teamGroupp;
	}

	public void setTeamGroupp(char teamGroupp) {
		this.teamGroupp = teamGroupp;
	}
	
	public Team(String teamName, String teamCoach, int teamLoss,
			int teamVectories, char teamGroupp) {
		super();
		this.teamName = teamName;
		this.teamCoach = teamCoach;
		this.teamLoss = teamLoss;
		this.teamVectories = teamVectories;
		this.teamGroupp = teamGroupp;
	}

	@OneToMany(mappedBy="team")
	public List<MicroEvent> getMicroEvents() {
		return microEvents;
	}
	public void setMicroEvents(List<MicroEvent> microEvents) {
		this.microEvents = microEvents;
	}
	
	@OneToMany(mappedBy ="team")
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	@OneToMany(mappedBy="team")

	public List<SubscribedClientTeam> getSubscribedClientTeams() {
		return subscribedClientTeams;
	}

	public void setSubscribedClientTeams(
			List<SubscribedClientTeam> subscribedClientTeams) {
		this.subscribedClientTeams = subscribedClientTeams;
	} 
	
	
}
