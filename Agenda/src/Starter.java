import pkgAgenda.Agenda;
import pkgAgenda.Contacts;

/**
 * 
 */

/**
 * @author andrea.sorrentino2
 *
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Agenda a1 = new Agenda();
		Contacts c=new Contacts("Andrea","Sorrentino",1);
		a1.aggiungiContatto(c);
		c=new Contacts("Marco","Anisetti",2);
		a1.aggiungiContatto(c);
		c=new Contacts("Antonio","Bello",3);
		a1.aggiungiContatto(c);
		
		System.out.print(a1);
		System.out.print("\n");
		System.out.println(a1.cercaContatto("Sorrentino"));
		
		
		

		
	}
	
	
}
