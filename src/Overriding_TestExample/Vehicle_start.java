package Overriding_TestExample;

public class Vehicle_start {
    public static void main(String[] args) {
    Vehicle b=new Bike();
    Vehicle c=new Car();
        b.Start();
        c.Start();
    }
}
class Vehicle{
    void Start(){
        System.out.println("start vehicle");
    }
}
class Bike extends Vehicle{
    @Override
    void Start() {
        System.out.println("Kick start the bike");
    }
}
class Car extends Vehicle{
    void Start(){
        System.out.println("Turn the key to start the car");
    }
}