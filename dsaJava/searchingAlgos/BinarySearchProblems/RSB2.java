package searchingAlgos.BinarySearchProblems;

import java.util.Scanner;
import java.util.Arrays;

public class RSB2 {
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
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

        if (index > 0) {
            System.out.println(target + " in " + Arrays.toString(arr) + " is at " + index + "index.");
        } else {
            System.out.println(target + " isn't found in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[0] <= arr[mid]) {
                // left part of the array is in ascending order
                if (target >= arr[0] && target <= arr[mid]) {
                    // target lies between 0th elmnt and mid elmnt
                    // arr[0] <= target <= arr[mid]
                    end = mid - 1;
                } else {
                    // target lies between n-1th elmnt and mid elmnt
                    // arr[mid] <= target <= arr[arr.length - 1]
                    start = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[arr.length - 1]) {
                    // target lies between mid elmnt and last elmnt
                    // arr[mid] <= target <= arr[arr.length - 1]
                    start = mid + 1;
                } else {
                    // target lies between 0th elmnt and mid elmnt
                    // arr[0] <= target <= arr[mid]
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
