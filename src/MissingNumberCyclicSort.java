import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
//268. Missing Number
//easy
//cyclicSort
//Example 1:
//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//        Example 2:
//        Input: nums = [0,1]
//        Output: 2
//        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//        Example 3:
//        Input: nums = [9,6,4,2,3,5,7,0,1]
//        Output: 8
//        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//        Example 4:
//        Input: nums = [0]
//        Output: 1
//        Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
public class MissingNumberCyclicSort {
    public static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
//            nums[i]<nums.length, is used to exclude the last element in the array, to make it take the missing
//            number's place!!
//            must check the nums[i] < nums.length first
            if( nums[i] < nums.length && nums[i] != nums[nums[i]]){
                int j = nums[i];
                swap(nums, i, j);
            } else {
                i++;
        }
    }
//        sout the nums array
        System.out.println(Arrays.toString(nums));
//        return the missing number
        for(int k = 0; k < nums.length ; k++){
            if(nums[k] != k){
                return k;
            }
        }
//        if the missing number is the last element in the array
        return nums.length;
}
public static void swap(int[] nums, int i, int j){
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
}

    public static void main(String[] args) {
        System.out.println(MissingNumberCyclicSort.missingNumber(new int[] { 4, 0, 3, 1 }));
        System.out.println(MissingNumberCyclicSort.missingNumber(new int[] { 8, 3, 5, 2, 4, 6, 0, 1 }));
        System.out.println(MissingNumberCyclicSort.missingNumber(new int[] { 7, 3, 5, 2, 4, 6, 0, 1 }));
    }
}
