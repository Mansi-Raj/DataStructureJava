package DataStructureJava.Arrays;

//Lec 10: e.g 3

import java.util.*;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        boolean sorted = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                sorted = true;
            }
        }
        if (sorted) {
            System.out.print("Sorted");
        } else {
            System.out.print("Not sorted");
        }
        s.close();
    }
}
