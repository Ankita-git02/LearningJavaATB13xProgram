package Inheritance_Exercise;

public class MultiLevel_login_system {
    public static void main(String[] args) {

        SuperAdmin s1= new SuperAdmin();
        s1.login();
        s1.AccessAdminPanel();
        s1.shutDownSystem();
    }
}
class user{
    void login(){
        System.out.println("UserLogin");
    }
}
class AdminUser extends user{

    void AccessAdminPanel(){
        System.out.println("User can accses admin panel");
    }
}
class SuperAdmin extends AdminUser{
    void shutDownSystem(){
        System.out.println("System shut down ");
    }
}