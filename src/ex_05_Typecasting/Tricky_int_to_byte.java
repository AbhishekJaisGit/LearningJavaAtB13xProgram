package ex_05_Typecasting;

public class Tricky_int_to_byte {
    public static void main(String[] args) {

        // int --> byte is narrowing, needs casting; works without data loss only if value is within -128 to 127
        int i1 = 127;
        byte b1 = (byte) i1;
        System.out.println(b1);

        int i2 = 128;
        byte b2 = (byte) i2;
        System.out.println(b2); // 128 becomes -128 → (130 - 256 = -126) due to overflow
        // Think of it like a circular clock: if you exceed the max, it wraps around from the minimum again.
        // Similarly
        int i3 = 130;
        byte b3 = (byte) i3;
        System.out.println(b3); // 130 becomes -126 → (130 - 256 = -126) due to overflow



    }
}
