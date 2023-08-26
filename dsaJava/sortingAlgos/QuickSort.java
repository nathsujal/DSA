package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
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
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        in.close();
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            // putting the pivot at its correct position
            // in the sorted array
            while (arr[s] < pivot) {
                System.out.println(s + " " + e);
                s++;
            }
            while (arr[e] > pivot) {
                System.out.println(s + " " + e);
                e--;
            }
            if (s <= e) {
                // if arr[s] > pivot and arr[e] < pivot
                // i.e., if elements are not in their correct pst
                // swap them with each other
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // after we kept the pivot at its correct index
        // e < s
        // i.e., in the array
        // low, e, pivot, s, high => order
        // thus left part = arr[low] to arr[e]
        // and right part = arr[s] to arr[high]

        // now my pivot is at correct index, sorting the two halves
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

}
