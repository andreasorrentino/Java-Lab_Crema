package pkgAgenda;

import java.util.GregorianCalendar;

public class Contacts {
	
	private int id;
	private	String nome,cognome;
	private GregorianCalendar gc;
	
	
	public Contacts(String nome, String cognome, int id){
		this.nome=nome;
		this.cognome=cognome;
		this.id=id;

	}
	
	public String toString(){
		
		return "Nome: "+this.nome+" Cognome: "+this.cognome;
	}
	
	public int getId(){
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
