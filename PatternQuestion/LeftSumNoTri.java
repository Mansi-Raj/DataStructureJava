package DataStructureJava.PatternQuestion;

// Lec 5: Question 8

import java.util.*;

public class LeftSumNoTri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
    }
}
