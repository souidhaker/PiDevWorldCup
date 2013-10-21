package worldCup.group4.clientProject.deligate;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.services.GestionActualityRemote;
import worldCup.group4.clientProject.locator.ServiceLocator;




public class ActualityServiceDeligate {

	private static final String jndiName = "ejb:/WorldCupApplication/GestionActuality!tn.edu.esprit.piDevProject.worldCup.services.GestionActualityRemote";

	private static GestionActualityRemote getProxy() {
		return (GestionActualityRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static void createActuality(Actuality actuality) {
		getProxy().createActuality(actuality);
	}
	
	public static Actuality  findActualityById(int idActuality)
	{
		return getProxy().getActualityById(idActuality);
	}

	public static void upDateActuality(Actuality actuality) {
		getProxy().updateActuality(actuality);
	}
}
