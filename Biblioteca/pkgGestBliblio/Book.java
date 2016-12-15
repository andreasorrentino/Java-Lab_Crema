package pkgGestBliblio;

public class Book {
	private String codice;
	private String anno;
	private String autore;
	private String genere;
	private String titolo;
	private int	giorni;
	private boolean	disp;
	
	
	public Book(String codice, String anno, String autore, String genere, String titolo){
		this.codice=codice;
		this.anno=anno;
		this.autore=autore;
		this.genere=genere;
		this.titolo=titolo;
		this.giorni=0;
		this.disp=false;
	}


	public int getGiorni() {
		return giorni;
	}


	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String toString(){
		String s = "Non Disponibile";
		if (this.disp == true ) {
			s ="E' disponibile";
		}
			
		return "Cod: "+this.codice+" Autore: "+this.autore+" Genere: "+this.genere+" "+s;
	}
	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public String getAnno() {
		return anno;
	}


	public void setAnno(String anno) {
		this.anno = anno;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	public boolean isDisp() {
		return disp;
	}


	public void setDisp(boolean disp) {
		this.disp = disp;
	}
	

}
