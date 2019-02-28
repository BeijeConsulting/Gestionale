package it.beije.gestionale;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.beije.gestionale.entities.Dipendente;
import it.beije.gestionale.entities.Tecnologia;


//3 passaggio funzioni base di hibernate richiamo i valori delle classi e le salvo in session

public class StoreData {

	public static void main( String[] args ) {
		//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		Session session = HSfactory.getSession();
		Transaction t = session.beginTransaction();
		
		//inserisco i dati nellla classe tecnologia e li salvo oppure se voglio solo la tecnologia faccio storetecnologia
		Tecnologia tc = new Tecnologia();
		tc.setTecnologia(args[0]);
		Tecnologia tc1 = new Tecnologia();
		tc1.setTecnologia(args[1]);
		Tecnologia tc2 = new Tecnologia();
		tc2.setTecnologia(args[2]);
		Tecnologia tc3 = new Tecnologia();
		tc3.setTecnologia(args[3]);
		session.save(tc);
		session.save(tc1);
		session.save(tc2);
		session.save(tc3);
		
	
		
		//inserisco i valori nella classe dipendente
		Dipendente d = new Dipendente();  
		d.setNome("Mario");  
		d.setCognome("Rossi");
		d.setSesso('M');
		d.setCodiceFiscale("MRRSSI45C12T789M");
		d.setDataNascita(LocalDate.of(1945, 03, 12));
		d.setLuogoNascita("Milano");
		d.setTelefono("3268945782");
		d.setMail("mariorossi@gmail.com");
		Set<Tecnologia> techs = new HashSet<Tecnologia>();
		techs.add(tc);
		d.setTecnologie(techs);
		
		//salvo i dati del dipendente 
		session.save(d);
		
		t.commit();
		System.out.println("successfully saved");
		//factory.close();
		session.close();   
	}
}
