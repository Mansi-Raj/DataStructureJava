package DataStructureJava.PatternQuestion;

//Lec 6: Homework Question 5

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
        sc.close();
    }
}
