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
}