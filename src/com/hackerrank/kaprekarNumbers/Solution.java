package com.hackerrank.kaprekarNumbers;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = p; i <= q; i++) {
            long square = 1L*i*i;
            String squaredString = square+"";
            int len = squaredString.length();
            String l = squaredString.substring(0, len/2);
            String r = squaredString.substring(len/2);
            int leftNum = l.length() == 0 ? 0 : Integer.parseInt(l);
            int sum = leftNum + Integer.parseInt(r);
            if (sum == i) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            System.out.println("INVALID RANGE");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Integer i : list) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
