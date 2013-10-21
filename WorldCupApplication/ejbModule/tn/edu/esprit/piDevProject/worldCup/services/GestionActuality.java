package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;

/**
 * Session Bean implementation class GestionActuality
 */
@Stateless
public class GestionActuality implements GestionActualityRemote, GestionActualityLocal {
@PersistenceContext
	EntityManager ac;
    public GestionActuality() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createActuality(Actuality actuality) {
		ac.persist(actuality);
		
	}

	@Override
	public void updateActuality(Actuality actuality) {
		ac.merge(actuality);
		
	}

	@Override
	public void deleteActuality(Actuality actuality) {
		ac.remove(actuality);
		
	}

	@Override
	public Actuality getActualityById(int actualityId) {
		Actuality actuality = ac.find(Actuality.class, actualityId);
		return null;
	}

	@Override
	public List<Actuality> getAllActuality() {
		Query query = ac.createQuery("select a from Actuality a");
		return query.getResultList();
	}

	@Override
	public void deleteActuality(int i) {
		
	}

}
