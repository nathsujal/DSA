package sortingAlgos.CyclicSortProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber1 {
    // https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.printf("array: %s\n", Arrays.toString(arr));
        System.out.printf("Missing Number: %d\n", missingNumber(arr));

        in.close();
    }

    public static int missingNumber(int[] nums) {
        // as the elments are in the range of 0 to n
        // using cycle sort to sort the array
        int i = 0;
        while (i < nums.length) {
            // if nums[i] == nums.length => ignore it
            // because it doesn't has a place in the sorted array
            if (nums[i] < nums.length && nums[i] != i) {
                // in the sorted array, here index = element
                // as elemnts range from 0 to n
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        // search for the missing number in the sorted array
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // case 2
        return nums.length;
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
