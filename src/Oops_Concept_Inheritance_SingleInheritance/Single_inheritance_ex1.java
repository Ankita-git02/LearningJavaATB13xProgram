package Oops_Concept_Inheritance_SingleInheritance;

public class Single_inheritance_ex1 {

    public static void main(String[] args) {
        TestCase1 t1= new TestCase1();
        t1.runningTC1();

        TestCase2 t2= new TestCase2();
        t2.runningTC2();

        CommanToAll c1= new TestCase1(); //Dynamic dispatch
        //TestCase2 c2= new CommanToAll();  //Father object not possibvle
    }
}


