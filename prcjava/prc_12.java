package prcjava;

import java.util.Scanner;

//Reverse a number.
public class prc_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        numReverse(num);
    }

    public static void numReverse(int num) {
        for (int i = 0; i <=num; i++) {
            int last_num= num%10;
            System.out.println(last_num);
            num = num/10;
        }
    }
}
