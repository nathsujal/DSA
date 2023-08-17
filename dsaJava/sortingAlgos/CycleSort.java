package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
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
        cycleSort(arr);
        System.out.printf("sorted array: %s\n", Arrays.toString(arr));

        in.close();
    }

    public static void cycleSort(int[] arr) {
        /*
         * elements of the array range from [0, n-1]
         * index = element
         */
        int index = 0;
        while (index < arr.length) {
            // correct index of arr[index] is arr[index]
            // if elements = [0, n-1] => index = element
            // if elements = [1, n] => index = element - 1
            int correctIndex = arr[index];
            if (arr[index] != arr[correctIndex]) {
                // if arr[index] is not at its correct index
                // swap it with the element at its correct index
                swap(arr, index, correctIndex);
            } else {
                // else, move to next index
                index++;
            }
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
