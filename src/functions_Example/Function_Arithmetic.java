package functions_Example;
import java.util.Scanner;

public class Function_Arithmetic {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("Enter the num1");

        int a=0;
        if(sc.hasNextInt()){
            a= sc.nextInt();
        }else {
            System.out.println("enter integer only");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b=0;
        if(sc.hasNextInt()) {
            b = sc.nextInt();
        } else{
            System.out.println("Enter integre only");
            System.exit(0);
        }
        sum(a,b);
        int Result= sub(a,b);
        int Result_mul= mul(a,b);
        int Result_Div= div(a,b);

        System.out.println("subtraction "+Result);
        System.out.println("multiplictaion "+Result_mul);
        System.out.println("Division "+Result_Div);


    }

    static int sum(int a, int b){
        int sum = a+b;
        System.out.println("sum of two no is- "+sum);
        return sum;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        if(b==0){
        throw new ArithmeticException("B cant be a zero");
        }
        return a/b;


    }
}
