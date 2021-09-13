import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");
        }

        // base cases
        if (n == 0 || n == 1) {
            return n;
        }

        System.out.printf("computing fib(%d)\n", n);
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibMemoization(int n, Map<Integer, Integer> lookup) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");
        }

        // base cases
        if (n == 0 || n == 1) {
            return n;
        }

        if (lookup.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            return lookup.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fibMemoization(n - 1, lookup) + fibMemoization(n - 2, lookup);
        lookup.put(n, result);
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(fib(8));
        System.out.println(fibMemoization(5, new HashMap<>()));
    }
}
