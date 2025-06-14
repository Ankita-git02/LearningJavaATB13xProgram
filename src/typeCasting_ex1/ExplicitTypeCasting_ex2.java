package typeCasting_ex1;

import java.sql.SQLOutput;

public class ExplicitTypeCasting_ex2 {
//Program 5: Explicit Typecasting (Narrowing)
//Description: Casts a double to an int, cutting off decimals value
    public static void main(String[] args) {
    double A =100.89;
    int B = (int)A; //Explicit narrowing
        System.out.println("Value of A; "+A);
        System.out.println("Value of B: "+B);
}
}
