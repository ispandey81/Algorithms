import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] data = { -2, 45, 0, 11, -9 };
        assertEquals("[-9, -2, 0, 11, 45]", Arrays.toString(BubbleSort.bubbleSort(data)));
    }
}
