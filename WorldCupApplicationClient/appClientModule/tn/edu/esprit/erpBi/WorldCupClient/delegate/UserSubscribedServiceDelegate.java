package tn.edu.esprit.erpBi.WorldCupClient.delegate;

import tn.edu.esprit.erpBi.WorldCupClient.locator.ServiceLocator;
import tn.edu.esprit.piDevProjet.worldCup.domain.SubscribedClient;
import tn.edu.esprit.piDevProjet.worldCup.services.SubscribedClientServicesRemote;

public class UserSubscribedServiceDelegate {

	private static final String jndiName = "ejb:/tn.edu.esprit.piDevProjet.worldCup/SubscribedClientServices!tn.edu.esprit.piDevProjet.worldCup.services.SubscribedClientServicesRemote";

	private static SubscribedClientServicesRemote getProxy() {
		return (SubscribedClientServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static void create(SubscribedClient client) {
		getProxy().createSubscribedClient(client);
	}

	public static void delete(SubscribedClient client) {
		getProxy().deleteSubscribedClient(client);
	}
}
