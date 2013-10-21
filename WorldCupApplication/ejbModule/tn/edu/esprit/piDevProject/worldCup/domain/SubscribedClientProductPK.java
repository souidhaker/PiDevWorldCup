package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientProductPK
 *
 */
@Embeddable

public class SubscribedClientProductPK implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int idProduct;
	private int clientId;
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
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
		result = prime * result + idProduct;
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
		SubscribedClientProductPK other = (SubscribedClientProductPK) obj;
		if (clientId != other.clientId)
			return false;
		if (idProduct != other.idProduct)
			return false;
		return true;
	}
	
	
	
   
}
