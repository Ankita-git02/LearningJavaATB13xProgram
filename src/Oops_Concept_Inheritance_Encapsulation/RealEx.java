package Oops_Concept_Inheritance_Encapsulation;

public class RealEx {
    public static void main(String[] args) {
    ICICIBank Ic= new ICICIBank("Ankita", 200);
        System.out.println(Ic.getBalance());
        System.out.println("===========================");
        Ic.setBalance(300,true);
        System.out.println(Ic.getBalance());
    }
}
class ICICIBank{

   private String Name;
    private long balance;



    public ICICIBank(String Name, long balance){
        this.Name= Name;
        this.balance= balance;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance,boolean isCashier) {
        if(isCashier){
            this.balance = balance;

        }else{
            System.out.println("Not allowed to chanfe");
        }
    }
}
