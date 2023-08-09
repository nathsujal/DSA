package array;

import java.util.Arrays;

public class MultiDimensionalArrray {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        int[][] arr1 = new int[3][3];

        int[][] arr2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // specifying column size is not mandatory
        int[][] arr3 = {
                { 1, 2 }, // 0th index
                { 3, 4, 5, 6 }, // 1st index
                { 7, 8, 9 } // 2nd index
        };

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
