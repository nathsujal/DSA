package patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.println("\nPattern 13\n");
        pattern13(rows);
        in.close();
    }

    static void pattern13(int rows) {
        for (int _row = 1; _row <= rows; _row++) {
            // no of spaces in each row
            int noOfSpaces = rows - _row;
            int noOfStars = _row * 2 - 1;
            int spaceInBetween = noOfStars - 3;
            // updated no of stars according to the question
            noOfStars = 2;
            for (int _col = 1; _col <= rows; _col++) {
                if (_row == rows) {
                    System.out.print("**");
                } else if (_col <= noOfSpaces) {
                    System.out.print(" ");
                } else if (noOfStars > 0) {
                    System.out.print("* ");
                    for (int i = spaceInBetween; i > 0; i--) {
                        System.out.print(" ");
                    }
                    spaceInBetween = 0;
                    noOfStars--;
                }
            }
            System.out.println();
        }
    }
}
