//Find Ncr & Npr
import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Value of N: ");
        int n= sc.nextInt();
        System.out.print("Value of R: ");
        int r= sc.nextInt();
        int nfact=1;
        int nr=n-r;
        int rfact=1;
        int nrfact=1;
        while (n>0){
            nfact=nfact*n;
            n--;
        }
        while (r>0){
            rfact=rfact*r;
            r--;
        }
        while (nr>0){
            nrfact=nrfact*nr;
            nr--;
        }
        double per=(double) nfact/nrfact;
        double com=(double) nfact/(nrfact*rfact);
        System.out.println("Permutation: "+per);
        System.out.println("Combination: "+com);
    }
}
