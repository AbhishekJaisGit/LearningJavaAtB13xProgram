package ex_04_Operators;

public class Lab055_Interview {
    public static void main(String[] args) {
        System.out.println('A' == 65); //Que.1

        //Que.2
        short s = 10;
        char c = 'A';
        String s1 = "A";
        System.out.println(c + s); //Tricky
        System.out.println(c);  //Tricky
        System.out.println(c + c);    //Tricky
        System.out.println(c + s1);   //Tricky
        System.out.println("" + c + c);  // "" makes it string context  //Tricky

    }
}
