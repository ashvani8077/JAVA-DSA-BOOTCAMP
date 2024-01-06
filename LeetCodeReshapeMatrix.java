//Example 2:
//
//
//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]
import java.util.Scanner;

public class LeetCodeReshapeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //class Solution {
        //    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //        int [][] arr = new int [r][c];
        //        int row = mat.length, col = mat[0].length, ri=0, ci=0;
        //        if(r==row || c==col ) return mat;
        //        if(r*c != row*col) return mat;
        //        for(int i=0; i<row; i++){
        //            for(int j=0; j<col; j++){
        //                arr[ri][ci] = mat[i][j];
        //                ci++;
        //                if(ci > c-1 ){
        //                ci=0;
        //                ri++;
        //            }
        //            }
        //        }
        //        return arr;
        //    }

    }
}
