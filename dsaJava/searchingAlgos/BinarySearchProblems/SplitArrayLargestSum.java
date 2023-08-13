package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k;
        System.out.println("Rotated Binary Search\n\n");
        System.out.print("size of the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("k: ");
        k = in.nextInt();

        System.out.println("Minimised largest sum of the split is " + minSum(arr, k));

        in.close();
    }

    public static int minSum(int[] arr, int k) {
        int[] ansRange = minAndMaxAns(arr);

        int start = ansRange[0];
        int end = ansRange[1];

        while (start < end) {
            int mid = start + (end - start) / 2;
            int pieces = split(arr, mid);
            System.out.println(start + " " + end + " " + mid + " " + pieces);

            if (pieces <= k) {
                // sum needs to decrease
                // thus, end = mid
                end = mid;
            } else if (pieces > k) {
                // sum needs to increase
                // thus, start = mid + 1
                start = mid + 1;
            }
        }
        return start;
    }

    public static int split(int[] arr, int maxSum) {
        int pieces = 0;
        int sum = 0;
        System.out.print("Sum: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                System.out.print(sum + " ");
                pieces++;
                sum = 0;
            }
        }
        System.out.println();
        return pieces;
    }

    public static int[] minAndMaxAns(int[] arr) {
        int[] ans = new int[2];
        int maxElement = arr[0];
        int sumOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElements += arr[i];
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        ans[0] = maxElement;
        ans[1] = sumOfElements;
        return ans;
    }
}
