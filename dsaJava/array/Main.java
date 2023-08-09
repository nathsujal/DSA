package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // syntax of array
        // datatype[] variable_name = new datatype[size];
        // datatype[] variable_name = {n, m, p, q, ...};
        int[] arr1 = new int[5];
        arr1[0] = 3;
        arr1[1] = 2;
        arr1[2] = 4;
        arr1[3] = 5;
        arr1[4] = 6;
        int[] arr2 = { 2, 59, 32, 9, 1 };

        int[] arr3; // declaration of array. arr3 is getting defined in the stack
        arr3 = new int[5]; // initailization: actually here object of arr3 is being created in the heap

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = in.nextInt();
        }

        System.out.print("arr3: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("arr3: " + Arrays.toString(arr3));

        in.close();
    }
}
