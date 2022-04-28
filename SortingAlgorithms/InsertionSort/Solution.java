package SortingAlgorithms.InsertionSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] {9,45,2,41,3,90,28,2};

        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

}

    public static void insertSort(int[] arr) {
        for (int curIndex = 1; curIndex < arr.length; curIndex++) { // n
            int prevIndex = curIndex - 1; // n - 1
            int curValue = arr[curIndex]; // n - 1

            while(prevIndex >= 0 && arr[prevIndex] > curValue) { // n - 1
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex + 1] = curValue;
        }
}
}