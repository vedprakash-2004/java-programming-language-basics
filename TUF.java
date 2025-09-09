public class TUF {

    public static void printlinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 16;

        printlinearSearch(arr, key);
    }
}