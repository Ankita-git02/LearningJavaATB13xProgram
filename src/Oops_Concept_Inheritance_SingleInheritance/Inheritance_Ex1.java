package Oops_Concept_Inheritance_SingleInheritance;

public class Inheritance_Ex1 {

    public static void main(String[] args) {
        Father f1= new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        System.out.println("Child class");
        son s1= new son();
        System.out.println(s1.gold_f);
        s1.bhk3();
        s1.bhk2();

    }
}

class Father{
    int gold_f=1000;    //Attribute

    public void bhk2() {  //method
        System.out.println("Father-2BHK");
    }
}

class son extends Father {

    public void bhk3(){
        System.out.println("Son-3BHK");
    }

}

