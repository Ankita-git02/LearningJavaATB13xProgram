package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class Addition_Overload {
    public static void main(String[] args) {
            Calculator c1= new Calculator();
           int intAdd= c1.add(10,30);
        System.out.println("addition of two integer no is= "+intAdd);
            Double DoubleAdd= c1.add(10.2,40.2);
        System.out.println("addition of two Double no is= "+DoubleAdd);

    }
}
class Calculator{

    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
