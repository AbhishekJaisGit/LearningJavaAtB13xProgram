package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {

        System.out.println("Abhi" + "shek" + " Jaiswal");
        int a = 10;
        int b = 20;
        System.out.println(a + b); //Adds

        String x = "10";
        String y = "20";
        System.out.println(x + y); //Concats

        // + -> behave differently with the data type.
        // + -> operator overloading

        String first_name = "Abhi";
        String last_name = "Jais";

        int k = 10;
        int l = 10;

        System.out.println(first_name + last_name + k + l);  //Tricky
        System.out.println(k + l + first_name + last_name); //Tricky

        System.out.println(first_name + last_name + (a + b)); //BODMAS

    }
}
