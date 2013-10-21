package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	
	private int idProduct;
	private String productLabel;
	private String productCategory;
	private static final long serialVersionUID = 1L;
	private List<SubscribedClientProduct> subscribedClientProducts;
	private Administrator administrator ;
	public Product() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}   
	public String getProductLabel() {
		return this.productLabel;
	}

	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}   
	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	public Product(String productLabel, String productCategory) {
		super();
		this.productLabel = productLabel;
		this.productCategory = productCategory;
	}

	@ManyToOne
	@JoinColumn(insertable = true , name = "adminId" , referencedColumnName="adminId")
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	@OneToMany(mappedBy="product")

	public List<SubscribedClientProduct> getSubscribedClientProducts() {
		return subscribedClientProducts;
	}

	public void setSubscribedClientProducts(
			List<SubscribedClientProduct> subscribedClientProducts) {
		this.subscribedClientProducts = subscribedClientProducts;
	}
	
	
	
}
