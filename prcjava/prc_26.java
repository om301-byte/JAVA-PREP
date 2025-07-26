package prcjava;

import java.util.Scanner;

//Calculate the power of a number using loop
public class prc_26 {
    public static void main(String[] args) {


        calPower(2,4);
    }

    public static void calPower(int num,int pow) {
        int cal=num;
        for (int i = 0; i <pow; i++) {
            cal= cal*num;
        }
        System.out.println(cal);
    }
}
