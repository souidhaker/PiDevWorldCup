package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.piDevProject.worldCup.domain.SubscribedClient;

@Remote
public interface SubscribedClientServicesRemote {

    public void createSubscribedClient(SubscribedClient subscribedClient );
    public void updateSubscribedClient(SubscribedClient subscribedClient);
    public void deleteSubscribedClient(SubscribedClient subscribedClient);
    public SubscribedClient getSubscribedClientById(int clienId);
    public List<SubscribedClient> getAllSubscribedClient();
}
