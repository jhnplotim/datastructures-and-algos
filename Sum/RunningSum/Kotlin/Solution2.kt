class Solution2 {
    // O(n) time complexity
    // O(1) space complexity, no new array is created
    fun runningSum(nums: IntArray): IntArray {

        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1] 
        }
        
        return nums
    }
}