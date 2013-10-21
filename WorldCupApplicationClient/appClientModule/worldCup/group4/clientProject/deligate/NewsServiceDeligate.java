package worldCup.group4.clientProject.deligate;


import tn.edu.esprit.piDevProject.worldCup.domain.News;
import tn.edu.esprit.piDevProject.worldCup.services.gestionNewsRemote;
import worldCup.group4.clientProject.locator.ServiceLocator;

public class NewsServiceDeligate {

	/**
	 * @param args
	 */
	private static final String jndiName = "ejb:/WorldCupApplication/gestionNews!tn.edu.esprit.piDevProject.worldCup.services.gestionNewsRemote";

	private static gestionNewsRemote getProxy() {
		return (gestionNewsRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}

	public static void createNews(News news) {
		getProxy().createNews(news);
	}

	public static void findNewsById(int idActuality) {
		getProxy().findNews(idActuality);
	}

	public static void upDateInterview(News news) {
		getProxy().updateNews(news);
	}

}
