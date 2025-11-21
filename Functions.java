public class Functions {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bioCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bioCoefficient = fact_n / (fact_r * fact_nmr);
        return bioCoefficient;
    }

    public static int natSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    // public static boolean isPrime(int n) {
    // if (n == 2) {
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // check if a number is Prime or not (optimized way)

    public static boolean isPrime(int n) {
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

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Reverse the number

    // public static void main(String args[]) {
    // int n = -1059;
    // int rev = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // rev = (rev * 10) + lastDigit;
    // n = n / 10;
    // }
    // System.out.println(rev);
    // }

    // public static void main(String args[]) {
    // int n = -1059;
    // int rev = 0;
    // int sign = (n < 0) ? -1 : 1; // store sign
    // n = Math.abs(n); // make number positive

    // while (n > 0) {
    // int lastDigit = n % 10;
    // rev = (rev * 10) + lastDigit;
    // n = n / 10;
    // }

    // rev = rev * sign; // restore sign
    // System.out.println(rev);
    // }



    // conver from binary to decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0; 
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit + (int)Math.Pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    // convert from decimal to binary
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
        System.out.println("binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(7);
    }
}