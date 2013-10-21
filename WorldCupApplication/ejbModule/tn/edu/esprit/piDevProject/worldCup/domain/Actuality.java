package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Collection;


import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actuality
 *
 */
@Entity

public class Actuality implements Serializable {

	
	private int actualityId;
	private String actualityTitle;
	private String actualityDate;
	private static final long serialVersionUID = 1L;
	private ChiefEditor chiefEditor;
	private List<SubscribedClientActuality> subscribedClientActuality;
	public Actuality() {
		super();
	}   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getActualityId() {
		return this.actualityId;
	}

	public void setActualityId(int actualityId) {
		this.actualityId = actualityId;
	}   
	public String getActualityTitle() {
		return this.actualityTitle;
	}

	public void setActualityTitle(String actualityTitle) {
		this.actualityTitle = actualityTitle;
	}   

	public String getActualityDate() {
		return this.actualityDate;
	}

	public void setActualityDate(String actualityDate) {
		this.actualityDate = actualityDate;
	}
	public Actuality( String actualityTitle, String actualityDate) {
		super();
		
		this.actualityTitle = actualityTitle;
		this.actualityDate = actualityDate;
	}
	@ManyToOne
	@JoinColumn(insertable = true , name = "chiefEditorId" , referencedColumnName="chiefEditorId")
	public ChiefEditor getChiefEditor() {
		return chiefEditor;
	}
	public void setChiefEditor(ChiefEditor chiefEditor) {
		this.chiefEditor = chiefEditor;
	}
	
	
	@OneToMany(mappedBy="actuality")
	public List<SubscribedClientActuality> getSubscribedClientActuality() {
		return subscribedClientActuality;
	}
	public void setSubscribedClientActuality(
			List<SubscribedClientActuality> subscribedClientActuality) {
		this.subscribedClientActuality = subscribedClientActuality;
	}
	
	
	
	
	
	
	

	
	
	
}
