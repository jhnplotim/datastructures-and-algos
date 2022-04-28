package SortingAlgorithms.QuickSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arrToSort = new int[] {1,40,5,10,28,100,3};

        System.out.println(Arrays.toString(arrToSort));
        quickSort(arrToSort, 0, arrToSort.length - 1);
        System.out.println(Arrays.toString(arrToSort));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap i th & j th
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] arr, int index1, int index2) {
        if (index1 < arr.length && index2 < arr.length) {
            // within bounds, perform swap
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}