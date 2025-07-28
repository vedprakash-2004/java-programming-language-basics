import java.util.*;

public class javaBasics {
    // public static void printHelloWorld() {
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // return;
    // }

    // public static void calculateSum() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("sum is :" + sum);
    // }

    // public static int multiply(int a, int b) {
    // int product = a * b;
    // return product;
    // }

    // public static int factorial(int n) {
    // int f = 1;

    // for (int i = 1; i <= n; i++) {
    // f = f * i;
    // }
    // return f;
    // }

    // public static int binCoeff(int n, int r) {
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nmr = factorial(n - r);

    // int binCoeff = fact_n / (fact_r * fact_nmr);
    // return binCoeff;
    // }

    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // // func to calc sum of 3 nums

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    public static float sum(int a, int b) {
        return a + b;
    }

    // func to cal float sum

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));

    }
}