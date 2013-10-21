package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientTeamPK
 *
 */
@Embeddable

public class SubscribedClientTeamPK implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int idTeam;
	private int clientId;
	public int getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
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
		result = prime * result + idTeam;
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
		SubscribedClientTeamPK other = (SubscribedClientTeamPK) obj;
		if (clientId != other.clientId)
			return false;
		if (idTeam != other.idTeam)
			return false;
		return true;
	}
	
	
	
   
}
