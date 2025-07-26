package prcjava;
//Check whether a character is a vowel or consonant.
public class prc_22 {
    public static void main(String[] args) {
        char chr='l';
        checkVowelorConsonant(chr);
    }

    public static void checkVowelorConsonant(char chr){
        if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
