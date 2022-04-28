package ReverseNumber;

public class SolutionRecursion {
    public static void main(String[] args) {
        System.out.println(reverse(23753, 0));
        System.out.println(reverse(233, 0));
    }

    public static int reverse(int num, int reverse) {
        // Base case
        if (num < 10) {
            return reverse * 10 + num;
        }

        int remainder = num % 10;

        return  reverse(num / 10, reverse * 10 + remainder);
    }
    
}
