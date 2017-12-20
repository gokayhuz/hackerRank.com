package com.hackerrank.breakingTheRecords;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = -1;
        int highRecord = -1, lowRecord = -1;
        while (n --> 0) {
            int s = sc.nextInt();
            if (s < min) {
                min = s;
                lowRecord++;
            }
            if (s > max) {
                max = s;
                highRecord++;
            }
        }
        System.out.println(highRecord + " " + lowRecord);
    }
}
