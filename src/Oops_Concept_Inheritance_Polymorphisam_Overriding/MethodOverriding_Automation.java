package Oops_Concept_Inheritance_Polymorphisam_Overriding;

public class MethodOverriding_Automation {
    public static void main(String[] args) {
        CommonToall c1=new CommonToall();
        c1.OpenBrowser();
        ChromeTc c2=new ChromeTc();
        c2.OpenBrowser();
        FireFox f1= new FireFox();
        f1.OpenBrowser();
    }


}

class CommonToall{

    void OpenBrowser(){
        System.out.println("Starting IE Browser");
    }
}
class ChromeTc extends CommonToall{

    void OpenBrowser(){
        System.out.println("Starting ChormeBrowser");
    }
}
class FireFox extends CommonToall{
    void OpenBrowser(){
        System.out.println("Starting FireFoxDriver");
    }
}