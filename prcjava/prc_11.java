package prcjava;

import java.util.Scanner;

//Print Fibonacci series up to N terms.
public class prc_11 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        serFibonacci(n);

    }
    public static void serFibonacci(int n){
        int a=0;
        int b=1;
        for (int i = 0; i <n; i++) {
            System.out.print(a+" ");
            int c= a+b;
            a=b;
            b=c;
            }
        }
    }
