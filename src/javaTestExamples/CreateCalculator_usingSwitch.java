package javaTestExamples;

import java.util.Scanner;

public class CreateCalculator_usingSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter No1");
        float a = sc.nextFloat();
        System.out.println("Enter no2");
        float b= sc.nextFloat();

        if(b==0) throw new ArithmeticException("value of b cannot be zero");

        System.out.println("Enter operator ");
        char operator= sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println("Addition of two no is "+(a+b));
                break;
            case '-':
                System.out.println("Substraction of two no is "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of two no is "+(a*b));
                break;
            case '/':
                System.out.println("division of two no is "+(a/b));
                break;
            case '%':
                System.out.println("Multiplication of two no is "+(a%b));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
