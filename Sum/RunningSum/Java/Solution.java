package Sum.RunningSum.Java;

public class Solution {

    // O(n) time complexity
    // O(1) space complexity, no new array is created
    public int[] runningSum(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        
        return nums;
    }
    
}
