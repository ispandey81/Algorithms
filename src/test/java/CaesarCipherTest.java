import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testCaesarCipherEncrypt() {
        assertEquals("IFMMP", CaesarCipher.encrypt("HELLO",1));
    }

    @Test
    public void testCaesarCipherDecrypt() {
        assertEquals("HELLO", CaesarCipher.decrypt("IFMMP",1));
    }
}
