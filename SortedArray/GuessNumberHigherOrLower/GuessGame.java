package SortedArray.GuessNumberHigherOrLower;

public class GuessGame {
    private int pickedNumber;

    public GuessGame() {
        this.pickedNumber = 50;
    }

    public GuessGame(int guess) {
        this.pickedNumber = guess;
    }

    int guess(int myGuess) {
        int diff = myGuess - pickedNumber;

        if (diff == 0) {
            return diff;
        } else if (diff > 0) {
            return 1;
        } else {
            return -1;
        }

    }
}
