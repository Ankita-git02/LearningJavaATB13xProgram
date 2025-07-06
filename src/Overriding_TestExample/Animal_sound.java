package Overriding_TestExample;

public class Animal_sound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        System.out.println("Dog sound: " + dog.sound());
        System.out.println("Cat sound: " + cat.sound());
        System.out.println("Cow sound: " + cow.sound());
    }
}
class Animal{

    String sound(){
        System.out.println("Sound of All the animal");
        return "SomeSound";
}
}
class Dog extends Animal{
    String sound(){
        return "Bark";
    }
}
class Cat extends Animal{
    String sound(){
        return "Meow";
    }
}
class Cow extends Animal{
    String sound(){
        return "Moo";
    }
}
