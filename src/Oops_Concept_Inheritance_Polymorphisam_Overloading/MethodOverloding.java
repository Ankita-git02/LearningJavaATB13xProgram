package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class MethodOverloding {
    public static void main(String[] args) {
        Home h1= new Home();
        System.out.println(h1.Task());
        System.out.println(h1.Task(10));
        System.out.println(h1.Task(true));
    }
}
class Home{
    int Task(){
        System.out.println("Task1");
        return 0;
    }
    int Task(int a){
        System.out.println("Task1");
        return a;
    }
    Boolean Task(boolean a){
        return a;
    }
}
