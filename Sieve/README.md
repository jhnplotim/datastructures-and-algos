# print Prime Numbers less or equal to N (Sieve)
- QN: Given a number, N, print all prime numbers less than or equal to N
- One possible approach (less optimized brute force approach) could be run the isPrime() method check from 1 to N
- Since isPrime() can have a time complexity of root N (See PrimeNumbers.java), re-using this method for this would give us a time complexity of N * Root of N
- This can be improved / optimized by skipping some repeated checks i.e.
- We maintain a boolean array for all numbers we want to check. The array index is equal to the number we are checking, therefore, the array size will be N+1 since the array indices are zero based.
- If we know that 2 is a prime number, then all multiples of 2 less than our number N will automatically be marked as not prime
- From investigation, we do NOT need to repeat this check for all N values, instead, we only perform this up to root of N and terminate the loop.
- See attached video for explanation
- Once the loop is terminated, we shall only have primeNumbers left in the array and we can display them.