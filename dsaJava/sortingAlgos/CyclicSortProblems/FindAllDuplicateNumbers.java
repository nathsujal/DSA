package sortingAlgos.CyclicSortProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllDuplicateNumbers {

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/

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
        System.out.printf("Missing Number: %s\n", findDuplicates(arr));

        in.close();
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> duplicates = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                duplicates.add(nums[index]);
            }
        }

        return duplicates;
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
