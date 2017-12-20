package com.hackerrank.appleAndOrange;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(), t = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(),
                m = sc.nextInt(), n = sc.nextInt();

        int numApples = 0;

        int numOranges = 0;

        while (m-->0) {  // apples
            int d = sc.nextInt();
            if (a + d <= t && a+d >= s)
                numApples++;
        }

        while (n-->0) { // oranges
            int d = sc.nextInt();
            if (b+d >= s && b+d <= t)
                numOranges++;
        }

        System.out.println(numApples);
        System.out.println(numOranges);
    }
}
