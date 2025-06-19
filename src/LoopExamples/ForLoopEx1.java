package LoopExamples;

public class ForLoopEx1 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
            if (i % 2 == 0) {
                System.out.println("Even no = " + i);
            } else {
                System.out.println("Odd no = " + i);
            }
    }
}
