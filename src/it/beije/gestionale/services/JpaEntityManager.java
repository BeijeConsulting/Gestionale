package it.beije.gestionale.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaEntityManager {
	
	private static EntityManagerFactory emfactoryGestionale;
	//private static EntityManagerFactory emfactoryRapportini;
	
	static {
		emfactoryGestionale = Persistence.createEntityManagerFactory( "Gestionale" );
		//emfactoryRapportini = Persistence.createEntityManagerFactory( "Rapportini" );
	}
	
	public static EntityManager getGestionaleManager() {
		return emfactoryGestionale.createEntityManager();
	}

//	public static EntityManager getRapportiniManager() {
//		return emfactoryRapportini.createEntityManager();
//	}

}
