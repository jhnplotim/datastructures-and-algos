package Array.RotateArray;

import java.util.Arrays;

public class Solution {
    // Using extra memory
    // Time complexity O(n)
    // Space complexity O(n). Extra space used
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Place elements in their correct position in new array
        for (int i = 0; i < n; i++) {
            int newPos = (i + k) % n;
            result[newPos] = nums[i];
        }
        
        
        // Copy elements back into original array
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(input));

        Solution rotater = new Solution();
        rotater.rotate(input, k);

        System.out.println(Arrays.toString(input));

    }
}
