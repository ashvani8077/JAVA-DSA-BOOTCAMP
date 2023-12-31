//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
import java.util.Scanner;

public class LeetCodeSuffleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Half Value of array: ");
        int n= sc.nextInt();
        System.out.print("Size of array: ");
        int s= sc.nextInt();
        int nums[]=new int[s];
        System.out.println("Enter Elements: ");
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        int arr[]=shuffle(nums,n);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int r[]=new int[nums.length];
        int count=0;
        for(int i=0;i<n;i++){
            r[count++]=nums[i];
            r[count++]=nums[i+n];
        }
        return r;
    }
}
