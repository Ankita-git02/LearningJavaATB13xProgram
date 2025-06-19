package swichCase_ex;

public class Switchcase_multiplematchEx4 {
    public static void main(String[] args) {
        int ItemCode=003;
        switch (ItemCode){
            case 001,002,003:
                System.out.println("Match1");
                break;
            case 004,005,006:
                System.out.println("Match2");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
