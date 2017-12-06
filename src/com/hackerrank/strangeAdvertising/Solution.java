package com.hackerrank.strangeAdvertising;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        arr[1] = 2;
        int sum = 2;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1]*3/2;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
