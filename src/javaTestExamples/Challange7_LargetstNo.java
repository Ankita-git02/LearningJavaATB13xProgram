package javaTestExamples;

import java.util.Scanner;

public class Challange7_LargetstNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No1");
       int a= sc.nextInt();
        System.out.println("Enter No2");
        int b= sc.nextInt();
        System.out.println("Enter No3");
        int c= sc.nextInt();
        if (a==b||b==c||c==a) {
            System.out.println("cannot be calculate");
        } else if(a>b && a>c ){
            System.out.println(a+" is Large");
        }else if(b>a && b>c){
            System.out.println(b+" is Large");
        }else{
            System.out.println(c+" is Large");
        }

    }
}
