import java.util.Arrays;

public class SortAnArray {
//    number 912
//    https://leetcode.com/problems/sort-an-array/submissions/
//    method: selection sort
    public int[] sortAnArray(int[] nums){
        for(int i =  0; i < nums.length; i++){
            int smallest = nums[i];
            int index = i;
            for(int j = i; j < nums.length; j++){
                if(nums[j] < smallest){
                    smallest = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = smallest;
            nums[index] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] nums1 = {5,1,1,2,0,0};
        SortAnArray arr = new SortAnArray();
        System.out.println(Arrays.toString(arr.sortAnArray(nums)));
        System.out.println(Arrays.toString(arr.sortAnArray(nums1)));

    }
}


