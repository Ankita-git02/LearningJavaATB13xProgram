package javaOperator_Examples;

public class Nested_ternary_ex {
    public static void main(String[] args) {
        int Marks =80;
        //  Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        // (marks ==90) ? "A+": ((marks == 75)? "A": (marks==60)? "B":(marks==40)? "C": (marks <40)? "Fail"));

        String grade= (Marks>=90) ? "A+": (Marks>=75)? "A": (Marks>=60)? "B":(Marks>=40)? "C": "Fail";

        System.out.println("grade is: "+grade);
        System.out.println("Marks is: "+Marks);

    }
}
