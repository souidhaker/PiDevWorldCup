package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientGallery
 *
 */
@Entity

public class SubscribedClientGallery implements Serializable {

	
	private static final long serialVersionUID = 1L;
private SubscribedClientGalleryPK subscribedClientGalleryPK;
private SubscribedClient subscribedClient;
private Gallery gallery;

@EmbeddedId
public SubscribedClientGalleryPK getSubscribedClientGalleryPK() {
	return subscribedClientGalleryPK;
}
public void setSubscribedClientGalleryPK(
		SubscribedClientGalleryPK subscribedClientGalleryPK) {
	this.subscribedClientGalleryPK = subscribedClientGalleryPK;
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

@JoinColumn(insertable = false , updatable = false , name ="galleryId" , referencedColumnName = "galleryId")
public Gallery getGallery() {
	return gallery;
}
public void setGallery(Gallery gallery) {
	this.gallery = gallery;
}


}
