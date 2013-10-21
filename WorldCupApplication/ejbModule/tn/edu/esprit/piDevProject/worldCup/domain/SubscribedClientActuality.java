package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientActuality
 *
 */
@Entity

public class SubscribedClientActuality implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private SubscribedClientActualityPK subscribedClientActualityPK;
	private SubscribedClient subscribedClient;
	private Actuality actuality;
	
	@EmbeddedId
	public SubscribedClientActualityPK getSubscribedClientActualityPK() {
		return subscribedClientActualityPK;
	}
	public void setSubscribedClientActualityPK(
			SubscribedClientActualityPK subscribedClientActualityPK) {
		this.subscribedClientActualityPK = subscribedClientActualityPK;
	}
	
	@ManyToOne
	@JoinColumn(insertable = false , updatable = false , name ="clientId" , referencedColumnName = "clientId")

	public SubscribedClient getSubscribedClient() {
		return subscribedClient;
	}
	
	public void setSubscribedClient(SubscribedClient subscribedClient) {
		this.subscribedClient = subscribedClient;
	}
	
	@ManyToOne
	@JoinColumn(insertable = false , updatable = false , name ="actualityId" , referencedColumnName = "actualityId")

	public Actuality getActuality() {
		return actuality;
	}
	public void setActuality(Actuality actuality) {
		this.actuality = actuality;
	}
	
   
}
