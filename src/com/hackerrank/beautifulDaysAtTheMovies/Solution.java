package com.hackerrank.beautifulDaysAtTheMovies;

        import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();

        int count = 0;

        for (int index = i; index <= j; index++) {
            if (isBeautiful(index, k))
                count++;
        }

        System.out.println(count);
    }

    private static boolean isBeautiful(int i, int k) {
        return (Math.abs(i - reversed(i)) % k) == 0;
    }

    private static int reversed(int num) {
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }
}
