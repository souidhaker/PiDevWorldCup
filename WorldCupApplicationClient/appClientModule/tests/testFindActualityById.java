package tests;

import worldCup.group4.clientProject.deligate.ActualityServiceDeligate;

public class testFindActualityById {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//try {
			//Context context = new InitialContext();
			//gestionActualityRemote proxy = (gestionActualityRemote) context
				//	.lookup("ejb:/worldCup.group4.ejbProject/gestionActuality!services.gestionActualityRemote");

			//Actuality actuality = proxy.findActualityById(1);
		

		//} catch (NamingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		
		ActualityServiceDeligate delege = null;
		delege.findActualityById(1);
		tn.edu.esprit.piDevProject.worldCup.domain.Actuality actuality=delege.findActualityById(1);
		System.out.println(actuality.getActualityDate());
		System.out.println(actuality.getActualityTitle());
		
		}
	}


