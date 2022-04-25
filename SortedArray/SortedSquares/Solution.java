package SortedArray.SortedSquares;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        
        while (pos >= 0) {
            int sqRoot;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                sqRoot = nums[right];
                --right;
            } else {
                sqRoot = nums[left];
                ++left;
            }
            result[pos] = sqRoot * sqRoot;
            --pos;
        }
        
        return result;
    }

    public int[] sortedSquares2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        
        for (int i = n - 1; i >= 0; i --)  {
            int sqRoot;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                sqRoot = nums[right];
                --right;
            } else {
                sqRoot = nums[left];
                ++left;
            }
            result[i] = sqRoot * sqRoot;
        }
        
        return result;
    }
}