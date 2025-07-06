package functions_Example;

public class Function_Userdefined_ex3 {
    public static void main(String[] args) {
     int result=  Sum(10,6);
        System.out.println(result);

        sum_of_num(10,4);
    }
    static int Sum(int a, int b){
        System.out.println("Addition of two no");
        return a + b;
    }
    static void sum_of_num(int a, int b){
        System.out.println("Addition is "+(a+b));
    }
}
