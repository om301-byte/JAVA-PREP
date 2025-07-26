package prcjava;

import java.util.Scanner;

//Calculate the area of a circle.
public class prc_23 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        double radius=scn.nextInt();
        calAreacircle(radius);
    }

    public static void calAreacircle(double radius){
       double circle= Math.PI *radius*radius;
        System.out.println(circle);
    }
}
