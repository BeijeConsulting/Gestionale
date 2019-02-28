package it.beije.gestionale.entities;

import javax.persistence.*;

@Entity
@Table(name="clienti")
public class Cliente {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "ragione_sociale")
	private String ragioneSociale;
	
	@Column(name = "città")
	private String citta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	

}
