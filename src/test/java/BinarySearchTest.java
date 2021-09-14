import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {0,1,2,3,4,5,6,7};
        assertEquals(3, BinarySearch.binarySearch(arr, 3, 0, arr.length));
    }
}
