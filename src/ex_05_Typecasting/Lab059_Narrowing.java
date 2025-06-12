package ex_05_Typecasting;

public class Lab059_Narrowing {
    public static void main(String[] args) {
        double D = 9.78;

        // Narrowing type cast: double -> int
        // This Type casting may lead to data loss
        int I = (int) D;

        System.out.println("Double : " + D); // 9.78
        System.out.println("Integer : " + I);   // 9 : Decimal part is discarded

        // Narrowing again integer --> byte
        // No data loss here
        byte B = (byte) I;
        System.out.println("Integer : " + I); // 9
        System.out.println("Byte : " + B); // 9 : No data loss
    }
}

