package Oops_Concept_Inheritance_Multilevel_inheritance;

public class MultiLevel_ex {
    public static void main(String[] args) {
        GrandFather gf= new GrandFather();
        gf.gf();

        System.out.println("---------");

        Father f1= new Father();
        f1.f();
        f1.gf();

        Son s1= new Son();
        s1.gf();
        s1.f();
        s1.s();


    }
}
