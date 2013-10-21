package tn.edu.esprit.piDevProject.worldCup.services;



import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.domain.Interview;

/**
 * Session Bean implementation class gestionInterview
 */
@Stateless
@LocalBean
public class gestionInterview implements gestionInterviewRemote, gestionInterviewLocal {
	@PersistenceContext
	EntityManager em;
	
    public gestionInterview() {
        // TODO AcreateInterviewuto-generated constructor stub
    }

	@Override
	public void createInterview(Interview interview) {
		em.persist(interview);
		
	}

	@Override
	public void updateInterview(Interview interview) {
		em.merge(interview);
		
	}

	@Override
	public Actuality findInterviewById(int idActuality) {
		return em.find(Actuality.class, idActuality);
	}

	@Override
	public void deleteInterview(int idActuality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Interview> getAllInterview() {
		// TODO Auto-generated method stub
		return null;
	}

}
