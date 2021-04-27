package BruteForce;
// O[n]
class Maximum {
    static int maximum_index(int[] array, int array_size) {
        int max_value = Integer.MIN_VALUE;
        int max_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_value) {
                max_index = i;
                max_value = array[i];
            }
        }
        return max_index;
    }
    public static void main(String[] args) {
            int array_size = 9;
            int nums[] = {2,4,6,3,5,7,9,1,8};
            int max_index = maximum_index(nums, array_size);

            System.out.println("The MAX number " + nums[max_index] + " is found at index " + max_index);
        }
}
