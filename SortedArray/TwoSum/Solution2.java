package SortedArray.TwoSum;

// Solution (less preferred) using binary search
// Time complexity: O(nlogn) (worst case scenario)
// Space complexity: O(1), uses constant space
public class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int cur;
        int target2;
        for(int i = 0; i < numbers.length - 1; i++) {
            cur = numbers[i];
            // target2 + cur = target
            // target2 = target - cur
            // Search for target2 using binary search
            target2 = target - cur;
            
            // Binary search
            int left = i + 1;
            int right = numbers.length -1;
            int mid;
            int midElement;
            while(left <= right) {
                // Avoid overflow
                mid = left + (right - left) / 2;
                midElement = numbers[mid];
                if (midElement == target2) {
                    return new int[] {++i, ++mid};
                } else if (midElement > target2) {
                    // Search to left of mid element
                    right = mid - 1;
                } else {
                    // Search to right of mid element
                    left = mid + 1;
                }
            }
        }
        
        // If no match is found
        return new int[] {-1,-1};
    }
}
