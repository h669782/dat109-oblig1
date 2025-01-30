package no.hvl.dat109.stigespill;

public class Spiller {

	public String navn;
	public Brikke brikke;
	
	public Spiller(String navn) {
		this.navn = navn;
		this.brikke = new Brikke();
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public Brikke getBrikke() {
		return brikke;
	}
	
	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}
	
	public boolean harVunnet() {
		return brikke.getPlass().getId() == 100;
	}
	
	public void spillTrekk() {
		int sum = Terning.trill();
		int plass = brikke.getPlass().getId();
		Rute nyPlass = brett.finnRute(plass, sum);
		brikke.setPlass(nyPlass);
	}
	
}
