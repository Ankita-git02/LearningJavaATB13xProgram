package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class GreetUser {
    public static void main(String[] args) {
    Greeter g= new Greeter();
        g.Greet();
        System.out.println(g.Greet("ankita bhujbal"));



    }
}
class Greeter{

    void Greet(){
        System.out.println("Hello");
    }
    String Greet(String name){
        System.out.println("Hello ");
        return name;
    }
}