public class TwoSum {
//    https://leetcode.com/problems/two-sum/
//    1. Two Sum
//    Easy
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i < nums.length ; i++){
            for(int j = i+1; j < nums.length ; j++){
                    if(nums[i] + nums[j] == target){
                        return output= new int[]{i, j};
                    }
            }
        }
        return output;
    }
}
