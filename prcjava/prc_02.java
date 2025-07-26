package prcjava;
import java.util.Scanner;
public class prc_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c= sub( a, b);
        System.out.println(c);
    }
    public static int sub(int a,int b){
        return a-b;
    }
}
