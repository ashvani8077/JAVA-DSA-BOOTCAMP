//Example 1:
//
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
import java.util.Scanner;

public class LeetCodeFlippingImageArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        int len=image.length;
//        int l=image[0].length;
//        for(int i=0;i<len;i++){
//            for(int j=0;j<l/2;j++){
//                int temp=image[i][j];
//                image[i][j]=image[i][l-1-j];
//                image[i][l-1-j]=temp;
//                // if(image[i][l-1-j]==0){image[i][l-1-j]=1;}
//                // else if(image[i][l-1-j]==1){image[i][l-1-j]=0;}
//                // if(image[i][j]==0){image[i][j]=1;}
//                // else if(image[i][j]==1){image[i][j]=0;}
//            }
//        }
//        for(int i=0;i<l;i++){
//            for(int j=0;j<l;j++){
//                if(image[i][j]==0){
//                    image[i][j]=1;
//                }
//                else if(image[i][j]==1){
//                    image[i][j]=0;
//                }
//            }
//        }
//        return image;
//    }
//}


    }
}
