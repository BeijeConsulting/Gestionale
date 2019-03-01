package it.beije.gestionale;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.beije.gestionale.HSfactory;
import it.beije.gestionale.entities.Cliente;
import it.beije.gestionale.entities.Dipendente;
import it.beije.gestionale.entities.Tecnologia;


public class StoreData {

	public static void main( String[] args ) {
		//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		Session session = HSfactory.getSession();
		Transaction t = session.beginTransaction();

		Tecnologia tc = new Tecnologia();
		tc.setTecnologia("Java EE");
		session.save(tc);
		Cliente cl = new Cliente(); 
		cl.setCitta("lissone");
		cl.setRagioneSociale("Beije srl");
		session.save(cl);
		
		Dipendente d = new Dipendente();
		//d.setId(1);  
		d.setNome("sonoo");  
		d.setCognome("jaiswal");
		Set<Tecnologia> techs = new HashSet<Tecnologia>();
		techs.add(tc);
		d.setTecnologie(techs);
		Set<Cliente> client = new HashSet<Cliente>();
		client.add(cl);
		d.setCliente(client);
		
		

		session.save(d);
		t.commit();
		System.out.println("successfully saved");
		//factory.close();
		session.close();   
	}
}
