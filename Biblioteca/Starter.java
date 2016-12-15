import pkgGestBliblio.Biblioteca;
import pkgGestBliblio.Book;
import pkgGestBliblio.InputClass;
import pkgGestBliblio.User;

public class Starter {
	
	public static void main(String[] args) {
		
		Book b;
		User u;
		String cod,nome,cognome,anno,autore,genere,titolo;
		int day=0;
		 	int p=0;
		 	
		InputClass input = new InputClass(); 	
		Biblioteca biblio = new Biblioteca();
		
		
		
		System.out.println("|BENVENUTO NELLA BIBLIOTECA|\n");
		System.out.println("|1)AGGIUNGI LIBRO|\n");
		System.out.println("|2)AGGIUNGI UTENTE|\n");
		System.out.println("|3)PRENOTA LIBRO|\n");
		System.out.println("|4)CONSEGNA LIBRO|\n");
		System.out.println("|5) Mostra Tutti");
		p = input.readInt("Inserisci la scelta ");
		
		switch(p){
		case 1 : {
			cod = input.readLine("Inserisci Codice: ");
			titolo = input.readLine("\n Inserisci Titolo: ");
			genere = input.readLine("\n Inserisci Genere: ");
			autore = input.readLine("\n Inserisci Autore: ");
			anno = input.readLine("\nInserisci Anno: ");
			
			b = new Book (cod,anno,autore,genere,titolo);
			biblio.registraLibro(b);
			
			
		}break;
		
		case 2 : {
			nome = input.readLine("Inserisci Nome: ");
			cognome = input.readLine("\n Cognome: ");
			genere = input.readLine("\n Inserisci Genere: ");
			autore = input.readLine("\n Inserisci Autore: ");
			anno = input.readLine("\nInserisci Anno: ");
			
			u = new User (nome,cognome);
			biblio.registraUtente(u);
			
		}break;
		
		
	case 3 : {
		cod = input.readLine("Inserisci Codice: ");
		nome = input.readLine("\nInserisci Nome: ");
		cognome = input.readLine("\n Cognome: ");
		day = input.readInt("\n Inserisci per quanti giorni: ");
		
		u = new User(nome, cognome);
		biblio.prenotaLibrobyCod(cod,u,day);
		
		
	}break;
		
		
	}

 }
	
}
