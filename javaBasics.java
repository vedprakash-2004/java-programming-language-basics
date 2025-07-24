import java.util.*;

public class javaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double A = sc.nextDouble();

        if (A >= 103.5) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }

}