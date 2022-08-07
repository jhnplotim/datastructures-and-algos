class Solution:
    # O(n) time complexity
    # O(1) space complexity
    def runningSum(self, nums: List[int]) -> List[int]:
        for i in range(1, len(nums)):
            nums[i] += nums[i - 1]
        return nums