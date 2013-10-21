package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: SubscribedClient
 *
 */
@Entity

public class SubscribedClient implements Serializable {
	private int clientId;
	private String clientName;
	private String clientLastName;
	private String clientEmail;
	private Date clientBirthDate;
	private String clientSex;
	private String clientLogin;
	private String clientPassword;
	private static final long serialVersionUID = 1L;
	private List<MicroEvent> microEvent;
private List<SubscribedClientGallery> subscribedClientGalleries;
private List<SubscribedClientActuality > subscribedClientActualities;
private List<SubscribedClientProduct> subscribedClientProducts;
private List<SubscribedClientTeam> subscribedClientTeams;
private List< SubscribedClientMatch> subscribedClientMatchs;
	public SubscribedClient() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientLastName() {
		return clientLastName;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	@Temporal(TemporalType.DATE)

	public Date getClientBirthDate() {
		return clientBirthDate;
	}

	public void setClientBirthDate(Date clientBirthDate) {
		this.clientBirthDate = clientBirthDate;
	}

	public String getClientSex() {
		return clientSex;
	}

	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}

	public String getClientLogin() {
		return clientLogin;
	}

	public void setClientLogin(String clientLogin) {
		this.clientLogin = clientLogin;
	}

	public String getClientPassword() {
		return clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}
	
	
	public SubscribedClient(String clientName, String clientLastName,
			String clientEmail, Date clientBirthDate, String clientSex,
			String clientLogin, String clientPassword) {
		super();
		this.clientName = clientName;
		this.clientLastName = clientLastName;
		this.clientEmail = clientEmail;
		this.clientBirthDate = clientBirthDate;
		this.clientSex = clientSex;
		this.clientLogin = clientLogin;
		this.clientPassword = clientPassword;
	}
	@OneToMany(mappedBy="subscribedClient")
	public java.util.List<MicroEvent> getMicroEvent() {
		return microEvent;
	}

	public void setMicroEvent(java.util.List<MicroEvent> microEvent) {
		this.microEvent = microEvent;
	}
	
	@OneToMany(mappedBy="subscribedClient")
	public List<SubscribedClientGallery> getSubscribedClientGalleries() {
		return subscribedClientGalleries;
	}
	public void setSubscribedClientGalleries(
			List<SubscribedClientGallery> subscribedClientGalleries) {
		this.subscribedClientGalleries = subscribedClientGalleries;
	}
	
	@OneToMany(mappedBy="subscribedClient")
	public List<SubscribedClientActuality> getSubscribedClientActualities() {
		return subscribedClientActualities;
	}
	public void setSubscribedClientActualities(
			List<SubscribedClientActuality> subscribedClientActualities) {
		this.subscribedClientActualities = subscribedClientActualities;
	}
	
	@OneToMany(mappedBy="subscribedClient")
	public List<SubscribedClientProduct> getSubscribedClientProducts() {
		return subscribedClientProducts;
	}
	public void setSubscribedClientProducts(
			List<SubscribedClientProduct> subscribedClientProducts) {
		this.subscribedClientProducts = subscribedClientProducts;
	}
	
	@OneToMany(mappedBy="subscribedClient")
	public List<SubscribedClientTeam> getSubscribedClientTeams() {
		return subscribedClientTeams;
	}
	public void setSubscribedClientTeams(
			List<SubscribedClientTeam> subscribedClientTeams) {
		this.subscribedClientTeams = subscribedClientTeams;
	}
	@OneToMany(mappedBy="subscribedClient")
	public List<SubscribedClientMatch> getSubscribedClientMatchs() {
		return subscribedClientMatchs;
	}
	public void setSubscribedClientMatchs(
			List<SubscribedClientMatch> subscribedClientMatchs) {
		this.subscribedClientMatchs = subscribedClientMatchs;
	}
	
	
	
}
