package no.hvl.dat109.stigespill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester funksjonaliteten til klassen Rute.
 */
class RuteTest {

    @Test
    void testSetAndGetId() {
        Rute rute = new Rute();
        rute.setId(25);
        assertEquals(25, rute.getId(), "Ruten sin id skal settes til 25");
    }
    
    @Test
    void testConstructorWithId() {
        Rute rute = new Rute(75);
        assertEquals(75, rute.getId(), "Ruten sin id skal være 75 ved konstruksjon");
    }
}
