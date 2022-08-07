package SquareRoot.PrecisionSquareRoot;

public class PrecSqRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(16));
        System.out.println(squareRootBinarySearch(16, 0, 16));

    }

    /***
     * Find square root by checking numbers from n = 1 to root of n
     * Time compexity of root n, Space complexity of 1
     * @param n Number whose square root is being looked for
     * @return squareRoot
     */
    public static int squareRoot(int n) {
        int c = 2;

        while (c * c < n) {
            c = c + 1;
        }

        return c;
    }

    /***
     * Find square root of a number by using binary search since we are basically checking a sorted list of numbers to find the square root
     * @param n Number whose square root is being looked for
     * @param start Left bound of search space
     * @param end Right bound of search spaffce
     * @return Square Root
     */
    public static int squareRootBinarySearch(int n, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (mid * mid == n) {
            return mid;
        } else if (mid * mid > n) {
            // Mid point is greater than root, search to its left
            return squareRootBinarySearch(n, start, mid - 1);
        } else {
            // Mid point is less than root, search to its right
            return squareRootBinarySearch(n, mid + 1, end);
        }
    }
}
