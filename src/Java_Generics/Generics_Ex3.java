package Java_Generics;

public class Generics_Ex3 {
    public static void main(String[] args) {
        GenericClass g= new GenericClass(10);
        GenericClass g1= new GenericClass("Ankuta");
        System.out.println(g.getData());
        System.out.println(g1.getData());
    }
}
class GenericClass <T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;

    }
}
