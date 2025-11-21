import java.util.*;

public class Assignment {
    public static boolean ConPrint(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8 };

        Assignment obj = new Assignment(); // create object
        System.out.println(obj.ConPrint(numbers));
    }
}
