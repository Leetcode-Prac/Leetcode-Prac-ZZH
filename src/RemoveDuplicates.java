import java.util.ArrayList;
//Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the length of the subarray that has no duplicate in it.
//Example 1:
//Input: [2, 3, 3, 3, 6, 9, 9]
//Output: 4
//Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
//Example 2:
//Input: [2, 2, 2, 11]
//Output: 2
//Explanation: The first two elements after removing the duplicates will be [2, 11].
public class RemoveDuplicates {
    public static int remove(int[] nums) {
//        int size = 1;
//        int start = 0;
//        for(int i = 1; i < arr.length ; i++){
//            if(arr[start]!= arr[i]){
//                start = i;
//                size++;
//            }
//        }
//        return size;
        if (nums == null || nums.length == 0) return 0;
        int i = 1, j = 0;
        while (i < nums.length) {
            if (nums[i] > nums[j]) {
                nums[++j] = nums[i];
            }
            i++;
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
        System.out.println(RemoveDuplicates.remove(arr));

        arr = new int[] { 2, 2, 2, 11 };
        System.out.println(RemoveDuplicates.remove(arr));
    }

}
