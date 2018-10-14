package com.hackerrank.euler.thirtyfour;

import java.util.Scanner;

public class Solution {

    private static int[] factorials = new int[11];

    static {
        factorials[0] = 1;
        factorials[1] = 1;
        for (int i = 2; i < 11; i++) {
            factorials[i] = factorials[i-1] * i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long result = 0;
        for (int i = 10; i < N; i++) {
            long sum = 0;
            int copyN = i;
            while (copyN > 0) {
                int lastDigit = copyN % 10;
                sum += factorials[lastDigit];
                copyN = copyN / 10;
            }
            if (sum % i == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
