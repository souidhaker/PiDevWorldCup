package tn.edu.esprit.erpBi.WorldCupClient.test;

import tn.edu.esprit.erpBi.WorldCupClient.delegate.UserSubscribedServiceDelegate;
import tn.edu.esprit.piDevProjet.worldCup.domain.SubscribedClient;

public class SubscribeUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserSubscribedServiceDelegate delege = null;
		SubscribedClient client = new SubscribedClient("Houssem", "Ben ali", "hoos@live.fr", "25/25/25", "H", "HOOS", "azerty");
		delege.create(client);

	}

}
