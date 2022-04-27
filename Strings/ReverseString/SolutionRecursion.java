package Strings.ReverseString;

public class SolutionRecursion {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
      }

    private void reverse(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }

        swap(s, left, right);
        --right;
        ++left;
        reverse(s, left, right);
    }

    private void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
