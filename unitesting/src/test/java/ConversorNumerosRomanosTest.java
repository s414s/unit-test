import org.junit.jupiter.api.Test;
import org.sanvalero.ConversorNumerosRomanos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ConversorNumerosRomanosTest {

    @Test
    public void testConvertToRoman() {
        assertEquals("I", ConversorNumerosRomanos.convertirARomano(1));
        assertEquals("X", ConversorNumerosRomanos.convertirARomano(10));
        assertEquals("VII", ConversorNumerosRomanos.convertirARomano(7));
        assertEquals("MCMXLIX", ConversorNumerosRomanos.convertirARomano(1949));
        assertEquals("MMXVIII", ConversorNumerosRomanos.convertirARomano(2018));
    }

    @Test
    public void testConvertToRomanWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> ConversorNumerosRomanos.convertirARomano(0));
        assertThrows(IllegalArgumentException.class, () -> ConversorNumerosRomanos.convertirARomano(-1));
        assertThrows(IllegalArgumentException.class, () -> ConversorNumerosRomanos.convertirARomano(3001));
    }

}
