package it.beije.gestionale;

import javax.persistence.*;

@Entity
@Table (name = "tecnologie") 
public class Tecnologia {
	
	@Id @GeneratedValue //id vuol dire chiave primaria e generatedValue vuol dire autoincrement
	@Column (name = "id")
	private int id;
	
	@Column (name = "tecnologia")
	private String tecnologia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	
}
