import java.util.Scanner;

public class LeetCodeRunningSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array: ");
        int s= sc.nextInt();
        int nums[]=new int[s];
        System.out.println("Enter Elements: ");
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        int arr[]=runningSum(nums);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static int[] runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        return arr;
    }
}
