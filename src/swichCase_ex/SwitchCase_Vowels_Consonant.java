package swichCase_ex;

import java.util.Scanner;

public class SwitchCase_Vowels_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alphabet");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Not a letter, please enter letter");

        } else {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("Vowels");
                    break;
                default:
                    System.out.println("others are consonant");
            }


        }
    }
}
