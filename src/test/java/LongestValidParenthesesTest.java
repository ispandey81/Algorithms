import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestValidParenthesesTest {

    @Test
    public void testLongestValidParentheses() {
        assertEquals(4, LongestValidParentheses.findMaxLen("()()"));
        assertEquals(0, LongestValidParentheses.findMaxLen("("));
    }
}
