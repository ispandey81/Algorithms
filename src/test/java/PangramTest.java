import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramTest {

    @Test
    public void testPangram() {
        assertEquals(true, Pangram.isPangram("The quick brown fox jumps over the lazy dog"));
        assertEquals(false, Pangram.isPangram("The quick brown fox"));
    }
}
