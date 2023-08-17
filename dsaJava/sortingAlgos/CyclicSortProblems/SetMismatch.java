package sortingAlgos.CyclicSortProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {

    // https://leetcode.com/problems/set-mismatch/

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
        System.out.printf("sorted array: %s\n", Arrays.toString(findErrorNums(arr)));

        in.close();
    }

    public static int[] findErrorNums(int[] nums) {
        /*
         * Pseudocode:
         * 
         * sort the array using cycle sort => as elemnts range from [1, n]
         * traverse through the array
         * check where, element != index - 1
         * return {element, index + 1}
         * 
         * element => value which was repeated
         * index + 1 => value which was missed
         */

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for the missing number in the sorted array
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}