package ifElseExample;

import java.util.Scanner;

public class IfElse_TringleClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of s1");
        int s1 = sc.nextInt();
        System.out.println("Enter size of s2");
        int s2 = sc.nextInt();
        System.out.println("Enter size of s3");

        int s3 = sc.nextInt();
            if (s1 == s2 && s2 == s3) {
                System.out.println("equilateral triangle");
            } else if (s1 == s2 || s2 == s3 || s3 == s1) {
                System.out.println("isosceles triangle");
            } else {
                System.out.println("scalene triangle");
            }
        }
    }


