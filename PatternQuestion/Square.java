package DataStructureJava.PatternQuestion;

//Lec 5: Question 1

import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("*" + " ");
            }
            System.out.println();
        }
    }
}