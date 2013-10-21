package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.domain.News;



@Remote
public interface gestionNewsRemote {
	public void createNews(News news);

	public void updateNews(News news);

	public Actuality findNews(int idActuality);

	public void deleteNews(int idActuality);

	public List<News> getNews();

}
