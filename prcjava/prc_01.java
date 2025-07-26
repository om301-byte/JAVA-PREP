package prcjava;
import java.util.Scanner;
public class prc_01 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int d= add(a,b);
    System.out.println(d);
    }
public static int add(int a,int b){
        return  a+b;
  }
}
