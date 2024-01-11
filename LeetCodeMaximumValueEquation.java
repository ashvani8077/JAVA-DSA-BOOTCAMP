//Example 1:
//
//Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
//Output: 4
//Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
//No other pairs satisfy the condition, so we return the max of 4 and 1.
import java.util.Scanner;

public class LeetCodeMaximumValueEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //class Solution {
        //    public int findMaxValueOfEquation(int[][] points, int k) {
        //        int maxM=Integer.MIN_VALUE;
        //        int lastKnownGreater=1;
        //        int i=0;
        //        while(i<points.length)
        //        {
        //            if(lastKnownGreater<=i)
        //            {
        //                lastKnownGreater=i+1;
        //            }
        //            for(int j=lastKnownGreater;j<points.length;j++)
        //            {
        //                if(points[j][0]>(k+points[i][0]))
        //                {
        //                    break;
        //                }
        //                int temp=points[i][1]+points[j][1]+Math.abs(points[j][0]-points[i][0]);
        //                if(temp>maxM)
        //                {
        //                    maxM=temp;
        //                    lastKnownGreater=j;
        //                }
        //            }
        //            i++;
        //        }
        //        return maxM;
        //    }
        //}


    }
}
