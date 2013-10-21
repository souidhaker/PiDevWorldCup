package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientTeam
 *
 */
@Entity

public class SubscribedClientTeam implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private SubscribedClientTeamPK subscribedClientTeamPK;
	private Team team;
	private SubscribedClient subscribedClient;
	
	@EmbeddedId
	public SubscribedClientTeamPK getSubscribedClientTeamPK() {
		return subscribedClientTeamPK;
	}
	public void setSubscribedClientTeamPK(
			SubscribedClientTeamPK subscribedClientTeamPK) {
		this.subscribedClientTeamPK = subscribedClientTeamPK;
	}
	@ManyToOne
	@JoinColumn(insertable = false , updatable = false , name ="idTeam" , referencedColumnName = "idTeam")

	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@ManyToOne
	@JoinColumn(insertable = false , updatable = false , name ="clientId" , referencedColumnName = "clientId")

	public SubscribedClient getSubscribedClient() {
		return subscribedClient;
	}
	public void setSubscribedClient(SubscribedClient subscribedClient) {
		this.subscribedClient = subscribedClient;
	}
	
   
}
