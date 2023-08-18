package patterns;

import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.print("cols: ");
        int cols = in.nextInt();
        System.out.println("\nPattern 1\n");
        pattern1(rows, cols);
        in.close();
    }

    static void pattern1(int rows, int cols) {
        for (int _row = 1; _row <= rows; _row++) {
            for (int _col = 1; _col <= cols; _col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
