package com.hackerrank.gradingStudents;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int g = sc.nextInt();
            if (g < 38) {
                System.out.println(g);
            } else {
                System.out.println(round(g));
            }

        }
    }

    private static int round(int g) {
        int whole = g/5;
        int extra = g%5 >= 3 ? 5 : g%5;
        return whole*5 + extra;
    }
}
