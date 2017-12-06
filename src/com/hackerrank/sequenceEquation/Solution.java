package com.hackerrank.sequenceEquation;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            int tmp = sc.nextInt();
            arr[tmp] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(arr[arr[i]]);
        }
    }
}
