package Strings.ReverseWords;

public class Solution1 {
    public String reverseWords(String s) {
        int prevSpaceIndex = -1;
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (cur == ' ' || i == chars.length - 1) {
                
                int left = ++prevSpaceIndex;
                int right = cur == ' ' ? i - 1 : i;
                char temp;
                while(left < right) {
                    temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                
                prevSpaceIndex = i;
            }
        }
        
        return new String(chars);
    }
}
