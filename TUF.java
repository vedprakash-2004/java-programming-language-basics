public class TUF {

    public static void largestNumber(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int nums[] = { 20, 2, 6, 3, 8 };
        largestNumber(nums);
    }
}