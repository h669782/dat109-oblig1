package no.hvl.dat109.stigespill;

/**
 * Representerer en spillbrikke i stigespillet.
 * Holder rede på spillerens navn og posisjon (rute) på brettet.
 */
public class Brikke {
    
    private String navn;
    private Rute plass;
    private Brett brett;
    
    /**
     * Oppretter en ny Brikke for et gitt brett.
     * Brikken starter alltid på rute 1.
     *
     * @param brett brettet spillbrikken er en del av
     */
    public Brikke(Brett brett) {
        this.brett = brett;
        this.plass = brett.finnRute(1, 0);
    }
    
    /**
     * Henter navnet til brikken.
     *
     * @return navnet til brikken
     */
    public String getNavn() {
        return navn;
    }
    
    /**
     * Setter navnet til brikken.
     *
     * @param navn navnet til brikken
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    /**
     * Henter den nåværende ruten brikken er på.
     *
     * @return den nåværende ruten
     */
    public Rute getPlass() {
        return plass;
    }
    
    /**
     * Setter den nye ruten for brikken.
     *
     * @param plass den nye ruten
     */
    public void setPlass(Rute plass) {
        this.plass = plass;
    }
    
    /**
     * Henter brettet som brikken tilhører.
     *
     * @return brettet til brikken
     */
    public Brett getBrett() {
        return brett;
    }
}
