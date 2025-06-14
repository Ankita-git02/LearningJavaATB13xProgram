package typeCasting_ex1;

public class ImplicitTypeCasting_ex1 {
    public static void main(String[] args) {

        //🔹Program 4: Implicit Typecasting (Widening)
        //                    Description: Convert int A =100 to double.

        int A= 100;
        double B=A;
        //or
        //Double B = (double) A; // implicit widening Casting


        System.out.println("Integer value A: "+ A);
        System.out.println("Converted to double B: " + B);
    }
}
