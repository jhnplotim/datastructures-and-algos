package DynamicProgramming.Fibonacci.Recursive;

// Find nth number in a Fibonacci sequence ( Un-optimized solution)
// Space complexity: O(n) - Recursion stack
// Time complexity: O(2 pow n)
public class SolutionFib {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    private static int fib(int n) {
        // Base case
        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
