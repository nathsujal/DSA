package recursion.Problems.Easy;

import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("string: ");
        String str = in.next();
        powerSet(str, 0, 1);
        in.close();
    }

    public static void powerSet(String str, int s, int e) {
        if (s == str.length()) {
            return;
        }
        if (e <= str.length()) {
            System.out.print(str.substring(s, e) + " ");
            powerSet(str, s, e + 1);
        } else {
            powerSet(str, s + 1, s + 2);
        }
    }
}
