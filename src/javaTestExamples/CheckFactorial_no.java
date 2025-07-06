package javaTestExamples;

import java.util.Scanner;

public class CheckFactorial_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid integer no");
            return;
        }
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Enter a positive no");
        } else {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + num + "is " + fact);

        }
    }
}

