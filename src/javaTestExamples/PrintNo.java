package javaTestExamples;

import java.util.Scanner;

public class PrintNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        if (sc.hasNextInt()) {
            int no = sc.nextInt();

            if(no<1){
                System.out.println("Enter a positive no which is greater than 0 ");
            }else
                for (int i = 1; i<= no; i++) {
                System.out.print(i+ " ");
            }
        }else{
            System.out.println("Enter valid integer");
        }
    }
}
