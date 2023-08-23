package recursion.Problems.Easy;

import java.util.*;

public class BubbleSort {

    /*
     * Recursive Bubble Sort
     * 
     * article link:
     * https://www.geeksforgeeks.org/recursive-bubble-sort/
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/bubble-sort/1
     * 
     * Problem:
     * Given an Integer N and a list arr. Sort the array using bubble sort
     * algorithm.
     * 
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
        recursiveBubbleSort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        in.close();
    }

    public static void recursiveBubbleSort(int arr[], int n) {
        if (n == 1) {
            // end condition
            // i.e., one element is left to sort
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        recursiveBubbleSort(arr, n - 1);
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
