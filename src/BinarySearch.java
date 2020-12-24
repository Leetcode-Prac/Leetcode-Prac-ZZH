import java.util.Arrays;
// https://leetcode.com/problems/binary-search/
// number : 704
// using binary search
public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
//            thinking of integer overflow: start + (end - start)/2 is different than (start + end ) /2(may cause
//            overflow);
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                 end = mid - 1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        BinarySearch binarySea = new BinarySearch();
        System.out.println(binarySea.binarySearch(new int[]{-1, 0, 3, 5, 9, 12},9));
        System.out.println(binarySea.binarySearch(new int[]{-1,0,3,5,9,12},2));
    }
}
