import java.util.Scanner;

public class javaBasics {
    // public static void printHelloWorld() {
    // System.out.println("Hello World");
    // System.out.println("Hello World");

    // }

    // public static int calculateSum(int a, int b) {// parameters or formal

    // int Sum = a + b;
    // return Sum;

    // }

    // public static void swap(int a, int b) {
    // // swap
    // int temp = a;
    // a = b;
    // b = temp;

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
    // return f; // factorial of n
    // }

    // public static int binCoeff(int n, int r) {
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nmr = factorial(n - r);

    // int binCoeff = fact_n / (fact_r * fact_nmr);
    // return binCoeff;
    // }

    // // // func to calc sum of 2 nums
    // // public static int sum(int a, int b) {
    // // return a + b;
    // // }

    // // // func ot calc sum of 3 nums

    // // public static int sum(int a, int b, int c) {
    // // return a + b + c;
    // // }

    // // func to cal int sum
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // // func to cal float sum
    // public static float sum(float a, float b) {
    // return a + b;
    // }

    // public static boolean isprime(int n) {

    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) { // completely dividing
    // return false;
    // }
    // }
    // return true;
    // }

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {// true
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }

    public static void pattern() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of" + myNum + " = " + binNum);
    }

    public static void invHal(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void ZOtra(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }

    public static void ButtFl(int n) {
        for (int i = 1; i <= n; i++) {
            // stars - i

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int k = 2 * (n - i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void Solid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Hol(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void diaMond(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {

                System.out.print("*");

            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void Nup(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void ppN(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // decending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ppN(7);
    }
}
