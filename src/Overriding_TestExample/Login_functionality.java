package Overriding_TestExample;

public class Login_functionality {
    public static void main(String[] args) {
    User u= new User();
    User u1= new AdminUser();
    User u2= new RegularUser();
    u.login();
    u1.login();
    u2.login();
    }
}
class User{
    void login(){
        System.out.println("User Login");
    }
}
class AdminUser extends User{
    void login(){
        System.out.println("Admin login: Access to admin dashboard");
    }
}
class RegularUser extends User{
    void login(){
        System.out.println("Regular user login: Access to user homepage");
    }
}