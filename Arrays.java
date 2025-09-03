import java.util.*;

public class Arrays {

    public static void printSubarrays(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int sum = 0;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) { // print
                    sum = (sum + numbers[k]);
                    System.out.print(numbers[k] + " ");// subarray

                }
                System.out.println();

            }
            System.out.println();
            System.out.println("sum of all numbers :" + sum);

        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}