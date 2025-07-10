package Java_Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic_List_Ex {
    public static void main(String[] args) {
        List normalList= new ArrayList<>();
        normalList .add(10);
        normalList.add("Ankita");
        normalList.add(true);
        normalList.add(10.4);

        List<Integer> IntergerList= new ArrayList();
        IntergerList.add(10);
        //IntergerList.add("Ankita");   Not able to add string becase Here we hardcore As Integer
    }
}
