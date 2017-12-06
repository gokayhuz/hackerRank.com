package com.hackerrank.flatlandSpaceStations;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = n-m;

        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            arr[j] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int j = 1;
                while(i-j >= 0 && arr[i-j] > j) {
                    arr[i-j] = j;
                    j++;
                }
                j = 1;
                while (i+j < n && arr[i+j] > j) {
                    arr[i+j] = j;
                    j++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
