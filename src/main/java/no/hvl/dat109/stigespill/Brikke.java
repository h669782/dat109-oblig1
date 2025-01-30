package no.hvl.dat109.stigespill;

public class Brikke {
    
    private String navn;
    private Rute plass;
    private Brett brett;
    
    public Brikke(Brett brett) {
        this.brett = brett;
        this.plass = brett.finnRute(1, 0);
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
    
    public Brett getBrett() {
    	return brett;
    }
}