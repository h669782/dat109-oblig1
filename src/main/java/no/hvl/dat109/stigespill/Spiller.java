package no.hvl.dat109.stigespill;

/**
 * Representerer en spiller i stigespillet.
 * Inneholder spillerens navn, brikke og tilknyttede brett.
 */
public class Spiller {
    
    private String navn;
    private Brikke brikke;
    private Brett brett;
    
    /**
     * Oppretter en ny spiller med et gitt navn og brett.
     * Brikken opprettes for å starte på startruten.
     *
     * @param navn spillerens navn
     * @param brett brettet spilleren spiller på
     */
    public Spiller(String navn, Brett brett) {
        this.navn = navn;
        this.brett = brett;
        this.brikke = new Brikke(brett);
    }
    
    /**
     * Henter spillerens navn.
     *
     * @return spillerens navn
     */
    public String getNavn() {
        return navn;
    }
    
    /**
     * Setter spillerens navn.
     *
     * @param navn det nye navnet til spilleren
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    /**
     * Henter spillerens brikke.
     *
     * @return spillerens brikke
     */
    public Brikke getBrikke() {
        return brikke;
    }
    
    /**
     * Setter spillerens brikke.
     *
     * @param brikke den nye brikken for spilleren
     */
    public void setBrikke(Brikke brikke) {
        this.brikke = brikke;
    }
    
    /**
     * Sjekker om spilleren har vunnet spillet.
     * En spiller vinner dersom brikkens posisjon er rute 100.
     *
     * @return true hvis spilleren har vunnet
     */
    public boolean harVunnet() {
        return brikke.getPlass().getId() == 100;
    }
    
    /**
     * Utfører et trekk for spilleren ut ifrå terningkastet.
     * Oppdaterer brikkens posisjon på brettet.
     *
     * @param terningkast summen av terningkastet
     */
    public void spillTrekk(int terningkast) {
        int plass = brikke.getPlass().getId();
        Rute nyPlass = brett.finnRute(plass, terningkast);
        brikke.setPlass(nyPlass);
    }
}
