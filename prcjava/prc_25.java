package prcjava;

import java.util.Scanner;

//Calculate simple interest.
public class prc_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the price :");
        double price= scn.nextInt();
        System.out.println("Enter the Rate of perctage:");
        double rate=scn.nextInt();
        System.out.println("Enter a time:");
        double time=scn.nextInt();
        calSimpleInterst(price,rate,time);
    }

    public static void calSimpleInterst(double price,double rate,double time) {
        double simple_interest=price*rate*time/100;
        System.out.println(simple_interest);
    }
}
