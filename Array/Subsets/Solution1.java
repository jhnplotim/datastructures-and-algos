package Array.Subsets;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestSubSet(new int[] {3,5,10,20,21})));
        System.out.println(Arrays.toString(largestSubSet(new int[] {1,3,6,24})));
        System.out.println(Arrays.toString(largestSubSet(new int[] {2,14,6,7})));
    }

    public static int[] largestSubSet(int[] arr) {
        int startIndex1 = 0, endIndex1 = 0;
        int startIndex2 = 0, endIndex2 = 0;

        if (arr.length < 2) {
            return new int[0];
        }

        for(int i = 1; i < arr.length; i++) {
            int larger, smaller;
            if (arr[i] > arr[i - 1]) {
                larger = arr[i];
                smaller = arr[i - 1];

            } else {
                larger = arr[i - 1];
                smaller = arr[i];
            }

            if (larger % smaller == 0) {
                endIndex1 = i;
            } else {
                if ((endIndex1 - startIndex1) > (endIndex2 - startIndex2)) {
                    // transfer
                    startIndex2 = startIndex1;
                    endIndex2 = endIndex1;
                }
                startIndex1 = i;
                endIndex1 = i;
            }
        }

        if ((endIndex1 - startIndex1) > (endIndex2 - startIndex2)) {
            startIndex2 = startIndex1;
            endIndex2 = endIndex1;
        }

        if(endIndex2 > startIndex2) {
            int[] result = new int[endIndex2 - startIndex2 + 1];

            for(int i = startIndex2, j = 0; i <= endIndex2; i++, j++) {
                result[j] = arr[i];
            }

            return result;

        } else {
            return new int[0];
        }

    }
}
