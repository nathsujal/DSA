package recursion.Problems.Easy;

import java.util.*;

class Pair {
    // customised class given in question
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class MinAndMaxInArray {
    /*
     * Given an array of integers arr, the task is to find the minimum and maximum
     * element of that array using recursion.
     * 
     * Input: arr = {1, 4, 3, -5, -4, 8, 6};
     * Output: min = -5, max = 8
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        long n = in.nextInt();
        long[] arr = new long[(int) n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("\nSearching for min and max\n");
        Pair product = getMinMax(arr, n);
        System.out.printf("Min = %d\n", product.first);
        System.out.printf("Max = %d\n", product.second);
        in.close();
    }

    static long max;
    static long min;

    static Pair getMinMax(long a[], long n) {
        if (n == a.length) {
            max = a[(int) n - 1];
            min = a[(int) n - 2];
            if (max < min) {
                long temp = min;
                max = min;
                min = temp;
            }
        }
        if (a[(int) n - 1] > max) {
            max = a[(int) n - 1];
        }
        if (a[(int) n - 1] < min) {
            min = a[(int) n - 1];
        }
        Pair ans = new Pair(min, max);
        if (n == 1) {
            return ans;
        }
        return getMinMax(a, n - 1);
    }
}
