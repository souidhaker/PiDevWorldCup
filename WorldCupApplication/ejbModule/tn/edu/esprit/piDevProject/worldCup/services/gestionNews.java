package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.domain.News;


/**
 * Session Bean implementation class gestionNews
 */
@Stateless
@LocalBean
public class gestionNews implements gestionNewsRemote, gestionNewsLocal {

	@PersistenceContext
	EntityManager em;
    public gestionNews() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createNews(News news) {
		em.persist(news);
		
	}

	@Override
	public void updateNews(News news) {
		em.merge(news);
		
	}

	@Override
	public Actuality findNews(int idActuality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNews(int idActuality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News> getNews() {
		// TODO Auto-generated method stub
		return null;
	}

}
