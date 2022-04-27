package Array.MoveZeroes;

public class Solution1 {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0, newPos, temp;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                if (zeroCount > 0) {
                    // Swap
                    newPos = i - zeroCount;
                    temp = nums[newPos];
                    nums[newPos] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        
    }    
}
