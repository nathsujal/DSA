package recursion;

import java.util.Scanner;

public class countZeroes {
    static int count0 = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int noOfZeroes = count0s(num);
        System.out.printf("No. of zeroes in %d are %d.\n", num, noOfZeroes);
        in.close();
    }

    public static int count0s(int num) {
        if (num == 0) {
            // end condition
            return count0;
        }

        if (num % 10 == 0) {
            count0++;
        }
        return count0s(num / 10);
    }
}
