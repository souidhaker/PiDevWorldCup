package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientActualityPK
 *
 */
@Embeddable

public class SubscribedClientActualityPK implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int clientId;
	private int actualityId;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getActualityId() {
		return actualityId;
	}
	public void setActualityId(int actualityId) {
		this.actualityId = actualityId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + actualityId;
		result = prime * result + clientId;
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
		SubscribedClientActualityPK other = (SubscribedClientActualityPK) obj;
		if (actualityId != other.actualityId)
			return false;
		if (clientId != other.clientId)
			return false;
		return true;
	}
	
	
	
}
