public class TUF {

    public static void selectionSort(int nums[]) {

        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;

                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;

        }

    }

    public static void printArr(int nums[]) {
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        selectionSort(nums);
        printArr(nums);

    }
}