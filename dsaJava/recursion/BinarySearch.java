package recursion;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("target: ");
        int target = in.nextInt();

        int targetIndex = binarySearch(arr, target, 0, n - 1);
        System.out.printf("\nIndex of %d: %d\n", target, targetIndex);

        in.close();
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            // search in the left half
            return binarySearch(arr, target, start, mid - 1);
        }
        // search in the right half
        return binarySearch(arr, target, mid + 1, end);
    }
}
