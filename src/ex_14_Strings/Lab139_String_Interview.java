package ex_14_Strings;

public class Lab139_String_Interview {
    public static void main(String[] args) {
        //Q1: How many strings are present in SCP (String Constant Pool)?
        String name = "Abhi";           //1 string is here = Abhi
        name = name.toUpperCase();      //1 string is here = ABHI
        System.out.println(name);
        //Ans1: 2

        //Q2: How many strings are present in SCP and how many in Object Area?
        String str1 = "Xyz";           //Only 1 string is present in SCP
        String str2 = "Xyz";
        String str3 = "Xyz";

        String str11 = new String("Xyz");       //1 string is here = Xyz
        String str12 = new String("Xyz");       //1 string is here = Xyz
        String str13 = new String("Xyz");       //1 string is here = Xyz
        //Ans2: 1 --> SCP, 3 --> OA, Total count of strings = 4


        //Tricky Comparisions: == --> Compares location references
        System.out.println(str1 == str11);      //false
        System.out.println(str11 == str12);     //false
        System.out.println(str1 == str2);       //true

        //Tricky Comparisions: equals --> Compares content values
        System.out.println(str1.equals(str11));     //true
        System.out.println(str11.equals(str13));    //true
    }
}
