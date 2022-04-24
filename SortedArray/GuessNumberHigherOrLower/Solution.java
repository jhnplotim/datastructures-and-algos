package SortedArray.GuessNumberHigherOrLower;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n, myGuess;
        
        while (low <= high) {
            myGuess = low + (high - low) / 2;
            int res = guess(myGuess);
            if (res == 0) {
                return myGuess;
            } else if (res == 1) {
                // My guess is lower than the picked number
                // Search to right of my guess
                low = myGuess + 1;
            } else {
                // My guess is higher than the picked number
                // Search to left of my guess
                high = myGuess - 1;  
            }
        }
        
        return -1;
    }
}
