package prcjava;
//Check if a number is a palindrome rohit's code
public class prc_14 {
    public static void main(String[] args) {
        int num =121;
        checkPalindrome(num);
    }

    public static void checkPalindrome(int num){
        int temp=num;
        int res=0;
        int digits=0;
        for (int j = 0; j <= digits; j++) {
            if(temp>0){
                digits++;
                temp=temp/10;
            }
        }

        temp=num;
        for (int i = 0; i<digits; i++) {
            int last_num= temp%10;
            res=(res*10)+last_num;
            temp=temp/10;
        }
        System.out.println("num : "+num);
        System.out.println("res : "+res );
        if (res==num) {
            System.out.println("it's a palindrome");
        }else {
            System.out.println("it's not a palindrome");
        }
    }
}
