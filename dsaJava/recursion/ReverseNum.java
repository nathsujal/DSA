package recursion;

import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int r_num = rNum(num);
        System.out.println(r_num);
        in.close();
    }

    public static String reverseNum(int num) {
        if (num == 0) {
            return "";
        }

        int lastDigit = num % 10;
        num = num / 10;

        return lastDigit + "" + reverseNum(num);
    }

    public static int rNum(int num) {
        if (num == 0) {
            // end condition
            return 0;
        }
        int last_digit = num % 10;
        num = num / 10;
        int initialDigit;
        if (num == 0) {
            // as incase when num == 0
            // Math.log(0) == -infinity
            // so Math.pow(10, -infinity) -> 0
            // thus initialDigit -> 0
            // to correct it
            // we make initialDigit = last_digit, directly
            initialDigit = last_digit;
        } else {
            initialDigit = last_digit * (int) Math.pow(10, (int) Math.log10(num) + 1);
        }
        return initialDigit + rNum(num);
    }
}
