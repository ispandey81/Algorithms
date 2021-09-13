import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {
    // Function to find the length of the longest common subsequence of
    // sequences `X[0…m-1]` and `Y[0…n-1]`
    public static int LCSLength(String X, String Y, int m, int n)
    {
        // return if the end of either sequence is reached
        if (m == 0 || n == 0) {
            return 0;
        }

        // if the last character of `X` and `Y` matches
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return LCSLength(X, Y, m - 1, n - 1) + 1;
        }

        // otherwise, if the last character of `X` and `Y` don't match
        return Integer.max(LCSLength(X, Y, m, n - 1),
                LCSLength(X, Y, m - 1, n));
    }

    // Function to find the length of the longest common subsequence of substring
    // `X[0…m-1]` and `Y[0…n-1]`
    public static int LCSLengthMemoization(String X, String Y, int m, int n,
                                Map<String, Integer> lookup)
    {
        // return if the end of either string is reached
        if (m == 0 || n == 0) {
            return 0;
        }

        // construct a unique map key from dynamic elements of the input
        String key = m + "|" + n;

        // if the subproblem is seen for the first time, solve it and
        // store its result in a map
        if (!lookup.containsKey(key))
        {
            // if the last character of `X` and `Y` matches
            if (X.charAt(m - 1) == Y.charAt(n - 1)) {
                lookup.put(key, LCSLengthMemoization(X, Y, m - 1, n - 1, lookup) + 1);
            }
            else {
                // otherwise, if the last character of `X` and `Y` don't match
                lookup.put(key, Integer.max(LCSLengthMemoization(X, Y, m, n-1, lookup),
                        LCSLengthMemoization(X, Y, m - 1, n, lookup)));
            }
        }

        // return the subproblem solution from the map
        return lookup.get(key);
    }

    public static void main(String[] args)
    {
        String X = "ABCBDAB", Y = "BDCABA";
        // create a map to store solutions to subproblems
        Map<String, Integer> lookup = new HashMap<>();

//        System.out.print("The length of the LCS is "
//                + LCSLength(X, Y, X.length(), Y.length()));

        System.out.print("The length of the LCS is "
                + LCSLengthMemoization(X, Y, X.length(), Y.length(), lookup));
    }
}
