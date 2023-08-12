package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elments of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int index = peak(arr);

        if (index > 0) {
            System.out.println("Peak element in " + Arrays.toString(arr) + " is " + arr[index]);
        } else {
            System.out.println("Peak element isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int peak(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(arr[mid]);

            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
