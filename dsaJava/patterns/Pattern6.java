package patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.println("\nPattern 6\n");
        pattern6(rows);
        in.close();
    }

    static void pattern6(int rows) {
        for (int _row = 1; _row <= rows; _row++) {
            // no of spaces in each row
            int spaces = rows - _row;
            for (int _col = 1; _col <= rows; _col++) {
                if (_col <= spaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
