package com.hackerrank.euler.eighteen;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int N = sc.nextInt();
            int[][] nums = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    nums[i][j] = sc.nextInt();
                }
            }

            for (int i = N - 2; i >= 0 ; i--) {
                for (int j = 0; j <= i; j++) {
                    nums[i][j] = nums[i][j] + Math.max(nums[i+1][j], nums[i+1][j+1]);
                }
            }
            System.out.println(nums[0][0]);
        }
    }
}
