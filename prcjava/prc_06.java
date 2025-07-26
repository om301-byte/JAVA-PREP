package prcjava;
//Find the largest among three numbers
import java.util.Scanner;

public class prc_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        finLAR(a, b,c);

    }

    public static void finLAR(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is greatest");
        } else if (b > a &&b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}