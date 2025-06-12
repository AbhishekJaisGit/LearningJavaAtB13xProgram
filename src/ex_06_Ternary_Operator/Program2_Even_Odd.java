package ex_06_Ternary_Operator;

public class Program2_Even_Odd {
    public static void main(String[] args) {
        int num = 20;
        String  result = (num % 2 == 0) ? (num + " is Even") : (num + " is Odd");
        System.out.println(result);
    }
}
