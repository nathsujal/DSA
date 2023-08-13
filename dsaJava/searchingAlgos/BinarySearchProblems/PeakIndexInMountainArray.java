package searchingAlgos.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elments of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int index = peak(arr);

        if (index > 0) {
            System.out.println("Peak element in " + Arrays.toString(arr) + " is " + arr[index]);
        } else {
            System.out.println("Peak element isn't present in " + Arrays.toString(arr));
        }

        in.close();
    }

    public static int peak(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                // we are in the descending part of the array
                // check in the left side
                // arr[mid] may be the peak element, thus end = mid
                end = mid;
            } else{
                // we are in the ascending part of the array
                // check in the right side
                // arr[mid] < arr[mid- 1] thus it is not the peak element, thus start = mid + 1
                start = mid + 1;
            }
        }
        // start equls end, at the peak elment
        // thus condition for the breaking of the loop is (start == end)
        // i.e., the while loop will run till start < end
        // atlast returning start -> as the peak index
        // at the end of the loop, start and end points to the peak element
        return start;
    }
}
