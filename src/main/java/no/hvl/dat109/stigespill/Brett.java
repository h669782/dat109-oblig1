package no.hvl.dat109.stigespill;

/**
 * Representerer brettet i stigespillet.
 * Består av 100 ruter
 */
public class Brett {
    private Rute[] brett;
    
    /**
     * Oppretter et nytt Brett med 100 ruter.
     */
    public Brett() {
        brett = new Rute[101];
        for (int i = 1; i <= 100; i++) {
            brett[i] = new Rute(i);
        }
    }
    
    /**
     * Returnerer ruten som en spiller skal flytte til.
     * Dersom summen av nåværende posisjon og terningkast overstiger 100,
     * returneres den opprinnelige ruten.
     *
     * @param plass den nåværende posisjonen til spilleren
     * @param sum terningkastets sum
     * @return den nye ruten spilleren flytter til, eller den opprinnelige ruten hvis summen overstiger 100
     */
    public Rute finnRute(int plass, int sum) {
        if (sum + plass > 100) {
            return brett[plass];
        }
        return brett[sum + plass];
    }
    
    /**
     * Henter ruten med gitt id.
     *
     * @param id identifikatoren til ruten
     * @return ruten med angitt id
     */
    public Rute getRute(int id) {
        return brett[id];
    }
}
