package LoopExamples;

import java.util.Scanner;

public class CheckVowe_ex {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter character");
        char ch= sc.next().toLowerCase().charAt(0);

        if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
            System.out.println(ch + " is vowel");

        }else if(ch>='a'&&ch<='z'){
            System.out.println(ch+ " is consonant");
        }else {
            System.out.println("invalid");
        }
    }
}
