package ex_14_Strings;

public class Lab143_String_Useful_Functions {
    public static void main(String[] args) {

        String name = "Sonal";              //0, 1, 2 , 3, 4
        System.out.println(name.length());

        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        // System.out.println(name.charAt(10));     Error: java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Gupta"));

        System.out.println(name.contains("naL"));   //false
        System.out.println(name.contains("nal"));   //true

        System.out.println(name.equals("soNAL"));   //false
        System.out.println(name.equalsIgnoreCase("soNAL")); //true

        String s1 = "Madam Mimosa";
        System.out.println(s1.indexOf("M"));        //0: due to first occurence
        System.out.println(s1.indexOf("m"));        //4: due to case-senstivity
        System.out.println(s1.lastIndexOf("M"));    //6

        

    }
}
