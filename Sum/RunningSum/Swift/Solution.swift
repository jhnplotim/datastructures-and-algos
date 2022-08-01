class Solution {
    func runningSum(_ nums: [Int]) -> [Int] {
        var sums: [Int] = Array(repeating: 0, count: nums.count)
        
        sums[0] = nums[0]
        
        for i in 1 ..< nums.count {     
            sums[i] = sums[i-1] + nums[i]
        }
        
        return sums
    }
}