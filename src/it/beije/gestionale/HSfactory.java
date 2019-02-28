package it.beije.gestionale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.beije.gestionale.entities.Dipendente;
import it.beije.gestionale.entities.Tecnologia;

public class HSfactory {
	
	private static SessionFactory factory;
	
	static {
		factory = new Configuration().
				configure().
				//addPackage("it.beije.gestionale.entities").
				addAnnotatedClass(Dipendente.class).
				addAnnotatedClass(Tecnologia.class).
                buildSessionFactory();
	}
	
	public static Session getSession() {
		return factory.openSession();
	}

}