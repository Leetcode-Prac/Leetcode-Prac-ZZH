import java.util.Arrays;

public class MoveZeroes {
//    https://leetcode.com/problems/move-zeroes/
//    number: 283
//    using two pointers of equi-direction
//    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Example
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Note:
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.
    public int[] moveZeros(int[] nums){
        int readIndex = 0;
        int writeIndex = 0;
        int n = nums.length - 1;
        while(readIndex <= n){
            if(nums[readIndex] == 0){
                readIndex++;
                continue;
            }

            if(readIndex != writeIndex){
                nums[writeIndex] = nums[readIndex];
                nums[readIndex] = 0;
            }
             writeIndex++;
             readIndex++;
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes zeroes = new MoveZeroes();
        System.out.println(Arrays.toString(zeroes.moveZeros(new int[] {0,1,0,3,12})));
    }
}
