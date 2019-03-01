package it.beije.gestionale;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//per stamparlo su eclipse (non serve)

import it.beije.gestionale.entities.Tecnologia;

public class PrintTecnologies {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Tecnologia.class);
		List tecnologie = criteria.list();

		Iterator itr = tecnologie.iterator();
		while (itr.hasNext()) {
			Tecnologia tech = (Tecnologia) itr.next();
			System.out.println(tech.getId());
			System.out.println(tech.getTecnologia());
		}
		
//		Tecnologia t1 = session.load(Tecnologia.class, new Integer(1));
//		System.out.println(t1.getId());
//		System.out.println(t1.getTecnologia());

		t.commit();
		factory.close();
		session.close();   
	}

}
