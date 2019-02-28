package it.beije.gestionale;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class StoreData {

	public static void main(String[] args) {
		
		//nel caso in cui scrivo codice alla vecchia maniera, con i mapping delle classi in file .xml
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		//sposto la factory in una nuova classe che restituisce con un metodo statico la factory
//		SessionFactory factory = new Configuration().
//				configure().addAnnotatedClass(Dipendente.class).
//				addAnnotatedClass(Tecnologia.class).
//				buildSessionFactory();
		
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
