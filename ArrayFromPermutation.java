//Example 1:
//
//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
//Explanation: The array ans is built as follows:
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3]
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array: ");
        int s= sc.nextInt();
        int nums[]=new int[s];
        System.out.println("Enter Elements: ");
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        int arr[]=buildArray(nums);
        for (int i:arr){
            System.out.println(i);
        }
    }
        public static int[] buildArray(int[] nums) {
            int arr[] = new int[nums.length];
            for (int i = 0; i < arr.length; i++) {
                int t = nums[i];
                arr[i] = nums[t];
            }
            return arr;
        }
    }
