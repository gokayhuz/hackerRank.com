package com.hackerrank.strangeCode;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long time = 1;
        long value = 3;

        while (time + value <= t) {
            time += value;
            value = value * 2;
        }
        long result = value - (t - time);
        System.out.println(result);
    }
}
