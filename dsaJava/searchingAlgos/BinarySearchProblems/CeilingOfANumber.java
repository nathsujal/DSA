package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfANumber {
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

        int ceiling = ceiling(arr, target);

        if (ceiling > 0) {
            System.out.println("Ceiling of " + target + " in " + Arrays.toString(arr) + " is " + arr[ceiling]);
        } else {
            System.out.println("Ceiling of " + target + " isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int ceiling(int[] arr, int target) {
        /*
         * Ceiling: smallest number greater than equal to target
         */
        int start = 0, end = arr.length - 1;
        if (arr[end] < target)
            //
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

        return start;
    }
}
