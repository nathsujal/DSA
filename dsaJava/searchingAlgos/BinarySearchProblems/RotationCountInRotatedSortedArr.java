package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RotationCountInRotatedSortedArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Rotated Binary Search\n\n");
        System.out.print("size of the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int noOfRotation = countRotation(arr);
        System.out.println("No of rotation of " + Arrays.toString(arr) + " is : " + noOfRotation);

        in.close();
    }

    public static int countRotation(int[] arr) {
        // getting the pivot of the array
        int pivot = pivot(arr);
        int noOfRotation = 0;
        if (pivot != -1) {
            // pivot != -1, if the array is rotated
            // hence if pivot == -1, rotation didn't happened

            // noOfRotation = end - pivot = (arr.length - 1) - pivot;
            // noOfRotation = pivot + 1;
            noOfRotation = pivot + 1;
        }

        return noOfRotation;
    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // condition for getting the pivot point in the array
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                // check for the pivot point in the left part of the array
                end = mid - 1;
            } else {
                // check for the pivot point in the right part of the array
                start = mid + 1;
            }
        }

        return -1;
    }
}
