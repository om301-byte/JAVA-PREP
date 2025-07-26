package prcjava;
//Find the ASCII value of a character
public class prc_20 {
    public static void main(String[] args) {
        String chr = "om";
        findASCIIvalue(chr);
    }

    public static void findASCIIvalue(String chr) {
        char[] chArr = chr.toCharArray();
        for(char c : chArr){
            System.out.println((int)c);
        }
    }
}