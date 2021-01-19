import java.util.ArrayList;
import java.util.List;
//Problem Statement #
//We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. The array has some numbers
// appearing TWICE, find all these duplicate numbers without using any extra space.
//Example 1:
//Input: [3, 4, 4, 5, 5]
//Output: [4, 5]
//Example 2:
//Input: [5, 4, 7, 2, 3, 5, 3]
//Output: [3, 5]
public class FindAllDuplicateCyclicSort {
    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> duplicateNumbers = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                int j = nums[i] - 1;
                swap(nums, i, j);
            } else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
//                bonus if the number repeat more than twice, they just get one of the same duplicated nums
                if(!duplicateNumbers.contains(nums[j])){
                   duplicateNumbers.add(nums[j]);
                }
            }
        }
        return duplicateNumbers;
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        List<Integer> duplicates = FindAllDuplicateCyclicSort.findNumbers(new int[] { 3, 4, 4, 5, 5 });
        System.out.println("Duplicates are: " + duplicates);
//bonus for checking duplicated numbers which repeat more than twice
        duplicates = FindAllDuplicateCyclicSort.findNumbers(new int[] { 5, 5, 4, 7, 2, 3, 5, 3 });
        System.out.println("Duplicates are: " + duplicates);
    }
}
