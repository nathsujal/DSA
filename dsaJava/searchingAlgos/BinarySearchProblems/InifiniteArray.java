package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class InifiniteArray {
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

        int index = Search(arr, num);

        if (index > 0) {
            System.out.println(num + " in " + Arrays.toString(arr) + " is at index " + index);
        } else {
            System.out.println(num + " isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int Search(int[] arr, int target) {
        /*
         * checks for a number in an array
         * return the index if target is present, else returns -1
         */

        // initial box will be of size 2
        int start = 0;
        int end = 1;

        // finding the range of the box
        while (target > arr[end]) {
            // newStart = end + 1
            // boxSize = end - size + 1
            // end = end + boxSize*2
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;

            // start = newStart for the BinarySearch
            start = newStart;
        }

        return BinarySearch(arr, target, start, end);
    }

    public static int BinarySearch(int[] arr, int num, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                // search for num in the left part of the array
                end = mid - 1;
            } else if (arr[mid] < num) {
                // search for num in the right part of the array
                start = mid + 1;
            }
        }

        return -1;
    }
}
