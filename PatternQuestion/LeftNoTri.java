package DataStructureJava.PatternQuestion;

//Lec 5:  Question 6

import java.util.*;

public class LeftNoTri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
