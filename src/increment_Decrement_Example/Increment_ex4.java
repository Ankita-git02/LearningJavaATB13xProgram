package increment_Decrement_Example;

public class Increment_ex4 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output: ? 5

        System.out.println("b: " + b); // Output: ?7
    }

}
