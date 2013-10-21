package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClientProduct
 *
 */
@Entity

public class SubscribedClientProduct implements Serializable {

	private static final long serialVersionUID = 1L;
private SubscribedClientProductPK subscribedClientProductPK;
private Product product;
private SubscribedClient subscribedClient;

@EmbeddedId
public SubscribedClientProductPK getSubscribedClientProductPK() {
	return subscribedClientProductPK;
}

public void setSubscribedClientProductPK(
		SubscribedClientProductPK subscribedClientProductPK) {
	this.subscribedClientProductPK = subscribedClientProductPK;
}

@ManyToOne
@JoinColumn(insertable = false , updatable = false , name ="idProduct" , referencedColumnName = "idProduct")

public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
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
