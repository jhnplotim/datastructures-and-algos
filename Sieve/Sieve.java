package Sieve;

public class Sieve {
    
    public static void main(String[] args) {
        primeNumbersLessOrEqualN(40);
    }


    public static void primeNumbersLessOrEqualN(int n) {

        // The array elements will all be initialised as false, which will mean prime for our case
        // if a number is marked as true, then it will be a multiple of another number, hence not prime, we skip it
        // we repeat up to root of N (See explanation video that has been uploaded)
        boolean[] numbers = new boolean[n + 1];

        // Start from 2 since we know that all numbers less than 2 are not prime
        for (int i = 2; i * i <= n; i++) {
            // We start at 2, and mark all multiples of 2 as not prime i.e. set to true
            if (!numbers[i]) {
                // Mark all as not prime
                for (int j = i + i; j <= n; j = j + i) {
                    numbers[j] = true;
                }
            }

        }

        for (int c = 2; c <= n; c++) {
            if (!numbers[c]) {
                // Print
                System.out.printf("%s \n", c);
            }
        }
    }
    
}