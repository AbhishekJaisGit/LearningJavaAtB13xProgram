package ex_RandomProbs_27June_Tasks;

import java.util.Scanner;

public class Check_Senior_Citizen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        if(age>0 && age <=12)
        {
            System.out.println(age  + " : Child");
        } else if(age>=13 && age <=19) {
            System.out.println(age  + " : Teenager");

        }else if(age>=20 && age <=64) {
            System.out.println(age  + " : Adult");
        }else  {
            System.out.println(age  + " : Senior Citizen");

        }
    }
}
