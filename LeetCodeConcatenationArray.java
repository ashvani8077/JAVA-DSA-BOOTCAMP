//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]
import java.util.Scanner;

public class LeetCodeConcatenationArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array: ");
        int s= sc.nextInt();
        int nums[]=new int[s];
        System.out.println("Enter Elements: ");
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        int arr[]=getConcatenation(nums);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int arr[]=new int[(2*nums.length)];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=nums.length;i<arr.length;i++){
            arr[i]=nums[i-nums.length];
        }
        return arr;
    }
}
