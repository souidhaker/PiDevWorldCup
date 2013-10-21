package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Photo
 *
 */
@Entity

public class Photo implements Serializable {

	int photoId;
	String photoName;
	String photoDescription;
	String photoRates;
	
	private static final long serialVersionUID = 1L;

	public Photo() {
		super();
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoDescription() {
		return photoDescription;
	}

	public void setPhotoDescription(String photoDescription) {
		this.photoDescription = photoDescription;
	}

	public String getPhotoRates() {
		return photoRates;
	}

	public void setPhotoRates(String photoRates) {
		this.photoRates = photoRates;
	}
	public Photo(String photoName, String photoDescription, String photoRates) {
		super();
		this.photoName = photoName;
		this.photoDescription = photoDescription;
		this.photoRates = photoRates;
	}
   
}
