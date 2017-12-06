package com.hackerrank.happyLadybugs;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        while (g --> 0) {
            int n = sc.nextInt();
            char[] bugs;
            String bugsLine = sc.next();
            bugs = bugsLine.toCharArray();

            // check if the bugs are already happy
            boolean allHappy = true;
            if (n == 1) {
                if (bugs[0] == '_') {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            else if (n == 2) {
                if (bugs[0] != bugs[1]) {
                    allHappy = false;
                }
            } else {
                for (int i = 1; allHappy && i < n-1; i++) {
                    if (bugs[i] != bugs[i-1] && bugs[i] != bugs[i+1]) {
                        allHappy = false;
                    }
                }
                if (bugs[0] != bugs[1] || bugs[n-1] != bugs[n-2]){
                    allHappy = false;
                }
            }
            if (allHappy) {
                System.out.println("YES");
                continue;
            }
            if (bugsLine.indexOf('_') < 0) {
                System.out.println("NO");
                continue;
            }

            int[] counts = new int['Z' - 'A' + 1];
            for (int i = 0; i < n; i++) {
                if (bugs[i] != '_') {
                    counts[bugs[i] - 'A']++;
                }
            }
            allHappy = true;
            for (int i = 0; allHappy && i < 'Z'-'A'+1; i++) {
                if (counts[i] == 1) {
                    allHappy = false;
                }
            }
            if (allHappy)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
