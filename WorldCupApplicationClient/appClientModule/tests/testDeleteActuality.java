package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import tn.edu.esprit.piDevProject.worldCup.services.GestionActualityRemote;


public class testDeleteActuality {
	public static void main(String[] args) {
		try {
				Context context = new InitialContext();
				GestionActualityRemote proxy = (GestionActualityRemote) context
						.lookup("ejb:/worldCup.group4.ejbProject/gestionActuality!services.gestionActualityRemote");

				proxy.deleteActuality(1);
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


