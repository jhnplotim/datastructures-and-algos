package SortedArray.TwoSum;

// Using the two pointer method to locate the target
// Time complexity: O(n), the input array is traversed at most once
// Space complexity: O(1), constant space is used
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum;
        while(left < right) {
            sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[] {++left, ++right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        
        // If target is not found
        return new int[] {-1,-1};
    }
}
