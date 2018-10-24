package ba.unsa.etf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    private Predmet p = new Predmet("RPR", 1, 10);

    @Test
    void upisi() {
        Student s = new Student("John", "Johnic", 111);
        p.upisi(s);
        assertEquals("1. Johnic John (111)\n", p.toString());
        p.ispisi(s);
    }

    @Test
    void ispisi() {
        Student s = new Student("John", "Johnic", 111);
        p.upisi(s);
        p.ispisi(s);
        assertEquals("", p.toString());
    }

    @Test
    void toStringTest() {
        Student s = new Student("Ime", "Prezime", 1);
        p.upisi(s);
        assertEquals("1. Prezime Ime (1)\n", p.toString());
        p.ispisi(s);
    }
}