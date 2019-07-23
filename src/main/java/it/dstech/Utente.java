package it.dstech;

public class Utente
{
	private String username;
	private String passworld;
	private String nome;
	private String cognome;
	private String mail;
	private String tipo;
	public Utente(String username, String passworld, String nome, String cognome, String mail, String tipo)
	{
		super();
		this.username = username;
		this.nome = nome;
		this.cognome= cognome;
		this.mail = mail;
		this.tipo = tipo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassworld() {
		return passworld;
	}
	public void setPassworld(String passworld) {
		this.passworld = passworld;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
