package pkgGestBliblio;

import java.util.ArrayList;

public class User {
	
private String	nome;
private String	cognome;
private int errori;
private ArrayList<Book> libriletti;
private ArrayList<Book> libriInLettura;


	public User(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		this.errori=0;
		this.libriletti=new ArrayList<Book>();
		this.libriInLettura=new ArrayList<Book>();
		
	}
	
	public int getErrori() {
		return errori;
	}

	public void setErrori(int errori) {
		this.errori = errori;
	}

	public String toString(){
		
		return "(Nome: "+this.nome+" Cognome: "+this.cognome+")\n";
	}
	
	

	public ArrayList<Book> getLibriletti() {
		return libriletti;
	}

	public void setLibriletti(ArrayList<Book> libriletti) {
		this.libriletti = libriletti;
	}

	public ArrayList<Book> getLibriInLettura() {
		return libriInLettura;
	}

	public void setLibriInLettura(ArrayList<Book> libriInLettura) {
		this.libriInLettura = libriInLettura;
	}

	public ArrayList<Book> getBook() {
		return libriletti;
	}


	public void setBook(ArrayList<Book> book) {
		this.libriletti = book;
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


	
	public boolean aggiungiLibroLettura(Book b){
		this.libriInLettura.add(b);
		
		return true;
	}
	public boolean rimuoviLibroLettura(Book b){

		for(int i=0; i<this.libriInLettura.size(); i++){
			Book b1 = libriInLettura.get(i);
			if(b.getCodice().contentEquals(b1.getCodice())){
				this.libriInLettura.remove(i);
				this.libriletti.add(b);
			}
		}
		return true;
	}
	
	public void aggRep(){
		 this.errori++;
		 
	}
	
	public void dowRep(){
		 this.errori--;
		 
	}

}
