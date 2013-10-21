package worldCup.group4.clientProject.deligate;


import java.util.List;

import tn.edu.esprit.piDevProject.worldCup.domain.SubscribedClient;
import tn.edu.esprit.piDevProject.worldCup.services.SubscribedClientServicesRemote;
import worldCup.group4.clientProject.locator.ServiceLocator;

public class SubscribedClientServiceDelegate {

	
	private static final String jndiName = "ejb:/WorldCupApplication/SubscribedClientServices!tn.edu.esprit.piDevProject.worldCup.services.SubscribedClientServicesRemote";

	private static SubscribedClientServicesRemote getProxy() {
		return (SubscribedClientServicesRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}
	
	public static void createSubscribedClient(SubscribedClient subscribedClient) {
		getProxy().createSubscribedClient(subscribedClient);
	}
	

	public static void getSubscribeClienteById(int clientId) {
		getProxy().getSubscribedClientById(clientId);
	}
	
	public static void updateSubscribedClient(SubscribedClient subscribedClient) {
		getProxy().updateSubscribedClient(subscribedClient);
	}
	
	public static void deleteSubscribedClient(SubscribedClient subscribedClient) {
		getProxy().deleteSubscribedClient(subscribedClient);
	}
	
	public static List<SubscribedClient> getAllSubscribedClient() {
		return getProxy().getAllSubscribedClient();
	}
	

}
