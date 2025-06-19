package ifElseExample;

import java.util.Scanner;

public class if_elseEx2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no");
        int no =sc.nextInt();
        if (no%2==0){
            System.out.println("No is Even");
        }else {
            System.out.println("No is odd");
        }
    }
}
