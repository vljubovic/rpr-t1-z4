package ba.unsa.etf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    private Predmet p = new Predmet("RPR", 1, 10);

    @Test
    void upisi() {
        //Kako?
    }

    @Test
    void ispisi() {
        //Kako?
    }

    @Test
    void toStringTest() {
        Student s = new Student("Ime", "Prezime", 1);
        p.upisi(s);
        assertEquals("1. Prezime Ime (1)\n", p.toString());
        p.ispisi(s);
    }
}