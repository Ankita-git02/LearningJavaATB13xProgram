package javaTestExamples;

import java.util.Scanner;

public class Challange4_Increment_Decrement_Operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Original: "+a);
        System.out.println("Pre-increment: "+(++a));
        System.out.println("Post-increment: "+(a++));
        System.out.println("Return: "+a);
        System.out.println("Pre-decrement: "+(--a));
        System.out.println("Post-decrement: "+(a--));
        System.out.println("Return: "+a);


    }
}
