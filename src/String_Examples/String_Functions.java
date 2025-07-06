package String_Examples;

public class String_Functions {
    public static void main(String[] args) {
        String s1="Ankita";
        String s2="Ankita";//String constat pool=1

        String s3= new String("Ankita"); //OA=3
        String s4= new String("ankita");
        String s5= new String("Ankita");

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s4==s5);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s4));


    }
}
