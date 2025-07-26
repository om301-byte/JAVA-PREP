package prcjava;
//Check if a number is a palindrome.
public class prc_15 {
    public static void main(String[] args) {
        int num = 121;
        checkPalindrom(num);
    }
    public static void checkPalindrom(int num) {
        int res = 0;
        int temp = num;
        for (int i = 0; temp > 0; i++) {
            int lastDigit = temp % 10;
            res = (res * 10) + lastDigit;
            temp = temp / 10;
        }
        System.out.println("res=" + res);
        System.out.println("num=" + num);
        if (res == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}