package SortingAlgorithms.MergeSort;

import java.util.Arrays;
// Merge Sort in place
class Solution {
    public static void main(String[] args) {
        int[] nums  = {5,2,3,1};
        Solution s = new Solution();
        System.out.println(Arrays.toString(nums));
        s.sortArray(nums);
        System.out.println(Arrays.toString(nums));

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    public void mergeSort(int[] arr, int start, int end) {
        
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    
    public void merge(int[] arr, int start, int mid, int end) {
        int start2 = mid + 1;
        
        // If two sublists are already merged, return
        if (arr[start2] >= arr[mid]) {
            return;
        }
        
        while (start <= mid && start2 <= end) {
            if (arr[start] <= arr[start2]) {
                start++;
            } else {
                int index = start2;
                int value = arr[start2];
                
                while (index != start) {
                    arr[index] = arr[index -1];
                    index--;
                }
                
                arr[start] = value;
                
                start++;
                start2++;
                mid++;
            }
        }
        
        
    }
}