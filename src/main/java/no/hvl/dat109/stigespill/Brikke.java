package no.hvl.dat109.stigespill;

public class Brikke {
	
	public String navn;
	public Rute rute;
	
	public Brikke() {
		
	}
	
	public Brikke(String navn, Rute rute) {
		this.navn = navn;
		this.rute = rute;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public Rute getRute() {
		return rute;
	}
	
	public void setRute(Rute rute) {
		this.rute = rute;
	}

}
