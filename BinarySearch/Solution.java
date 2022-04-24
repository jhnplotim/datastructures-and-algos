package BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        
        //return binarySearchRecursive(nums, target, 0, nums.length - 1);
        return binarySearchIterative(nums, target);
        
    }
    
    
    public int binarySearchIterative(int[] arr, int target) {
        int low = 0, high = arr.length - 1, pivot;
        
        while(low <= high) {
            pivot = low + (high - low) / 2;
            
            if (arr[pivot] == target) {
                return pivot;
            } else if (arr[pivot] > target) {
                high = pivot - 1;
            } else {
                low = pivot + 1;
            }
        }
        
        return -1;
    }
    
    
    public int binarySearchRecursive(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = start + (end - start) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            // Search to left of mid
            return binarySearchRecursive(arr, target, start, mid - 1);
        } else {
            // Search to right of mid
            return binarySearchRecursive(arr, target, mid + 1, end);
        }
    }
}
