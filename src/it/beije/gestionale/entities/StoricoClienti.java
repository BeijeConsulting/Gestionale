package it.beije.gestionale.entities;

import javax.persistence.*;

@Entity
@Table(name = "storico_clienti")
public class StoricoClienti {
	
	@Id @GeneratedValue
	@Column (name = "id")
	private int id;
	
	@Column (name = "id_dipendente")
	private int idDipendete;
	
	@Column (name = "id_cliente")
	private int idCliente;
	
	@Column (name = "data_inizio")
	private int dataInizio;
	
	@Column (name = "data_fine")
	private int dataFine;
	
	
	private Cliente cliente;
	
}
