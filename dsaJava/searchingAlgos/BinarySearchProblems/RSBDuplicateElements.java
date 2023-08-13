package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RSBDuplicateElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, target;
        System.out.println("Rotated Binary Search\n\n");
        System.out.print("size of the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("target: ");
        target = in.nextInt();
        int index = search(arr, target);

        if (index >= 0) {
            System.out.println(target + " in " + Arrays.toString(arr) + " is at " + index + "index.");
        } else {
            System.out.println(target + " isn't found in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int search(int[] arr, int target) {
        int pivot = pivotWithDuplicates(arr);
        int ans = -1;
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] > target) {
            // checking if the target < arr[pivot] = max elment
            if (target >= arr[0]) {
                return binarySearch(arr, target, 0, pivot - 1);
            } else {
                return binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
        } else if (arr[pivot] == target) {
            // checking if the target == arr[pivot]
            return pivot;
        }
        return ans; // return -1 if not found

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid != 0 && arr[mid - 1] == arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int pivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // condition for getting the pivot point in the array
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            // if elements at start, mid, end are equal -> skip the duplicates
            if (arr[start] == arr[mid] && arr[start] == arr[mid]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivots
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot
                if (arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be at right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                // check for pivot in the right part of the array
                start = mid + 1;
            } else {
                // check for pivot in the left part of the array
                end = mid - 1;
            }
        }

        return -1;
    }
}
