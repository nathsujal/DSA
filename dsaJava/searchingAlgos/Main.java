package searchingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n, target;

        // System.out.print("Enter the size of the array: ");
        // n = in.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter the elments of the array:");
        // for (int i = 0; i < n; i++) {
        // arr[i] = in.nextInt();
        // }

        // System.out.print("target: ");
        // target = in.nextInt();

        // int index = interpolationSearch(arr, target);

        // if (index > 0) {
        // System.out.println(target + " in " + Arrays.toString(arr) + " is at index " +
        // index);
        // } else {
        // System.out.println(target + " isn't present in " + Arrays.toString(arr));
        // }

        // in.close();

        Scanner in = new Scanner(System.in);
        int n, m;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elments of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the size of the pattern: ");
        m = in.nextInt();

        int[] pattern = new int[m];
        System.out.println("Enter the elments of the pattern:");
        for (int i = 0; i < m; i++) {
            pattern[i] = in.nextInt();
        }

        int patternFound = patternSearch(arr, pattern);
        if (patternFound > 0) {
            System.out
                    .println(Arrays.toString(pattern) + " is present in " + Arrays.toString(arr));
        } else {
            System.out.println(Arrays.toString(pattern) + " isn't present in " + Arrays.toString(arr));
        }
    }

    // Linear Search
    public static int LinearSearch(int[] arr, int num) {
        /*
         * checks for a number in an array
         * return the index if num is present, else returns -1
         */

        // traversing the whole array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) { // checking the element of the array
                return i;
            }
        }
        // returning -1 if the num doesn't exist in the array
        return -1;
    }

    public static int BinarySearch(int[] arr, int num) {
        /*
         * checks for a number in an array
         * return the index if num is present, else returns -1
         */

        int start = 0;
        int end = arr.length - 1;

        // checks the sorted order of the array
        boolean isAsc = arr[start] < arr[start + 1];

        while (start <= end) {
            // int mid = (start + end) / 2;
            // if start and end are very numbers then (start + end) will be a very huge
            // number -> long

            // better way to find mid
            int mid = start + (end - start) / 2;

            if (isAsc) { // if the array is sortd in ascending order
                if (arr[mid] == num)
                    return mid;
                else if (arr[mid] > num)
                    // search for num in the left part of the array
                    end = mid - 1;
                else if (arr[mid] < num)
                    // search for num in the right part of the array
                    start = mid + 1;
            } else { // if the array is sorted in descending order
                if (arr[mid] == num)
                    return mid;
                else if (arr[mid] > num)
                    // search for num in the right part of the array
                    start = mid + 1;
                else if (arr[mid] < num)
                    // search for num in the left part of the array
                    end = mid - 1;
            }
        }

        // in case where num doesn't exist in the array
        return -1;
    }

    public static int jumpSearch(int[] arr, int target) {
        int jumpSize = 3;
        int low = 0;
        int high = low + jumpSize;

        while (high <= arr.length) {
            if (arr[high] == target) {
                return high;
            } else if (arr[high] > target) {
                // if arr[high] > target => searching for target in arr[low] <-> arr[high] range
                return searchForJumpSearch(arr, target, low, high);
            } else {
                // if arr[high] < target => jumping to the next search window
                low = high;
                high = low + jumpSize;
            }
        }

        // if high went above arr.length and some elements still needs to checked in
        // between arr[low] <-> arr[n-1] => updating high
        // and searching for target in the range
        high = arr.length - 1;
        if (arr[high] == target) {
            return high;
        } else if (arr[high] > target) {
            return searchForJumpSearch(arr, target, low, high);
        }
        return -1;
    }

    public static int searchForJumpSearch(int[] arr, int target, int start, int end) {
        // binary search applied for searching in the search window
        // in jump search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int maxPos = high;
        int pos = 0;

        while (pos <= maxPos) {
            // if pos > maxPos => the target doesn't exist in the array

            // applying the formula for interpolation search
            pos = low + ((target - arr[low]) / (arr[high] - arr[low])) * (high - low);
            // if the array doesn't has uniformly distributed values => no of steps of
            // finding the pos will increase
            // else it will only take 1 step

            if (arr[pos] == target) {
                // if target is at pos => return pos
                return pos;
            } else if (arr[pos] < target) {
                // target may lie in the right part to the pos
                // update low and re-check for target
                low = pos + 1;
            } else {
                // target may lie in the left part to the pos
                // update high and re-check for target
                high = pos - 1;
                maxPos = high;
            }
        }

        return -1;
    }

    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            // loop will run until i < arr.length
            // and arr[i] <= target
            // arr[i] > target => target may be in the array in after arr[i]

            // increasing the pointer the exponentially
            i = i * 2;
        }
        // previous value of i = i/2, as i is being updated by twice everytime
        // so, start = i/2
        // and end = arr.length - 1
        return searchForExponentialSearch(arr, target, i / 2, arr.length - 1);
    }

    public static int searchForExponentialSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int patternSearch(int[] arr, int[] pattern) {
        // KMP Algorithm
        // Pattern Search Algorithm

        // brute force approach
        // take two pointers one for arr, another for pattern
        // compare arr[p1] and pattern[p2]
        // under a while loop with condition (p2 < pattern.length)
        // if arr[p1] == pattern[p2] => increment p1 and p2
        // else if arr[p1] != pattern[p2] => increment p1 and make p2 = 0
        //
        // after the end of the loop
        // if p2 == pattern.lenght - 1 => return true
        // else return false

        // optimised approach

        // taking two pointers, one for arr and another for pattern
        int p1 = 0, p2 = 0;
        while (p1 < arr.length) {
            // if p1 >= arr.length => loop will end because end of arr has been reached by
            // that
            if (arr[p1] == pattern[p2]) {
                // if both the pointers are pointing to the same value
                // incrementing both of them
                p1++;
                p2++;
            } else {
                // else, p1 will stay constant
                // till p1 and p2 points to the same value
                // in this process p2 will be decremented
                // till it reaches 0 or it points to the same value as p1
                // after that p1 is incremented
                while (arr[p1] != pattern[p2] && p2 > 0) {
                    p2--;
                }
                p1++;
            }
        }
        if (p2 == pattern.length) {
            // pattern exist in the array
            return p1;
        }
        return -1; // pattern doesn't exist
    }
}
