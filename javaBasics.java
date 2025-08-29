import java.util.Scanner;

public class javaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int a, int b) {
        int Sum = a + b;
        return Sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Sum = calculateSum(A, B);
        System.out.println("sum is :" + Sum);
    }
}