package searchingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, num;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elments of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the number: ");
        num = in.nextInt();

        int index = BinarySearch(arr, num);

        if (index > 0) {
            System.out.println(num + " in " + Arrays.toString(arr) + " is at index " + index);
        } else {
            System.out.println(num + " isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    // Linear Search
    public static int LinearSearch(int[] arr, int num) {
        /*
         * checks for a number in an array
         * return the index if num is present, else returns -1
         */

        // traversing the whole array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) { // checking the element of the array
                return i;
            }
        }
        // returning -1 if the num doesn't exist in the array
        return -1;
    }

    public static int BinarySearch(int[] arr, int num) {
        /*
         * checks for a number in an array
         * return the index if num is present, else returns -1
         */

        int start = 0;
        int end = arr.length - 1;

        // checks the sorted order of the array
        boolean isAsc = arr[start] < arr[start + 1];

        while (start <= end) {
            // int mid = (start + end) / 2;
            // if start and end are very numbers then (start + end) will be a very huge
            // number -> long

            // better way to find mid
            int mid = start + (end - start) / 2;

            if (isAsc) { // if the array is sortd in ascending order
                if (arr[mid] == num)
                    return mid;
                else if (arr[mid] > num)
                    // search for num in the left part of the array
                    end = mid - 1;
                else if (arr[mid] < num)
                    // search for num in the right part of the array
                    start = mid + 1;
            } else { // if the array is sorted in descending order
                if (arr[mid] == num)
                    return mid;
                else if (arr[mid] > num)
                    // search for num in the right part of the array
                    start = mid + 1;
                else if (arr[mid] < num)
                    // search for num in the left part of the array
                    end = mid - 1;
            }
        }

        // in case where num doesn't exist in the array
        return -1;
    }
}
