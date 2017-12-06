package com.hackerrank.manasaAndStones;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            TreeSet<Long> lastStone = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                long curNum = a*(n-1-i) + b*i;
                lastStone.add(curNum);
            }

            StringBuilder sb = new StringBuilder();
            for (Long l : lastStone) {
                sb.append(l).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}

