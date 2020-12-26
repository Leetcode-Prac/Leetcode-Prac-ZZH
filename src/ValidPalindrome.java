public class ValidPalindrome {
//  https://leetcode.com/problems/valid-palindrome/
//    number: 125
//    using two pointers two-side
//    Easy
//    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Note: For the purpose of this problem, we define empty string as valid palindrome.
//
//Example 1:
//
//Input: "A man, a plan, a canal: Panama"
//Output: true
//Example 2:
//
//Input: "race a car"
//Output: false

    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while( left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            } else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(validPalindrome.isPalindrome("race a car"));
        System.out.println(validPalindrome.isPalindrome("0p"));

    }
}
