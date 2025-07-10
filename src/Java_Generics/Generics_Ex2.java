package Java_Generics;

public class Generics_Ex2 {
    public static void main(String[] args) {
      display(10,5);
      display("Ank","Bhuj");
      display(12.4,34.6,34.4);

    }
    static <T> T display(T a,T b,T c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return null;
    }

    //insted of T we can use anytging<r><y>

    static <T> void display(T a, T b){
        System.out.println(a);
        System.out.println(b);
    }
}

