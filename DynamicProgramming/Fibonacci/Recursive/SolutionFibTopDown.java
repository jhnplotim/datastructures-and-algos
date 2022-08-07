package DynamicProgramming.Fibonacci.Recursive;

// Find nth number in a Fibonacci sequence (Topdown approach)
// Space complexity: O(n)
// Time complexity: O(n)
public class SolutionFibTopDown {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    private static long fib(int n) {
        Long[] cache = new Long[n+1];
        cache[0] = 0L;
        cache[1] = 1L;
        cache[2] = 1L;

        for(int i = 3; i < n + 1; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }
    
}
