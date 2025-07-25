import java.util.*;

public class javaBasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { // n is multiple of i (i not equal to 1 or n)
                if (n % i == 0) {
                    isPrime = false;
                }

                if (isPrime == true) {
                    System.out.println("n is prime");
                } else {
                    System.out.println("n is not prime");
                }
            }
        }

    }
}