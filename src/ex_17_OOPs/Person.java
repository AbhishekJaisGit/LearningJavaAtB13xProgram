package ex_17_OOPs;

public class Person {

    // These are called as properties/attributes/instance variables/ member variables
    String name;
    int age;
    String gender;
    boolean isMarried;

    // These are called as Behaviours/member functions/functions/methods
    void walk(){
        System.out.println("Walking");
    }

    void eat(){
        System.out.println("Eating");
    }

    String sleep(){
        System.out.println("Sleeping");
        return null;
    }

    String food(String foodName){
        System.out.println("Eating");
        return null;
    }


}
