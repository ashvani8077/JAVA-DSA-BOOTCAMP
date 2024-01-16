//Example 1:
//
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.
import java.util.Scanner;

public class LeetCodeCountNegativeOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //class Solution {
        //    public int countNegatives(int[][] grid) {
        //        int count = 0;
        //        int rows = grid.length;
        //        int cols = grid[0].length;
        //
        //        int i = 0; // Start from the top-right corner
        //
        //        while (i < rows && cols > 0) {
        //            if (grid[i][cols - 1] < 0) {
        //                // If the current element is negative, move to the next row
        //                count += rows - i;
        //                cols--; // Move left in the current row
        //            } else {
        //                // If the current element is non-negative, move to the next column
        //                i++; // Move down in the current column
        //            }
        //        }
        //
        //        return count;
        //    }
        //}



    }
}
