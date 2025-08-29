
import java.util.*;

public class RemDup {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;

        int i = 0; // pointer for unique elements
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int newLength = removeDuplicates(arr);

        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
