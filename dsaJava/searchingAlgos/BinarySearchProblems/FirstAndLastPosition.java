package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {
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

        int[] position = searchRange(arr, target);

        System.out.println(Arrays.toString(position));
        in.close();
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] position = new int[2];
        position[0] = search(nums, target, true);
        position[1] = search(nums, target, false);

        return position;
    }

    public static int search(int[] nums, int target, boolean fPositionSearch) {
        int position = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                if (fPositionSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                position = mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return position;
    }
}
