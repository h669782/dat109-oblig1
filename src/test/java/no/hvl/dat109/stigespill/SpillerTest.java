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
        // Spillerens brikke skal starte på rute 1.
        assertEquals(1, spiller.getBrikke().getPlass().getId(), "Spillerens brikke skal starte på rute 1");
    }
    
    @Test
    void testSpillTrekkWithinBounds() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        // Fra rute 1, trekk 4 skal flytte brikken til rute 5.
        spiller.spillTrekk(4);
        assertEquals(5, spiller.getBrikke().getPlass().getId(), "Trekk på 4 skal flytte til rute 5");
    }
    
    @Test
    void testSpillTrekkOvershoot() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        // Flytt spilleren til rute 98.
        spiller.getBrikke().setPlass(brett.getRute(98));
        // Et trekk på 4 gir 98+4=102, som overskrider 100. Spilleren skal da bli stående på rute 98.
        spiller.spillTrekk(4);
        assertEquals(98, spiller.getBrikke().getPlass().getId(), "Overskytende trekk skal ikke endre posisjon");
    }
    
    @Test
    void testHarVunnet() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Test", brett);
        // Sett spilleren til å være på rute 100.
        spiller.getBrikke().setPlass(brett.getRute(100));
        assertTrue(spiller.harVunnet(), "Spilleren skal ha vunnet når brikken er på rute 100");
    }
}
