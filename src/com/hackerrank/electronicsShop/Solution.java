package com.hackerrank.electronicsShop;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        int[] drives = new int[m];

        int maxSpent = 0;


        for (int i = 0; i < n; i++) {
            keyboards[i] = in.nextInt();
        }
        for (int j = 0; j < m; j++) {
            drives[j] = in.nextInt();
        }

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        if (keyboards[0] + drives[0] > b) {
            System.out.println("-1");
            return;
        }

        int i, j = 0;

        for (i = n-1; i >= 0; i--) {
            for (; j < m && keyboards[i] + drives[j] < b; j++);

            if (j > 0 && j < m) {
                int curSpent = keyboards[i] + drives[j-1];
                if (curSpent > maxSpent) {
                    maxSpent = curSpent;
                }
            }

        }

        System.out.println(maxSpent);

    }
}
