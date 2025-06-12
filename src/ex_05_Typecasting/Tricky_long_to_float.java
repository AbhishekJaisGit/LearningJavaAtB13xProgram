package ex_05_Typecasting;

public class Tricky_long_to_float {
    public static void main(String[] args) {

        //long: 64 bit -> float : 32 bit

        long l = 999999999999999999L;
        float f = l;

        System.out.println("Long: " + l);
        System.out.println("Float (after cast): " + f);

    }
}
