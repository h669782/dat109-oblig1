package no.hvl.dat109.stigespill;

/**
 * Representerer en rute på brettet.
 */
public class Rute {
    
    /** Id for ruten. */
    public int id;
    
    /**
     * Oppretter en ny rute.
     */
    public Rute() {
    }
    
    /**
     * Oppretter en ny rute med gitt id.
     *
     * @param id identifikatoren for ruten
     */
    public Rute(int id) {
        this.id = id;
    }
    
    /**
     * Henter ruten sin id.
     *
     * @return ruten sin id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Setter ruten sin id.
     *
     * @param id den nye iden til ruten
     */
    public void setId(int id) {
        this.id = id;
    }
}
