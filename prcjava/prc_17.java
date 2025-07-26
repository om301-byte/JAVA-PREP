package prcjava;
//Count the number of digits in a number.
public class prc_17 {
    public static void main(String[] args) {
        int num=123;
        countDigits(num);
    }

    public static void countDigits(int num){
        int count =0;
        for (int i = 0; i <=num; i++) {
            count++;
            if(i==1){
                i=0;
            }
            num= num/10;
        }
        System.out.println(count);
    }
}
