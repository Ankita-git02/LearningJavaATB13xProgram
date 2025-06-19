package scannerClass_example;

import java.util.Scanner;

public class Ternary_Operator_usingScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();
        String Is_Eligible_forVote = (age>=18)? "Eligible": "Not Eligible";
        System.out.println("Person age: "+age);
        System.out.println("Eligible or not: "+Is_Eligible_forVote);
    }
}
