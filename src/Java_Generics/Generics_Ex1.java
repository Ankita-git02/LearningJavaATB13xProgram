package Java_Generics;

public class Generics_Ex1 {
    public static void main(String[] args) {

                int res1=  sum(10, 20);
                System.out.println(res1);
        System.out.println(sum(210.4, 33.5));
        System.out.println(sum("ankita", "Bhujbal"));

            }

            //here if we want to do sum for different datatypes we use Different functions
            // so, for this to make as single function we use Generics
            static int sum(int a, int b) {
                return a + b;
            }

            static double sum(double a, double b) {
                return a + b;
            }

            static String sum(String a, String b) {
                return a + b;
            }
        }
