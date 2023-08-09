package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(2);

        // adding elements to the list
        list.add(67);
        list.add(13);
        list.add(52);
        list.add(66);
        list.add(98);

        System.out.println(list.contains(13)); // checking if the arrayList contains the element or not
        System.out.println(list.contains(33));

        list.set(0, 99); // updating the value at a specific index in the arrayList

        System.out.println(list);

        list.remove(2); // removing an element from the arrayList

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        // input
        for (int i = 0; i < 5; i++) {
            list2.add(in.nextInt());
        }

        System.out.print("list2: ");
        // get item at an index
        for (int i = 0; i < 5; i++) {
            System.out.print(list2.get(i) + " "); // pass index here
        }
    }
}
