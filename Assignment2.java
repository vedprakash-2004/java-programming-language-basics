public class Assignment2 {
    public static int ArrNum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { 1 };
        int target = 0;
        System.out.println(ArrNum(nums, target));
    }
}
