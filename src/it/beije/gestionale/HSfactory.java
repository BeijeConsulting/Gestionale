package it.beije.gestionale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HSfactory {

	private static SessionFactory factory;

	static {
		factory = new Configuration().configure().addAnnotatedClass(Dipendente.class)
				.addAnnotatedClass(Tecnologia.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		return factory.getCurrentSession();
	}

}
