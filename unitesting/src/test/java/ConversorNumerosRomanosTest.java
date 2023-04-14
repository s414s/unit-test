import org.junit.jupiter.api.Test;
import org.sanvalero.ConversorNumerosRomanos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ConversorNumerosRomanosTest {

    @Test
    public void testConvertToRoman() {
        assertEquals("I", new ConversorNumerosRomanos().convertirARomano(1));
        assertEquals("X", new ConversorNumerosRomanos().convertirARomano(10));
        assertEquals("VII", new ConversorNumerosRomanos().convertirARomano(7));
        assertEquals("MCMXLIX", new ConversorNumerosRomanos().convertirARomano(1949));
        assertEquals("MMXVIII", new ConversorNumerosRomanos().convertirARomano(2018));
    }

    @Test
    public void testConvertToRomanWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> new ConversorNumerosRomanos().convertirARomano(0));
        assertThrows(IllegalArgumentException.class, () -> new ConversorNumerosRomanos().convertirARomano(-1));
        assertThrows(IllegalArgumentException.class, () -> new ConversorNumerosRomanos().convertirARomano(3001));
    }

}
