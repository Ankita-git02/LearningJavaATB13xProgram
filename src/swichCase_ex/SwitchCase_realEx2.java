package swichCase_ex;

import java.util.Scanner;

public class SwitchCase_realEx2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser you want to run testcase");
        String bName= sc.next();
        bName = bName.toLowerCase();

        switch(bName){
            case "chrome":
                System.out.println("use chrome to execute test case");
                break;

            case "firefox":
                System.out.println("use firefox to execute test case");
                break;

            case "edge":
                System.out.println("use Edge  to execute test case");
                break;

                default:
                    System.out.println("invalid");
        }
    }
}
