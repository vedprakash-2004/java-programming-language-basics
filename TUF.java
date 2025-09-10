public class TUF {

    public static void reverse(int nums[]) {
        int first = 0, last = nums.length - 1;

        while (first < last) {
            // swap
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8 };
        reverse(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}