package DataStructureJava.PatternQuestion;

// Lec 5: Homework Question 3

import java.util.*;

public class PalindromicPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(n - j + 1);
                }
                System.out.print(" ");
            }
            for (int j = n + 1; j < 2 * n; j++) {
                if (j <= n + i) {
                    System.out.print(j - n + 1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
