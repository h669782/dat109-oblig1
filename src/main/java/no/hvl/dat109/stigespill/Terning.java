package no.hvl.dat109.stigespill;

/**
 * Representerer en terning i stigespillet.
 * Håndterer terningkast og logikk for tre 6-kast på rad.
 */
public class Terning {
    /** Lagrer den siste terningverdien. */
    private static int verdi;
    
    /**
     * Oppretter en ny terning.
     */
    public Terning() {
    }
    
    /**
     * Returnerer den siste terningverdien.
     * @return siste terningverdi
     */
    public static int getVerdi() {
        return verdi;
    }
    
    /**
     * Kaster terningen for en spiller og returnerer summen av kastene.
     * Dersom spilleren kaster 6, legges et nytt kast til.
     * Hvis summen av kast overstiger eller er lik 18 (altså tre 6-tall på rad), 
     * returneres 0, noe som indikerer at spilleren må flytte tilbake til start.
     *
     * @param spiller spilleren som kaster terningen
     * @return summen av terningkast eller 0 hvis tre 6-tall kastes på rad
     */
    public int trill(Spiller spiller) {
        verdi = (int)((Math.random() * 6) + 1);
        
        while (verdi % 6 == 0 && verdi <= 18) {
            System.out.println(spiller.getNavn() + " kastet 6 og får ett nytt kast");
            verdi += (int)((Math.random() * 6) + 1);
        }
        
        if (verdi >= 18) {
            return 0;
        }
        
        return verdi;
    }
}
