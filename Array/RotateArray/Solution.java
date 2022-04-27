package Array.RotateArray;

public class Solution {
    // Using extra memory
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
}
