package prcjava;
//odd even
import java.util.Scanner;
public class prc_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        evenodd(a);
    }
    public static void evenodd(int a){
        if(a%2==0){
            System.out.print(a+"is a even number");
        }else {
            System.out.print(a+"is a odd number");
        }
    }
}