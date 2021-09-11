import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        assertEquals(10, BinaryToDecimal.convertBinaryToDecimal("1010"));
        assertEquals(2, BinaryToDecimal.convertBinaryToDecimal("10"));
    }
}
