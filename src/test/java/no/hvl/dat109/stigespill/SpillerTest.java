package no.hvl.dat109.stigespill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester metoder i klassen Spiller.
 */
class SpillerTest {

    @Test
    void testInitialBrikkePosition() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        assertEquals(1, spiller.getBrikke().getPlass().getId(), "Spillerens brikke skal starte på rute 1");
    }
    
    @Test
    void testSpillTrekkWithinBounds() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        spiller.spillTrekk(4);
        assertEquals(5, spiller.getBrikke().getPlass().getId(), "Trekk på 4 skal flytte til rute 5");
    }
    
    @Test
    void testSpillTrekkOvershoot() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        spiller.getBrikke().setPlass(brett.getRute(98));
        spiller.spillTrekk(4);
        assertEquals(98, spiller.getBrikke().getPlass().getId(), "Overskytende trekk skal ikke endre posisjon");
    }
    
    @Test
    void testHarVunnet() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        spiller.getBrikke().setPlass(brett.getRute(100));
        assertTrue(spiller.harVunnet(), "Spilleren skal ha vunnet når brikken er på rute 100");
    }
}
