package prcjava;
//Find the ASCII value of a character(add that value)
public class prc_21 {
    public static void main(String[] args) {
        String chr = "om";
        findASCIIvalue(chr);
    }

    public static void findASCIIvalue(String chr) {
        char[] chArr = chr.toCharArray();
        int count =0;
        for(char c : chArr){
            System.out.println((int)c);
            count=count+(int)c;
        }
        System.out.println(count);
    }
}