//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.+
import java.util.Scanner;

public class LeetCodeRichestCustomer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Row of 2D array: ");
        int r= sc.nextInt();
        System.out.print("Column of 2D array: ");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int max=maximumWealth(arr);
        System.out.println(max);
    }
    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}
