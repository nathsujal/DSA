package searchingAlgos.BinarySearch2D;

public class Search2dArray1 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        boolean found = searchMatrix(arr, 13);
        System.out.println(found);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int maxRow = matrix.length - 1;
        int row = 0, col = matrix[0].length - 1;
        while (row <= maxRow && col >= 0) {
            System.out.println(row + " " + col);
            int element = matrix[row][col];
            if (element == target) {
                return true;
            } else if (element > target) {
                // eliminate the column
                col--;
            } else {
                // eleiminate the row
                row++;
            }
        }

        return false;
    }
}
