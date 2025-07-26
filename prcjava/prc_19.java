package prcjava;
//Swap two numbers without using a third variable.
public class prc_19 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        swapTwoNum(a,b);
    }

    public static void swapTwoNum(int a,int b) {
       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
