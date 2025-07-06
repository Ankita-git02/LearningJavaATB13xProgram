package LoopExamples;

public class DoWhile_Ex1 {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("Loop execute once");
            System.out.println(a);
            a++;
        } while (a < 0) ;//Atlest once its is executed

    }
}
