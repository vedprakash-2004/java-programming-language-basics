import java.util.*;
//Largest Number in Array

public class Arrays {

    public static int getLargest(int numbers[]) {
        int Largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;// infinity

        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];

            }
        }
        System.out.println("smallest value is :" + smallest);
        return Largest;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("largest value is :" + getLargest(numbers));

    }
}