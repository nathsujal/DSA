package sortingAlgos.CyclicSortProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersDisappeared2 {

    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1023946468/

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
        // as the elments are in the range of 1 to n
        // using cycle sort to sort the array

        List<Integer> dissapearedNumbers = new ArrayList<Integer>();

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // the if condition also takes care of the duplicate values
            if (nums[i] != nums[correctIndex]) {
                // in the sorted array, here index = element - 1
                // as elemnts range from 1 to n
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for the missing number in the sorted array
        for (int index = 0; index < nums.length; index++) {
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
