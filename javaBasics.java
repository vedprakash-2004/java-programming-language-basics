import java.util.*;

public class javaBasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int num; // To hold number

        int fact = 1; // To hold factorial

        System.out.println("Enter any positive intereger:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial: " + fact);

    }
}