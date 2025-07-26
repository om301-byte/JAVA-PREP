package prcjava;
//Convert temperature from Celsius to Fahrenheit
public class prc_27 {
    public static void main(String[] args) {
      int cel=50;
      calCeltoFah(cel);
    }

    public static void calCeltoFah(int cel) {
     int fahre= (cel*9/5)+32;
        System.out.println(fahre);

    }
}
