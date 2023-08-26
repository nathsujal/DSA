package recursion;

import java.util.Scanner;

public class SkipString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("str: ");
        String str = in.next();
        System.out.println(skipApple(str));
        in.close();
    }

    public static String skipApple(String str) {
        if (str == "") {
            return "";
        }
        char ch = str.charAt(0);
        if (str.startsWith("apple")) {
            // skip apple
            return skipApple(str.substring(("apple").length()));
        }
        return ch + skipApple(str.substring(1));
    }
}
