package javaTestExamples;

import java.util.Scanner;

public class Challage3_Comparison_LogicalOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no1");
        int a= sc.nextInt();
        System.out.println("Enter no2");
        int b= sc.nextInt();

        System.out.println("a==b: "+(a==b));
        System.out.println("a>b: "+(a>b));
        System.out.println("a<b: "+(a<b));
        System.out.println("!(a>b): "+!(a>b));
        System.out.println((a>b)&&(a>0));
        System.out.println((a < b)||(a > 0));




    }
}
