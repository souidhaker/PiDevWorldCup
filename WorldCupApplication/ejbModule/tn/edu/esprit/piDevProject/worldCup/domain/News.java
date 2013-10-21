package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: News
 *
 */
@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)

public class News extends Actuality implements Serializable {

	
	private String newsDescription;
	private static final long serialVersionUID = 1L;

	public News() {
		super();
	}   
	public String getNewsDescription() {
		return this.newsDescription;
	}

	public void setNewsDescription(String newsDescription) {
		this.newsDescription = newsDescription;
	}
	public News(String newsDescription) {
		super();
		this.newsDescription = newsDescription;
	}
   
}
