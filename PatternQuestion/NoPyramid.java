package DataStructureJava.PatternQuestion;

// Lec 5: Homework Question 2

import java.util.*;

public class NoPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
