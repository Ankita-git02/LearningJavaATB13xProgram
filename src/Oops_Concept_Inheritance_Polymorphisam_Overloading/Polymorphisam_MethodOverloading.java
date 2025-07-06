package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class Polymorphisam_MethodOverloading {
    public static void main(String[] args) {
        mathOperation m1= new mathOperation();
        int r1= m1.add(10,20);
        double r2= m1.add(10.5,3.4);
        int r3= m1.add(10,4,6);
        String s= m1.add("avc","ABC");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(s);
    }
}
class mathOperation{

    int add (int a, int b){
        return a+b;
    }
    double add( double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    String add(String a, String b){
        return a+b;
    }
}
