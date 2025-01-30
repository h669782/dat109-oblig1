package no.hvl.dat109.stigespill;

public class Spiller {

    private String navn;
    private Brikke brikke;
    private Brett brett;
    
    public Spiller(String navn, Brett brett) {
        this.navn = navn;
        this.brett = brett;
        this.brikke = new Brikke(brett);
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
    
    public void spillTrekk(int terningkast) {
        int plass = brikke.getPlass().getId();
        Rute nyPlass = brett.finnRute(plass, terningkast);
        brikke.setPlass(nyPlass);
    }
}
