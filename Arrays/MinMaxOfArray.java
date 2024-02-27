package DataStructureJava.Arrays;

//Lec 10: e.g: 1

import java.util.*;

public class MinMaxOfArray {

    public int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        MinMaxOfArray m = new MinMaxOfArray();
        System.out.print("Min: " + m.min(a) + "\n" + "Max: " + m.max(a));
        s.close();
    }
}
