package recursion.Problems.Easy;

import java.util.*;

public class SumTriangleFromArray {
    /*
     * Given an array of integers, print a sum triangle from it such that the first
     * level has all array elements. From then, at each level number of elements is
     * one less than the previous level and elements at the level is be the Sum of
     * consecutive two elements in the previous level.
     * 
     * Input : A = {1, 2, 3, 4, 5}
     * Output :
     * [48]
     * [20, 28]
     * [8, 12, 16]
     * [3, 5, 7, 9]
     * [1, 2, 3, 4, 5]
     * 
     * Article Link:
     * https://www.geeksforgeeks.org/sum-triangle-from-array/
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/sum-triangle-for-given-array1159/
     * 1
     */

    private static long sizeOfTriangle;
    private static long[] sumTriangle;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        long n = in.nextInt();
        long[] arr = new long[(int) n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        sizeOfTriangle = (long) ((n / 2.0) * (1 + n));
        sumTriangle = new long[(int) sizeOfTriangle];
        System.out.println(Arrays.toString(getTriangle(arr, n)));
        in.close();
    }

    public static long[] getTriangle(long arr[], long n) {
        long sizeOfOriginalArray = (long) ((-1) + Math.sqrt(1 + (8 * sizeOfTriangle))) / 2;
        if (arr.length == 1) {
            sumTriangle[0] = arr[0];
            return sumTriangle;
        }
        int rowNo = (int) sizeOfOriginalArray - ((int) sizeOfOriginalArray - arr.length);
        long[] aboveRow = new long[rowNo - 1];
        for (int i = 0; i < (int) n - 1; i++) {
            aboveRow[i] = arr[i] + arr[i + 1];
        }
        getTriangle(aboveRow, rowNo - 1);
        int index = (int) ((rowNo / 2.0) * (rowNo + 1)) - arr.length;
        for (int i = 0; i <= rowNo - 1; i++) {
            sumTriangle[index + i] = arr[i];
        }
        return sumTriangle;
    }
}
