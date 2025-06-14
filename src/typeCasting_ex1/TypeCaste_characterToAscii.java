package typeCasting_ex1;

import java.sql.SQLOutput;

import static java.lang.System.out;

public class TypeCaste_characterToAscii {
    //Program 6: Character to ASCII
    //Description: Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.
    public static void main(String[] args) {
        //Charater to ascii
        char ch = 'A';
        int Value = (int)ch;
        System.out.println("Value of character: "+ch);
        System.out.println("Ascii value: "+Value);
        out.println();

        out.println("-----------------------------------------");
        //Ascii to character
        int A= 98;
        char c = (char)A;
        System.out.println("Value of int: "+A);
        System.out.println("character value: "+c);

    }
}
