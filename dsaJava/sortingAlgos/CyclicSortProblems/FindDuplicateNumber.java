package sortingAlgos.CyclicSortProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateNumber {

    // https://leetcode.com/problems/find-the-duplicate-number/

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
        System.out.printf("Duplicate Number: %d\n", findDuplicate(arr));

        in.close();
    }

    public static int findDuplicate(int[] nums) {
        /*
         * Pseudocode:
         * 
         * while sorting the array
         * check if the elment is at its correct position
         * i.e., if element != index + 1,
         * --> again check if nums[i] != nums[correctIndex]
         * --> i.e., if the elment has duplicate value or not
         * --> bcz, if it does then by now the original element should be at its correct
         * position
         * --> and tecnically the original and duplicate element belong to the same
         * position
         * --> so if nums[i] != nums[correctIndex] => swap the element
         * 
         * --> else if, nums[i] == nums[correctIndex] => then nums[i] is the duplicate
         * of nums[correctIndex]
         * --> so, return nums[correctIndex]
         * 
         * else if, the element == i + 1 => the element is at its correct position =>
         * move ahead
         */

        int i = 0;
        while (i < nums.length) {
            // checking if the element is at its correct position
            // if not, then we will swap it with the element at its correct position
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    // if nums[i] != nums[correctIndex] => place nums[i] at its correct position
                    swap(nums, i, correctIndex);
                } else {
                    // if nums[i] == nums[correctIndex] => nums[i] is the duplicate element in the
                    // array
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return nums.length;
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
