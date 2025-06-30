package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Abhishek";   //stored in String Constant Pool
        String nameInUpper = name.toUpperCase();         //using the string in some operation  (Immutable)
        System.out.println(name);   //prints Abhishek (String stored in name variable does not change)

        name = name.toUpperCase();  //reassigning the string
        System.out.println(name);   //prints ABHISHEK

        System.out.println("bhai".toUpperCase());   //doing operation in a string without assigning it to any variable

    }
}
