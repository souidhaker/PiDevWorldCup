package worldCup.group4.clientProject.GUI;

import javax.xml.ws.spi.ServiceDelegate;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;
import worldCup.group4.clientProject.deligate.MicroEventServiceDeligate;

public class TestEvent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
MicroEvent event = new MicroEvent();
event.setNameEvent("Free Kick Youssef Msakni");
event.setTimeEvent(62);
event.setTypeEvent("Free Kick");

MicroEventServiceDeligate.createMicroEvent(event); 

	
	}

}
