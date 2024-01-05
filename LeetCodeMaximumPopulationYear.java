//Example 1:
//
//Input: logs = [[1993,1999],[2000,2010]]
//Output: 1993
//Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
import java.util.Scanner;

public class LeetCodeMaximumPopulationYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        class Solution {
//            public int maximumPopulation(int[][] logs) {
//                int arr[]=new int[101];
//                for(int log[]:logs){
//                    int bi=log[0];
//                    int de=log[1];
//                    arr[bi-1950]++;
//                    arr[de-1950]--;
//
//                }
//                int max=arr[0];
//                int my=1950;
//                for(int i=1;i<101;i++){
//                    arr[i]+=arr[i-1];
//                    if(max<arr[i]){
//                        max=i;
//                        my=1950+i;
//                    }
//                }
//                return my;
//            }
//        }

    }
}
