package sortingAlgos.CyclicSortProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.printf("array: %s\n", Arrays.toString(arr));
        System.out.printf("Missing Number: %d\n", firstMissingNumber(arr));

        in.close();
    }

    public static int firstMissingNumber(int[] arr) {
        /*
         * Pseudocode:
         * 
         * Sort the array
         * -> while sorting, ignore -ve elements and elements > arr.length
         * After sorting
         * Iterate the array
         * if arr[index] != index + 1 => 1st missing number is (index + 1)
         * return (index + 1);
         */

        // sorting the array
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // ignoring -ve elements and elements > arr.length
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // iterating the array, and searching the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
