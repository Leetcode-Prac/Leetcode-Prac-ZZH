import java.util.HashMap;
import java.util.Map;

//Given a string, find the length of the longest substring, which has no repeating characters.
//Example 1:
//Input: String="aabccbb"
//Output: 3
//Explanation: The longest substring without any repeating characters is "abc".
//Example 2:
//Input: String="abbbb"
//Output: 2
//Explanation: The longest substring without any repeating characters is "ab".
//Example 3:
//Input: String="abccde"
//Output: 3
//Explanation: Longest substrings without any repeating characters are "abc" & "cde".
public class NoRepeatSubstringSlidingWindow {
    public static int findLength(String str){
        int windowStart = 0;
        int maxLength = 0;
        Map<Character,Integer> noRepeatSubStr = new HashMap<>();
//        try to extend the range[windowStart, windowEnd]
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
//            if the map already contain the key, shrink the window from the beginning so that we have only one
//            occurrence of str.charAt(windowEnd)
            if(noRepeatSubStr.containsKey(str.charAt(windowEnd))){
//                tricky, if the key is getting duplicated, we need to make the windowStart to the NEXT index of the
//                str.charAt(windowEnd)
               windowStart = Math.max(windowStart, noRepeatSubStr.get(str.charAt(windowEnd))+1);
            }
            noRepeatSubStr.put(str.charAt(windowEnd),windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

       return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + NoRepeatSubstringSlidingWindow.findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstringSlidingWindow.findLength("abbbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstringSlidingWindow.findLength("abccde"));
    }
}
