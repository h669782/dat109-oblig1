package no.hvl.dat109.stigespill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester metoder i klassen Brikke.
 */
class BrikkeTest {

    @Test
    void testInitialPosition() {
        Brett brett = new Brett();
        Brikke brikke = new Brikke(brett);
        // Brikken skal starte på rute 1.
        assertEquals(1, brikke.getPlass().getId(), "Brikken skal starte på rute 1");
    }
    
    @Test
    void testSetAndGetNavn() {
        Brett brett = new Brett();
        Brikke brikke = new Brikke(brett);
        brikke.setNavn("TestBrikke");
        assertEquals("TestBrikke", brikke.getNavn(), "Navnet skal settes korrekt");
    }
    
    @Test
    void testSetAndGetPlass() {
        Brett brett = new Brett();
        Brikke brikke = new Brikke(brett);
        Rute nyRute = brett.getRute(10);
        brikke.setPlass(nyRute);
        assertEquals(10, brikke.getPlass().getId(), "Brikken skal flyttes til rute 10");
    }
}
