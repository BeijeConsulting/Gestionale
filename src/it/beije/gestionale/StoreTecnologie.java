package it.beije.gestionale;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import it.beije.gestionale.entities.Tecnologia;

public class StoreTecnologie {

	public static void main(String[] args) {
		
		//genero connessioni
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		for(int i=0; i < args.length; i++) {
			
			//genero elemento
			Tecnologia tc = new Tecnologia();
			String tecnologia = args[i];
			tc.setTecnologia(tecnologia);
			
			//carico elemento
			session.save(tc);
			
		}
		
		t.commit();
		System.out.println("successfully saved");
		
		//chiudo connessioni
		factory.close();
		session.close(); 
		
	}
	
}
