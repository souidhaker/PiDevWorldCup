package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CollectionAgent
 *
 */
@Entity

public class CollectionAgent implements Serializable {

	
	private int collectionAgentId;
	private String login;
	private String password;
	private static final long serialVersionUID = 1L;
	private List<MicroEvent> microEvents;
	public CollectionAgent() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public int getCollectionAgentId() {
		return this.collectionAgentId;
	}

	public void setCollectionAgentId(int collectionAgentId) {
		this.collectionAgentId = collectionAgentId;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public CollectionAgent(String login, String password
			) {
		super();
		this.login = login;
		this.password = password;
	
	}

	@OneToMany(mappedBy="collectionAgent")
	public List<MicroEvent> getMicroEvents() {
		return microEvents;
	}

	public void setMicroEvents(List<MicroEvent> microEvents) {
		this.microEvents = microEvents;
	}
}
