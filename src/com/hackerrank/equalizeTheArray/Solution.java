package com.hackerrank.equalizeTheArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] counts = new int[101];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            counts[tmp]++;
        }
        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < 101; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
            }
        }

        System.out.println(n - maxCount);
    }

}
