package it.beije.gestionale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import it.beije.gestionale.entities.Tecnologia;

//inserisco da linea di comando i valori di tecnologia cosi mi inserisce solo i valori di tecnologia
//mi creo direttamente da qui la tabella tecnologia con i relativi valori che ho inserito per il db

public class StoreTecnologia {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		for (int i = 0; i<args.length; i++) {
			Tecnologia tech = new Tecnologia();
			tech.setTecnologia(args[i]);
			session.save(tech);
		}
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
