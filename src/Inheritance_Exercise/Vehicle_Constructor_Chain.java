package Inheritance_Exercise;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
    Bike bk= new Bike();


    }
}
class vehicle{

    vehicle(){
        System.out.println("Vehicle is ready");
    }
}
class Bike extends vehicle{

    Bike(){
        System.out.println("Bike is ready");
    }
}