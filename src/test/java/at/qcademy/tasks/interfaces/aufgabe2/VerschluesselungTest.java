package at.qcademy.tasks.interfaces.aufgabe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerschluesselungTest {
    @Test
    public void testCaesarVerschluesselung() {
        // Testfall für die Caesar-Chiffrierung mit Verschiebung 3
        CaesarChiffrierung caesarSchluessel = new CaesarChiffrierung(3);

        String klartext = "hello";//String soll hello sein
        String verschluesselt = Verschluesselung.verschluesseln(klartext, caesarSchluessel);
        String entschluesselt = Verschluesselung.entschluesseln(verschluesselt, caesarSchluessel);

        assertEquals("khoor", verschluesselt);//verschluesselt soll khoor sein
        assertEquals(klartext, entschluesselt);//entschluesselt soll hello sein und verschluesselt sollte khoor sein

    }
}