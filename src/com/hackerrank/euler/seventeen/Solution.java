package com.hackerrank.euler.seventeen;

import java.util.Scanner;

public class Solution {

    private static String[] places = new String[]{"", " Thousand", " Million", " Billion", " Trillion"};
    private static String[] digits = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            long N = sc.nextLong();
            System.out.printf(convertToString(N));
        }
    }

    private static String convertToString(long n) {
        if (n == 0) {
            return "Zero";
        }

        String result = "";
        int placeCount = 0;
        while (n > 0) {
            int lastThreeDigits = (int)(n % 1000);
            result = convertThreeDigitsToString(lastThreeDigits) + places[placeCount];
            n = n / 1000;
        }
        return result;
    }

    private static String convertThreeDigitsToString(int lastThreeDigits) {

        return "";
    }
}
