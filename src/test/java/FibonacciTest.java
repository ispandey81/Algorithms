import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(55, Fibonacci.fibMemoization(10, new HashMap<>()));
        assertEquals(55, Fibonacci.fib(10));
    }
}
