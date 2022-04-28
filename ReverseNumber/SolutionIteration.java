package ReverseNumber;

public class SolutionIteration {
    public static void main(String[] args) {
        System.out.println(reverse(23753));
        System.out.println(reverse(233));
    }

    public static int reverse(int num) {
        int reverse = 0;

        while(num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        return reverse;

    }
    
}
