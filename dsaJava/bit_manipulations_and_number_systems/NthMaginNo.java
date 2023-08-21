package bit_manipulations_and_number_systems;

import java.util.*;

public class NthMaginNo {
    /*
     * Find the nth majic number.
     * ________5^3___5^2___5^1
     * for n=1_ 0 ___ 0 ___ 1 ___ => 5
     * for n=2_ 0 ___ 1 ___ 0 ___ => 25
     * for n=3_ 0 ___ 1 ___ 1 ___ => 30 (25 + 5)
     * for n=4_ 1 ___ 0 ___ 0 ___ => 125
     * for n=5_ 1 ___ 0 ___ 1 ___ => 130 (125 + 5)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.printf("%d-th magic number is %d.\n", n, magicNum(n));
        in.close();
    }

    public static int magicNum(int n) {
        int magicNum = 0;
        for (int i = 1; i <= 8; i++) {
            // getting the last bit, n & 1
            int last_bit = n & 1;
            // eliminating the current last bit, n = n >> 1
            n = n >> 1;
            magicNum += last_bit * pow(5, i);
        }

        return magicNum;
    }

    public static int pow(int num, int p) {
        if (p == 0) {
            return 1;
        }
        return num * pow(num, p - 1);
    }
}
