package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, target;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elments of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the number: ");
        target = in.nextInt();

        int floor = floor(arr, target);

        if (floor > 0) {
            System.out.println("Floor of " + target + " in " + Arrays.toString(arr) + " is " + arr[floor]);
        } else {
            System.out.println("Floor of " + target + " isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int floor(int[] arr, int target) {
        /*
         * Floor: greatest number less than equal to target
         */

        int start = 0, end = arr.length - 1;
        if (arr[start] > target)
            return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                // check in left array
                end = mid - 1;
            else if (arr[mid] < target)
                // check in right array
                start = mid + 1;
        }

        return end;
    }
}
