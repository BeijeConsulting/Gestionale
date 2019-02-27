package it.beije.gestionale;


public class Dipendente {
	
	private int id;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoNascita;
	private char sesso;
	private String codiceFiscale;
	private String numeroTelefono;
	private String mail;

//	public Dipendente(String nome, String cognome, char sesso) {
//		this.nome = nome;
//		this.cognome = cognome;
//		this.sesso = sesso;
//	}
//
//	public Dipendente(String nome, String cognome, char sesso, String dataNascita, String luogoNascita, 
//			String codiceFiscale, String numeroTelefono, String mail) {
//		this(nome, cognome, sesso);
//		this.dataNascita= dataNascita;
//		this.luogoNascita= luogoNascita;
//		this.codiceFiscale= codiceFiscale;
//		this.numeroTelefono= numeroTelefono;
//		this.mail= mail;
//	}
	
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

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
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

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("nome : ").append(nome).append(" | ");
		b.append("cognome : ").append(cognome).append(" | ");
		b.append("data di nascita : ").append(dataNascita).append(" | ");
		b.append("luogo di nascita : ").append(luogoNascita).append(" | ");
		b.append("sesso : ").append(sesso).append(" | ");
		b.append("codice fiscale : ").append(codiceFiscale).append(" | ");
		b.append("numero telefono : ").append(numeroTelefono).append(" | ");
		b.append("email : ").append(mail).append(" | ");
		
		return b.toString();
	}

}