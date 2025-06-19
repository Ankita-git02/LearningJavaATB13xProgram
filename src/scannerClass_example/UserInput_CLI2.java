package scannerClass_example;

public class UserInput_CLI2 {
    public static void main(String[] args) {
        String age1= args[0];
        int age = Integer.parseInt(age1);
        String CanVote= age>=18? "Can vote":"Cannot Vote";
        System.out.println(CanVote);

    }
}
