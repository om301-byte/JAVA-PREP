package prcjava;

import java.util.Scanner;

//Check whether a number is prime or not
public class prc_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        numPrime(a);
    }

    public static void numPrime(int a) {
        for(int i = 2; i <a; i++) {
            if(a%i==0){
                System.out.println(" not prime");
            }
            else {
                System.out.println("prime number");
                break;
            }
        }
        
    }
}
