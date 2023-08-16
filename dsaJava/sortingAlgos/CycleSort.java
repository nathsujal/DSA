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
        for (int i = 0; i < arr.length - 1; i++) {
            while (i != arr[i] - 1) {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
