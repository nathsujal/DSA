package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.println("\nPattern 2\n");
        pattern2(rows);
        in.close();
    }

    static void pattern2(int rows) {
        for (int _row = 1; _row <= rows; _row++) {
            for (int _col = 1; _col <= _row; _col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
