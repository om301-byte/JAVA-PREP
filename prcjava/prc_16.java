package prcjava;
//Find the sum of digits of a number
public class prc_16 {
    public static void main(String[] args) {
        int num =1234;
        findSumDigits(num);
    }

    public static void findSumDigits(int num){
        int digit=0;
        for (int i = 0; i <=num; i++) {
            digit=num%10+digit;//picese value leta hai
            if(i==1){
                i=0;
            }
            num=num/10;//remove last num
        }
        System.out.println(digit);
    }
}
