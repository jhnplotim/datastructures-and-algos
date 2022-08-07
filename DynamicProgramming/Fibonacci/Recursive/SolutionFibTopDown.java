package DynamicProgramming.Fibonacci.Recursive;

// Find nth number in a Fibonacci sequence (Topdown approach)
// Space complexity: O(n)
// Time complexity: O(n)
public class SolutionFibTopDown {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    private static int fib(int n) {
        Integer[] cache = new Integer[n+1];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 1;

        for(int i = 3; i < n + 1; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }
    
}
