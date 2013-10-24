package tn.edu.esprit.piDevProject.worldCup.services;

import java.util.List;

import javax.ejb.Local;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;



@Local
public interface MicroEventsServicesLocal {
	public void addMicroEvent(MicroEvent event);

	public MicroEvent findEventById(int idEvent);

	public void deleteEventById(int idEvent);

	public void updateEvent(MicroEvent event);
	
	public List<MicroEvent> findAllEvents();
}
