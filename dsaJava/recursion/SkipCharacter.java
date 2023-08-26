package recursion;

import java.util.Scanner;

public class SkipCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("str: ");
        String str = in.next();
        System.out.println(skip(str));
        in.close();
    }

    public static String skip(String str) {
        if (str == "") {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip(str.substring(1));
        }
        return ch + skip(str.substring(1));
    }
}
