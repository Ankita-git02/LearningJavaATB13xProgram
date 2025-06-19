package ifElseExample;

import java.util.Scanner;

public class if_elseEx1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
       int age = sc.nextInt();
        if(age>=18){
            System.out.println("CanVote");
        }else {
            System.out.println("Cannot Vote");
        }
    }
}
