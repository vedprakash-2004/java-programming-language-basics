import java.util.Arrays;

public class DividenConquer {

    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void mergeSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // // kaam
    // int mid = si + (ei - si) / 2;
    // mergeSort(arr, si, mid);
    // mergeSort(arr, mid + 1, ei);
    // merge(arr, si, mid, ei);
    // }

    // public static void merge(int arr[], int si, int mid, int ei) {
    // int temp[] = new int[ei - si + 1];
    // int i = si;
    // int j = mid + 1;
    // int k = 0;

    // while (i <= mid && j <= ei) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;
    // k++;
    // } else {
    // temp[k] = arr[j];
    // k++;
    // j++;

    // }

    // }
    // // left part
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }
    // // right part
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }

    // // copy temp to original arr
    // for (k = 0, i = si; k < temp.length; k++, i++) {
    // arr[i] = temp[k];
    // }

    // }

    // public static void quickSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // // last element
    // int pIdx = partition(arr, si, ei);
    // quickSort(arr, si, pIdx - 1);// left
    // quickSort(arr, pIdx + 1, ei);// right

    // }

    // public static int partition(int arr[], int si, int ei) {
    // int pivot = arr[ei];
    // int i = si - 1; // to make place for els smaller than pivot

    // for (int j = si; j < ei; j++) {
    // if (arr[j] <= pivot) {
    // i++;
    // // swap
    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // }
    // }
    // i++;
    // int temp = pivot;
    // arr[ei] = arr[i];
    // arr[i] = temp;
    // return i;
    // }

    public static void SorArr(int nums[], int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.print(i);
            }

        }

    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        SorArr(nums, target);

    }
}