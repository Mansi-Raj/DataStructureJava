package DataStructureJava.PatternQuestion;

// Question 9

import java.util.*;

import javax.swing.text.Style;

public class BinaryLeftAlignTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
