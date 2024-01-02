//Example 1:
//
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]
import java.util.Scanner;

public class LeetCodeTargetArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array and index: ");
        int n= sc.nextInt();
        int num[]=new int[n];
        int ind[]=new int[n];
        System.out.println("Enter element of array: ");
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Enter index of array: ");
        for(int i=0;i<n;i++){
            ind[i]= sc.nextInt();
        }
        int arr[]=createTargetArray(num,ind);
        for (int i:arr){
            System.out.println(arr);
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int t[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>index[i];j--){
                t[j]=t[j-1];
            }
            t[index[i]]=nums[i];
        }
        return t;
    }
}
