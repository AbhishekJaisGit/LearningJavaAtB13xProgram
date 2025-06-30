package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");

    int age = sc.nextInt();
    String canVote = age >= 18 ? "Yes" : "No";

        System.out.println(canVote);


    }

}
