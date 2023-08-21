package bit_manipulations_and_number_systems;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Enter the powe: ");
        int pow = in.nextInt();
        int aPowerb = pow(num, pow);
        System.out.printf("%d power %d is %d\n", num, pow, aPowerb);
        in.close();
    }

    public static int pow(int a, int b) {
        int base = a;
        while (b > 0) {
            int lastBit = b & 1;
            if (lastBit == 1) {
                base = base * base;
            }
            b = b >> 1;
        }
        int aPowerb = base;
        return aPowerb;
    }
}
