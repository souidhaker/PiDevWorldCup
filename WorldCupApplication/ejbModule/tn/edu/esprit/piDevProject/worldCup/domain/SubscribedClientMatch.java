package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientMatch
 *
 */
@Entity

public class SubscribedClientMatch implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private SubscribedClientMatchPK subscribedClientMatchPK;
	private Match match;
	private SubscribedClient subscribedClient;
	@EmbeddedId
	public SubscribedClientMatchPK getSubscribedClientMatchPK() {
		return subscribedClientMatchPK;
	}
	public void setSubscribedClientMatchPK(
			SubscribedClientMatchPK subscribedClientMatchPK) {
		this.subscribedClientMatchPK = subscribedClientMatchPK;
	}
	
	@ManyToOne
	@JoinColumn(insertable = false , updatable = false , name ="matchId" , referencedColumnName = "matchId")

	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
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
