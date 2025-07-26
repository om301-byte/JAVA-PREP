package prcjava;

import java.util.Scanner;

//Check whether a year is a leap year or not
public class prc_28 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int year= scn.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year) {
        if(year%4==0 && year%100==0 || year%400==0){
            System.out.println(year+"it's a leap year");
        }else {
            System.out.println(year+"it's not s leap year");
        }
    }
}
