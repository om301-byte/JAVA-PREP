package prcjava;

import java.util.Scanner;

//Find the factorial of a number
public class prc_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b = facNum(a);
        System.out.println(b);
    }

    public static int facNum(int a) {
        int c= 1;
        for (int i = 1; i <=a; i++) {
           c= c*i;
        }
        return c;
    }
}
