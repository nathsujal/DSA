package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        recursiveSelectionSort(arr, n, 0, 0);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        in.close();
    }

    /*
     * In selection sort
     * -> we find the max element in the array
     * -> swap it with the element at the last index of the array
     * -> take a part of the array (expect the last index)
     * -> go to step 1 and continue till you end up with no elements left for
     * sorting
     */

    public static void recursiveSelectionSort(int[] arr, int r, int c, int maxIndex) {
        if (r == 0) {
            // the soritng is completed
            return;
        }
        if (c < r) {
            // identifying the max element to the end of the current array
            if (arr[c] > arr[maxIndex]) {
                // checking for the maxIndex
                // if arr[c] > max element
                // maxIndex = c
                recursiveSelectionSort(arr, r, c + 1, c);
            } else {
                // checking the max element with the next element of the array
                recursiveSelectionSort(arr, r, c + 1, maxIndex);
            }
        } else {
            // putting the max element at the end of the current array
            // in the current array (r - 1) is the last index
            // so swapping max element with element at (r - 1)
            swap(arr, maxIndex, r - 1);
            // going for the next sub-array
            recursiveSelectionSort(arr, r - 1, 0, 0);
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
