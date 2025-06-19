package LoopExamples;

import java.util.Scanner;

public class FactorialProgram1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int number= sc.nextInt();
        int factorial =1;
        if(number <=0){
            System.out.println("Factorial");
        }else{
            for(int i=1;i<=number;i++){
                factorial=factorial*i;
            }
        }
        System.out.println("Factorial of = "+number+" is "+factorial);
    }
}
