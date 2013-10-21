package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;

@Remote
public interface GestionActualityRemote {
public void createActuality(Actuality actuality);
public void updateActuality(Actuality actuality);
public void deleteActuality(int i);
public Actuality getActualityById(int actualityId);
public List<Actuality> getAllActuality();
}
