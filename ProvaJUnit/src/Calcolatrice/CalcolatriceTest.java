package Calcolatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcolatriceTest {

    @Test
    void testSomma() {
        double risultato = Calcolatrice.potenza(3,  2);
        assertEquals(9, risultato);
    }

}