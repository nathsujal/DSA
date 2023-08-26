package recursion;

public class Pattern2 {

    // Pattern
    //
    // *
    // * *
    // * * *
    // * * * *

    public static void main(String[] args) {
        pattern2(1, 0);
    }

    public static void pattern2(int row, int col) {
        if (row > 4) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            pattern2(row, col + 1);
        } else {
            System.out.println();
            pattern2(row + 1, 0);
        }
    }
}
