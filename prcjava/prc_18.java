package prcjava;
//Swap two numbers using a third variable(temp)(int c)
public class prc_18 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        swapNumber(a,b);
    }

    public static void swapNumber(int a,int b) {
        int temp= a;//temp ke jaga c variable bhi decler kar shakte hai
        a=b;
        b=temp;//temp=c
        System.out.println(a);
        System.out.println(b);
    }
}
