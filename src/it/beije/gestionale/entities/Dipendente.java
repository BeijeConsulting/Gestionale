package it.beije.gestionale.entities;
//hibernate annotetion per il collegamento con il db
import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="dipendenti")
public class Dipendente {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "data_nascita")
	private LocalDate dataNascita;
	
	@Column(name = "luogo_nascita")
	private String luogoNascita;
	
	@Column(name = "sesso")
	private char sesso;
	
	@Column(name = "codice_fiscale")
	private String codiceFiscale;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "mail")
	private String mail;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "dipendente_tecnologie",
            joinColumns = @JoinColumn(name = "id_dipendente"),
            inverseJoinColumns = @JoinColumn(name = "id_tecnologia")
    )
	private Set<Tecnologia> tecnologie;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinTable(
			name = "dipendente_cliente",
			joinColumns = @JoinColumn(name = "id_dipendente"),
			inverseJoinColumns = @JoinColumn(name = "id_cliente")
			)
	private Set<Cliente> clienti;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Set<Tecnologia> getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(Set<Tecnologia> tecnologie) {
		this.tecnologie = tecnologie;
	}
	
	public Set<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(Set<Cliente> clienti) {
		this.clienti = clienti;
	}

	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("nome : ").append(nome).append(" | ");
		b.append("cognome : ").append(cognome).append(" | ");
		b.append("data di nascita : ").append(dataNascita).append(" | ");
		b.append("luogo di nascita : ").append(luogoNascita).append(" | ");
		b.append("sesso : ").append(sesso).append(" | ");
		b.append("codice fiscale : ").append(codiceFiscale).append(" | ");
		b.append("telefono : ").append(telefono).append(" | ");
		b.append("email : ").append(mail).append(" | ");
		
		return b.toString();
	}

}

