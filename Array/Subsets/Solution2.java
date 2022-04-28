package Array.Subsets;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestSubSet(new int[] {3,5,10,20,21})));
        System.out.println(Arrays.toString(largestSubSet(new int[] {1,3,6,24})));
        System.out.println(Arrays.toString(largestSubSet(new int[] {2,14,6,7})));
    }

    public static int[] largestSubSet(int[] arr) {
        int startIndex = 0, endIndex = 0;

        if (arr.length < 2) {
            return new int[0];
        }

        for(int i = 0; i < arr.length - 1; i++) {
            // Current largest subset is greater than the largest possible subset we expect, we found the largest
            if ((endIndex - startIndex) > (arr.length - 1 - (i + 1))) {
                break;
            }

            for (int j = i + 1; j < arr.length; j++) {
                // Compare consecutive elements
                if(arr[j] > arr[j - 1]) {
                    if (arr[j] % arr[j - 1] == 0) {
                        if ((endIndex - startIndex) < j - i) {
                            startIndex = i;
                            endIndex = j;
                        }
                    } else {
                        break;
                    }
                } else {
                    if (arr[i] % arr[j - 1] == 0) {
                        if ((endIndex - startIndex) < j - i) {
                            startIndex = i;
                            endIndex = j;
                        }
                    } else {
                        break;
                    }

                }
            }
        }

        if (endIndex > startIndex) {
            // TODO: Populate
            int[] result = new int[endIndex - startIndex + 1];

            for(int i = startIndex, j = 0; i <= endIndex; i++, j++) {
                result[j] = arr[i];
            }

            return result;
        } else {
            return new int[0];
        }



    }
    
}
