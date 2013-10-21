package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientMatchPK
 *
 */
@Embeddable

public class SubscribedClientMatchPK implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int matchId;
	private int clientId;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clientId;
		result = prime * result + matchId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubscribedClientMatchPK other = (SubscribedClientMatchPK) obj;
		if (clientId != other.clientId)
			return false;
		if (matchId != other.matchId)
			return false;
		return true;
	}
	
	

}
