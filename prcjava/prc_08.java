package prcjava;

import java.util.Scanner;

//Print the multiplication table of any number
public class prc_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        mulTable(a);
    }

    public static void mulTable(int a) {
        for (int i = 1; i <11; i++) {
            int b = a*i;
            System.out.println(a+"*"+i+"="+b);
        }
    }
}
