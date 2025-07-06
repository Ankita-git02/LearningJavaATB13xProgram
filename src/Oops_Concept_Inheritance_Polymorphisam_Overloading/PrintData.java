package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class PrintData {
    public static void main(String[] args) {
    Printer p= new Printer();
        System.out.println(p.printData(10));
        System.out.println(p.printData("Ankita"));
        System.out.println(p.printData(33.2f));

    }
}
class Printer{

    String printData(String data){
        return data;
    }
    int printData(int data){
        return data;
    }
    float printData(float data){
        return data;
    }
}
