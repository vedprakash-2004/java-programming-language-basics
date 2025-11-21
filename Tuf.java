import java.util.Arrays;

public class Tuf {

    public static int MissinNum(int nums[]) {
        for (int i = 0; i <= nums.length; i++) {
            Arrays.sort(nums);
            if (nums[i] != i) {
                return i;

            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int nums[] = { 3, 0, 2 };
        int j = MissinNum(nums);
        System.out.println(j);
    }
}