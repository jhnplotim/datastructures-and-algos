package DynamicProgramming.Fibonacci.Recursive;

// Un-optimized solution
public class SolutionFib {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    // Find nth number in a Fibonacci sequence
    private static int fib(int n) {
        // Base case
        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
