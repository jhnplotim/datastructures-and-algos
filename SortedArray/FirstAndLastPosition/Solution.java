package SortedArray.FirstAndLastPosition;

public class Solution {

    /***
     * Use 2 Binary Searches to find the starting and ending index of a given target value
     * Return array of [-1,-1] if target is not found
     * @param nums sorted array to search
     * @param target target to search for in array
     * @return 2 element array with the positions
     */
    public int[] searchRange(int[] nums, int target) {
        
        int lowerIndex = lowerBound(nums, target);
        
        if (lowerIndex != -1) {
            // Search for upper index
            int upperIndex = upperBound(nums, target);
            
            return new int[] {lowerIndex, upperIndex};
            
        } else {
            return new int[] {-1, -1};
        }
        
    }
    
    public int lowerBound(int[] nums, int target) {
        int start = 0, end = nums.length -1, mid;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                if(mid == 0 || nums[mid - 1] != target) {
                    return mid;
                } else {
                    // Search to the left of mid
                    end = mid - 1;
                }
            } else if (nums[mid] > target) {
                // Search to left of mid
                end = mid - 1;
                
            } else {
                // Search to right of mid
                start = mid + 1;
            }
        }
        
        return -1; 
    }
    
    public int upperBound(int[] nums, int target) {
        int start = 0, end = nums.length -1, mid;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                if(mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;
                } else {
                    // Search to the right of mid
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                // Search to left of mid
                end = mid - 1;
                
            } else {
                // Search to right of mid
                start = mid + 1;
            }
        }
        
        return -1; 
    }



    /***
     * Use Binary Search, then bidirectional search to find the starting and ending index of a given target value
     * Return array of [-1,-1] if target is not found
     * @param nums sorted array to search
     * @param target target to search for in array
     * @return 2 element array with the positions
     */
    public int[] searchRange1(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        
        while(left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                // found, search left and right of it
                int first = mid, last = mid;
                while ((first - 1) >= 0 && nums[first - 1] == target) {
                    first = first - 1;
                }
                while ((last + 1) < nums.length && nums[last + 1] == target) {
                    last = last + 1;
                }
                
                return new int[] {first, last};
                
            } else if (nums[mid] > target) {
                // search to the left of mid
                right = mid -1;
            } else {
                // search to the right of mid
                left = mid + 1;
                
            }
        }
        
        return new int[] {-1,-1};
    }
}
