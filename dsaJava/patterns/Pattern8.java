package patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.println("\nPattern 8\n");
        pattern8(rows);
        in.close();
    }

    static void pattern8(int rows) {
        for (int _row = 1; _row <= rows; _row++) {
            // no of spaces in each row
            int noOfSpaces = rows - _row;
            // no of stars in each row
            // int noOfStars = _row * 2 - 1;

            // thus no of cols in each row = noOfSpaces + noOfStars
            for (int _col = 1; _col <= rows + _row - 1; _col++) {
                if (_col <= noOfSpaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
