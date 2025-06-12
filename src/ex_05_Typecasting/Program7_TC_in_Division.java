package ex_05_Typecasting;

public class Program7_TC_in_Division {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        float Caution = (float) (a / b); //Compare this statement with other 3
        System.out.println(Caution);

        float Result = (float) a / (float) b;
        System.out.println(Result);
        //or
        Result = (float) a / b;
        System.out.println(Result);
        //or
        Result = a / (float) b;
        System.out.println(Result);
    }
}
