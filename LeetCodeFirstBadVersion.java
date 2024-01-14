//Example 1:
//
//Input: n = 5, bad = 4
//Output: 4
//Explanation:
//call isBadVersion(3) -> false
//call isBadVersion(5) -> true
//call isBadVersion(4) -> true
//Then 4 is the first bad version.
import java.util.Scanner;

public class LeetCodeFirstBadVersion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ///* The isBadVersion API is defined in the parent class VersionControl.
        //      boolean isBadVersion(int version); */
        //
        //public class Solution extends VersionControl {
        //    public int firstBadVersion(int n) {
        //        int s=1;
        //        int l=n;
        //        while(s<l){
        //            int mid=s+(l-s)/2;
        //            if(isBadVersion(mid)){
        //                l=mid;
        //            }
        //            else{
        //                s=mid+1;
        //            }
        //        }
        //        return s;
        //    }
        //}



    }
}
