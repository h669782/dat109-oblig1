package no.hvl.dat109.stigespill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * En enkel test for konstruktøren til Stigespill.
 * Merk at interaktiv input og hovedløkken ikke testes her.
 */
class StigespillTest {

    @Test
    void testConstructor() {
        // Oppretter et spill med to spillere.
        Stigespill spill = new Stigespill(Arrays.asList("Alice", "Bob"));
        assertNotNull(spill, "Stigespill-instansen skal ikke være null");
    }
}
