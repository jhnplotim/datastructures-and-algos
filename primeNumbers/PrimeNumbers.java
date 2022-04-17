package primeNumbers;

public class PrimeNumbers {
  public static void main(String[] args) {
      for (int n = 0; n <= 40 ; n++) {
          System.out.printf("%s is prime? %s \n", n, isPrime(n));
      }
  }
  
  public static boolean isPrime(int number) {

    if (number < 2) {
        return false;
    }

    // Improvement: All even numbers except 2 are not prime
    if (number > 2 && number % 2 == 0) {
        return false;
    }

    // Time complexity Big O of root N
    // Start at 2 since 1 is already a prime number
    // If we find any number that is a factor, then we simply return false, otherwise, when the for loop completes, return true
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }

    // If code reaches here, we are dealing with a prime number
    return true;

  }
}