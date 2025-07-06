package String_Examples;

public class String_Immutable_ex1 {
    public static void main(String[] args) {
        //string constant pool
        String name= "Ankita";
       String uppercase= name.toUpperCase();
        System.out.println(uppercase);

        //Object area
        String s1= "Anku";
        String s2= new String("Anku");

        System.out.println(s1);
        System.out.println(s2);

        String s3="Ankita";
        String concat= s3.concat("Bhujbal");
        System.out.println(concat);

    }
}
