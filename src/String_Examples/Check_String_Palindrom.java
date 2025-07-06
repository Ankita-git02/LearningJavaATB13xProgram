package String_Examples;

import StringBuilder_StringBuffer_example.String_Builder;

import java.util.Scanner;

public class Check_String_Palindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s1= sc.next();
        String New_Reverse_String= reverseString(s1);
        String new_reverse_string1=withoutReverse(s1);


        if(New_Reverse_String.equalsIgnoreCase(s1)){
            System.out.println("Palindrom");
            } else {
            System.out.println("not palindrom");
        }

    }
    static String reverseString (String userinput){
        StringBuilder sb= new StringBuilder(userinput);
        return sb.reverse().toString();
    }

    static String withoutReverse(String userinput){
        String reverseString1="";
        for(int i =userinput.length()-1;i>=0;i--){
            reverseString1= reverseString1+userinput.charAt(i);
           // System.out.println(reverseString1);
        }
        System.out.println("Palindrom no using for loop");
        return reverseString1;
    }
}



