package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        selectionSort(arr);
        System.out.printf("sorted array: %s\n", Arrays.toString(arr));

        in.close();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = maxIndex(arr, end);
            swap(arr, end, maxIndex);
        }
    }

    public static int maxIndex(int[] arr, int endIndex) {
        int index = 0;
        for (int i = 0; i <= endIndex; i++) {
            if (arr[i] >= arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] arr, int endIndex, int maxIndex) {
        int temp = arr[endIndex];
        arr[endIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
