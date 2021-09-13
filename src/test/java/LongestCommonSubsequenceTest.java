import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void testLongestCommonSubsequence() {
        assertEquals(4, LongestCommonSubsequence.LCSLength("ABCBDAB", "BDCABA", 7,6));
        assertEquals(4, LongestCommonSubsequence.LCSLengthMemoization("ABCBDAB", "BDCABA", 7,6, new HashMap<>()));
    }

}
