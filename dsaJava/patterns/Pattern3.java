package patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.println("\nPattern 3\n");
        pattern3(rows);
        in.close();
    }

    static void pattern3(int rows) {
        for (int _row = 1; _row <= rows; _row++) {
            for (int _col = rows - _row; _col > 0; _col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
