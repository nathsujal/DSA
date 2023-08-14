package searchingAlgos.BinarySearch2D;

public class Search2dArray2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        boolean found = searchMatrix(arr, 20);
        System.out.println(found);

        int[][] arr2 = { { 1 } };
        boolean found2 = searchMatrix(arr2, 1);
        System.out.println(found2);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int maxRow = matrix[0].length - 1;
        int maxCol = matrix[0].length - 1;

        for (int row = 0; row <= maxRow; row++) {
            // checks if the row can have the target elment or not
            if (matrix[row][0] <= target && matrix[row][maxCol] >= target) {
                // if the row can have the target element
                // binary search is performed on the row
                boolean found = binarySearch(matrix[row], target);
                if (found == true) {
                    // if the element is found -> true is returned
                    return found;
                }
                // esle next row will be checked for target
            }
        }

        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
