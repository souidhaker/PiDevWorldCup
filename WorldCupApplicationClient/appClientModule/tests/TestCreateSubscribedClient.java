package tests;

import tn.edu.esprit.piDevProject.worldCup.domain.SubscribedClient;
import worldCup.group4.clientProject.deligate.SubscribedClientServiceDelegate;

public class TestCreateSubscribedClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubscribedClientServiceDelegate delegate = null;
		SubscribedClient client = new SubscribedClient();
		client.setClientEmail("hoos@live.fr");
		client.setClientName("Houssem");
		client.setClientLastName("Ben Ali");
		delegate.createSubscribedClient(client);

	}

}
