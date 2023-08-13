package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInMountainArray {

    // https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, num;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elments of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the number: ");
        num = in.nextInt();

        int index = findInMountainArray(arr, num);

        if (index > 0) {
            System.out.println(num + " in " + Arrays.toString(arr) + " is at index " + index);
        } else {
            System.out.println(num + " isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int findInMountainArray(int[] mountainArr, int target) {
        // Spliting the array across the peak element
        int peakIndex = peak(mountainArr);
        // finding the index of the target in the left part
        int ans = binarySearch(target, mountainArr, 0, peakIndex, true);
        if (ans == -1) {
            // if the target doesn't exist in the left part
            // we will look for it in the right part
            ans = binarySearch(target, mountainArr, peakIndex + 1, mountainArr.length - 1, false);
        }

        return ans;
    }

    public static int binarySearch(int target, int[] mountainArr, int start, int end, boolean isAscPart) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] == target) {
                return mid;
            }
            if (isAscPart) {
                // when asked to search in the left part of the array
                if (mountainArr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // when asked to search in the right part of the array
                if (mountainArr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

    public static int peak(int[] mountainArr) {
        int start = 0, end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                // we are in the descending part of the array
                // check in the left side
                // arr[mid] may be the peak element, thus end = mid
                end = mid;
            } else {
                // we are in the ascending part of the array
                // check in the right side
                // arr[mid] < arr[mid- 1] thus it is not the peak element, thus start = mid + 1
                start = mid + 1;
            }
        }
        // start equls end, at the peak elment
        // thus condition for the breaking of the loop is (start == end)
        // i.e., the while loop will run till start < end
        // atlast returning start -> as the peak index
        // at the end of the loop, start and end points to the peak element
        return start;
    }

}
