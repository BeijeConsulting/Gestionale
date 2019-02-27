package it.beije.gestionale;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main( String[] args ) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Tecnologia tc = new Tecnologia();
		tc.setTecnologia("Java EE");
		session.save(tc);

		Dipendente d = new Dipendente();
		//d.setId(1);  
		d.setNome("sonoo");  
		d.setCognome("jaiswal");
		Set<Tecnologia> techs = new HashSet<Tecnologia>();
		techs.add(tc);
		d.setTecnologie(techs);
		

		session.save(d);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();   
	}
}
