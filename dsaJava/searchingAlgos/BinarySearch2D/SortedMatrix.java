package searchingAlgos.BinarySearch2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 90;
        System.out.println(Arrays.toString(search(matrix, target)));

        int[][] matrix2 = {
                { 1 },
                { 2 },
                { 3 }
        };
        int target2 = 3;
        System.out.println(Arrays.toString(search(matrix2, target2)));
    }

    public static int[] search(int[][] matrix, int target) {
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;

        if (maxRow == 1) {
            return binarySearch(matrix, 0, target, 0, maxCol - 1);
        }

        int colMid = maxCol / 2;

        int rowStart = 0;
        int rowEnd = maxRow - 1;
        while (rowStart < (rowEnd - 1)) {
            // rowStart < (rowEnd - 1) -> this condition will be true till #rows > 2
            // if #rows == 2 -> loop must end
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[rowMid][colMid] == target) {
                return new int[] { rowMid, colMid };
            } else if (matrix[rowMid][colMid] > target) {
                rowEnd = rowMid;
            } else {
                rowStart = rowMid;
            }
        }

        // now we have 2 rows
        // check whether the target is in the col of 2 rows
        if (matrix[rowStart][colMid] == target) {
            return new int[] { rowStart, colMid };
        } else if (matrix[rowEnd][colMid] == target) {
            return new int[] { rowEnd, colMid };
        }
        // otherwise, search in 1st half
        if (colMid - 1 <= maxCol - 1 && target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, target, 0, colMid - 1);
        }
        // search in 2nd half
        else if (colMid - 1 <= maxCol - 1 && target <= matrix[rowEnd][colMid - 1]) {
            return binarySearch(matrix, rowEnd, target, 0, colMid - 1);
        }
        // search in 3rd half
        else if (colMid + 1 <= maxCol && target >= matrix[rowStart][colMid + 1]
                && target <= matrix[rowStart][maxCol - 1]) {
            return binarySearch(matrix, rowStart, target, colMid + 1, maxCol - 1);
        }
        // search in 4th half
        else if (colMid + 1 <= maxCol && target >= matrix[rowEnd][colMid + 1] && target <= matrix[rowEnd][maxCol - 1]) {
            return binarySearch(matrix, rowEnd, target, colMid + 1, maxCol - 1);
        }

        return new int[] { -1, -1 };
    }

    public static int[] binarySearch(int[][] matrix, int row, int target, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cMid] == target) {
                return new int[] { row, cMid };
            } else if (matrix[row][cMid] > target) {
                cEnd = cMid - 1;
            } else {
                cStart = cMid + 1;
            }
        }

        return new int[] { -1, -1 };
    }
}
