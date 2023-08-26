package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int[] arr = new int[(int) n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        in.close();
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0;
        int[] arr = new int[left.length + right.length];
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }
        return arr;
    }

    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mergedArr = new int[end - start];
        int i = start, j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mergedArr[k] = arr[i];
                i++;
            } else {
                mergedArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mergedArr[k] = arr[i];
            k++;
            i++;
        }
        while (j < end) {
            mergedArr[k] = arr[j];
            k++;
            j++;
        }

        // putting the value of mergedArr into the real array
        // basically, putting the elements of the given array in sorted manner
        for (int l = 0; l < mergedArr.length; l++) {
            arr[start + l] = mergedArr[l];
        }
    }
}
