package no.hvl.dat109.stigespill;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester metoden trill i klassen Terning.
 * Siden metoden benytter tilfeldige tall, testes det at resultatet 
 * er enten 0 (ved tre 6-tall på rad) eller et tall mellom 1 og 17.
 */
class TerningTest {

    @Test
    void testTrillResultRange() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Dummy", brett);
        Terning terning = new Terning();
        int result = terning.trill(spiller);
        
        if (result != 0) {
            assertTrue(result > 0 && result < 18, "Resultat skal være mellom 1 og 17 når det ikke er 0");
        } else {
            assertEquals(0, result, "Resultat er 0 når tre 6-tall kastes på rad");
        }
    }
    
    @RepeatedTest(50)
    void repeatedTestTrill() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Dummy", brett);
        Terning terning = new Terning();
        int result = terning.trill(spiller);
        // Sjekker at resultatet faller innenfor gyldig intervall.
        if (result != 0) {
            assertTrue(result > 0 && result < 18, "Resultat skal være mellom 1 og 17 når det ikke er 0");
        }
    }
}
