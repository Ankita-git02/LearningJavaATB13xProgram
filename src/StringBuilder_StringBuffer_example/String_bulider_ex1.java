package StringBuilder_StringBuffer_example;

public class String_bulider_ex1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Ankita ");
        sb.append("Bhujbal");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.delete(3,5));//delete the sunstring
        System.out.println(sb.replace(3,6,"AAA"));

    }
}
