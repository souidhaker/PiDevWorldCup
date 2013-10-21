package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.Local;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;

@Local
public interface GestionActualityLocal {
	public void createActuality(Actuality actuality);
	public void updateActuality(Actuality actuality);
	public void deleteActuality(Actuality actuality);
	public Actuality getActualityById(int actualityId);
	public List<Actuality> getAllActuality();
}
