package ba.unsa.etf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void toStringTest() {
        Student s = new Student("Buggs", "Bunny", 11109);
        assertEquals("Bunny Buggs (11109)", s.toString());
    }

    @Test
    void Studnet() {
        Student s = new Student("Merry", "Johnic", 222);
        assertEquals("Johnic Merry (222)", s.toString());
    }
}