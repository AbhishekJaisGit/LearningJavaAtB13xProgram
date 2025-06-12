package ex_05_Typecasting;

public class Lab058_Widening {
    public static void main(String[] args) {
        byte b = 10;
        int implicit = b;  //Implicit widening TC
        int explicit = (int)b; //Explicit widening TC
    }
}
