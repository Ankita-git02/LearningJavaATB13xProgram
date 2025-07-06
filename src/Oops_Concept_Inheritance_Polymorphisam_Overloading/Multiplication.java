package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class Multiplication {
    public static void main(String[] args) {
    MathOperation mp= new MathOperation();
        System.out.println(mp.multiply(10,20));
        System.out.println(mp.multiply(12,12,23));
    }
}
class MathOperation{

    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b, int c){
        return a*b*c;
    }
}