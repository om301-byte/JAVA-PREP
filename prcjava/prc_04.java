package prcjava;
//Check if a number is positive, negative or zero.
import java.util.Scanner;
public class prc_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        pnz(a);
    }
    public static void pnz(int a){
        if(a>0){
            System.out.println("It's positive");
        }
        else if(a<0){
            System.out.println("It's negative");
        }
        else {
            System.out.println("It's zero");
        }
    }
}