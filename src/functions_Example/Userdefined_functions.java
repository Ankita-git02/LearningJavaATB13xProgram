package functions_Example;

public class Userdefined_functions {

    public static void main(String[] args) {

        //Without Parameters and Without Return Type.
        greet();

        //2. Without Parameters but With Return Type
        String msg = greet_with_hello();
        System.out.println(msg);

        //3. With Parameters and Without Return Type
        greet_with_details("ankita",20,90000);

        //4. With Parameters and With Return Type.
        int total=sum_of_twonum(30,40);
        System.out.println("total is "+total);
    }

    //1. Without Parameters and Without Return Type.(declare/Define)
    static void greet() {
        System.out.println("hi");
    }

    //2. Without Parameters but With Return Type
    static String greet_with_hello() {
        System.out.println("hi");
        return "hi, how are you?";
    }

    //3. With Parameters and Without Return Type
    static void greet_with_details(String name, int age, double Salary){
        System.out.println("your name is- "+name+ "\nYour age is- "+age+ "\nyour salary is- "+Salary);
    }
    //4. With Parameters and With Return Type.
    static int sum_of_twonum(int a, int b){
        return a+b;
    }
}