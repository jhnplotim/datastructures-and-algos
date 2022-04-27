package Array.RotateArray;

import java.util.Arrays;

public class Solution2 {
    // Example
    // Let n = 7 and k = 3.
    // Original List                   : 1 2 3 4 5 6 7
    // After reversing all numbers     : 7 6 5 4 3 2 1
    // After reversing first k numbers : 5 6 7 4 3 2 1
    // After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
    // Time complexity: O(n). n elements reversed a total of 1 times, k elements reversed 1 time & n - k elements reversed 1 time
    // Space complexity: O(1). No extra space used
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        // Reverse all numbers
        reverse(nums, 0, nums.length - 1);
        // reversing first k numbers
        reverse(nums, 0, k - 1);
        // revering last n-k numbers
        reverse(nums, k, nums.length - 1);
      }
      public void reverse(int[] nums, int start, int end) {
        while (start < end) {
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] = temp;
          start++;
          end--;
        }
      }

      public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(input));

        Solution2 rotater = new Solution2();
        rotater.rotate(input, k);

        System.out.println(Arrays.toString(input));

    }
}
