package DynamicProgramming.Fibonacci.Recursive;

// Find nth number in a Fibonacci sequence ( Un-optimized solution)
// Space complexity: O(n) - Recursion stack
// Time complexity: O(2 pow n)
public class SolutionFib {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    private static Long fib(int n) {
        // Base case
        if (n <= 2) {
            return 1L;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
