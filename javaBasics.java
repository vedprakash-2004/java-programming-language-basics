import java.util.*;

public class javaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is :" + sum);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a*b = " + prod);
    }
}