package Oops_Concept_Inheritance_Encapsulation;

public class Encapsulation_Ex {
    public static void main(String[] args) {
        VWOLogin vw= new VWOLogin("Admin@123", "Admin");
        System.out.println(vw.username);
        System.out.println(vw.Password);
        System.out.println("----------------------------------------------");
        GoodLogin gl= new GoodLogin("AdminLogin","Admin@177");
       // System.out.println(gl.username);- cannot access platform due to vairibale is private
        System.out.println(gl.getUsername());
       System.out.println(gl.getPassword());
        System.out.println("------------------------------------------------");
        gl.setPassword("Abc@123",true);
        System.out.println(gl.getPassword());

    }
}

class VWOLogin{
    public String username;
    public String Password;

    public VWOLogin(String password,String username){
        this.username= username;
        this.Password=password;

    }
}
//Good Login

class GoodLogin{
   private String username;
    private String Password;

    GoodLogin(String username,String Password){
        this.username=username;
        this.Password=Password;
    }
//Getter Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin){
            this.Password = password;
        }else {
            System.out.println("Cant change the password");
        }
    //return password;
    }
}
