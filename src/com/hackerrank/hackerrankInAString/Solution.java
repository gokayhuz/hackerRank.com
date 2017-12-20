

package com.hackerrank.hackerrankInAString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q --> 0) {
            String s = sc.next();
            System.out.println(containsHackerRank(s) ? "YES" : "NO");
        }
    }

    private static boolean containsHackerRank(String target) {
        String source = "hackerrank";

        if (target.length() < source.length()) {
            return false;
        }

        int targetIndex = 0;
        for (int i = 0; i < source.length(); i++, targetIndex++) {
            while (targetIndex < target.length() && target.charAt(targetIndex) != source.charAt(i))
                targetIndex++;
            if (targetIndex >= target.length()) {
                return false;
            }
        }

        return true;
    }
}

