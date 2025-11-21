
// ***** THIS CODE IS VERY IMPORTANT OF MTE *****

// ++++++++find the maximum and minimum element  in Array+++++++
// import java.util.*;

// public class Aarrays {
//     public static void getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("MAXIMUM value is:" + largest);
//         System.out.println("MINIMUM value is:" + smallest);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 6, 3, 5 };
//         getLargest(numbers);

//     }

// }

// ++++++Reverse an Array++++++

public class Aarrays {

    public static void Reverse(int numbers[]) {
        int j = numbers.length - 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            // swap
            if (j > i) {
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;

            }
            j--;

        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        Reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

// +++++++++Function to find Kth smallest element+++++++++++
// import java.util.*;

// public class Aarrays {

// public static int findKthSmallest(int[] arr, int k) {
// Arrays.sort(arr); // sort in ascending order
// return arr[k - 1]; // kth smallest element (index = k-1)
// }

// public static int findKthLargest(int[] arr, int k) {
// Arrays.sort(arr); // sort in ascending order
// return arr[arr.length - k]; // kth largest element (from end)
// }

// public static void main(String[] args) {
// int[] numbers = { 7, 10, 4, 3, 20, 15 };
// int k = 2; // change value of k to test

// int kthSmallest = findKthSmallest(numbers.clone(), k);
// int kthLargest = findKthLargest(numbers.clone(), k);

// System.out.println(k + "rd Smallest Element is: " + kthSmallest);
// System.out.println(k + "rd Largest Element is: " + kthLargest);
// }
// }

// LinearSearch

// public class Aarrays {

// public static int linearSearch(int num[], int key) {
// for (int i = 0; i < num.length; i++) {
// if (num[i] == key) {
// return i;
// }
// }
// return -1;

// }

// public static void main(String[] args) {
// int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
// int key = 16;
// System.out.println(linearSearch(num, key));
// }
// }

// BinarySearch

// public class Aarrays {

// public static int BinarySearch(int numbers[], int key) {
// int start = 0, end = numbers.length - 1;

// while (start <= end) {
// int mid = (start + end) / 2;

// if (numbers[mid] == key) {
// return mid;
// }
// if (numbers[mid] < key) {
// start = mid + 1;
// } else {
// end = mid - 1;
// }
// }
// return -1;

// }

// public static void main(String args[]) {
// int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
// int key = 10;
// System.out.println("index for key is:" + BinarySearch(numbers, key));
// }
// }

// public class Aarrays {
// public static void sort012(int[] arr) {
// int low = 0, mid = 0, high = arr.length - 1;

// while (mid <= high) {
// if (arr[mid] == 0) {
// int temp = arr[low];
// arr[low] = arr[mid];
// arr[mid] = temp;
// low++;
// mid++;
// } else if (arr[mid] == 1) {
// mid++;
// } else { // arr[mid] == 2
// int temp = arr[mid];
// arr[mid] = arr[high];
// arr[high] = temp;
// high--;
// }
// }
// }

// public static void main(String[] args) {
// int[] arr = { 2, 0, 1, 2, 1, 0, 0, 1 };

// sort012(arr);

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// public class Aarrays {
// public static void main(String[] args) {
// int[] arr = { 0, 1, 0, 3, 12 };
// int j = 0;

// // Move non-zero elements forward
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] != 0) {
// arr[j++] = arr[i];
// }
// }

// // Fill remaining positions with 0
// while (j < arr.length) {
// arr[j++] = 0;
// }

// // Print the result
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// public class Aarrays {

// public static void findMaximum(int arr[]) {
// int maximum = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] > maximum) {
// maximum = arr[i];
// }
// }
// System.out.println("This is maximum number of the Array => " + maximum);

// }

// public static void main(String[] args) {
// int arr[] = { 2, 4, 8, 9, 4, 5, 1 };
// findMaximum(arr);
// }
// }

// import java.util.Arrays;

// public class Aarrays {

// public static int findKthSmallest(int arr[], int k) {
// Arrays.sort(arr);
// return arr[k - 1];

// }

// public static void main(String[] args) {
// int arr[] = { 2, 4, 9, 0, 5, 4 };
// int k = 3;

// int smallest = findKthSmallest(arr.clone(), k);
// System.out.println(smallest);

// }
// }