package pkgAgenda;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacts> contacts;
	
	public Agenda(){
		this.contacts= new ArrayList<Contacts>();
	}
	
	public boolean aggiungiContatto(Contacts c){
		this.contacts.add(c);
		return false;
	}
	
	public boolean cancellaContatto(int id){
		for(int i=0; i<this.contacts.size(); i++){
			Contacts c = contacts.get(i); //prendo l'elemento i esimo nell'oggetto contatti
			if(id == c.getId()){
				this.contacts.remove(i);
				return true;
			}
				
		}
		return false;
	}
	
	public Contacts cercaContatto(int id){
		for(int i=0; i<this.contacts.size(); i++){
			Contacts c = contacts.get(i); //prendo l'elemento i esimo nell'oggetto contatti
			if(id == c.getId()){

				return c;
			}
				
		}
		return null;
	}
	
	public Contacts cercaContatto(String lastname){
		for(int i=0; i<this.contacts.size(); i++){
			Contacts c = contacts.get(i); //prendo l'elemento i esimo nell'oggetto contatti
			//lastname è una stringa Controlla se e' uguale con c.getCognome
			if(lastname.contentEquals(c.getCognome())){
				return c;
			}
				
		}
		return null;
	}
		
	public ArrayList<Contacts> startwith(String lastname){
		ArrayList<Contacts> result = new ArrayList<Contacts>();
		
		for(int i=0; i<this.contacts.size(); i++){
			Contacts c = contacts.get(i); //prendo l'elemento i esimo nell'oggetto contatti
			//lastname è una stringa Controlla se e' uguale con c.getCognome
			if(c.getCognome().startsWith(lastname)){
				result.add(c);
			}
				
		}
		return result;
		
	}
	
	public int cancellaStartWith(String prefixCognome){
		int sm=0;
		for(int i=0; i<this.contacts.size(); i++){
			Contacts c = contacts.get(i);
			if(c.getCognome().startsWith(prefixCognome)){
				this.contacts.remove(i);
				sm++;
			}
			
		}
		return sm;
	}
	
	public boolean cancellaTutti(){
			
				this.contacts.clear();
			
		return true;	
	}
	
	public ArrayList<Contacts> monstraTutti(){
		
		return this.contacts;
		
	}
	
	
	public String toString(){
		String result="";
		for(int i=0; i<this.contacts.size(); i++){
			result+= this.contacts.get(i)+"\n";
		}
		
		return result;
		
	}

}
