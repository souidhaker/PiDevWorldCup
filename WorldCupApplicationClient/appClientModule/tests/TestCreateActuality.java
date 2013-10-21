package tests;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.domain.Interview;
import tn.edu.esprit.piDevProject.worldCup.domain.News;
import worldCup.group4.clientProject.deligate.ActualityServiceDeligate;
import worldCup.group4.clientProject.deligate.InterviewServiceDelegate;
import worldCup.group4.clientProject.deligate.NewsServiceDeligate;




public class TestCreateActuality {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// try {
		// Context context = new InitialContext();
		// gestionActualityRemote proxy = (gestionActualityRemote) context
		// .lookup("ejb:/worldCup.group4.ejbProject/gestionActuality!services.gestionActualityRemote");
		ActualityServiceDeligate delege = null;
		Actuality actuality = new Actuality();
		// actuality.setIdActuality(1);
		actuality.setActualityTitle("marwen");
		actuality.setActualityDate("11/11/2011");
		delege.createActuality(actuality);
		
		InterviewServiceDelegate delege1 = null;
		Interview interview = new Interview();
		interview.setInterviewdPlayer("carlos");
		delege1.createInterview(interview);
		
		NewsServiceDeligate delege2 = null;
		News news = new News();
		news.setNewsDescription("djerba");
		delege2.createNews(news);

		// proxy.createActuality(actuality);

		// } catch (NamingException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
