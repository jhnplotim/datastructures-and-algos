package Sum.RunningSum.Java;

public class Solution2 {

    // O(n) time and space complexity
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];     
        
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i-1] + nums[i];
        }
        
        return sums;
    }
}
