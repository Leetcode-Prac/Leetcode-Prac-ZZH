import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
//    method: sliding windows
//    Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
//    Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
//    Here, we are asked to find the average of all contiguous subarrays of size ‘5’ in the given array. Let’s solve this:
//For the first 5 numbers (subarray from index 0-4), the average is:
//(1+3+2+6−1)/5=>2.2
//The average of next 5 numbers (subarray from index 1-5) is:
//(3+2+6−1+4)/5=>2.8
//…
//Here is the final output containing the averages of all contiguous subarrays of size 5:
//Output: [2.2, 2.8, 2.4, 3.6, 2.8]
    public static double[] findAverages(int K, int[] arr){
        double[] result = new double[arr.length - K + 1];
        int windowStart = 0;
        double windowSum = 0;
        for(int windowEnd = 0; windowEnd < arr.length ; windowEnd++){
//            add the next element
            windowSum += arr[windowEnd];
//            slide the window, we don't need to slide if we've not hit the required window size of "K" : at index of
//            K-1
            if(windowEnd >= K - 1){
//                calculate the average
                result[windowStart] = windowSum / K;
//                subtract the element going out
                windowSum -= arr[windowStart];
//                slide the window ahead
                windowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subArrays of size K: " + Arrays.toString(result));
    }
}
