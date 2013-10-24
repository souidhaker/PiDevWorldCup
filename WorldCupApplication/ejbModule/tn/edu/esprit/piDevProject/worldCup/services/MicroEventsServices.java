package tn.edu.esprit.piDevProject.worldCup.services;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;



/**
 * Session Bean implementation class EmployeesServices
 */
@Stateless
public class MicroEventsServices implements MicroEventsServicesRemote,
		MicroEventsServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public MicroEventsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMicroEvent(MicroEvent event) {
		entityManager.persist(event);
		
	}

	@Override
	public MicroEvent findEventById(int idEvent) {
		return entityManager.find(MicroEvent.class, idEvent);
	}

	@Override
	public void deleteEventById(int idEvent) {
		entityManager.remove(findEventById(idEvent));
		
	}

	@Override
	public void updateEvent(MicroEvent event) {
		entityManager.merge(event);
		
	}

	@Override
	public List<MicroEvent> findAllEvents() {
		return entityManager.createQuery("select m from MicroEvent m")
				.getResultList();	}

	@Override
	public List<MicroEvent> findEventByName(String name) {
		String jpql = "select m from MicroEvent m where m.nameEvent =:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", name);
		return query.getResultList();		
	}



	

	

}
