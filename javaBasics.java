import java.util.*;

public class javaBasics {

    public static void main(String[] args) {
        int A = 1;
        int B = 6;
        int c = 3;

        if (A >= B) {
            System.out.println("A is largest");
        } else if (c > A && c >= B) {
            System.out.println("C is largest");
        } else {
            System.out.println("B is largest");
        }
    }

}