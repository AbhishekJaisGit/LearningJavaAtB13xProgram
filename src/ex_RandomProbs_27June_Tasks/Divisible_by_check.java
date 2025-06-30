package ex_RandomProbs_27June_Tasks;

import java.util.Scanner;

public class Divisible_by_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        if (sc.hasNextLong()) {
            long num = sc.nextLong();
            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println(num + " is divisible by 5 and 11");
            } else if (num % 5 == 0 && num % 11 != 0) {
                System.out.println(num + " is divisible by 5 but not by 11");
            } else if (num % 5 != 0 && num % 11 == 0) {
                System.out.println(num + " is divisible by 11 but not by 5");
            } else {
                System.out.println(num + " is not divisible by both 5 and 11");
            }
        } else {
            System.out.println("Invalid Input!");
        }
    }
}
