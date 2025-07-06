package Oops_Concept_Inheritance_Polymorphisam_Overloading;

public class WebAutomation {
    public static void main(String[] args) {

        Browser b1= new Browser();
        b1.StartBrowser();
        b1.StartBrowser("Chrome");
    }
}
class Browser{
    void StartBrowser(){
        System.out.println("Starting browser");
    }
    String StartBrowser(String browser){
        System.out.println("starting browser "+browser);
        return browser;

    }

}