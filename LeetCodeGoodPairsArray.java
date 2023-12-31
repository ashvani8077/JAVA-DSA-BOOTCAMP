import java.util.Scanner;

public class LeetCodeGoodPairsArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array: ");
        int s= sc.nextInt();
        int nums[]=new int[s];
        System.out.println("Enter Elements: ");
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int co=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i<j){
                    if(nums[i]==nums[j]){
                        co++;
                    }
                }
            }
        }
        return co;
    }
}
