package DataStructureJava.PatternQuestion;

//Lec 5:  Question 5

import java.util.*;

public class RightTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.printf(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
