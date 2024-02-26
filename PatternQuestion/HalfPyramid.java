package DataStructureJava.PatternQuestion;

//Lec 6: Homework Question 4

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
