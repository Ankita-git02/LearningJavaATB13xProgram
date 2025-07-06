package Overriding_TestExample;

public class Employee_Role_Info {
    public static void main(String[] args) {
    Employee e= new Employee();
    Manager m= new Manager();
    Clerk c= new Clerk();
    Tester t= new Tester();

        e.role();
        m.role();
        c.role();
        t.role();

    }
}
class Employee{
    void role(){
        System.out.println("General Employee");
    }
}
class Manager extends Employee{
    void role(){
        System.out.println("Manager role");
    }
}
class Clerk extends Employee{
    void role(){
        System.out.println("Clerk role");
    }
}
class Tester extends Employee{
    void role(){
        System.out.println("Tester role");
    }
}