package swichCase_ex;

import java.util.Scanner;

public class SwitchCase_Ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read first character from input

        switch (ch) {
            case 'A':
             //   System.out.println("ascci value of "+ch+ "is "+(int)ch);
            case 'a':
            case 'B':
            case 'b':
            case '1':
            case '@':
            case 'Z':
            case 'z':
                System.out.println("The ASCII value of " + ch + " is: " + (int) ch);
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
