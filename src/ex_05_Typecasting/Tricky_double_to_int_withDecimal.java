package ex_05_Typecasting;

public class Tricky_double_to_int_withDecimal {
    public static void main(String[] args) {

        //double is 64 bit -> integer is 32 bit

        double d1 = 123.999;
        double d2 = -456.789;

        int i1 = (int) d1;
        int i2 = (int) d2;

        System.out.println("123.999 → int: " + i1); // 123 : int can’t hold decimals → decimal part is truncated
        System.out.println("-456.789 → int: " + i2); // -456
    }
}
