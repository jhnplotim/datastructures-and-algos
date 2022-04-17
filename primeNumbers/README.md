# Prime Numbers
Prime Numbers
- QN: Given a Number N, that is greater than 1, check if N is a prime Number
- A number that is only divisible by itself and 1 is a primeNumber
- From the definition of prime numbers, our search space would be from 2 to N-1
- If within this search space, we find any factors, the number is not prime
- If within this search space, we do not find any factors, the number is prime
- This solution would have a time complexity, O(N)
- However, this solution can further be simplified since there are some repeated checks
- Take a number like 36 with factors 1 & 36, 2 & 18, 3 & 12, 4 & 9, 6 & 6, 9 & 4, 12 & 3, 36 & 1. 
- If we are finding factors of 36, it is enough to stop at 6 & 6 since after this, there is repetition. 
- The time complexity of the algorithm would be reduced to root of N
- The algorithm can further be improved by excluding all even numbers greater than 2 since they are not prime anywhere
