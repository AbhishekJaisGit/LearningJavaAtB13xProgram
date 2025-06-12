package ex_05_Typecasting;

public class Tricky_int_to_char {
    public static void main(String[] args) {


        //Char range: 0-65535
        int i1 = -65;
        char c1 = (char) i1;

        System.out.println("Negative int to char: " + c1);
        System.out.println("Numeric char value: " + (int) c1); //65535-65 = 65470 + 1 = 65471


        int i2 = -100;
        char c2 = (char) i2;

        System.out.println("Negative int to char: " + c2);
        System.out.println("Numeric char value: " + (int) c2);
    }
}
