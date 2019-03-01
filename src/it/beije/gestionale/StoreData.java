package it.beije.gestionale;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.beije.gestionale.entities.Dipendente;
import it.beije.gestionale.entities.Tecnologia;
import it.beije.gestionale.entities.Cliente;


public class StoreData {

	public static void main( String[] args ) {
		
		Session session = HSfactory.getSession();
		Transaction t = session.beginTransaction();

		Tecnologia tc = new Tecnologia();
		tc.setTecnologia("Java EE");
		session.save(tc);
		
		Cliente cl = new Cliente();
		cl.setRagioneSociale("Beije Srl");
		cl.setCitta("Lissone");

		Dipendente d = new Dipendente();
		d.setNome("sonoo");  
		d.setCognome("jaiswal");
		Set<Tecnologia> techs = new HashSet<Tecnologia>();
		techs.add(tc);
		d.setTecnologie(techs);
		Set<Cliente> clients = new HashSet<Cliente>();
		clients.add(cl);
		d.setClienti(clients);
		
		session.save(d);
		t.commit();
		System.out.println("successfully saved");
		session.close();   
	}
}
