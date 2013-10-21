package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientGalleryPK
 *
 */
@Embeddable

public class SubscribedClientGalleryPK implements Serializable {

	
	private static final long serialVersionUID = 1L;
private int clientId;
private int galleryId;
public int getClientId() {
	return clientId;
}
public void setClientId(int clientId) {
	this.clientId = clientId;
}
public int getGalleryId() {
	return galleryId;
}
public void setGalleryId(int galleryId) {
	this.galleryId = galleryId;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + clientId;
	result = prime * result + galleryId;
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
	SubscribedClientGalleryPK other = (SubscribedClientGalleryPK) obj;
	if (clientId != other.clientId)
		return false;
	if (galleryId != other.galleryId)
		return false;
	return true;
}
	
   
}
