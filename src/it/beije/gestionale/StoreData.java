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
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		/*nel caso in cui scrivo codice alla vecchia maniera, con i mapping delle classi in file .xml 
		 * allora farò un oggetto di tipo tandardServiceRegistry ecc*/
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		
		
		/*sposto la factory in una nuova classe che restituisce con un metodo statico la factory*/
//		SessionFactory factory = new Configuration().
//				configure().addAnnotatedClass(Dipendente.class).
//				addAnnotatedClass(Tecnologia.class).
//				buildSessionFactory();
		
		/*prendo la sessione dalla classe HSfactory che è impostata in modo statico*/
		Session session = HSfactory.getSession();
		Transaction t = session.beginTransaction();

		
		Tecnologia tc;
		System.out.println("Quante tecologie vuoi inserire?");
		int x = GestioneScanner.PrendiInt();
		for (int i = 0; i < x ; i++) {
			System.out.println("Scrivi la tecnologia da inserire nel database e premi invio");
			tc= new Tecnologia();
			tc.setTecnologia(GestioneScanner.PrendiStringa());
			session.save(tc);
		}

//		Dipendente d = new Dipendente();
//		d.setNome("sonoo");  
//		d.setCognome("jaiswal");
//		Set<Tecnologia> techs = new HashSet<Tecnologia>();
//		techs.add(tc);
//		d.setTecnologie(techs);

//		session.save(d);
		
		
		t.commit();
		System.out.println("successfully saved");
		HSfactory.getSession().close();
		session.close();
	}
}
