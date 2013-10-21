package worldCup.group4.clientProject.deligate;


import tn.edu.esprit.piDevProject.worldCup.domain.Interview;
import tn.edu.esprit.piDevProject.worldCup.services.gestionInterviewRemote;
import worldCup.group4.clientProject.locator.ServiceLocator;

public class InterviewServiceDelegate {

	private static final String jndiName = "ejb:/WorldCupApplication/gestionInterview!tn.edu.esprit.piDevProject.worldCup.services.gestionInterviewRemote";

	private static gestionInterviewRemote getProxy() {
		return (gestionInterviewRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static void createInterview(Interview interview) {
		getProxy().createInterview(interview);
	}

	public static void findInterviewById(int idActuality) {
		getProxy().findInterviewById(idActuality);
	}

	public static void upDateInterview(Interview interview) {
		getProxy().updateInterview(interview);
	}
}
