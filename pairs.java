import java.util.*;

public class pairs {

    public static void subarrayPrint(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarrayPrint(numbers);
    }
}