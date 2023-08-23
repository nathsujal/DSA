package recursion.Problems.Easy;

import java.util.*;

public class SortedArray {
    /*
     * Program to check if an array is sorted or not
     * 
     * article link:
     * https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-
     * recursive/
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
     * 
     * Problem:
     * Given an array arr[] of size N, check if it is sorted in non-decreasing order
     * or not.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        boolean sorted = isSorted(arr, n);
        System.out.println(sorted);
        in.close();
    }

    public static boolean isSorted(int[] arr, int n) {
        if (n == 1) {
            return true;
        }
        if (arr[n - 2] > arr[n - 1]) {
            return false;
        }
        return isSorted(arr, n - 1);
    }
}
