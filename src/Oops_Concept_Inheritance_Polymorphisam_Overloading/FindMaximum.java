package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class FindMaximum {
    public static void main(String[] args) {
    Utility u= new Utility();
    u.Max(-10,40);
    u.Max(30,30,10);
    u.Max(10.4,35.7);
    }
}
class Utility{

    int Max(int a, int b){
        int maxInt= (a>b)? a: b;
        System.out.println("Maximum value between two integer= "+maxInt);
        return maxInt;
    }
    int Max(int a, int b, int c){
        int max= (a>=b && a>=c)? a:(b>=a && b>=c)? b:c;
        System.out.println("maximum value between three integer= "+max);
        return max;
    }
    double Max(double a, double b){
        double maxDouble= (a>b)? a: b;
        System.out.println("maximum value between two Double= "+maxDouble);
        return maxDouble;
    }
}
