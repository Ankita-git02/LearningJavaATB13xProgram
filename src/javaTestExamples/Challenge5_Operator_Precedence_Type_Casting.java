package javaTestExamples;

import java.util.Scanner;

public class Challenge5_Operator_Precedence_Type_Casting {
    public static void main(String[] args) {
       int a= 130;
       float f=a;
       byte b= (byte)a;

        System.out.println("Value of a: "+a); //123
        System.out.println("Implicit casting: "+f); //123.0
        System.out.println("Explicit casting: "+b); //1
    }

}
