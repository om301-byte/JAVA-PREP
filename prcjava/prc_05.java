package prcjava;
//Find the greatest of two numbers.
import java.util.Scanner;

public class prc_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        numGRE(a,b);

    }

    public static void numGRE(int a,int b) {
        if(a>b){
            System.out.println("a is greatest");
        }else {
            System.out.println("b is greatest");
        }
    }
}
