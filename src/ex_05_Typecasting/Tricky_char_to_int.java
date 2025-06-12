package ex_05_Typecasting;

public class Tricky_char_to_int {

    public static void main(String[] args) {


        char ch = 'A';
        int i1 = ch;
        int i2 = 'A' + 1;
        int i3 = 'A' + 'B';

        System.out.println("char to int: " + i1);     // 65
        System.out.println("'A' + 1: " + i2);         // 66
        System.out.println("'A' + 'B': " + i3);       // 65 + 66 = 131
    }
}
