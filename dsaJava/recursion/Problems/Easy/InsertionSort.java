package recursion.Problems.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    /*
     * Recursive Insertion Sort
     * 
     * article link:
     * https://www.geeksforgeeks.org/recursive-insertion-sort/
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/insertion-sort/1
     * 
     * Problem:
     * The task is to complete the insert() function which is used to implement
     * Insertion Sort.
     */
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
        recursiveInsertionSort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        in.close();
    }

    public static void recursiveInsertionSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        recursiveInsertionSort(arr, n - 1);
        // index of the element, whose position is being corrected
        int lastIndex = n - 1;
        int j = n - 2; // index before last
        while (j >= 0 && arr[j] > arr[lastIndex]) {
            swap(arr, j, lastIndex);
            j--;
            lastIndex--;
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
