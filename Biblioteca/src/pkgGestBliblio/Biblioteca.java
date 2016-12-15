package pkgGestBliblio;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<User> utenti;
	private ArrayList<Book> libri;
	
	public Biblioteca(){
		this.utenti = new ArrayList<User>();
		this.libri = new ArrayList<Book>();
	}
	
	
	public boolean registraLibro(Book b){
		this.libri.add(b);
		return true;
	}
	
	public boolean registraUtente(User u){
		this.utenti.add(u);
		return true;
	}
	
	public boolean cancellaUtentebyNome(String name){
		for(int i=0;i<this.utenti.size();i++){
			User u = this.utenti.get(i);
			if(name.contentEquals(u.getNome())){
				this.utenti.remove(i);
				return true;
			}
			
		}
		
		return false;
	}
	
	public boolean cancellaLibrobyCodice(String code){
		for(int i=0; i<this.libri.size(); i++ ){
			Book b = this.libri.get(i);
			if(code.contentEquals(b.getCodice())){
				this.libri.remove(i);
				return true;
			}
			
		}
		
		return false;
	}
	
	public User cercaUtentebyName(String name){
		for(int i=0; i<this.utenti.size(); i++){
			User u = this.utenti.get(i);
			if(name.contentEquals(u.getNome())){
				
				return u;
			}
		}
		
		return null;
		
	}
	
	public Book cercaLibrobyTitolo(String name){
		for(int i=0; i<this.libri.size(); i++){
			Book b = this.libri.get(i);
			if(name.contentEquals(b.getTitolo())){
				return b;
			}
		}
		
		return null;
		
	}
	
	public boolean prenotaLibrobyCod(String cod,  User u, int day){
		
		for(int i=0; i<this.libri.size(); i++){
			Book b = this.libri.get(i);
			if(cod.contentEquals(b.getCodice())){
				if(b.isDisp()){
					b.setDisp(false);
					b.setGiorni(day);
					u.aggiungiLibroLettura(b);
					return true;
				}
				
			}
			
		}
		
		return false;
	}
	
	
	public boolean consegnaLibro(String cod, User u, int day){
		
		for(int i=0; i<this.libri.size(); i++){
			Book b = this.libri.get(i);
			if(cod.contentEquals(b.getCodice())){
					if(day > b.getGiorni()){
						u.aggRep();
						b.setDisp(true);
					}
					
					u.rimuoviLibroLettura(b);
					return true;
				}
				
			}
			
		
		
		return false;
		
		
	}
	
	

}
