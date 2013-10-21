package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Interview
 *
 */
@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
public class Interview extends Actuality implements Serializable {

	
	private String interviewdPlayer;
	private static final long serialVersionUID = 1L;

	public Interview() {
		super();
	}   
	public String getInterviewdPlayer() {
		return this.interviewdPlayer;
	}

	public void setInterviewdPlayer(String interviewdPlayer) {
		this.interviewdPlayer = interviewdPlayer;
	}
	public Interview(String interviewdPlayer) {
		super();
		this.interviewdPlayer = interviewdPlayer;
	}
   
}
