//https://www.hackerrank.com/challenges/staircase/problem
//HackerRank StairCase
//Staircase detail
//This is a staircase of size :
//   #
//  ##
// ###
//####
//Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
//Write a program that prints a staircase of size .
//Function Description
//Complete the staircase function in the editor below.
//staircase has the following parameter(s):
//int n: an integer
//Print a staircase as described above.
//Input Format
//A single integer, , denoting the size of the staircase.
//Constraints
//0 < n <=100
//Output Format
//Print a staircase of size  using # symbols and spaces.
//Note: The last line must have  0 spaces in it.
//Sample Input
//n = 6
//Sample Output
//     #
//    ##
//   ###
//  ####
// #####
//######
//Explanation
//The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6;
public class Staircase {
    public static void staircase(int n){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n ; i++){
            builder.append(" ");
        }
        int k = 0;
//        j <= n!!!
        for(int j = 1; j <= n ; j++){
//            the end doesn't included in replace
            builder.replace(builder.length()-j,builder.length()-k,"#");
            System.out.println(builder);
            k++;
        }
    }

    public static void main(String[] args) {
        Staircase.staircase(4);
        Staircase.staircase(6);
    }
}
