package sortingAlgos;

import java.util.*;

public class BubbleSort {
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
        bubbleSort(arr);
        System.out.printf("sorted array: %s\n", Arrays.toString(arr));

        in.close();
    }

    public static void bubbleSort(int[] arr) {
        int i = 0;
        boolean swapped = false;
        while (i <= arr.length - 1) {
            // the array will be passed for (n-1)times
            for (int j = 0; j < arr.length - i - 1; j++) {
                // at the end of ith passing
                // the largest element will be at the desired position
                // sorting the arr til n-i-1 elments => bcz after that the elements were sorted
                if (arr[j] > arr[j + 1]) {
                    // if arr[j] > arr[j+1] => swap them
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // if for a particular i, swap didn't happened
            // array is already sorted
            if (swapped == false) {
                return;
            }

            // updating the counter i
            i++;
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
