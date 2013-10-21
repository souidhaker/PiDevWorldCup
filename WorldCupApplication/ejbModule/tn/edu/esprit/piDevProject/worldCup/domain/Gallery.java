package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Gallery
 *
 */
@Entity

public class Gallery implements Serializable {

	
	private int galleryId;
	private String galleryName;
	private String galleryDescription;
	private static final long serialVersionUID = 1L;
	private List<SubscribedClientGallery> subscribedClientGalleries;
	public Gallery() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getGalleryId() {
		return this.galleryId;
	}

	public void setGalleryId(int galleryId) {
		this.galleryId = galleryId;
	}   
	public String getGalleryName() {
		return this.galleryName;
	}

	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}   
	public String getGalleryDescription() {
		return this.galleryDescription;
	}

	public void setGalleryDescription(String galleryDescription) {
		this.galleryDescription = galleryDescription;
	}
	public Gallery(String galleryName, String galleryDescription) {
		super();
		this.galleryName = galleryName;
		this.galleryDescription = galleryDescription;
	}
	
	@OneToMany(mappedBy="gallery")
	public List<SubscribedClientGallery> getSubscribedClientGalleries() {
		return subscribedClientGalleries;
	}
	public void setSubscribedClientGalleries(
			List<SubscribedClientGallery> subscribedClientGalleries) {
		this.subscribedClientGalleries = subscribedClientGalleries;
	}
	
	
}
