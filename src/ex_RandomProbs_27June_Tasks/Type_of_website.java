package ex_RandomProbs_27June_Tasks;

import java.util.Scanner;

public class Type_of_website {
    public static void main(String[] args) {
        System.out.print("Enter domain: ");

        Scanner sc = new Scanner(System.in);
        String url =sc.next().toLowerCase();

        if(url.endsWith(".com"))
        {
            System.out.println(url  + " : The website type is: Commercial website");
        } else if(url.endsWith(".org")){
            System.out.println(url  + " : The website type is: Non-profit organization");

        }else if(url.endsWith(".edu")) {
            System.out.println(url + " : The website type is: Educational Institution");
        }else if(url.endsWith(".gov"))  {
            System.out.println(url  + " : The website type is: Government website");

        }
        else if(url.endsWith(".net"))  {
            System.out.println(url  + " : The website type is: Network-related website");

        }

        else if(url.endsWith(".info"))  {
            System.out.println(url  + " : The website type is: Informational website");

        }

        else  {
            System.out.println(url  + " : The website type is: Unknown or other types of websites");

        }
    }
}
