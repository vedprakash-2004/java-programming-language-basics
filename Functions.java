import java.util.*;

public class Functions {
    public static void printHelloworld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculatorSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is :" + sum);
    }

    public static void main(String[] args) {
        calculatorSum();
    }
}
