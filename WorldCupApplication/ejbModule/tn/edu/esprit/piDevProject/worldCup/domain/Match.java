package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;
import javax.mail.util.*;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity(name="matche")

public class Match implements Serializable {

	
	private int matchId;
	private String matchReferee;
	private String matchDate;
	private String matchCategory;
	private String matchStadium;
	private static final long serialVersionUID = 1L;
private List<SubscribedClientMatch> subscribedClientMatchs;
	public Match() {
		super();
	}   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="matchId")
	public int getMatchId() {
		return this.matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}   
	public String getMatchReferee() {
		return this.matchReferee;
	}

	public void setMatchReferee(String matchReferee) {
		this.matchReferee = matchReferee;
	}   
	
	public String getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}   
	public String getMatchCategory() {
		return this.matchCategory;
	}

	public void setMatchCategory(String matchCategory) {
		this.matchCategory = matchCategory;
	}   
	public String getMatchStadium() {
		return this.matchStadium;
	}

	public void setMatchStadium(String matchStadium) {
		this.matchStadium = matchStadium;
	}
	public Match(String matchReferee, String matchDate, String matchCategory,
			String matchStadium) {
		super();
		this.matchReferee = matchReferee;
		this.matchDate = matchDate;
		this.matchCategory = matchCategory;
		this.matchStadium = matchStadium;
	}
	
	@OneToMany(mappedBy="match")
	public List<SubscribedClientMatch> getSubscribedClientMatchs() {
		return subscribedClientMatchs;
	}
	public void setSubscribedClientMatchs(
			List<SubscribedClientMatch> subscribedClientMatchs) {
		this.subscribedClientMatchs = subscribedClientMatchs;
	}
   
}
