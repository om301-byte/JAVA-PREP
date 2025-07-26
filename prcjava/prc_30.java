package prcjava;
import java.util.ArrayList;
import java.util.Scanner;
//Find HCF (GCD) of two numbers
public class prc_30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b=scn.nextInt();
        findHCF(a,b);
    }
    public static void findHCF(int a, int b) {
        ArrayList<Integer> arry= new ArrayList<>();
        for (int i = 1; i <=a; i++) {
            if (a%i==0) {
                arry.add(i);
            }
        }
        ArrayList<Integer>arry2= new ArrayList<>();
        for (int j = 1; j <=b; j++) {
            if(b%j==0){
                arry2.add(j);
            }

        }
        System.out.println(arry);
        System.out.println(arry2);

        for (int k = 0; k < arry.size(); k++) {
            for (int l = 0; l <arry2.size(); l++) {
                if (arry.get(k).equals(arry2.get(l))){
                    System.out.println(arry2.get(l));
                }
            }

        }
    }
}
