package DataStructureJava.PatternQuestion;

//Lec 5: Homework Question 1

import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            for (int j = n + 1; j <= 2 * n; j++) {
                if (j <= 2 * n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}