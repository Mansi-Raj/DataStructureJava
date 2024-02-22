package DataStructureJava.PatternQuestion;

//Lec 6: Homework Question 2

import java.util.*;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" " + " ");
            }
            if (i == 1 || i == rows) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    if (j == 1 || j == rows) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}