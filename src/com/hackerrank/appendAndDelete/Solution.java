package com.hackerrank.appendAndDelete;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int k = sc.nextInt();

        int min = s.length() < t.length() ? s.length() : t.length();
        int max = s.length() > t.length() ? s.length() : t.length();

        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        int n = s.length() - i + t.length() - i;

        if (n == k || (n < k && (k-n) % 2 == 0) || k >= max + min) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
