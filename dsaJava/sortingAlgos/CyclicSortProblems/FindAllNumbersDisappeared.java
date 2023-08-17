package sortingAlgos.CyclicSortProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersDisappeared {
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
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
        System.out.printf("Missing Number: %s\n", findDisappearedNumbers(arr));

        in.close();
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // given an array of Integers
        // with elements in the range [1, n]
        // find all the dissapeared elements in the array
        List<Integer> dissapearedNumbers = new ArrayList<Integer>();

        // sort the array first
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // if nums[correctIndex] == nums[i] => nums[i] is the duplicate of
            // nums[correctIndex]
            // by now, nums[correctIndex] is at its correct position
            // so ignore nums[i] => move to the next element
            if ((nums[correctIndex] != nums[i]) && (nums[i] != i + 1)) {
                // it will place an element at its correct position
                swap(nums, i, correctIndex);
            } else {
                // if nums[correctIndex] == nums[i] => i.e., duplicate element
                // then here nums[correctIndex] already has been at its correct position
                // ignore the duplicate element
                i++;
            }
        }

        // traverse the array
        for (int index = 0; index < nums.length; index++) {
            // if any index doesn't have a number it should have
            // i.e., if index != nums[index] - 1 => missing number = index
            // add the missing number in the array list
            if (nums[index] != index + 1) {
                dissapearedNumbers.add(index + 1);
            }
        }

        return dissapearedNumbers;
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
