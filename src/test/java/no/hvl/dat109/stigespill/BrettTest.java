package no.hvl.dat109.stigespill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester metoder i klassen Brett.
 */
class BrettTest {

    @Test
    void testFinnRuteWithinBounds() {
        Brett brett = new Brett();
        // For posisjon 95 med trekk 4, blir ny posisjon 95+4=99.
        Rute rute = brett.finnRute(95, 4);
        assertEquals(99, rute.getId(), "Ruten skal være 99 når summen ikke overskrider 100");
    }
    
    @Test
    void testFinnRuteOvershoot() {
        Brett brett = new Brett();
        // For posisjon 95 med trekk 6, blir 95+6=101 > 100, så spilleren skal bli stående på rute 95.
        Rute rute = brett.finnRute(95, 6);
        assertEquals(95, rute.getId(), "Ruten skal forbli 95 pga overshoot");
    }
    
    @Test
    void testGetRute() {
        Brett brett = new Brett();
        Rute rute = brett.getRute(50);
        assertEquals(50, rute.getId(), "Ruten sin id skal være 50");
    }
}
