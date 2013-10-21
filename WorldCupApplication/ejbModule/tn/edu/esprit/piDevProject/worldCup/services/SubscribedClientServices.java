package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.piDevProject.worldCup.domain.SubscribedClient;

/**
 * Session Bean implementation class SubscribedClientServices
 */
@Stateless
@LocalBean
public class SubscribedClientServices implements SubscribedClientServicesRemote, SubscribedClientServicesLocal {

    @PersistenceContext
    EntityManager em;

public SubscribedClientServices() {
    // TODO Auto-generated constructor stub
}

    @Override
    public void createSubscribedClient(SubscribedClient subscribedClient) {

            em.persist(subscribedClient);
    }

    @Override
    public void updateSubscribedClient(SubscribedClient subscribedClient) {

            em.merge(subscribedClient);
    }

    @Override
    public void deleteSubscribedClient(SubscribedClient subscribedClient) {

            em.remove(subscribedClient);
    }

    @Override
    public SubscribedClient getSubscribedClientById(int clienId) {

            SubscribedClient subscribedClient= em.find(SubscribedClient.class, clienId);
            
            return subscribedClient;
    }

    @Override
    public List<SubscribedClient> getAllSubscribedClient() {
            Query query=em.createQuery("select s from SubscribedClient s");
            return query.getResultList();
    }

}
