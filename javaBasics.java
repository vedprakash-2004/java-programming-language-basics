import java.util.*;

public class javaBasics {

    public static void printSubarrays(int numbers[]) {
        ArrayList<Integer> sums = new ArrayList<>(); // sums store karne ke liye

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0; // reset per subarray

                for (int k = start; k <= end; k++) {
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " "); // subarray print
                }
                System.out.println(" -> Sum: " + sum);

                sums.add(sum); // subarray sum store
            }
            System.out.println();
        }

        // ab array mein convert karte hain
        int[] sumArray = new int[sums.size()];
        for (int i = 0; i < sums.size(); i++) {
            sumArray[i] = sums.get(i);
        }

        // max aur min nikalte hain
        int max = sumArray[0], min = sumArray[0];
        for (int i = 1; i < sumArray.length; i++) {
            if (sumArray[i] > max)
                max = sumArray[i];
            if (sumArray[i] < min)
                min = sumArray[i];
        }

        // yaha pe fully-qualified Arrays use karo
        System.out.println("All Subarray Sums: " + java.util.Arrays.toString(sumArray));
        System.out.println("Maximum Sum: " + max);
        System.out.println("Minimum Sum: " + min);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}
