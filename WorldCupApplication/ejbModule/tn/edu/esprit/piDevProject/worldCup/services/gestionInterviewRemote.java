package tn.edu.esprit.piDevProject.worldCup.services;


import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.domain.Interview;



@Remote
public interface gestionInterviewRemote {
	public void createInterview(Interview interview);

	public void updateInterview(Interview interview);

	public Actuality findInterviewById(int idActuality);

	public void deleteInterview(int idActuality);

	public List<Interview> getAllInterview();

}
