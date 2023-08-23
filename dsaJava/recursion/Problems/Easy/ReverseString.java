package recursion.Problems.Easy;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of characters: ");
        int n = in.nextInt();
        char[] arr = new char[n];
        System.out.print("Char array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.next().charAt(0);
        }
        System.out.printf("Original Array: %s\n", Arrays.toString(arr));
        reverseString(arr);
        System.out.printf("Reversed Array: %s\n", Arrays.toString(arr));
        in.close();
    }

    public static void reverseString(char[] s) {
        swap(s, 0, s.length - 1);
    }

    public static void swap(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        swap(s, start + 1, end - 1);
    }
}
