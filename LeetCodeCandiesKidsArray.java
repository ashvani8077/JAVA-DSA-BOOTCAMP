//Example 1:
//
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

//import java.util.Scanner;
//
//public class LeetCodeCandiesKidsArray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Extra Candies: ");
//        System.out.print("Number Of Kids: ");
//        int s= sc.nextInt();
//        int nums[]=new int[s];
//        System.out.println("Enter Kids Having Candies: ");
//        for(int i=0;i<s;i++){
//            nums[i]=sc.nextInt();
//        }
//
//        System.out.println(kidsWithCandies(nums,n));
//    }
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        ArrayList<Boolean> re=new ArrayList<Boolean>();
//        int len=candies.length;
//        int max=0;
//        for(int i=0;i<len;i++){
//             if(candies[i]>max){
//                max=candies[i];
//             }
//          }
//        for(int i=0;i<len;i++){
//            if(extraCandies+candies[i]>=max){
//                re.add(true);
//            }
//            else{
//                re.add(false);
//            }
//        }
//        return re;
//    }
//}
