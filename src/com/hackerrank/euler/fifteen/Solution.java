package com.hackerrank.euler.fifteen;

import java.util.Scanner;

public class Solution {
    private static int MAX_SIZE = 500;
    private static int MOD = 1000000000+7;
    public static void main(String[] args) {


        int[][] routes = new int[MAX_SIZE+1][MAX_SIZE+1];
        for (int i = 0; i <= MAX_SIZE; i++) {
            routes[0][i] = 1;
            routes[i][0] = 1;
        }

        for (int i = 1; i <= MAX_SIZE; i++) {
            for (int j = 1; j <= MAX_SIZE; j++) {
                routes[i][j] = (routes[i-1][j] + routes[i][j-1]) % MOD;
            }
        }

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println((routes[N][M] % MOD));
        }
    }
}
