//Example 1:
//
//
//Input: rows = 1, cols = 4, rStart = 0, cStart = 0
//Output: [[0,0],[0,1],[0,2],[0,3]]
import java.util.Scanner;

public class LeetCodeSpiralMatrix3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //class Solution {
        //    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        //        int[][] mat = new int[rows*cols][2];
        //        int i = 0;
        //        mat[i++] = new int[]{rStart,cStart};
        //        int d = 0;
        //        int len = 0;
        //        int[] directions = {0,1,0,-1,0};
        //
        //        while(i < rows*cols){
        //            if(d==0 || d==2) len++;
        //
        //            for (int j = 0; j < len; j++) {
        //                rStart += directions[d];
        //                cStart += directions[d+1];
        //                if(rStart < rows && rStart >= 0 && cStart < cols && cStart >= 0) mat[i++] = new int[]{rStart, cStart};
        //            }
        //            d = ++d%4;
        //        }
        //        return mat;
        //
        //    }
        //}


    }
}
