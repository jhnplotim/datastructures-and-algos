package DynamicProgramming.Fibonacci.Recursive;

import java.util.Arrays;

// Find nth number in a Fibonacci sequence ( Memoized solution)
// Space complexity: O(n)
// Time complexity: O(n)
public class SolutionFibMemo {

    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    private static int fib(int n) {
        Integer[] cache = new Integer[n+1];
        Arrays.fill(cache, null);
        return fibMemo(n, cache);
    }

    // Find nth number in a Fibonacci sequence (memoized)
    private static int fibMemo(int n, Integer[] cache) {
        // Base case
        if (n <= 2) {
            return 1;
        }

        if (cache[n] != null) {
            return cache[n];
        } else {
            cache[n] = fibMemo(n-1, cache) + fibMemo(n-2, cache);
            return cache[n];
        }
    }
}