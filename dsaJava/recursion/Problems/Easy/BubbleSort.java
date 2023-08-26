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
        recursiveBubbleSort(arr, n - 1, 0);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        in.close();
    }

    public static void recursiveBubbleSort(int arr[], int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            recursiveBubbleSort(arr, r, c + 1);
        } else {
            recursiveBubbleSort(arr, r - 1, 0);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
