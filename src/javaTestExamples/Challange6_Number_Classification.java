package javaTestExamples;

import java.util.Scanner;

public class Challange6_Number_Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number == 0) {
                System.out.println(number + " is zero");
            } else if (number > 0) {
                System.out.println(number + " is positive");
            } else {
                System.out.println(number + " is negative");
            }
        } else {
            System.out.println("Input is not valid please enter valid input");
        }
    }
}
