package ex_06_Ternary_Operator;

public class Lab062_Ternary_Op {
    public static void main(String[] args) {
        int age = 18;
        String canVote = (age >= 18) ? "Yes" : "No";
        System.out.println(canVote);
    }
}
