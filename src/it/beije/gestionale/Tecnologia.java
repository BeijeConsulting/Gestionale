package it.beije.gestionale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tecnologie")
public class Tecnologia {
	
	@Id @GeneratedValue
	@Column (name = "id")
	private int id;
	
	@Column (name = "tecnologia")
	private String tecnologia;
	
		
	//setter e getter
	
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
