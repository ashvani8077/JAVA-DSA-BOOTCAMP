//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
import java.util.Scanner;

public class LeetCodeRotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //class Solution {
        //    public void reverse(int []nums, int low, int high){
        //        while(low<high){
        //            int temp=nums[low];
        //            nums[low]=nums[high];
        //            nums[high]=temp;
        //            low++;
        //            high--;
        //        }
        //    }
        //    public void rotate(int[] nums, int k) {
        //        if(nums.length==0) return;
        //
        //        int n= nums.length;
        //        k%=n;
        //        reverse(nums, 0, n-1);
        //        reverse(nums,0,k-1);
        //        reverse(nums,k,n-1);
        //    }
        //}



    }
}
