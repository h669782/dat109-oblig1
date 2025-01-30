package no.hvl.dat109.stigespill;

public class Spiller {

	public String navn;
	
	public Spiller() {
		
	}
	
	public Spiller(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public boolean harVunnet() {
		return false;
	}
	
	public void spillTrekk() {
		
	}
	
}
