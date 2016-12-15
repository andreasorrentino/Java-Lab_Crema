import pkgAgenda.Agenda;
import pkgAgenda.Contacts;


 
public class Starter {


	public static void main(String[] args) {
		
		Agenda a1 = new Agenda();
		Contacts c=new Contacts("Name1","Lastname1",1);
		a1.aggiungiContatto(c);
		c=new Contacts("Name2","Lastname2",2);
		a1.aggiungiContatto(c);
		c=new Contacts("Name3","Lastname3",3);
		a1.aggiungiContatto(c);
		
		System.out.print(a1);
		System.out.print("\n");
		System.out.println(a1.cercaContatto("Lastname2"));
		
		
		

		
	}
	
	
}
