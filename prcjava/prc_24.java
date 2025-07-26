package prcjava;

import java.util.Scanner;

// Circumference of a Circle
public class prc_24 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        double radius=scn.nextInt();
        calAreaCirumference(radius);
    }

    public static void calAreaCirumference(double radius) {
        double circum= 2*Math.PI*radius;
        System.out.println("circumference of a circle");
        System.out.println(circum);
    }
}
