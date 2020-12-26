import java.util.Arrays;

public class ReverseString {
//    https://leetcode.com/problems/reverse-string/
//    number : 344
//    Easy
//     two pointers two-side
//    Write a function that reverses a string. The input string is given as an array of characters char[].
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//You may assume all the characters consist of printable ascii characters.
//Example 1:
//Input: ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//Example 2:
//Input: ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
    public char[] reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        char temp;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }

    public static void main(String[] args) {
        ReverseString reverseStr = new ReverseString();
        System.out.println(Arrays.toString(reverseStr.reverseString(new char[]{'H','a', 'n', 'n', 'a', 'h'})));
    }
}
