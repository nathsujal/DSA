package patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.println("\nPattern 12\n");
        pattern11(rows);
        in.close();
    }

    static void pattern11(int rows) {
        for (int _row = 1; _row <= rows; _row++) {
            // no of spaces in each row
            int noOfSpaces = _row - 1;
            for (int _col = 1; _col <= rows; _col++) {
                if (_col <= noOfSpaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int _row = 1; _row <= rows; _row++) {
            // no of spaces in each row
            int noOfSpaces = rows - _row;
            for (int _col = 1; _col <= rows; _col++) {
                if (_col <= noOfSpaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
