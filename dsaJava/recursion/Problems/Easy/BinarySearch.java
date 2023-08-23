package recursion.Problems.Easy;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int[] arr = new int[(int) n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("target: ");
        int target = in.nextInt();
        System.out.println("\nSearching for min and max\n");
        int index = search(arr, target);
        System.out.printf("%d in %s is at %d.\n", target, Arrays.toString(arr), index);
        in.close();
    }

    public static int search(int[] nums, int target) {
        int indexOfTarget = binarySearch(nums, target, 0, nums.length - 1);

        return indexOfTarget;
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
