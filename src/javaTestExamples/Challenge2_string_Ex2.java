package javaTestExamples;

public class Challenge2_string_Ex2 {
    public static void main(String[] args) {
        String string1= "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        System.out.println("Equals(): "+string1.equals(string2));
        System.out.println("equalignorecase(): "+string1.equalsIgnoreCase(string2));
        System.out.println(" comparrTo(): "+string1.compareTo(string2));
    }
}
