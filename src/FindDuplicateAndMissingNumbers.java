//Find the Corrupt Pair (easy) #
//We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. The array originally contained all the numbers from 1 to ‘n’, but due to a data error, one of the numbers got duplicated which also resulted in one number going missing. Find both these numbers.
//Example 1:
//Input: [3, 1, 2, 5, 2]
//Output: [2, 4]
//Explanation: '2' is duplicated and '4' is missing.
//Example 2:
//Input: [3, 1, 2, 3, 6, 4]
//Output: [3, 5]
//Explanation: '3' is duplicated and '5' is missing.
public class FindDuplicateAndMissingNumbers {
    public static int[] findNumbers(int[] nums){

        int[] arr = new int[2];
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                int j = nums[i] -1;
                swap(nums, i , j);
            } else {
                i++;
            }
        }
        for(int k = 0; k < nums.length ; k++){
            if(nums[k] != k + 1){
//        the duplicated number take the place of the missing number
//                get the duplicated number
                arr[0] = nums[k];
//                get the missing number
                arr[1] = k + 1;
            }
        }
        return arr;
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public static void main(String[] args) {
        int[] nums = FindDuplicateAndMissingNumbers.findNumbers(new int[] { 3, 1, 2, 5, 2 });
        System.out.println(nums[0] + ", " + nums[1]);
        nums = FindDuplicateAndMissingNumbers.findNumbers(new int[] { 3, 1, 2, 3, 6, 4 });
        System.out.println(nums[0] + ", " + nums[1]);
    }
}
