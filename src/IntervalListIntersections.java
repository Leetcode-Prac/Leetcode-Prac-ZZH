import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {
//    986. Interval List Intersections
//    https://leetcode.com/problems/interval-list-intersections/
//    medium 2D array : two pointers
//    Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
//Return the intersection of these two interval lists.
//(Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
//Example 1:
//Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
//Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0;
        int j = 0;
        while(i < A.length && j < B.length){
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);

            if(lo <= hi){
                ans.add(new int[]{lo, hi});
            }

            if(A[i][1] < B[j][1]){
                i++;
            } else {
                j++;
            }

        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        IntervalListIntersections intersections = new IntervalListIntersections();
        int[][] A = {{0,2},{5,10},{13,23},{24,25}};
        int[][] B = {{1,5},{8,12},{15,24},{25,26}};
        int[][] C = intersections.intervalIntersection(A,B);
        for(int[] row : C){
            System.out.println(Arrays.toString(row));
        }
    }
}
