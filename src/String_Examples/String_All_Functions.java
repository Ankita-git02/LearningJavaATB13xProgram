package String_Examples;

public class String_All_Functions {
    public static void main(String[] args) {
        String name= "Ankita";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.concat("  Bhujbal"));
        System.out.println(name.contains("nk"));
        System.out.println(name.equals("Ankita"));
        System.out.println(name.equalsIgnoreCase("ANKITA"));
        System.out.println(name.indexOf('A'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.replace('k','R'));
        //Split
//        String name1="ankitabhujbal@com@123";
//        String[] splitname1= name1.split("@");
//        System.out.println();


        System.out.println(name.substring(1,3));
        System.out.println(name.toLowerCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("a"));
    }
}
