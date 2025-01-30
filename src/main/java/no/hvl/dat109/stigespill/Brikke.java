package no.hvl.dat109.stigespill;

public class Brikke {
	
	public String navn;
	public Rute plass;
	
	public Brikke() {
		
	}
	
	public Brikke(String navn, Rute plass) {
		this.navn = navn;
		this.plass = plass;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public Rute getPlass() {
		return plass;
	}
	
	public void setPlass(Rute plass) {
		this.plass = plass;
	}

}
