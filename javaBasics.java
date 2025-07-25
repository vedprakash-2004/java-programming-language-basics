import java.util.*;

public class javaBasics {

    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

    }

    public static void main(String[] args) {
        printMultiplicationTable(5);
    }
}