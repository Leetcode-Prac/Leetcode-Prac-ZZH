//We are given an unsorted array containing ‘n+1’ numbers taken from the range 1 to ‘n’. The array has only one duplicate but it can be repeated multiple times. Find that duplicate number without using any extra space. You are, however, allowed to modify the input array.
//Example 1:
//Input: [1, 4, 4, 3, 2]
//Output: 4
//Example 2:
//Input: [2, 1, 3, 3, 5, 4]
//Output: 3
//Example 3:
//Input: [2, 4, 1, 4, 4]
//Output: 4
public class FindDuplicateCyclicSort {
    public static int findNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                int j = nums[i] - 1;
                swap(nums, i, j);
            } else {
                i++;
            }
        }
        for(int k = 0; k < nums.length ; k++){
            if(nums[k] != k + 1){
                return nums[k];
            }
        }
        return -1;
    }
    public static void swap(int[] nums,int i , int j){
        int temp = nums[j];
        nums[j]= nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        System.out.println(FindDuplicateCyclicSort.findNumber(new int[] { 1, 4, 4, 3, 2 }));
        System.out.println(FindDuplicateCyclicSort.findNumber(new int[] { 2, 1, 3, 3, 5, 4 }));
        System.out.println(FindDuplicateCyclicSort.findNumber(new int[] { 2, 4, 1, 4, 4 }));
    }
}
