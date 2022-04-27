package Strings.ReverseString;

// Using the two pointer method
// Time complexity: O(n), we shall traverse through all n elements of the array
// Space complexiy: O(1), we use constant time
public class Solution1 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
    
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
