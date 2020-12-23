import java.util.Arrays;

public class SortAnArray {
//    number 912
//    https://leetcode.com/problems/sort-an-array/submissions/

    public int[] sortAnArray(int[] nums){
//        using selection sort faster than bubble sort
//        for(int i =  0; i < nums.length; i++){
//            int smallest = nums[i];
//            int index = i;
//            for(int j = i; j < nums.length; j++){
//                if(nums[j] < smallest){
//                    smallest = nums[j];
//                    index = j;
//                }
//            }
//            int temp = nums[i];
//            nums[i] = smallest;
//            nums[index] = temp;
//        }
//        return nums;

//      using bubble sort slow, not good for larger length of the array
        int n = nums.length;
        boolean swapped;
        if(n == 1){
            return nums;
        }
        do {
            swapped = false;
            for(int i = 0 ; i < n-1; i++){
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swapped = true;
                }
            }
        } while(swapped == true);
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


