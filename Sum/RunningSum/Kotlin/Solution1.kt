class Solution1 {

    // O(n) time and space complexity
    fun runningSum(nums: IntArray): IntArray {
        val sums = IntArray(nums.size)
        
        sums[0] = nums[0]
        
        for (i in 1 until nums.size) {
            sums[i] = nums[i] + sums[i - 1] 
        }
        
        return sums
    }
}