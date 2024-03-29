package DataStructureJava.PatternQuestion;

// Lec 6: Homework Question 3

import java.util.*;

public class PascalTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int a = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a = a * (i - j) / (j + 1);
            }
            System.err.println();
        }
        sc.close();
    }
}
