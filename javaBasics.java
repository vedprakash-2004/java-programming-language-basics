import java.util.*;

public class javaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }

}