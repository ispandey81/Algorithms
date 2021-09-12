import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToBinaryTest {

    @Test
    public void testDecimalToBinary() {
        assertEquals(10, DecimalToBinary.convertDecimalToBinary(2));
        assertEquals(1010, DecimalToBinary.convertDecimalToBinary(10));
    }
}
