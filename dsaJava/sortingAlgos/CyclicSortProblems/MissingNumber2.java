package sortingAlgos.CyclicSortProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber2 {
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
        // taking the sum from 1 to nums.length(the largest element possible in the
        // array)
        // neglecting 0, bcz its presence wont matter in addition
        int sumRange = (int) (((float) (nums.length) / 2) * (float) (1 + nums.length));

        // taking the sum of the elments of the array
        int sumArr = 0;
        for (int val : nums) {
            sumArr += val;
        }

        // the missingNumber = sum of the range - sum of the elments of the array
        int missingNumber = sumRange - sumArr;
        return missingNumber;
    }
}
