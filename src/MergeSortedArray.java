import java.util.Arrays;

public class MergeSortedArray {
//    https://leetcode.com/problems/merge-sorted-array/
//    number:88
//    method : two pointers
//    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//    Note:
//
//The number of elements initialized in nums1 and nums2 are m and n respectively.
//You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
//Example:
//
//Input:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//Output: [1,2,2,3,5,6]
    public int[] merge(int[] nums1, int m, int[] nums2, int n){
//        index of nums1
        int j = m - 1;
//        index of nums2
        int i = n - 1;
//        index of merged nums1
        int curr = nums1.length - 1;

        while(i >= 0){
            if(j >= 0){
                nums1[curr--] = nums1[j] > nums2[i] ? nums1[j--] : nums2[i--];
            } else {
                nums1[curr--] = nums2[i--];
            }
        }
    return nums1;
    }

    public static void main(String[] args) {
        MergeSortedArray arr = new MergeSortedArray();
        System.out.println(Arrays.toString(arr.merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3)));
    }
}
