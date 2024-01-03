//Example 1:
//
//
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
import java.util.Scanner;

public class LeetCodeOddValueMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        class Solution {
//            public int oddCells(int m, int n, int[][] indices) {
//                int[][] matrix = new int[m][n];
//
//                for (int[] index : indices) {
//                    int row = index[0];
//                    int col = index[1];
//
//                    // Increment entire row
//                    for (int i = 0; i < n; i++) {
//                        matrix[row][i]++;
//                    }
//
//                    // Increment entire column
//                    for (int i = 0; i < m; i++) {
//                        matrix[i][col]++;
//                    }
//                }
//
//                // Count odd-valued cells in the matrix
//                int oddCount = 0;
//                for (int i = 0; i < m; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (matrix[i][j] % 2 != 0) {
//                            oddCount++;
//                        }
//                    }
//                }
//
//                return oddCount;
//            }
//        }

    }
}
