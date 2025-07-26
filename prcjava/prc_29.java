package prcjava;

import java.util.ArrayList;

//factors of number store in arrya
public class prc_29 {
    public static void main(String[] args) {
        int a= 12;
        storinArray(a);

    }

    public static void storinArray(int a){
        ArrayList<Integer> arry=new ArrayList<>();
        for (int i = 1; i <a; i++) {
            if (a%i==0){
                arry.add(i);
            }
        }
        System.out.println(arry);
    }
}