package it.beije.gestionale;

import java.util.Scanner;

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
		
		Scanner s = new Scanner(System.in);
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		
		String insert = s.nextLine();
		
		while (!(insert.equalsIgnoreCase("quit"))) {
			Tecnologia tech = new Tecnologia();
			tech.setTecnologia(insert);
			session.save(tech);
			insert = s.nextLine();
		}
		
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
		s.close();

	}

}
