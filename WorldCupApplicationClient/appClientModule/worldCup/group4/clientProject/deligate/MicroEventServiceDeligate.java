package worldCup.group4.clientProject.deligate;

import java.util.List;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;
import tn.edu.esprit.piDevProject.worldCup.services.MicroEventsServicesRemote;
import worldCup.group4.clientProject.locator.ServiceLocator;

public class MicroEventServiceDeligate {

	private static final String jndiName = "ejb:/WorldCupApplication/MicroEventsServices!tn.edu.esprit.piDevProject.worldCup.services.MicroEventsServicesRemote";

	private static MicroEventsServicesRemote getProxy() {
		return (MicroEventsServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static void createMicroEvent(MicroEvent event) {
		getProxy().addMicroEvent(event);
	}

	public static MicroEvent findEventById(int idEvent) {
		return getProxy().findEventById(idEvent);
	}

	public static void upDateEvent(MicroEvent event) {
		getProxy().updateEvent(event);
	}
	
	public static void deleteEvent(int idEvent)
	{
		getProxy().deleteEventById(idEvent);
	}

	public static List<MicroEvent> findAllEvents() {
		return getProxy().findAllEvents();
	}
}
