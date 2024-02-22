package DataStructureJava.PatternQuestion;

//Lec 6: Homework Question1

import java.util.*;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == i || j == 2 * n - i - 1 || j == 0 || j == 2 * n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == i || j == 2 * n - i - 1 || j == 0 || j == 2 * n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        s.close();
    }
}
