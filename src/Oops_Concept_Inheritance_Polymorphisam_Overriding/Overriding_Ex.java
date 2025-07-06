package Oops_Concept_Inheritance_Polymorphisam_Overriding;

public class Overriding_Ex {
    public static void main(String[] args) {
    Dog d= new Dog();
    d.Sound();
    }
}
class Animal{
    void Sound(){
        System.out.println("Default sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Bark");
    }

}
