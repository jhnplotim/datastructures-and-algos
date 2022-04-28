package Strings.ReverseWords;

public class Solution2 {

    /***
     * Reverse Words using a StringBuilder (Methods are not synchronized hence faster but not thread-safe)
     * If the requirement is to ensure that it is thread safe (methods are synchronized but slower because of synchronization), the use of a StringBuffer in place of the StringBuilder 
     * @param s String with words to be reversed
     * @return
     */
    public String reverseWords(String s) {
       String[] words = s.split(" ");
       StringBuilder builder = new StringBuilder();

       for (String word: words) {
           builder.append(new StringBuilder(word).reverse() +  " ");
       }
       return builder.toString().trim();

    }
    
}
