package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        insertionSort(arr);
        System.out.printf("sorted array: %s\n", Arrays.toString(arr));

        in.close();
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("i: " + i);
            int j = i + 1;
            while (j > 0) {
                System.out.printf("j = %d ", j);
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
                j--;
            }
            System.out.println();
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
