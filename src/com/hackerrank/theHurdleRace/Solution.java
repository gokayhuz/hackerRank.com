package com.hackerrank.theHurdleRace;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if (h > max)
                max = h;
        }
        System.out.println(max <= k ? 0 : max - k);
    }
}