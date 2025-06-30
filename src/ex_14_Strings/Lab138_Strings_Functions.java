package ex_14_Strings;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {

        char ch = 'A';  //there is no function for character
        System.out.println(ch);

        String str1 = "ABcd"; //there are many functions for string
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat("eF"));
    }
}
