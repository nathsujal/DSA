package recursion.Problems.Easy;

import java.util.*;

public class UpperCase {
    /*
     * Given a string find its first uppercase letter
     * 
     * Input : geeksforgeeKs
     * Output : K
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(firstUppercase(str, 0));
        in.close();
    }

    public static int firstUppercase(String str, int n) {
        if (n == str.length()) {
            return n - 1;
        }
        char c = str.charAt(n);
        if (c >= 'A' && c <= 'Z') {
            return n;
        }
        return firstUppercase(str, n + 1);
    }
}
